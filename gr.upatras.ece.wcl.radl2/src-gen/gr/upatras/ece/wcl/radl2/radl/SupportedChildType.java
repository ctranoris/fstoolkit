/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Child Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.SupportedChildType#getParamType <em>Param Type</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.SupportedChildType#getName <em>Name</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.SupportedChildType#getDefValue <em>Def Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getSupportedChildType()
 * @model
 * @generated
 */
public interface SupportedChildType extends EObject
{
  /**
   * Returns the value of the '<em><b>Param Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Type</em>' containment reference.
   * @see #setParamType(ParameterType)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getSupportedChildType_ParamType()
   * @model containment="true"
   * @generated
   */
  ParameterType getParamType();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.SupportedChildType#getParamType <em>Param Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param Type</em>' containment reference.
   * @see #getParamType()
   * @generated
   */
  void setParamType(ParameterType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getSupportedChildType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.SupportedChildType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Def Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def Value</em>' attribute.
   * @see #setDefValue(String)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getSupportedChildType_DefValue()
   * @model
   * @generated
   */
  String getDefValue();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.SupportedChildType#getDefValue <em>Def Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def Value</em>' attribute.
   * @see #getDefValue()
   * @generated
   */
  void setDefValue(String value);

} // SupportedChildType
