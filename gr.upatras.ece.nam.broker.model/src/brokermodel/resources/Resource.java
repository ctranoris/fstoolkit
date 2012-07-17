/**
 */
package brokermodel.resources;

import brokermodel.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.resources.Resource#getResourceSettings <em>Resource Settings</em>}</li>
 *   <li>{@link brokermodel.resources.Resource#getContributesToCategories <em>Contributes To Categories</em>}</li>
 *   <li>{@link brokermodel.resources.Resource#getRequiresResources <em>Requires Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.resources.ResourcesPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Resource Settings</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.resources.ResourceSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Settings</em>' containment reference list.
	 * @see brokermodel.resources.ResourcesPackage#getResource_ResourceSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceSetting> getResourceSettings();

	/**
	 * Returns the value of the '<em><b>Contributes To Categories</b></em>' reference list.
	 * The list contents are of type {@link brokermodel.resources.ResourceCategory}.
	 * It is bidirectional and its opposite is '{@link brokermodel.resources.ResourceCategory#getResourcelist <em>Resourcelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributes To Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributes To Categories</em>' reference list.
	 * @see brokermodel.resources.ResourcesPackage#getResource_ContributesToCategories()
	 * @see brokermodel.resources.ResourceCategory#getResourcelist
	 * @model opposite="resourcelist"
	 * @generated
	 */
	EList<ResourceCategory> getContributesToCategories();

	/**
	 * Returns the value of the '<em><b>Requires Resources</b></em>' reference list.
	 * The list contents are of type {@link brokermodel.resources.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource requires another resources Rb to be present in the scenario in order to be able to operate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requires Resources</em>' reference list.
	 * @see brokermodel.resources.ResourcesPackage#getResource_RequiresResources()
	 * @model
	 * @generated
	 */
	EList<Resource> getRequiresResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFullQualifiedName();

} // Resource
