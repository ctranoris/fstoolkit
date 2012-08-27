/**
 */
package gr.upatras.ece.wcl.radl2.radl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rule XMLRPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC#getRemoteMachine <em>Remote Machine</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC#getUsername <em>Username</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC#getPassword <em>Password</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC#getRPCMethod <em>RPC Method</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC#getURLparams <em>UR Lparams</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleXMLRPC()
 * @model
 * @generated
 */
public interface ruleXMLRPC extends Protocol
{
  /**
   * Returns the value of the '<em><b>Remote Machine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remote Machine</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remote Machine</em>' reference.
   * @see #setRemoteMachine(BindingParam)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleXMLRPC_RemoteMachine()
   * @model
   * @generated
   */
  BindingParam getRemoteMachine();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC#getRemoteMachine <em>Remote Machine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote Machine</em>' reference.
   * @see #getRemoteMachine()
   * @generated
   */
  void setRemoteMachine(BindingParam value);

  /**
   * Returns the value of the '<em><b>Username</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Username</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Username</em>' reference.
   * @see #setUsername(BindingParam)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleXMLRPC_Username()
   * @model
   * @generated
   */
  BindingParam getUsername();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC#getUsername <em>Username</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Username</em>' reference.
   * @see #getUsername()
   * @generated
   */
  void setUsername(BindingParam value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' reference.
   * @see #setPassword(BindingParam)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleXMLRPC_Password()
   * @model
   * @generated
   */
  BindingParam getPassword();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC#getPassword <em>Password</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' reference.
   * @see #getPassword()
   * @generated
   */
  void setPassword(BindingParam value);

  /**
   * Returns the value of the '<em><b>RPC Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RPC Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RPC Method</em>' reference.
   * @see #setRPCMethod(BindingParam)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleXMLRPC_RPCMethod()
   * @model
   * @generated
   */
  BindingParam getRPCMethod();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC#getRPCMethod <em>RPC Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RPC Method</em>' reference.
   * @see #getRPCMethod()
   * @generated
   */
  void setRPCMethod(BindingParam value);

  /**
   * Returns the value of the '<em><b>UR Lparams</b></em>' reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.ConfigurationParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>UR Lparams</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>UR Lparams</em>' reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleXMLRPC_URLparams()
   * @model
   * @generated
   */
  EList<ConfigurationParam> getURLparams();

} // ruleXMLRPC
