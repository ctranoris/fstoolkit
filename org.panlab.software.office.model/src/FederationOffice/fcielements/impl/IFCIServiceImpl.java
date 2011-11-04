/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package FederationOffice.fcielements.impl;

import FederationOffice.Office;

import FederationOffice.fcielements.FcielementsPackage;
import FederationOffice.fcielements.IFCIService;

import FederationOffice.federationscenarios.ResourceRequest;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFCI Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link FederationOffice.fcielements.impl.IFCIServiceImpl#getOffice <em>Office</em>}</li>
 *   <li>{@link FederationOffice.fcielements.impl.IFCIServiceImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFCIServiceImpl extends EObjectImpl implements IFCIService {
	/**
	 * The cached value of the '{@link #getOffice() <em>Office</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice()
	 * @generated
	 * @ordered
	 */
	protected Office office;
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected IFCIService instance;
	/**
	 * This is true if the Instance reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instanceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFCIServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FcielementsPackage.Literals.IFCI_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Office getOffice() {
		if (office != null && office.eIsProxy()) {
			InternalEObject oldOffice = (InternalEObject)office;
			office = (Office)eResolveProxy(oldOffice);
			if (office != oldOffice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FcielementsPackage.IFCI_SERVICE__OFFICE, oldOffice, office));
			}
		}
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Office basicGetOffice() {
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffice(Office newOffice) {
		Office oldOffice = office;
		office = newOffice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FcielementsPackage.IFCI_SERVICE__OFFICE, oldOffice, office));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFCIService getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = (IFCIService)eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FcielementsPackage.IFCI_SERVICE__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFCIService basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstance() {
		return instanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Office getOffice(String username, String password, boolean forceRefresh) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String CreateResource(String scenario, String providerAlias, String resourceTypeName, ResourceRequest resourceReq) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String UpdateResource(String scenario, String providerAlias, String resourceTypeName, String runtimeID, ResourceRequest resourceReq) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DeleteResource(String scenario, String providerAlias, String resourceTypeName, String runtimeID, ResourceRequest resourceReq) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterValueOfResource(String scenario, String providerAlias, String runtimeID, String paramName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FcielementsPackage.IFCI_SERVICE__OFFICE:
				if (resolve) return getOffice();
				return basicGetOffice();
			case FcielementsPackage.IFCI_SERVICE__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
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
			case FcielementsPackage.IFCI_SERVICE__OFFICE:
				setOffice((Office)newValue);
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
			case FcielementsPackage.IFCI_SERVICE__OFFICE:
				setOffice((Office)null);
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
			case FcielementsPackage.IFCI_SERVICE__OFFICE:
				return office != null;
			case FcielementsPackage.IFCI_SERVICE__INSTANCE:
				return isSetInstance();
		}
		return super.eIsSet(featureID);
	}

} //IFCIServiceImpl
