/**
 */
package brokermodel.extensionInterfaces;

import brokermodel.experimentRuntime.RunningScenarios;

import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.federationscenarios.ResourceSettingInstance;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IWorkflow Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see brokermodel.extensionInterfaces.ExtensionInterfacesPackage#getIWorkflowEngine()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IWorkflowEngine extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEngineName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	RunningScenarios getRunningScenarios();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ScheduleScenario(RequestedFederationScenario scenario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ShutDownScenario(RequestedFederationScenario scenario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void DeletePermanentlyScenario(RequestedFederationScenario scenario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ShutDownResource(RequestedFederationScenario scenario, ResourceRequest resourceReq);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model assignedSettingMany="true"
	 * @generated
	 */
	String UpdateResource(RequestedFederationScenario scenario, ResourceRequest resourceReq, EList<ResourceSettingInstance> assignedSetting);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ReadResource(RequestedFederationScenario scenario, ResourceRequest resourceReq, ResourceSettingInstance assignedSetting, boolean forceUpdate);

} // IWorkflowEngine
