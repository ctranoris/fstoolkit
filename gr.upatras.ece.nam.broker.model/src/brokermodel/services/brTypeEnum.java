/**
 */
package brokermodel.services;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>br Type Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.services.brTypeEnum#getTideEnumlist <em>Tide Enumlist</em>}</li>
 *   <li>{@link brokermodel.services.brTypeEnum#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.services.ServicesPackage#getbrTypeEnum()
 * @model
 * @generated
 */
public interface brTypeEnum extends SettingType {
	/**
	 * Returns the value of the '<em><b>Tide Enumlist</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.services.brTypeEnumItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tide Enumlist</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tide Enumlist</em>' containment reference list.
	 * @see brokermodel.services.ServicesPackage#getbrTypeEnum_TideEnumlist()
	 * @model containment="true"
	 * @generated
	 */
	EList<brTypeEnumItem> getTideEnumlist();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(brTypeEnumItem)
	 * @see brokermodel.services.ServicesPackage#getbrTypeEnum_DefaultValue()
	 * @model
	 * @generated
	 */
	brTypeEnumItem getDefaultValue();

	/**
	 * Sets the value of the '{@link brokermodel.services.brTypeEnum#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(brTypeEnumItem value);

} // brTypeEnum
