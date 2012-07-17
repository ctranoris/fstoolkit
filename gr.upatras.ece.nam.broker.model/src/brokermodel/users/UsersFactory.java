/**
 */
package brokermodel.users;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see brokermodel.users.UsersPackage
 * @generated
 */
public interface UsersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsersFactory eINSTANCE = brokermodel.users.impl.UsersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();

	/**
	 * Returns a new object of class '<em>Resources Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resources Provider</em>'.
	 * @generated
	 */
	ResourcesProvider createResourcesProvider();

	/**
	 * Returns a new object of class '<em>Testbed Designer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testbed Designer</em>'.
	 * @generated
	 */
	TestbedDesigner createTestbedDesigner();

	/**
	 * Returns a new object of class '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin</em>'.
	 * @generated
	 */
	Admin createAdmin();

	/**
	 * Returns a new object of class '<em>Broker Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broker Customer</em>'.
	 * @generated
	 */
	BrokerCustomer createBrokerCustomer();

	/**
	 * Returns a new object of class '<em>Broker Personel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broker Personel</em>'.
	 * @generated
	 */
	BrokerPersonel createBrokerPersonel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UsersPackage getUsersPackage();

} //UsersFactory
