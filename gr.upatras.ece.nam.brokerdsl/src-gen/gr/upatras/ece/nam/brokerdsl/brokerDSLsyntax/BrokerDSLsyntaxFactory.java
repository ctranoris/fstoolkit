/**
 */
package gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxPackage
 * @generated
 */
public interface BrokerDSLsyntaxFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BrokerDSLsyntaxFactory eINSTANCE = gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerDSLsyntaxFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Broker Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Broker Rule</em>'.
   * @generated
   */
  BrokerRule createBrokerRule();

  /**
   * Returns a new object of class '<em>Import Broker</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Broker</em>'.
   * @generated
   */
  ImportBroker createImportBroker();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BrokerDSLsyntaxPackage getBrokerDSLsyntaxPackage();

} //BrokerDSLsyntaxFactory
