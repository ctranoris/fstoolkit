package gr.upatras.ece.nam.fstoolkit.utils;

import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import brokermodel.availabilityContract.ResourceServiceContract;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceSettingInstance;
import brokermodel.federationscenarios.ServiceRequest;
import brokermodel.federationscenarios.ServiceSettingInstance;
import brokermodel.federationscenarios.SettingInstance;

public class ResourceAdvisor {


	private int planID=-1;
	private Vector<OfferedPlan> offeredPlans; 
	private Vector<brokermodel.Broker> testbedBrokers;

	private IFile modelFile;
	private RequestedFederationScenario sourceFedScenario = null ;

	
	

	public ResourceAdvisor(){
		offeredPlans = new Vector<OfferedPlan>();
		testbedBrokers = new Vector<brokermodel.Broker>();
		LoadModel();
		CalculateOffers();
	}
	
	/**
	 * @return the targetFedScenario or null if no plan selected
	 */
	public RequestedFederationScenario getTargetFedScenario() {
		if (planID>=0)
			return this.getOfferedPlans().get(planID).getProposedScenario();
		else
			return null;
	}
	
	/**
	 * @return the targetFedScenario
	 */
	public RequestedFederationScenario getSourceFedScenario() {
		return sourceFedScenario;
	}

	
	/**
	 * @return the planID
	 */
	public int getPlanID() {
		return planID;
	}

	/**
	 * @param planID the planID to set
	 */
	public void setPlanID(int planID) {
		this.planID = planID;
	}
	
	public Vector<OfferedPlan> getOfferedPlans() {
		return offeredPlans;
	}
	public Vector<brokermodel.Broker> getTestbedBrokers() {
		return testbedBrokers;
	}
	
	private void LoadModel(){
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		
		IEditorPart editor = page.getActiveEditor();
		
		
		modelFile = (IFile) editor.getEditorInput().getAdapter(IFile.class);
		if (modelFile != null) {
			System.out.println("LoadModel()" + modelFile.getLocation().toString() );
		}
		
		try {

			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = URI.createFileURI(modelFile.getLocation().toString());
			System.out.println("uri" + uri.toString() );
			org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(uri, true);
			sourceFedScenario = (RequestedFederationScenario) resource.getContents().get(0);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void CalculateOffers(){

		for (int j = 0; j < 7; j++) { //max 7 offers
			
			OfferedPlan offeredPlan= new OfferedPlan(sourceFedScenario);//ena offerPlan exei offers apo to ka8e imported Broker
			offeredPlans.add(offeredPlan); //pros8ese to sto vector me ola ta Plans
						
			
			
		}//for		
	}

	

	
	public Double getTotalCostForAdvicedOffer(ResourceServiceContract contract) {
		java.util.Date lastDate, earlyDate;
		if ( (sourceFedScenario.getScheduledPlan()!=null)&&
				(sourceFedScenario.getScheduledPlan().getValidFrom()!=null)&&
				(sourceFedScenario.getScheduledPlan().getValidUntil()!=null) ){
			earlyDate = sourceFedScenario.getScheduledPlan().getValidFrom();
			lastDate = sourceFedScenario.getScheduledPlan().getValidUntil();
			long deltaHours = ( lastDate.getTime() - earlyDate.getTime() )/ (60*60*1000);
			Double balanceDelta= (double) 0 ;
			if (contract.getAvailability().getCost().getPerUnit().getName().equals("HOUR") ){
				balanceDelta = (deltaHours*contract.getAvailability().getCost().getAmount()) ;
			}else if (contract.getAvailability().getCost().getPerUnit().getName().equals("USAGE") ){
				balanceDelta = (contract.getAvailability().getCost().getAmount()) ;
			}else if (contract.getAvailability().getCost().getPerUnit().getName().equals("DAY") ){
				balanceDelta = (deltaHours*contract.getAvailability().getCost().getAmount()/24 ) ;
			}
			
//			StringBuilder sb = new StringBuilder();
//			Formatter formatter = new Formatter(sb, Locale.US);
			
			return balanceDelta;
		}
		
		return (double) 0;
	}

	public IResource getModelFile() {
		
		return modelFile;
	}
	
	
}
