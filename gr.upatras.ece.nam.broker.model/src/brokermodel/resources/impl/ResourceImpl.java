/**
 */
package brokermodel.resources.impl;

import brokermodel.impl.NamedElementImpl;

import brokermodel.resources.Resource;
import brokermodel.resources.ResourceCategory;
import brokermodel.resources.ResourceSetting;
import brokermodel.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link brokermodel.resources.impl.ResourceImpl#getResourceSettings <em>Resource Settings</em>}</li>
 *   <li>{@link brokermodel.resources.impl.ResourceImpl#getContributesToCategories <em>Contributes To Categories</em>}</li>
 *   <li>{@link brokermodel.resources.impl.ResourceImpl#getRequiresResources <em>Requires Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends NamedElementImpl implements Resource {
	/**
	 * The cached value of the '{@link #getResourceSettings() <em>Resource Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceSetting> resourceSettings;

	/**
	 * The cached value of the '{@link #getContributesToCategories() <em>Contributes To Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributesToCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceCategory> contributesToCategories;

	/**
	 * The cached value of the '{@link #getRequiresResources() <em>Requires Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> requiresResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceSetting> getResourceSettings() {
		if (resourceSettings == null) {
			resourceSettings = new EObjectContainmentEList<ResourceSetting>(ResourceSetting.class, this, ResourcesPackage.RESOURCE__RESOURCE_SETTINGS);
		}
		return resourceSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceCategory> getContributesToCategories() {
		if (contributesToCategories == null) {
			contributesToCategories = new EObjectWithInverseResolvingEList.ManyInverse<ResourceCategory>(ResourceCategory.class, this, ResourcesPackage.RESOURCE__CONTRIBUTES_TO_CATEGORIES, ResourcesPackage.RESOURCE_CATEGORY__RESOURCELIST);
		}
		return contributesToCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getRequiresResources() {
		if (requiresResources == null) {
			requiresResources = new EObjectResolvingEList<Resource>(Resource.class, this, ResourcesPackage.RESOURCE__REQUIRES_RESOURCES);
		}
		return requiresResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullQualifiedName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ResourcesPackage.RESOURCE__CONTRIBUTES_TO_CATEGORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributesToCategories()).basicAdd(otherEnd, msgs);
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
			case ResourcesPackage.RESOURCE__RESOURCE_SETTINGS:
				return ((InternalEList<?>)getResourceSettings()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.RESOURCE__CONTRIBUTES_TO_CATEGORIES:
				return ((InternalEList<?>)getContributesToCategories()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.RESOURCE__RESOURCE_SETTINGS:
				return getResourceSettings();
			case ResourcesPackage.RESOURCE__CONTRIBUTES_TO_CATEGORIES:
				return getContributesToCategories();
			case ResourcesPackage.RESOURCE__REQUIRES_RESOURCES:
				return getRequiresResources();
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
			case ResourcesPackage.RESOURCE__RESOURCE_SETTINGS:
				getResourceSettings().clear();
				getResourceSettings().addAll((Collection<? extends ResourceSetting>)newValue);
				return;
			case ResourcesPackage.RESOURCE__CONTRIBUTES_TO_CATEGORIES:
				getContributesToCategories().clear();
				getContributesToCategories().addAll((Collection<? extends ResourceCategory>)newValue);
				return;
			case ResourcesPackage.RESOURCE__REQUIRES_RESOURCES:
				getRequiresResources().clear();
				getRequiresResources().addAll((Collection<? extends Resource>)newValue);
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
			case ResourcesPackage.RESOURCE__RESOURCE_SETTINGS:
				getResourceSettings().clear();
				return;
			case ResourcesPackage.RESOURCE__CONTRIBUTES_TO_CATEGORIES:
				getContributesToCategories().clear();
				return;
			case ResourcesPackage.RESOURCE__REQUIRES_RESOURCES:
				getRequiresResources().clear();
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
			case ResourcesPackage.RESOURCE__RESOURCE_SETTINGS:
				return resourceSettings != null && !resourceSettings.isEmpty();
			case ResourcesPackage.RESOURCE__CONTRIBUTES_TO_CATEGORIES:
				return contributesToCategories != null && !contributesToCategories.isEmpty();
			case ResourcesPackage.RESOURCE__REQUIRES_RESOURCES:
				return requiresResources != null && !requiresResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
