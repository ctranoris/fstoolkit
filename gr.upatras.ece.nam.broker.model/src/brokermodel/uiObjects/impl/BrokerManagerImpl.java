/**
 */
package brokermodel.uiObjects.impl;

import brokermodel.Broker;

import brokermodel.uiObjects.BrokerManager;
import brokermodel.uiObjects.UiObjectsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broker Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link brokermodel.uiObjects.impl.BrokerManagerImpl#getBrokersRef <em>Brokers Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrokerManagerImpl extends EObjectImpl implements BrokerManager {
	/**
	 * The cached value of the '{@link #getBrokersRef() <em>Brokers Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokersRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Broker> brokersRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrokerManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiObjectsPackage.Literals.BROKER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Broker> getBrokersRef() {
		if (brokersRef == null) {
			brokersRef = new EObjectResolvingEList<Broker>(Broker.class, this, UiObjectsPackage.BROKER_MANAGER__BROKERS_REF);
		}
		return brokersRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiObjectsPackage.BROKER_MANAGER__BROKERS_REF:
				return getBrokersRef();
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
			case UiObjectsPackage.BROKER_MANAGER__BROKERS_REF:
				getBrokersRef().clear();
				getBrokersRef().addAll((Collection<? extends Broker>)newValue);
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
			case UiObjectsPackage.BROKER_MANAGER__BROKERS_REF:
				getBrokersRef().clear();
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
			case UiObjectsPackage.BROKER_MANAGER__BROKERS_REF:
				return brokersRef != null && !brokersRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BrokerManagerImpl
