/**
 */
package brokermodel.services.impl;

import brokermodel.NamedElement;

import brokermodel.services.ServicesPackage;
import brokermodel.services.brTypeTideElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>br Type Tide Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link brokermodel.services.impl.brTypeTideElementImpl#getOfTideElement <em>Of Tide Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class brTypeTideElementImpl extends SettingTypeImpl implements brTypeTideElement {
	/**
	 * The cached value of the '{@link #getOfTideElement() <em>Of Tide Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfTideElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement ofTideElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected brTypeTideElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicesPackage.Literals.BR_TYPE_TIDE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getOfTideElement() {
		if (ofTideElement != null && ofTideElement.eIsProxy()) {
			InternalEObject oldOfTideElement = (InternalEObject)ofTideElement;
			ofTideElement = (NamedElement)eResolveProxy(oldOfTideElement);
			if (ofTideElement != oldOfTideElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicesPackage.BR_TYPE_TIDE_ELEMENT__OF_TIDE_ELEMENT, oldOfTideElement, ofTideElement));
			}
		}
		return ofTideElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetOfTideElement() {
		return ofTideElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfTideElement(NamedElement newOfTideElement) {
		NamedElement oldOfTideElement = ofTideElement;
		ofTideElement = newOfTideElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.BR_TYPE_TIDE_ELEMENT__OF_TIDE_ELEMENT, oldOfTideElement, ofTideElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicesPackage.BR_TYPE_TIDE_ELEMENT__OF_TIDE_ELEMENT:
				if (resolve) return getOfTideElement();
				return basicGetOfTideElement();
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
			case ServicesPackage.BR_TYPE_TIDE_ELEMENT__OF_TIDE_ELEMENT:
				setOfTideElement((NamedElement)newValue);
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
			case ServicesPackage.BR_TYPE_TIDE_ELEMENT__OF_TIDE_ELEMENT:
				setOfTideElement((NamedElement)null);
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
			case ServicesPackage.BR_TYPE_TIDE_ELEMENT__OF_TIDE_ELEMENT:
				return ofTideElement != null;
		}
		return super.eIsSet(featureID);
	}

} //brTypeTideElementImpl
