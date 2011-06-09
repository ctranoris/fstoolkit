package org.panlab.software.fstoolkit.localprovisioningengine;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import FederationOffice.Office;
import FederationOffice.VTStatus;
import FederationOffice.experimentRuntime.RunningScenarios;
import FederationOffice.extensionInterfaces.IProvisionResource;
import FederationOffice.extensionInterfaces.IWorkflowEngine;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;

public class LocalProvisioningEngine implements IWorkflowEngine {

	@Override
	public String getEngineName() {
		return "Local Provisioning Engine";
	}
	
	public RunningScenarios getRunningScenarios() {
		return LocalRuntimeScenariosMgt.getInstance().getRunningScenarios();
	}
	
	@Override
	public void ScheduleScenario(RequestedFederationScenario scenario) {
		if (scenario.getInfrastructureRequest() == null)
			return; //do nothing
		
		final RequestedFederationScenario schedScenario = 
			LocalRuntimeScenariosMgt.getInstance().SaveRunningScenarioModel(scenario);
		
		new ProvisionJob("Provisioning: " + schedScenario.getName(), schedScenario, ProvisionJobAction.PROVISION );
		
	}

	@Override
	public void ShutDownScenario(RequestedFederationScenario scenario) {
		// Check if the scenario belongs to us
		if (LocalRuntimeScenariosMgt.getInstance().checkIfScenarioExists(scenario) ){
			//proceed with shutting down
			new ProvisionJob("Shut down: " + scenario.getName(), scenario, ProvisionJobAction.SHUT_DOWN );
		}
	}

	@Override
	public void DeletePermanentlyScenario(final RequestedFederationScenario scenario) {
		// Check if the scenario belongs to us
		if (LocalRuntimeScenariosMgt.getInstance().checkIfScenarioExists(scenario) ){
			LocalRuntimeScenariosMgt.getInstance().DeleteScenarioModel(scenario);

			scenario.setStatus(VTStatus.DELETED);
			ProvisioningJobBroadcaster.getInstance().eventOccured(new ProvisioningJobEvent(scenario, null));
		}
		
	}
	
	
	@Override
	public String ShutDownResource(RequestedFederationScenario scenario,
			ResourceRequest resourceReq) {
		// Check if the scenario belongs to us
		if (LocalRuntimeScenariosMgt.getInstance().checkIfScenarioExists(scenario) ){
			//proceed with shutting down
			new ProvisionJob("Shut down resource: " + resourceReq.getName(), scenario, resourceReq, ProvisionJobAction.SHUT_DOWN_RESOURCE );
		}
		
		return null;
	}

	@Override
	public String UpdateResource(RequestedFederationScenario scenario,
			ResourceRequest resourceReq,
			ResourceSettingInstance assignedSetting) {
		// Check if the scenario belongs to us
		if (LocalRuntimeScenariosMgt.getInstance().checkIfScenarioExists(
				scenario)) {

			String officeName = ((Office) resourceReq.getRefOfferedResource()
					.getImplOfferedService().eContainer()).getName();

			for (IProvisionResource p : Activator.getDefault()
					.getProvisionPlugins()) {
				if (p.supportsOffice(officeName)) { 
					String val = p.updateResource(officeName, scenario,
							resourceReq, assignedSetting);
					assignedSetting.setStaticValue(val);
					return val;
				}
			}
		}
		return null;
	}

	@Override
	public String ReadResource(RequestedFederationScenario scenario,
			ResourceRequest resourceReq, 
				ResourceSettingInstance assignedSetting, boolean forceUpdate ) {

		// Check if the scenario belongs to us
		if (LocalRuntimeScenariosMgt.getInstance().checkIfScenarioExists(
				scenario)) {

			String officeName = ((Office) resourceReq.getRefOfferedResource()
					.getImplOfferedService().eContainer()).getName();

			for (IProvisionResource p : Activator.getDefault()
					.getProvisionPlugins()) {
				if (p.supportsOffice(officeName)) {
					String val = p.readResource(officeName, scenario,
							resourceReq, assignedSetting, true);
					assignedSetting.setStaticValue(val);
					return val;
				}
			}
		}
		return null;
	}
	

	
	
	
	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments)
			throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	

}
