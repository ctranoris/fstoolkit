/**
 */
package gr.upatras.ece.wcl.radl2.radl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rule HTTP URL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP_URL#getRemoteURL <em>Remote URL</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP_URL#getScriptparams <em>Scriptparams</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP_URL()
 * @model
 * @generated
 */
public interface ruleHTTP_URL extends EObject
{
  /**
   * Returns the value of the '<em><b>Remote URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remote URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remote URL</em>' attribute.
   * @see #setRemoteURL(String)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP_URL_RemoteURL()
   * @model
   * @generated
   */
  String getRemoteURL();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP_URL#getRemoteURL <em>Remote URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote URL</em>' attribute.
   * @see #getRemoteURL()
   * @generated
   */
  void setRemoteURL(String value);

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
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP_URL_Scriptparams()
   * @model
   * @generated
   */
  EList<scriptParam> getScriptparams();

} // ruleHTTP_URL
