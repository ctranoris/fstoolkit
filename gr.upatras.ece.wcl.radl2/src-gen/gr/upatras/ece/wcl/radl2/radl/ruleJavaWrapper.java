/**
 */
package gr.upatras.ece.wcl.radl2.radl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rule Java Wrapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleJavaWrapper#getClassname <em>Classname</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleJavaWrapper#getConstructorParams <em>Constructor Params</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleJavaWrapper#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleJavaWrapper()
 * @model
 * @generated
 */
public interface ruleJavaWrapper extends Protocol
{
  /**
   * Returns the value of the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' attribute.
   * @see #setClassname(String)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleJavaWrapper_Classname()
   * @model
   * @generated
   */
  String getClassname();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleJavaWrapper#getClassname <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' attribute.
   * @see #getClassname()
   * @generated
   */
  void setClassname(String value);

  /**
   * Returns the value of the '<em><b>Constructor Params</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.rulJava_param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructor Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructor Params</em>' containment reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleJavaWrapper_ConstructorParams()
   * @model containment="true"
   * @generated
   */
  EList<rulJava_param> getConstructorParams();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleJavaWrapper_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // ruleJavaWrapper
