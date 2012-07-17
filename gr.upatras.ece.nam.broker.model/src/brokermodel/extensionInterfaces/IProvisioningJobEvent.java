/**
 */
package brokermodel.extensionInterfaces;

import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceRequest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IProvisioning Job Event</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see brokermodel.extensionInterfaces.ExtensionInterfacesPackage#getIProvisioningJobEvent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IProvisioningJobEvent extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RequestedFederationScenario statusChangedOnScenario();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceRequest statusChangedOnResource();

} // IProvisioningJobEvent
