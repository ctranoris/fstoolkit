/**
 */
package brokermodel.services;

import brokermodel.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representing services 
 * e.g. a MySQL server. The MySQL server might be "providedByResources" by "any one" of  uopMySQL, FokusMySQL, etc
 * Bettet to inherit this class and live services even maybe unimplemented. (not abstract yet thoug)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.services.Service#getServiceSettings <em>Service Settings</em>}</li>
 *   <li>{@link brokermodel.services.Service#getRequiresServices <em>Requires Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.services.ServicesPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Service Settings</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.services.ServiceSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Settings</em>' containment reference list.
	 * @see brokermodel.services.ServicesPackage#getService_ServiceSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceSetting> getServiceSettings();

	/**
	 * Returns the value of the '<em><b>Requires Services</b></em>' reference list.
	 * The list contents are of type {@link brokermodel.services.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service Sa requires another service Sb to be present in the scenario in order to be able to operate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requires Services</em>' reference list.
	 * @see brokermodel.services.ServicesPackage#getService_RequiresServices()
	 * @model
	 * @generated
	 */
	EList<Service> getRequiresServices();

} // Service
