/**
 */
package brokermodel.services;

import brokermodel.NamedElement;

import brokermodel.federationscenarios.RequestedFederationScenario;

import brokermodel.resources.ResourceCategory;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.services.Taxonomy#getTaxonomies <em>Taxonomies</em>}</li>
 *   <li>{@link brokermodel.services.Taxonomy#getCategories <em>Categories</em>}</li>
 *   <li>{@link brokermodel.services.Taxonomy#getHasScenarios <em>Has Scenarios</em>}</li>
 *   <li>{@link brokermodel.services.Taxonomy#getHasServices <em>Has Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.services.ServicesPackage#getTaxonomy()
 * @model
 * @generated
 */
public interface Taxonomy extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Taxonomies</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.services.Taxonomy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomies</em>' containment reference list.
	 * @see brokermodel.services.ServicesPackage#getTaxonomy_Taxonomies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Taxonomy> getTaxonomies();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.resources.ResourceCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see brokermodel.services.ServicesPackage#getTaxonomy_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceCategory> getCategories();

	/**
	 * Returns the value of the '<em><b>Has Scenarios</b></em>' reference list.
	 * The list contents are of type {@link brokermodel.federationscenarios.RequestedFederationScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Scenarios</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Scenarios</em>' reference list.
	 * @see brokermodel.services.ServicesPackage#getTaxonomy_HasScenarios()
	 * @model
	 * @generated
	 */
	EList<RequestedFederationScenario> getHasScenarios();

	/**
	 * Returns the value of the '<em><b>Has Services</b></em>' reference list.
	 * The list contents are of type {@link brokermodel.services.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Services</em>' reference list.
	 * @see brokermodel.services.ServicesPackage#getTaxonomy_HasServices()
	 * @model
	 * @generated
	 */
	EList<Service> getHasServices();

} // Taxonomy
