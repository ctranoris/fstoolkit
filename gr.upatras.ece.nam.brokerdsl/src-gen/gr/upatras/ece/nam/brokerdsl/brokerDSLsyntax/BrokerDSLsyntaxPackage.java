/**
 */
package gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface BrokerDSLsyntaxPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "brokerDSLsyntax";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://nam.ece.upatras.gr/brokerdsl/BrokerDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "brokerDSLsyntax";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BrokerDSLsyntaxPackage eINSTANCE = gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerDSLsyntaxPackageImpl.init();

  /**
   * The meta object id for the '{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerRuleImpl <em>Broker Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerRuleImpl
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerDSLsyntaxPackageImpl#getBrokerRule()
   * @generated
   */
  int BROKER_RULE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROKER_RULE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Testbed Brokerv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROKER_RULE__TESTBED_BROKERV = 1;

  /**
   * The number of structural features of the '<em>Broker Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROKER_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.ImportBrokerImpl <em>Import Broker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.ImportBrokerImpl
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerDSLsyntaxPackageImpl#getImportBroker()
   * @generated
   */
  int IMPORT_BROKER = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_BROKER__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import Broker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_BROKER_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule <em>Broker Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broker Rule</em>'.
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule
   * @generated
   */
  EClass getBrokerRule();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule#getImports()
   * @see #getBrokerRule()
   * @generated
   */
  EReference getBrokerRule_Imports();

  /**
   * Returns the meta object for the containment reference '{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule#getTestbedBrokerv <em>Testbed Brokerv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Testbed Brokerv</em>'.
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule#getTestbedBrokerv()
   * @see #getBrokerRule()
   * @generated
   */
  EReference getBrokerRule_TestbedBrokerv();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.ImportBroker <em>Import Broker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Broker</em>'.
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.ImportBroker
   * @generated
   */
  EClass getImportBroker();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.ImportBroker#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.ImportBroker#getImportURI()
   * @see #getImportBroker()
   * @generated
   */
  EAttribute getImportBroker_ImportURI();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BrokerDSLsyntaxFactory getBrokerDSLsyntaxFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerRuleImpl <em>Broker Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerRuleImpl
     * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerDSLsyntaxPackageImpl#getBrokerRule()
     * @generated
     */
    EClass BROKER_RULE = eINSTANCE.getBrokerRule();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BROKER_RULE__IMPORTS = eINSTANCE.getBrokerRule_Imports();

    /**
     * The meta object literal for the '<em><b>Testbed Brokerv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BROKER_RULE__TESTBED_BROKERV = eINSTANCE.getBrokerRule_TestbedBrokerv();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.ImportBrokerImpl <em>Import Broker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.ImportBrokerImpl
     * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerDSLsyntaxPackageImpl#getImportBroker()
     * @generated
     */
    EClass IMPORT_BROKER = eINSTANCE.getImportBroker();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_BROKER__IMPORT_URI = eINSTANCE.getImportBroker_ImportURI();

  }

} //BrokerDSLsyntaxPackage
