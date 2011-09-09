/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ParameterType#getPName <em>PName</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getParameterType()
 * @model
 * @generated
 */
public interface ParameterType extends EObject
{
  /**
   * Returns the value of the '<em><b>PName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PName</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PName</em>' attribute.
   * @see #setPName(String)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getParameterType_PName()
   * @model
   * @generated
   */
  String getPName();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ParameterType#getPName <em>PName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PName</em>' attribute.
   * @see #getPName()
   * @generated
   */
  void setPName(String value);

} // ParameterType
