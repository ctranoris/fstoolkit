/**
 */
package brokermodel.federationscenarios;

import brokermodel.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.federationscenarios.ServicesRequest#getServiceRequestList <em>Service Request List</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.federationscenarios.FederationscenariosPackage#getServicesRequest()
 * @model
 * @generated
 */
public interface ServicesRequest extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Service Request List</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.federationscenarios.ServiceRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Request List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Request List</em>' containment reference list.
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getServicesRequest_ServiceRequestList()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceRequest> getServiceRequestList();

} // ServicesRequest
