/**
 */
package brokermodel.users;

import brokermodel.federationscenarios.RequestedFederationScenario;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broker Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.users.BrokerCustomer#getUtilizesVirtualTestbed <em>Utilizes Virtual Testbed</em>}</li>
 *   <li>{@link brokermodel.users.BrokerCustomer#getHasTestbedDesigner <em>Has Testbed Designer</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.users.UsersPackage#getBrokerCustomer()
 * @model
 * @generated
 */
public interface BrokerCustomer extends BrokerUser {
	/**
	 * Returns the value of the '<em><b>Utilizes Virtual Testbed</b></em>' reference list.
	 * The list contents are of type {@link brokermodel.federationscenarios.RequestedFederationScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilizes Virtual Testbed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilizes Virtual Testbed</em>' reference list.
	 * @see brokermodel.users.UsersPackage#getBrokerCustomer_UtilizesVirtualTestbed()
	 * @model
	 * @generated
	 */
	EList<RequestedFederationScenario> getUtilizesVirtualTestbed();

	/**
	 * Returns the value of the '<em><b>Has Testbed Designer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Testbed Designer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Testbed Designer</em>' reference.
	 * @see #setHasTestbedDesigner(TestbedDesigner)
	 * @see brokermodel.users.UsersPackage#getBrokerCustomer_HasTestbedDesigner()
	 * @model
	 * @generated
	 */
	TestbedDesigner getHasTestbedDesigner();

	/**
	 * Sets the value of the '{@link brokermodel.users.BrokerCustomer#getHasTestbedDesigner <em>Has Testbed Designer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Testbed Designer</em>' reference.
	 * @see #getHasTestbedDesigner()
	 * @generated
	 */
	void setHasTestbedDesigner(TestbedDesigner value);

} // BrokerCustomer
