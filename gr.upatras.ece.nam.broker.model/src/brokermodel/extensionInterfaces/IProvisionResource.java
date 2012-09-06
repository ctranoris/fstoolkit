/**
 */
package brokermodel.extensionInterfaces;

import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.federationscenarios.ResourceSettingInstance;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProvision Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see brokermodel.extensionInterfaces.ExtensionInterfacesPackage#getIProvisionResource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IProvisionResource extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String provisionResource(String brokerName, RequestedFederationScenario scenario, ResourceRequest resourceReq);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean supportsBroker(String brokerName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSupportedBrokerName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String deleteResource(String brokerName, RequestedFederationScenario scenario, ResourceRequest resourceReq);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model assignedSettingMany="true"
	 * @generated
	 */
	String updateResource(String brokerName, RequestedFederationScenario scenario, ResourceRequest resourceReq, EList<ResourceSettingInstance> assignedSetting);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String readResource(String brokerName, RequestedFederationScenario scenario, ResourceRequest resourceReq, ResourceSettingInstance assignedSetting, boolean forceUpdate);

} // IProvisionResource
