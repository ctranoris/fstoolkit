/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package FederationOffice.fcielements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FederationOffice.fcielements.AuthorizationKey#getUsername <em>Username</em>}</li>
 *   <li>{@link FederationOffice.fcielements.AuthorizationKey#getPassword <em>Password</em>}</li>
 *   <li>{@link FederationOffice.fcielements.AuthorizationKey#getCredentials <em>Credentials</em>}</li>
 * </ul>
 * </p>
 *
 * @see FederationOffice.fcielements.FcielementsPackage#getAuthorizationKey()
 * @model
 * @generated
 */
public interface AuthorizationKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see FederationOffice.fcielements.FcielementsPackage#getAuthorizationKey_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link FederationOffice.fcielements.AuthorizationKey#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see FederationOffice.fcielements.FcielementsPackage#getAuthorizationKey_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link FederationOffice.fcielements.AuthorizationKey#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credentials</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' reference.
	 * @see #setCredentials(FCICredentials)
	 * @see FederationOffice.fcielements.FcielementsPackage#getAuthorizationKey_Credentials()
	 * @model
	 * @generated
	 */
	FCICredentials getCredentials();

	/**
	 * Sets the value of the '{@link FederationOffice.fcielements.AuthorizationKey#getCredentials <em>Credentials</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' reference.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(FCICredentials value);

} // AuthorizationKey
