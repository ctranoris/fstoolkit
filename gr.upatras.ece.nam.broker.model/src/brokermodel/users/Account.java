/**
 */
package brokermodel.users;

import brokermodel.NamedElement;

import brokermodel.fcielements.AuthorizationKey;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.users.Account#getPassword <em>Password</em>}</li>
 *   <li>{@link brokermodel.users.Account#getUsername <em>Username</em>}</li>
 *   <li>{@link brokermodel.users.Account#getAuthorizationKey <em>Authorization Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.users.UsersPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends NamedElement {
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
	 * @see brokermodel.users.UsersPackage#getAccount_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link brokermodel.users.Account#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

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
	 * @see brokermodel.users.UsersPackage#getAccount_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link brokermodel.users.Account#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Authorization Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Key</em>' containment reference.
	 * @see #setAuthorizationKey(AuthorizationKey)
	 * @see brokermodel.users.UsersPackage#getAccount_AuthorizationKey()
	 * @model containment="true"
	 * @generated
	 */
	AuthorizationKey getAuthorizationKey();

	/**
	 * Sets the value of the '{@link brokermodel.users.Account#getAuthorizationKey <em>Authorization Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Key</em>' containment reference.
	 * @see #getAuthorizationKey()
	 * @generated
	 */
	void setAuthorizationKey(AuthorizationKey value);

} // Account
