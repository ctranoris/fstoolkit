package org.panlab.software.fstoolkit.localprovisioningengine;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import FederationOffice.VTStatus;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;

public class ProvisionJob extends Job {

	private RequestedFederationScenario requestedScenario;
	private ResourceRequest requestedResource;
	private List<ProvisionResourceJob> provingResJobList;
	private ProvisionJobAction provisionJobAction;
	
	public ProvisionJob(String name, RequestedFederationScenario scenario, ProvisionJobAction action) {		
		this(name, scenario, null, action);		
	}
	
	
	public ProvisionJob(String name, RequestedFederationScenario scenario, 
			ResourceRequest requestedResource, ProvisionJobAction action) {	
		super(name);
		
		if (scenario == null){
			return; //this normally should never happen
		}
		
		provingResJobList = new ArrayList<ProvisionResourceJob>();
		this.requestedScenario = scenario;
		this.provisionJobAction = action;
		this.requestedResource = requestedResource;
		this.setUser(true);
		
		if (scenario.getScheduledPlan() == null){
			this.schedule(2000);//start in 2 secs
		}else{ //don't expect too much for now :-)
			 /** Today's date */
		    Date today = new Date();			
			long delay = scenario.getScheduledPlan().getValidFrom().getTime() - today.getTime();
			System.out.println("Senario scheduled to run in "+delay+" msec");
			if (delay>0)
				this.schedule( delay );
			else
				this.schedule( 1000 );
		}
		
		switch (provisionJobAction) {
			case PROVISION: scenario.setStatus(VTStatus.SCHEDULED_PROVISIONING);break;
			case SHUT_DOWN: scenario.setStatus(VTStatus.SCHEDULED_SHUT_DOWN);break;
			case SHUT_DOWN_RESOURCE: scenario.setStatus(VTStatus.PROVISIONING);break;
		}

		System.out.println("Senario STATUS to run is "+scenario.getStatus() );
		//broadcast that
		ProvisioningJobBroadcaster.getInstance().eventOccuredOnScenario(scenario);
	}
	
	public RequestedFederationScenario getRequestedScenario(){
		return this.requestedScenario;
	}
	
	
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {

		switch (provisionJobAction) {
			case PROVISION: return runProvisionJob(monitor);
			case SHUT_DOWN: return runShutDownJob(monitor);
			case SHUT_DOWN_RESOURCE: return runShutDownResourceJob(monitor);
		}
		
		return Status.OK_STATUS ;		
	}
	
	
	private IStatus runProvisionJob(IProgressMonitor monitor) {
		
		this.requestedScenario.setStatus(VTStatus.PROVISIONING  );
		
		int totalWork= requestedScenario.getInfrastructureRequest().getReqOfferedResources().size();
		monitor.beginTask("Provisioning "+this.requestedScenario.getName(), totalWork);
		int lastProvisionedValue=totalWork;		

		monitor.subTask("Starting Resource Request jobs");
		ProvisionResourceJobs(monitor, provisionJobAction);
		
		do {
			if (lastProvisionedValue!=provingResJobList.size()){
				monitor.worked(lastProvisionedValue-provingResJobList.size());		
				lastProvisionedValue = provingResJobList.size();
			}
			if (monitor.isCanceled()){
				Job.getJobManager().cancel(this.requestedScenario.getInfrastructureRequest() );
				this.requestedScenario.setStatus(VTStatus.REJECTED );
				ProvisioningJobBroadcaster.getInstance().eventOccuredOnScenario(this.requestedScenario);
				return Status.CANCEL_STATUS;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} while (provingResJobList.size()>0);
	
		monitor.done();
		this.requestedScenario.setStatus(VTStatus.RUNNING );
		LocalRuntimeScenariosMgt.getInstance().SaveRunningScenarioModel(this.requestedScenario);//since completed 
		
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openInformation( Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell() ,
						"Local Provisioning Engine", "Provisioning job of "+ requestedScenario.getName() +" finished.");
			}
		});
		
		
		ProvisioningJobBroadcaster.getInstance().eventOccuredOnScenario(this.requestedScenario);
		return Status.OK_STATUS;
	}
	
	
	private IStatus runShutDownJob(IProgressMonitor monitor) {

		this.requestedScenario.setStatus(VTStatus.SHUTTING_DOWN  );
		
		int totalWork= requestedScenario.getInfrastructureRequest().getReqOfferedResources().size();
		monitor.beginTask("Shutting down "+this.requestedScenario.getName(), totalWork);
		int lastProvisionedValue=totalWork;		

		monitor.subTask("Shutting Down Resource Request jobs");
		ProvisionResourceJobs(monitor, provisionJobAction);
		
		do {
			if (lastProvisionedValue!=provingResJobList.size()){
				monitor.worked(lastProvisionedValue-provingResJobList.size());		
				lastProvisionedValue = provingResJobList.size();
			}
			if (monitor.isCanceled()){
				Job.getJobManager().cancel(this.requestedScenario.getInfrastructureRequest() );
				this.requestedScenario.setStatus(VTStatus.REJECTED );
				ProvisioningJobBroadcaster.getInstance().eventOccuredOnScenario(this.requestedScenario);
				return Status.CANCEL_STATUS;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} while (provingResJobList.size()>0);
	
		monitor.done();
		this.requestedScenario.setStatus(VTStatus.SHUT_DOWN );
		LocalRuntimeScenariosMgt.getInstance().SaveRunningScenarioModel(this.requestedScenario);//since completed 
		
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openInformation( Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell() ,
						"Local Provisioning Engine", "Shutting down job of "+ requestedScenario.getName() +" finished.");
			}
		});
		
		
		ProvisioningJobBroadcaster.getInstance().eventOccuredOnScenario(this.requestedScenario);
		return Status.OK_STATUS;
	}

	
	private IStatus runShutDownResourceJob(IProgressMonitor monitor) {
		this.requestedScenario.setStatus(VTStatus.PROVISIONING  );
		
		int totalWork= 1;
		monitor.beginTask("Shutting down resource "+this.requestedResource.getName(), totalWork);
		int lastProvisionedValue=totalWork;		

		monitor.subTask("Shutting Down Resource Request job");
		
		
		ProvisionResourceJob resJob = new ProvisionResourceJob(this, monitor, "Resource Request " + this.requestedResource.getName(),
					requestedScenario, this.requestedResource, provisionJobAction);
		provingResJobList.add(resJob);
		resJob.schedule();			
		
		
		do {
			if (lastProvisionedValue!=provingResJobList.size()){
				monitor.worked(lastProvisionedValue-provingResJobList.size());		
				lastProvisionedValue = provingResJobList.size();
			}
			if (monitor.isCanceled()){
				Job.getJobManager().cancel(this.requestedScenario.getInfrastructureRequest() );
				this.requestedScenario.setStatus(VTStatus.RUNNING );
				ProvisioningJobBroadcaster.getInstance().eventOccuredOnScenario(this.requestedScenario);
				return Status.CANCEL_STATUS;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} while (provingResJobList.size()>0);
	
		monitor.done();
		this.requestedScenario.setStatus(VTStatus.RUNNING );
		LocalRuntimeScenariosMgt.getInstance().SaveRunningScenarioModel(this.requestedScenario);//since completed 
		
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openInformation( Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell() ,
						"Local Provisioning Engine", "Shutting down job of resource "+ requestedResource.getName() +" finished.");
			}
		});
		
		
		ProvisioningJobBroadcaster.getInstance().eventOccuredOnScenario(this.requestedScenario);
		return Status.OK_STATUS;
	}
	
	
	private void ProvisionResourceJobs(IProgressMonitor monitor, ProvisionJobAction action){
		int i=0;
		for (ResourceRequest resReq : requestedScenario.getInfrastructureRequest().getReqOfferedResources()) {
			ProvisionResourceJob resJob = new ProvisionResourceJob(this, monitor, "Resource Request " + resReq.getName(),
					requestedScenario, resReq, action);
			provingResJobList.add(resJob);
			resJob.schedule(i);//schedule each one with 3secs difference and see		
			i+=5000;
		}
	}
	

	public void NotifyResJobFinished( ProvisionResourceJob provJob ){
		System.out.println("NotifyResJobFinished : "+ provJob.getName());
		provingResJobList.remove(provJob);
	}


}
