/**
 */
package brokermodel.services;

import brokermodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>br Type List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.services.brTypeList#getContainsElementsOf <em>Contains Elements Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.services.ServicesPackage#getbrTypeList()
 * @model
 * @generated
 */
public interface brTypeList extends SettingType {
	/**
	 * Returns the value of the '<em><b>Contains Elements Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Elements Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Elements Of</em>' reference.
	 * @see #setContainsElementsOf(NamedElement)
	 * @see brokermodel.services.ServicesPackage#getbrTypeList_ContainsElementsOf()
	 * @model
	 * @generated
	 */
	NamedElement getContainsElementsOf();

	/**
	 * Sets the value of the '{@link brokermodel.services.brTypeList#getContainsElementsOf <em>Contains Elements Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Elements Of</em>' reference.
	 * @see #getContainsElementsOf()
	 * @generated
	 */
	void setContainsElementsOf(NamedElement value);

} // brTypeList
