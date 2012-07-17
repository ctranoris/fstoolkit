/**
 */
package brokermodel.uiObjects;

import brokermodel.NamedElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ui Taxonomy Tree Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.uiObjects.ui_TaxonomyTreeItem#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link brokermodel.uiObjects.ui_TaxonomyTreeItem#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link brokermodel.uiObjects.ui_TaxonomyTreeItem#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link brokermodel.uiObjects.ui_TaxonomyTreeItem#getBrokerElement <em>Broker Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.uiObjects.UiObjectsPackage#getui_TaxonomyTreeItem()
 * @model
 * @generated
 */
public interface ui_TaxonomyTreeItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' reference.
	 * @see #setParentNode(ui_TaxonomyTreeItem)
	 * @see brokermodel.uiObjects.UiObjectsPackage#getui_TaxonomyTreeItem_ParentNode()
	 * @model
	 * @generated
	 */
	ui_TaxonomyTreeItem getParentNode();

	/**
	 * Sets the value of the '{@link brokermodel.uiObjects.ui_TaxonomyTreeItem#getParentNode <em>Parent Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' reference.
	 * @see #getParentNode()
	 * @generated
	 */
	void setParentNode(ui_TaxonomyTreeItem value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see brokermodel.uiObjects.UiObjectsPackage#getui_TaxonomyTreeItem_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link brokermodel.uiObjects.ui_TaxonomyTreeItem#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Child Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.uiObjects.ui_TaxonomyTreeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Nodes</em>' containment reference list.
	 * @see brokermodel.uiObjects.UiObjectsPackage#getui_TaxonomyTreeItem_ChildNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ui_TaxonomyTreeItem> getChildNodes();

	/**
	 * Returns the value of the '<em><b>Broker Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broker Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Element</em>' reference.
	 * @see #setBrokerElement(NamedElement)
	 * @see brokermodel.uiObjects.UiObjectsPackage#getui_TaxonomyTreeItem_BrokerElement()
	 * @model
	 * @generated
	 */
	NamedElement getBrokerElement();

	/**
	 * Sets the value of the '{@link brokermodel.uiObjects.ui_TaxonomyTreeItem#getBrokerElement <em>Broker Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker Element</em>' reference.
	 * @see #getBrokerElement()
	 * @generated
	 */
	void setBrokerElement(NamedElement value);

} // ui_TaxonomyTreeItem
