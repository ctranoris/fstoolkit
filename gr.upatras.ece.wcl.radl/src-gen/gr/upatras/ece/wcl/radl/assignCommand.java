/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>assign Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl.assignCommand#getScriptParam <em>Script Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl.RadlPackage#getassignCommand()
 * @model
 * @generated
 */
public interface assignCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Script Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script Param</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script Param</em>' reference.
   * @see #setScriptParam(scriptParam)
   * @see gr.upatras.ece.wcl.radl.RadlPackage#getassignCommand_ScriptParam()
   * @model
   * @generated
   */
  scriptParam getScriptParam();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl.assignCommand#getScriptParam <em>Script Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script Param</em>' reference.
   * @see #getScriptParam()
   * @generated
   */
  void setScriptParam(scriptParam value);

} // assignCommand
