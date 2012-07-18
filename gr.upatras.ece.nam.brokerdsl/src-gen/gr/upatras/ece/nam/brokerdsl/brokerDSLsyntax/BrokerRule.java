/**
 */
package gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax;

import brokermodel.Broker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broker Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule#getImports <em>Imports</em>}</li>
 *   <li>{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule#getTestbedBrokerv <em>Testbed Brokerv</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxPackage#getBrokerRule()
 * @model
 * @generated
 */
public interface BrokerRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.ImportBroker}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxPackage#getBrokerRule_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportBroker> getImports();

  /**
   * Returns the value of the '<em><b>Testbed Brokerv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testbed Brokerv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testbed Brokerv</em>' containment reference.
   * @see #setTestbedBrokerv(Broker)
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxPackage#getBrokerRule_TestbedBrokerv()
   * @model containment="true"
   * @generated
   */
  Broker getTestbedBrokerv();

  /**
   * Sets the value of the '{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule#getTestbedBrokerv <em>Testbed Brokerv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Testbed Brokerv</em>' containment reference.
   * @see #getTestbedBrokerv()
   * @generated
   */
  void setTestbedBrokerv(Broker value);

} // BrokerRule
