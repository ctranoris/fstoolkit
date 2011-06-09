package org.panlab.software.fstoolkit.localprovisioningengine;

import org.eclipse.emf.ecore.util.EcoreUtil;

import FederationOffice.Office;
import FederationOffice.experimentRuntime.ExperimentRuntimeFactory;
import FederationOffice.experimentRuntime.RuntimeElement;
import FederationOffice.experimentRuntime.RuntimeElementStatus;
import FederationOffice.extensionInterfaces.IProvisionResource;
import FederationOffice.federationscenarios.FederationscenariosFactory;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;
import FederationOffice.federationscenarios.SettingInstance;

public class ScenarioSolver {
	
	public ScenarioSolver() {
		super();
	}

	/**
	 * It will create a new scenario based on the given one, if the given one is not already saved. 
	 * The returned scenario will have some
	 * (or all if possible) assignments on resource settings resolved. 
	 * The method calls internally {@link #resolveAssignments(RequestedFederationScenario)}
	 * 
	 * @param The requested scenario
	 * @return a new scenario based on the requested, with resolved dependencies (if possible at first pass)
	 */
	public RequestedFederationScenario prepareScenarioRequest(
			RequestedFederationScenario scenario) {
		
		RequestedFederationScenario newScenario;
		if (scenario.getRuntimeInfo()==null){
			newScenario = FederationscenariosFactory.eINSTANCE.createRequestedFederationScenario();
			newScenario = (RequestedFederationScenario)EcoreUtil.copy(scenario);
			RuntimeElement rtinfo = ExperimentRuntimeFactory.eINSTANCE.createRuntimeElement();
			rtinfo.setDescription("Scenario is based on request by:"+ scenario.eResource().getURI().path());
			newScenario.setRuntimeInfo(rtinfo );
			for (ResourceRequest resReq : newScenario.getInfrastructureRequest().getReqOfferedResources()) {
				RuntimeElement rtInfo = ExperimentRuntimeFactory.eINSTANCE.createRuntimeElement();
				resReq.setRuntimeInfo(rtInfo);
				rtInfo.setStatus(RuntimeElementStatus.NOT_EXISTS );
			}
			
		}else{
			newScenario = scenario;
		}	
		
		resolveAssignments(newScenario);
		return newScenario;
	}
	
	
	/**
	 * Tries to resolve resource setting assignments of a given scenario
	 * @param scenario
	 * @return true if everything is resolved. false if there are assignments on resources that cannot be resolved yet
	 */
	public boolean resolveAssignments( RequestedFederationScenario scenario) {			
		//solve assignments with no constraints
		//SolveAssignmentsWithStaticValues(scenario);
		
		
		return true;
	}

	public boolean resourceRequestHasAllAssignementsResolved(
			RequestedFederationScenario scenario, ResourceRequest resReq) {

		for (ResourceSettingInstance s : resReq.getReqResourceSettings() ) {
			if (s.getAssignSetting().size()>0){
				String value = null;
				for (SettingInstance assignedSetting : s.getAssignSetting()) {
					ResourceRequest assignedResource = (ResourceRequest)((ResourceSettingInstance)assignedSetting).eContainer();
					value = getStaticValueOfAssignedSetting(scenario, assignedResource, (ResourceSettingInstance)assignedSetting);
					if ((value==null)){
						System.out.println("Setting:"+s.getName()+" of resource "+resReq.getName()+
								" has assigned value to:"+assignedSetting.getName()+
								" which cannot be resolved yet!");
						return false;//exit immediately. We currently cannot resolve this
					}
					value = value +",";
				}
				
				
				value = value.substring(0, value.length()-1);//to cut the last comma
				s.setStaticValue(value);
				s.getAssignSetting().clear();//if came here then it is ok and everything assigned		
			}
		}		
		
		//check now if everything is OK to go
		for (ResourceSettingInstance s : resReq.getReqResourceSettings() ){
			if (s.getRefResourceSetting().isWritable() )
				if ((s.getStaticValue() == null) || (s.getAssignSetting().size() > 0)) {
					System.out.println("Setting:" + s.getName() + " of resource " + resReq.getName()
							+ " cannot be resolved yet!");
					return false;
				}
		}
		
		return true; //everything is resolved..so go
	}
	
	private String getStaticValueOfAssignedSetting(  RequestedFederationScenario scenario, ResourceRequest resReq, ResourceSettingInstance assignedSetting) {
		if (( assignedSetting.getStaticValue()!=null ) && 
				assignedSetting.getAssignSetting().size()==0 ) //if there is available only the static value
			return assignedSetting.getStaticValue(); //we currently search only for the next assigned resource 
		else if ( (resReq.getRuntimeInfo()!=null) && 
				(resReq.getRuntimeInfo().getStatus()==RuntimeElementStatus.ONLINE)){ 
			//ask resource proxy, if it is possible to update its values and then return the value!	
			String officeName = ((Office)resReq.getRefOfferedResource().getImplOfferedService().eContainer()).getName() ;
			
			for (IProvisionResource p : Activator.getDefault().getProvisionPlugins()) {
				if (p.supportsOffice(officeName) ){
					String val = p.readResource(officeName, scenario, resReq, assignedSetting, true);
					assignedSetting.setStaticValue(val);
					return val;
				}
			}
			
		}
//		else { //else dig further to the next setting
//			for (SettingInstance s : assignedSetting.getAssignSetting() ) {
//				return getStaticValueOfAssignedSetting(s);
//			}
//		}
		
		return null;
	}

//	private void SolveAssignmentsWithStaticValues(RequestedFederationScenario scenario) {
//		for (ResourceRequest resReq : scenario.getInfrastructureRequest().getReqOfferedResources()) {
//			for (ResourceSettingInstance s : resReq.getReqResourceSettings() ) {
//				for (SettingInstance assignedSetting : s.getAssignSetting()) {
//					String value = getStaticValueOfAssignedSetting(assignedSetting);
//					
//					
//				}
//				
//			}
//		}
//		
//	}
//
	

}
