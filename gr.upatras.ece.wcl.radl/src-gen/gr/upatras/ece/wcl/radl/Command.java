/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl.Command#getJavaFunctionName <em>Java Function Name</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl.Command#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl.RadlPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Java Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Function Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Function Name</em>' attribute.
   * @see #setJavaFunctionName(String)
   * @see gr.upatras.ece.wcl.radl.RadlPackage#getCommand_JavaFunctionName()
   * @model
   * @generated
   */
  String getJavaFunctionName();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl.Command#getJavaFunctionName <em>Java Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Function Name</em>' attribute.
   * @see #getJavaFunctionName()
   * @generated
   */
  void setJavaFunctionName(String value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl.rulJava_param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see gr.upatras.ece.wcl.radl.RadlPackage#getCommand_Commands()
   * @model containment="true"
   * @generated
   */
  EList<rulJava_param> getCommands();

} // Command
