/**
 */
package brokermodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see brokermodel.BrokerPackage
 * @generated
 */
public interface BrokerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BrokerFactory eINSTANCE = brokermodel.impl.BrokerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broker</em>'.
	 * @generated
	 */
	Broker createBroker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BrokerPackage getBrokerPackage();

} //BrokerFactory
