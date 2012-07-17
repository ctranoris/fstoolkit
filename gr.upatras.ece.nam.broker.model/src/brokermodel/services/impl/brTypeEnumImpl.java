/**
 */
package brokermodel.services.impl;

import brokermodel.services.ServicesPackage;
import brokermodel.services.brTypeEnum;
import brokermodel.services.brTypeEnumItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>br Type Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link brokermodel.services.impl.brTypeEnumImpl#getTideEnumlist <em>Tide Enumlist</em>}</li>
 *   <li>{@link brokermodel.services.impl.brTypeEnumImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class brTypeEnumImpl extends SettingTypeImpl implements brTypeEnum {
	/**
	 * The cached value of the '{@link #getTideEnumlist() <em>Tide Enumlist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTideEnumlist()
	 * @generated
	 * @ordered
	 */
	protected EList<brTypeEnumItem> tideEnumlist;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected brTypeEnumItem defaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected brTypeEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicesPackage.Literals.BR_TYPE_ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<brTypeEnumItem> getTideEnumlist() {
		if (tideEnumlist == null) {
			tideEnumlist = new EObjectContainmentEList<brTypeEnumItem>(brTypeEnumItem.class, this, ServicesPackage.BR_TYPE_ENUM__TIDE_ENUMLIST);
		}
		return tideEnumlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public brTypeEnumItem getDefaultValue() {
		if (defaultValue != null && defaultValue.eIsProxy()) {
			InternalEObject oldDefaultValue = (InternalEObject)defaultValue;
			defaultValue = (brTypeEnumItem)eResolveProxy(oldDefaultValue);
			if (defaultValue != oldDefaultValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicesPackage.BR_TYPE_ENUM__DEFAULT_VALUE, oldDefaultValue, defaultValue));
			}
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public brTypeEnumItem basicGetDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(brTypeEnumItem newDefaultValue) {
		brTypeEnumItem oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.BR_TYPE_ENUM__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicesPackage.BR_TYPE_ENUM__TIDE_ENUMLIST:
				return ((InternalEList<?>)getTideEnumlist()).basicRemove(otherEnd, msgs);
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
			case ServicesPackage.BR_TYPE_ENUM__TIDE_ENUMLIST:
				return getTideEnumlist();
			case ServicesPackage.BR_TYPE_ENUM__DEFAULT_VALUE:
				if (resolve) return getDefaultValue();
				return basicGetDefaultValue();
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
			case ServicesPackage.BR_TYPE_ENUM__TIDE_ENUMLIST:
				getTideEnumlist().clear();
				getTideEnumlist().addAll((Collection<? extends brTypeEnumItem>)newValue);
				return;
			case ServicesPackage.BR_TYPE_ENUM__DEFAULT_VALUE:
				setDefaultValue((brTypeEnumItem)newValue);
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
			case ServicesPackage.BR_TYPE_ENUM__TIDE_ENUMLIST:
				getTideEnumlist().clear();
				return;
			case ServicesPackage.BR_TYPE_ENUM__DEFAULT_VALUE:
				setDefaultValue((brTypeEnumItem)null);
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
			case ServicesPackage.BR_TYPE_ENUM__TIDE_ENUMLIST:
				return tideEnumlist != null && !tideEnumlist.isEmpty();
			case ServicesPackage.BR_TYPE_ENUM__DEFAULT_VALUE:
				return defaultValue != null;
		}
		return super.eIsSet(featureID);
	}

} //brTypeEnumImpl
