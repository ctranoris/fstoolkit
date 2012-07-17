/**
 */
package brokermodel.providersite.impl;

import brokermodel.impl.NamedElementImpl;

import brokermodel.providersite.DomainManager;
import brokermodel.providersite.ProvidersitePackage;
import brokermodel.providersite.Site;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link brokermodel.providersite.impl.DomainManagerImpl#getIP <em>IP</em>}</li>
 *   <li>{@link brokermodel.providersite.impl.DomainManagerImpl#getBelongsToSite <em>Belongs To Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainManagerImpl extends NamedElementImpl implements DomainManager {
	/**
	 * The default value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvidersitePackage.Literals.DOMAIN_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIP() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIP(String newIP) {
		String oldIP = ip;
		ip = newIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvidersitePackage.DOMAIN_MANAGER__IP, oldIP, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site getBelongsToSite() {
		if (eContainerFeatureID() != ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE) return null;
		return (Site)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsToSite(Site newBelongsToSite, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBelongsToSite, ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsToSite(Site newBelongsToSite) {
		if (newBelongsToSite != eInternalContainer() || (eContainerFeatureID() != ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE && newBelongsToSite != null)) {
			if (EcoreUtil.isAncestor(this, newBelongsToSite))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBelongsToSite != null)
				msgs = ((InternalEObject)newBelongsToSite).eInverseAdd(this, ProvidersitePackage.SITE__PTM, Site.class, msgs);
			msgs = basicSetBelongsToSite(newBelongsToSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE, newBelongsToSite, newBelongsToSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBelongsToSite((Site)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE:
				return basicSetBelongsToSite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE:
				return eInternalContainer().eInverseRemove(this, ProvidersitePackage.SITE__PTM, Site.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProvidersitePackage.DOMAIN_MANAGER__IP:
				return getIP();
			case ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE:
				return getBelongsToSite();
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
			case ProvidersitePackage.DOMAIN_MANAGER__IP:
				setIP((String)newValue);
				return;
			case ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE:
				setBelongsToSite((Site)newValue);
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
			case ProvidersitePackage.DOMAIN_MANAGER__IP:
				setIP(IP_EDEFAULT);
				return;
			case ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE:
				setBelongsToSite((Site)null);
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
			case ProvidersitePackage.DOMAIN_MANAGER__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE:
				return getBelongsToSite() != null;
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
		result.append(" (IP: ");
		result.append(ip);
		result.append(')');
		return result.toString();
	}

} //DomainManagerImpl
