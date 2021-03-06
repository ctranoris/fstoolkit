/**
 */
package brokermodel.federationscenarios;

import brokermodel.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.federationscenarios.InfrastructureRequest#getReqOfferedResources <em>Req Offered Resources</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.InfrastructureRequest#getResourceGroups <em>Resource Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.federationscenarios.FederationscenariosPackage#getInfrastructureRequest()
 * @model
 * @generated
 */
public interface InfrastructureRequest extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Req Offered Resources</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.federationscenarios.ResourceRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Offered Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Offered Resources</em>' containment reference list.
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getInfrastructureRequest_ReqOfferedResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceRequest> getReqOfferedResources();

	/**
	 * Returns the value of the '<em><b>Resource Groups</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.federationscenarios.ResourceGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Groups</em>' containment reference list.
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getInfrastructureRequest_ResourceGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceGroup> getResourceGroups();

} // InfrastructureRequest
