/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package FederationOffice.users.impl;

import FederationOffice.fcielements.AuthorizationKey;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import FederationOffice.impl.NamedElementImpl;
import FederationOffice.users.Account;
import FederationOffice.users.UsersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FederationOffice.users.impl.AccountImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link FederationOffice.users.impl.AccountImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link FederationOffice.users.impl.AccountImpl#getAuthorizationKey <em>Authorization Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountImpl extends NamedElementImpl implements Account {
	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthorizationKey() <em>Authorization Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationKey()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationKey authorizationKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersPackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsersPackage.ACCOUNT__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsersPackage.ACCOUNT__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationKey getAuthorizationKey() {
		if (authorizationKey != null && authorizationKey.eIsProxy()) {
			InternalEObject oldAuthorizationKey = (InternalEObject)authorizationKey;
			authorizationKey = (AuthorizationKey)eResolveProxy(oldAuthorizationKey);
			if (authorizationKey != oldAuthorizationKey) {
				InternalEObject newAuthorizationKey = (InternalEObject)authorizationKey;
				NotificationChain msgs = oldAuthorizationKey.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsersPackage.ACCOUNT__AUTHORIZATION_KEY, null, null);
				if (newAuthorizationKey.eInternalContainer() == null) {
					msgs = newAuthorizationKey.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsersPackage.ACCOUNT__AUTHORIZATION_KEY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsersPackage.ACCOUNT__AUTHORIZATION_KEY, oldAuthorizationKey, authorizationKey));
			}
		}
		return authorizationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationKey basicGetAuthorizationKey() {
		return authorizationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorizationKey(AuthorizationKey newAuthorizationKey, NotificationChain msgs) {
		AuthorizationKey oldAuthorizationKey = authorizationKey;
		authorizationKey = newAuthorizationKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsersPackage.ACCOUNT__AUTHORIZATION_KEY, oldAuthorizationKey, newAuthorizationKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizationKey(AuthorizationKey newAuthorizationKey) {
		if (newAuthorizationKey != authorizationKey) {
			NotificationChain msgs = null;
			if (authorizationKey != null)
				msgs = ((InternalEObject)authorizationKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsersPackage.ACCOUNT__AUTHORIZATION_KEY, null, msgs);
			if (newAuthorizationKey != null)
				msgs = ((InternalEObject)newAuthorizationKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsersPackage.ACCOUNT__AUTHORIZATION_KEY, null, msgs);
			msgs = basicSetAuthorizationKey(newAuthorizationKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsersPackage.ACCOUNT__AUTHORIZATION_KEY, newAuthorizationKey, newAuthorizationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsersPackage.ACCOUNT__AUTHORIZATION_KEY:
				return basicSetAuthorizationKey(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsersPackage.ACCOUNT__PASSWORD:
				return getPassword();
			case UsersPackage.ACCOUNT__USERNAME:
				return getUsername();
			case UsersPackage.ACCOUNT__AUTHORIZATION_KEY:
				if (resolve) return getAuthorizationKey();
				return basicGetAuthorizationKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsersPackage.ACCOUNT__PASSWORD:
				setPassword((String)newValue);
				return;
			case UsersPackage.ACCOUNT__USERNAME:
				setUsername((String)newValue);
				return;
			case UsersPackage.ACCOUNT__AUTHORIZATION_KEY:
				setAuthorizationKey((AuthorizationKey)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UsersPackage.ACCOUNT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case UsersPackage.ACCOUNT__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case UsersPackage.ACCOUNT__AUTHORIZATION_KEY:
				setAuthorizationKey((AuthorizationKey)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UsersPackage.ACCOUNT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case UsersPackage.ACCOUNT__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case UsersPackage.ACCOUNT__AUTHORIZATION_KEY:
				return authorizationKey != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (password: ");
		result.append(password);
		result.append(", username: ");
		result.append(username);
		result.append(')');
		return result.toString();
	}

} //AccountImpl
