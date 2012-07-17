/**
 */
package brokermodel.uiObjects;

import brokermodel.Broker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broker Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.uiObjects.BrokerManager#getBrokersRef <em>Brokers Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.uiObjects.UiObjectsPackage#getBrokerManager()
 * @model
 * @generated
 */
public interface BrokerManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Brokers Ref</b></em>' reference list.
	 * The list contents are of type {@link brokermodel.Broker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brokers Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brokers Ref</em>' reference list.
	 * @see brokermodel.uiObjects.UiObjectsPackage#getBrokerManager_BrokersRef()
	 * @model
	 * @generated
	 */
	EList<Broker> getBrokersRef();

} // BrokerManager
