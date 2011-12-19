/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package FederationOffice.fcielements.impl;

import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.fcielements.FCICredentials;
import FederationOffice.fcielements.FcielementsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FederationOffice.fcielements.impl.AuthorizationKeyImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link FederationOffice.fcielements.impl.AuthorizationKeyImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link FederationOffice.fcielements.impl.AuthorizationKeyImpl#getCredentials <em>Credentials</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorizationKeyImpl extends EObjectImpl implements AuthorizationKey {
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
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected FCICredentials credentials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FcielementsPackage.Literals.AUTHORIZATION_KEY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FcielementsPackage.AUTHORIZATION_KEY__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FcielementsPackage.AUTHORIZATION_KEY__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FCICredentials getCredentials() {
		if (credentials != null && credentials.eIsProxy()) {
			InternalEObject oldCredentials = (InternalEObject)credentials;
			credentials = (FCICredentials)eResolveProxy(oldCredentials);
			if (credentials != oldCredentials) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FcielementsPackage.AUTHORIZATION_KEY__CREDENTIALS, oldCredentials, credentials));
			}
		}
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FCICredentials basicGetCredentials() {
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentials(FCICredentials newCredentials) {
		FCICredentials oldCredentials = credentials;
		credentials = newCredentials;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FcielementsPackage.AUTHORIZATION_KEY__CREDENTIALS, oldCredentials, credentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FcielementsPackage.AUTHORIZATION_KEY__USERNAME:
				return getUsername();
			case FcielementsPackage.AUTHORIZATION_KEY__PASSWORD:
				return getPassword();
			case FcielementsPackage.AUTHORIZATION_KEY__CREDENTIALS:
				if (resolve) return getCredentials();
				return basicGetCredentials();
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
			case FcielementsPackage.AUTHORIZATION_KEY__USERNAME:
				setUsername((String)newValue);
				return;
			case FcielementsPackage.AUTHORIZATION_KEY__PASSWORD:
				setPassword((String)newValue);
				return;
			case FcielementsPackage.AUTHORIZATION_KEY__CREDENTIALS:
				setCredentials((FCICredentials)newValue);
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
			case FcielementsPackage.AUTHORIZATION_KEY__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case FcielementsPackage.AUTHORIZATION_KEY__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case FcielementsPackage.AUTHORIZATION_KEY__CREDENTIALS:
				setCredentials((FCICredentials)null);
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
			case FcielementsPackage.AUTHORIZATION_KEY__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case FcielementsPackage.AUTHORIZATION_KEY__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case FcielementsPackage.AUTHORIZATION_KEY__CREDENTIALS:
				return credentials != null;
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
		result.append(" (username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //AuthorizationKeyImpl
