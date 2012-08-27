/**
 */
package gr.upatras.ece.wcl.radl2.radl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rule HTTP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getRemoteMachine <em>Remote Machine</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getHttpURL <em>Http URL</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getHMethod <em>HMethod</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getAuthMethod <em>Auth Method</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getUsername <em>Username</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getPassword <em>Password</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getPostBody <em>Post Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP()
 * @model
 * @generated
 */
public interface ruleHTTP extends Protocol
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
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP_RemoteMachine()
   * @model
   * @generated
   */
  scriptParam getRemoteMachine();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getRemoteMachine <em>Remote Machine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote Machine</em>' reference.
   * @see #getRemoteMachine()
   * @generated
   */
  void setRemoteMachine(scriptParam value);

  /**
   * Returns the value of the '<em><b>Http URL</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP_URL}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Http URL</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Http URL</em>' containment reference list.
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP_HttpURL()
   * @model containment="true"
   * @generated
   */
  EList<ruleHTTP_URL> getHttpURL();

  /**
   * Returns the value of the '<em><b>HMethod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>HMethod</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>HMethod</em>' attribute.
   * @see #setHMethod(String)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP_HMethod()
   * @model
   * @generated
   */
  String getHMethod();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getHMethod <em>HMethod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>HMethod</em>' attribute.
   * @see #getHMethod()
   * @generated
   */
  void setHMethod(String value);

  /**
   * Returns the value of the '<em><b>Auth Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Auth Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Auth Method</em>' reference.
   * @see #setAuthMethod(scriptParam)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP_AuthMethod()
   * @model
   * @generated
   */
  scriptParam getAuthMethod();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getAuthMethod <em>Auth Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Auth Method</em>' reference.
   * @see #getAuthMethod()
   * @generated
   */
  void setAuthMethod(scriptParam value);

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
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP_Username()
   * @model
   * @generated
   */
  scriptParam getUsername();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getUsername <em>Username</em>}' reference.
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
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP_Password()
   * @model
   * @generated
   */
  scriptParam getPassword();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getPassword <em>Password</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' reference.
   * @see #getPassword()
   * @generated
   */
  void setPassword(scriptParam value);

  /**
   * Returns the value of the '<em><b>Post Body</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Body</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Body</em>' reference.
   * @see #setPostBody(scriptParam)
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#getruleHTTP_PostBody()
   * @model
   * @generated
   */
  scriptParam getPostBody();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.radl2.radl.ruleHTTP#getPostBody <em>Post Body</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Body</em>' reference.
   * @see #getPostBody()
   * @generated
   */
  void setPostBody(scriptParam value);

} // ruleHTTP
