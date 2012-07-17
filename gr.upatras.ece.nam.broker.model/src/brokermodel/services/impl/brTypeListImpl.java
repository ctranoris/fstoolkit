/**
 */
package brokermodel.services.impl;

import brokermodel.NamedElement;

import brokermodel.services.ServicesPackage;
import brokermodel.services.brTypeList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>br Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link brokermodel.services.impl.brTypeListImpl#getContainsElementsOf <em>Contains Elements Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class brTypeListImpl extends SettingTypeImpl implements brTypeList {
	/**
	 * The cached value of the '{@link #getContainsElementsOf() <em>Contains Elements Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsElementsOf()
	 * @generated
	 * @ordered
	 */
	protected NamedElement containsElementsOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected brTypeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicesPackage.Literals.BR_TYPE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getContainsElementsOf() {
		if (containsElementsOf != null && containsElementsOf.eIsProxy()) {
			InternalEObject oldContainsElementsOf = (InternalEObject)containsElementsOf;
			containsElementsOf = (NamedElement)eResolveProxy(oldContainsElementsOf);
			if (containsElementsOf != oldContainsElementsOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicesPackage.BR_TYPE_LIST__CONTAINS_ELEMENTS_OF, oldContainsElementsOf, containsElementsOf));
			}
		}
		return containsElementsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetContainsElementsOf() {
		return containsElementsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsElementsOf(NamedElement newContainsElementsOf) {
		NamedElement oldContainsElementsOf = containsElementsOf;
		containsElementsOf = newContainsElementsOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.BR_TYPE_LIST__CONTAINS_ELEMENTS_OF, oldContainsElementsOf, containsElementsOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicesPackage.BR_TYPE_LIST__CONTAINS_ELEMENTS_OF:
				if (resolve) return getContainsElementsOf();
				return basicGetContainsElementsOf();
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
			case ServicesPackage.BR_TYPE_LIST__CONTAINS_ELEMENTS_OF:
				setContainsElementsOf((NamedElement)newValue);
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
			case ServicesPackage.BR_TYPE_LIST__CONTAINS_ELEMENTS_OF:
				setContainsElementsOf((NamedElement)null);
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
			case ServicesPackage.BR_TYPE_LIST__CONTAINS_ELEMENTS_OF:
				return containsElementsOf != null;
		}
		return super.eIsSet(featureID);
	}

} //brTypeListImpl
