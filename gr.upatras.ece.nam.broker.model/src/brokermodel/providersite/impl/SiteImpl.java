/**
 */
package brokermodel.providersite.impl;

import brokermodel.impl.NamedElementImpl;

import brokermodel.providersite.DomainManager;
import brokermodel.providersite.ProvidersitePackage;
import brokermodel.providersite.Site;
import brokermodel.providersite.SiteLocation;

import brokermodel.resources.OfferedResource;
import brokermodel.resources.ResourcesPackage;

import brokermodel.users.ResourcesProvider;
import brokermodel.users.UsersPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link brokermodel.providersite.impl.SiteImpl#getDomainManager <em>Domain Manager</em>}</li>
 *   <li>{@link brokermodel.providersite.impl.SiteImpl#getLocatedAt <em>Located At</em>}</li>
 *   <li>{@link brokermodel.providersite.impl.SiteImpl#getOfferedResourcesList <em>Offered Resources List</em>}</li>
 *   <li>{@link brokermodel.providersite.impl.SiteImpl#getBelongsToProvider <em>Belongs To Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiteImpl extends NamedElementImpl implements Site {
	/**
	 * The cached value of the '{@link #getDomainManager() <em>Domain Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainManager()
	 * @generated
	 * @ordered
	 */
	protected DomainManager domainManager;

	/**
	 * The cached value of the '{@link #getLocatedAt() <em>Located At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatedAt()
	 * @generated
	 * @ordered
	 */
	protected SiteLocation locatedAt;

	/**
	 * The cached value of the '{@link #getOfferedResourcesList() <em>Offered Resources List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedResourcesList()
	 * @generated
	 * @ordered
	 */
	protected EList<OfferedResource> offeredResourcesList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvidersitePackage.Literals.SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainManager getDomainManager() {
		return domainManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainManager(DomainManager newDomainManager, NotificationChain msgs) {
		DomainManager oldDomainManager = domainManager;
		domainManager = newDomainManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvidersitePackage.SITE__DOMAIN_MANAGER, oldDomainManager, newDomainManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainManager(DomainManager newDomainManager) {
		if (newDomainManager != domainManager) {
			NotificationChain msgs = null;
			if (domainManager != null)
				msgs = ((InternalEObject)domainManager).eInverseRemove(this, ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE, DomainManager.class, msgs);
			if (newDomainManager != null)
				msgs = ((InternalEObject)newDomainManager).eInverseAdd(this, ProvidersitePackage.DOMAIN_MANAGER__BELONGS_TO_SITE, DomainManager.class, msgs);
			msgs = basicSetDomainManager(newDomainManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvidersitePackage.SITE__DOMAIN_MANAGER, newDomainManager, newDomainManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteLocation getLocatedAt() {
		return locatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocatedAt(SiteLocation newLocatedAt, NotificationChain msgs) {
		SiteLocation oldLocatedAt = locatedAt;
		locatedAt = newLocatedAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvidersitePackage.SITE__LOCATED_AT, oldLocatedAt, newLocatedAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocatedAt(SiteLocation newLocatedAt) {
		if (newLocatedAt != locatedAt) {
			NotificationChain msgs = null;
			if (locatedAt != null)
				msgs = ((InternalEObject)locatedAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvidersitePackage.SITE__LOCATED_AT, null, msgs);
			if (newLocatedAt != null)
				msgs = ((InternalEObject)newLocatedAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvidersitePackage.SITE__LOCATED_AT, null, msgs);
			msgs = basicSetLocatedAt(newLocatedAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvidersitePackage.SITE__LOCATED_AT, newLocatedAt, newLocatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OfferedResource> getOfferedResourcesList() {
		if (offeredResourcesList == null) {
			offeredResourcesList = new EObjectContainmentWithInverseEList<OfferedResource>(OfferedResource.class, this, ProvidersitePackage.SITE__OFFERED_RESOURCES_LIST, ResourcesPackage.OFFERED_RESOURCE__BELONGS_TO_SITE);
		}
		return offeredResourcesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesProvider getBelongsToProvider() {
		if (eContainerFeatureID() != ProvidersitePackage.SITE__BELONGS_TO_PROVIDER) return null;
		return (ResourcesProvider)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsToProvider(ResourcesProvider newBelongsToProvider, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBelongsToProvider, ProvidersitePackage.SITE__BELONGS_TO_PROVIDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsToProvider(ResourcesProvider newBelongsToProvider) {
		if (newBelongsToProvider != eInternalContainer() || (eContainerFeatureID() != ProvidersitePackage.SITE__BELONGS_TO_PROVIDER && newBelongsToProvider != null)) {
			if (EcoreUtil.isAncestor(this, newBelongsToProvider))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBelongsToProvider != null)
				msgs = ((InternalEObject)newBelongsToProvider).eInverseAdd(this, UsersPackage.RESOURCES_PROVIDER__OFFERED_SITE_LIST, ResourcesProvider.class, msgs);
			msgs = basicSetBelongsToProvider(newBelongsToProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvidersitePackage.SITE__BELONGS_TO_PROVIDER, newBelongsToProvider, newBelongsToProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProvidersitePackage.SITE__DOMAIN_MANAGER:
				if (domainManager != null)
					msgs = ((InternalEObject)domainManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvidersitePackage.SITE__DOMAIN_MANAGER, null, msgs);
				return basicSetDomainManager((DomainManager)otherEnd, msgs);
			case ProvidersitePackage.SITE__OFFERED_RESOURCES_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOfferedResourcesList()).basicAdd(otherEnd, msgs);
			case ProvidersitePackage.SITE__BELONGS_TO_PROVIDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBelongsToProvider((ResourcesProvider)otherEnd, msgs);
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
			case ProvidersitePackage.SITE__DOMAIN_MANAGER:
				return basicSetDomainManager(null, msgs);
			case ProvidersitePackage.SITE__LOCATED_AT:
				return basicSetLocatedAt(null, msgs);
			case ProvidersitePackage.SITE__OFFERED_RESOURCES_LIST:
				return ((InternalEList<?>)getOfferedResourcesList()).basicRemove(otherEnd, msgs);
			case ProvidersitePackage.SITE__BELONGS_TO_PROVIDER:
				return basicSetBelongsToProvider(null, msgs);
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
			case ProvidersitePackage.SITE__BELONGS_TO_PROVIDER:
				return eInternalContainer().eInverseRemove(this, UsersPackage.RESOURCES_PROVIDER__OFFERED_SITE_LIST, ResourcesProvider.class, msgs);
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
			case ProvidersitePackage.SITE__DOMAIN_MANAGER:
				return getDomainManager();
			case ProvidersitePackage.SITE__LOCATED_AT:
				return getLocatedAt();
			case ProvidersitePackage.SITE__OFFERED_RESOURCES_LIST:
				return getOfferedResourcesList();
			case ProvidersitePackage.SITE__BELONGS_TO_PROVIDER:
				return getBelongsToProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProvidersitePackage.SITE__DOMAIN_MANAGER:
				setDomainManager((DomainManager)newValue);
				return;
			case ProvidersitePackage.SITE__LOCATED_AT:
				setLocatedAt((SiteLocation)newValue);
				return;
			case ProvidersitePackage.SITE__OFFERED_RESOURCES_LIST:
				getOfferedResourcesList().clear();
				getOfferedResourcesList().addAll((Collection<? extends OfferedResource>)newValue);
				return;
			case ProvidersitePackage.SITE__BELONGS_TO_PROVIDER:
				setBelongsToProvider((ResourcesProvider)newValue);
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
			case ProvidersitePackage.SITE__DOMAIN_MANAGER:
				setDomainManager((DomainManager)null);
				return;
			case ProvidersitePackage.SITE__LOCATED_AT:
				setLocatedAt((SiteLocation)null);
				return;
			case ProvidersitePackage.SITE__OFFERED_RESOURCES_LIST:
				getOfferedResourcesList().clear();
				return;
			case ProvidersitePackage.SITE__BELONGS_TO_PROVIDER:
				setBelongsToProvider((ResourcesProvider)null);
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
			case ProvidersitePackage.SITE__DOMAIN_MANAGER:
				return domainManager != null;
			case ProvidersitePackage.SITE__LOCATED_AT:
				return locatedAt != null;
			case ProvidersitePackage.SITE__OFFERED_RESOURCES_LIST:
				return offeredResourcesList != null && !offeredResourcesList.isEmpty();
			case ProvidersitePackage.SITE__BELONGS_TO_PROVIDER:
				return getBelongsToProvider() != null;
		}
		return super.eIsSet(featureID);
	}

} //SiteImpl
