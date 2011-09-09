/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rul SSH commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.rulSSH_commands#getRemoteCommand <em>Remote Command</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.rulSSH_commands#getScriptparams <em>Scriptparams</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getrulSSH_commands()
 * @model
 * @generated
 */
public interface rulSSH_commands extends EObject
{
  /**
   * Returns the value of the '<em><b>Remote Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remote Command</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remote Command</em>' attribute.
   * @see #setRemoteCommand(String)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getrulSSH_commands_RemoteCommand()
   * @model
   * @generated
   */
  String getRemoteCommand();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.rulSSH_commands#getRemoteCommand <em>Remote Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote Command</em>' attribute.
   * @see #getRemoteCommand()
   * @generated
   */
  void setRemoteCommand(String value);

  /**
   * Returns the value of the '<em><b>Scriptparams</b></em>' reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.scriptParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scriptparams</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scriptparams</em>' reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getrulSSH_commands_Scriptparams()
   * @model
   * @generated
   */
  EList<scriptParam> getScriptparams();

} // rulSSH_commands
