/**
 */
package gr.upatras.ece.wcl.radl2.radl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rule SSH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleSSH#getRemoteMachine <em>Remote Machine</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleSSH#getRPort <em>RPort</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleSSH#getUsername <em>Username</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleSSH#getPassword <em>Password</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleSSH#getCommands <em>Commands</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleSSH#getCommandsDelete <em>Commands Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleSSH()
 * @model
 * @generated
 */
public interface ruleSSH extends Protocol
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
   * @see #setRemoteMachine(scriptParam)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleSSH_RemoteMachine()
   * @model
   * @generated
   */
  scriptParam getRemoteMachine();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleSSH#getRemoteMachine <em>Remote Machine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote Machine</em>' reference.
   * @see #getRemoteMachine()
   * @generated
   */
  void setRemoteMachine(scriptParam value);

  /**
   * Returns the value of the '<em><b>RPort</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RPort</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RPort</em>' reference.
   * @see #setRPort(scriptParam)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleSSH_RPort()
   * @model
   * @generated
   */
  scriptParam getRPort();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleSSH#getRPort <em>RPort</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RPort</em>' reference.
   * @see #getRPort()
   * @generated
   */
  void setRPort(scriptParam value);

  /**
   * Returns the value of the '<em><b>Username</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Username</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Username</em>' reference.
   * @see #setUsername(scriptParam)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleSSH_Username()
   * @model
   * @generated
   */
  scriptParam getUsername();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleSSH#getUsername <em>Username</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Username</em>' reference.
   * @see #getUsername()
   * @generated
   */
  void setUsername(scriptParam value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' reference.
   * @see #setPassword(scriptParam)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleSSH_Password()
   * @model
   * @generated
   */
  scriptParam getPassword();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleSSH#getPassword <em>Password</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' reference.
   * @see #getPassword()
   * @generated
   */
  void setPassword(scriptParam value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.rulSSH_commands}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleSSH_Commands()
   * @model containment="true"
   * @generated
   */
  EList<rulSSH_commands> getCommands();

  /**
   * Returns the value of the '<em><b>Commands Delete</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.rulSSH_commands}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands Delete</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands Delete</em>' containment reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleSSH_CommandsDelete()
   * @model containment="true"
   * @generated
   */
  EList<rulSSH_commands> getCommandsDelete();

} // ruleSSH
