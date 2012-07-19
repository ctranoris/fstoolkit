package gr.upatras.ece.nam.fstoolkit.localprovisioningengine;

import java.util.ArrayList;
import java.util.Random;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import brokermodel.Broker;
import brokermodel.experimentRuntime.RuntimeElement;
import brokermodel.experimentRuntime.RuntimeElementStatus;
import brokermodel.extensionInterfaces.IProvisionResource;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceRequest;

public class ProvisionResourceJob extends Job {

	private ResourceRequest resourceReq;	
	private ProvisionJob parentJob;
	private ProvisionJobAction provisionJobAction;
	private RequestedFederationScenario scenario;

	
	public ProvisionResourceJob(ProvisionJob provisionJob, IProgressMonitor monitor, String name,RequestedFederationScenario scenario, ResourceRequest resReq, ProvisionJobAction action) {
		super(name);
		this.resourceReq = resReq;
		this.parentJob = provisionJob;
		this.scenario = scenario;
		this.setProgressGroup(monitor, 1);
		this.provisionJobAction = action;
	}

	@Override
	public boolean belongsTo(Object family) {
		return resourceReq.eContainer().equals(family);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {	
		
		switch (provisionJobAction) {
			case PROVISION: return runProvisionJob(monitor);
			case SHUT_DOWN: return runShutDownResourceJob(monitor);
			case SHUT_DOWN_RESOURCE: return runShutDownResourceJob(monitor);
		}
		return Status.OK_STATUS ;		
	}

	private IStatus runProvisionJob(IProgressMonitor monitor) {
		RuntimeElement rtInfo = resourceReq.getRuntimeInfo() ;
		
		broadcastResourceStatus(RuntimeElementStatus.OFFLINE);
		Random r1 = new Random();
		ScenarioSolver solver = new ScenarioSolver();
		if ( !solver.resourceRequestHasAllAssignementsResolved(scenario, resourceReq) ){			//r1.nextInt(20)>5 ){//ResourceSettingsAreNotOK ){			
			broadcastResourceStatus(RuntimeElementStatus.WAITING);
			
			Random r = new Random();
			this.schedule(1000 * r.nextInt(60)+1000); //reschedule the job in 60random seconds
			System.out.println("RESCHEDULED : " + resourceReq.getName());
			return Status.OK_STATUS;
		}

		monitor.beginTask("Provisioning " + resourceReq.getName(), 1);
		if (monitor.isCanceled()) {
			parentJob.NotifyResJobFinished(this);
			System.out.println("ProvisionResourceJob, Cancel provisioning : " + resourceReq.getName());
			broadcastResourceStatus(RuntimeElementStatus.UNKNOWN);
			return Status.CANCEL_STATUS;
		}

			
		String guid="";
		String officeName = ((Broker)resourceReq.getRefOfferedResource().getImplOfferedService().eContainer()).getName() ;
		for (IProvisionResource p : Activator.getDefault().getProvisionPlugins() ) {
			if (p.supportsBroker(officeName) ){
				broadcastResourceStatus(RuntimeElementStatus.STARTING);
				guid = p.provisionResource(officeName, scenario, resourceReq);
				rtInfo.setGUID(guid);
			}
		}
		
//		try {
//			Random r = new Random();
//			Thread.sleep(1000 * r.nextInt(10) );
//			guid="temp";
//			rtInfo.setGUID(guid+"."+resourceReq.getName());
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		if ("".equals(guid))
			broadcastResourceStatus(RuntimeElementStatus.ERROR);
		else
			broadcastResourceStatus(RuntimeElementStatus.ONLINE);	

		monitor.worked(1);

		monitor.done();
		parentJob.NotifyResJobFinished(this);

		return Status.OK_STATUS;

	}
	
	
	private IStatus runShutDownResourceJob(IProgressMonitor monitor) {
		RuntimeElement rtInfo = resourceReq.getRuntimeInfo() ;
		
		monitor.beginTask("Shutting down " + resourceReq.getName(), 1);
		if (monitor.isCanceled()) {
			parentJob.NotifyResJobFinished(this);
			System.out.println("ProvisionResourceJob, Cancel provisioning : " + resourceReq.getName());
			broadcastResourceStatus(RuntimeElementStatus.UNKNOWN  );;
			return Status.CANCEL_STATUS;
		}
		
		String guid="";
		String officeName = ((Broker)resourceReq.getRefOfferedResource().getImplOfferedService().eContainer()).getName() ;
		for (IProvisionResource p : Activator.getDefault().getProvisionPlugins()) {
			if (p.supportsBroker(officeName) ){
				if ( (rtInfo.getStatus()!= RuntimeElementStatus.NOT_EXISTS )){
					
					try {
						Random r = new Random();
						Thread.sleep(1000 * r.nextInt(60) ); //sleep randomly..shutdown to avoid collisions. 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
						
					guid = p.deleteResource(officeName, scenario, resourceReq);
				}
				rtInfo.setGUID(guid);
			}
		}
		
		broadcastResourceStatus(RuntimeElementStatus.NOT_EXISTS);

		monitor.worked(1);

		monitor.done();
		System.out.println("ProvisionResourceJob, OK Provisioning : " + resourceReq.getName());
		parentJob.NotifyResJobFinished(this);

		return Status.OK_STATUS;
	}
	
	

	public ResourceRequest getResourceRequest() {
		return this.resourceReq;
		
	}

	public ProvisionJob getParentJob() {
		return parentJob;
	}
	
	private void broadcastResourceStatus(RuntimeElementStatus status){

		resourceReq.getRuntimeInfo().setStatus(status);
		ProvisioningJobBroadcaster.getInstance().eventOccuredOnResource( resourceReq);
		
	}
	
	

}
