/**
 */
package brokermodel.users.impl;

import brokermodel.federationscenarios.RequestedFederationScenario;

import brokermodel.users.BrokerCustomer;
import brokermodel.users.TestbedDesigner;
import brokermodel.users.UsersPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broker Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link brokermodel.users.impl.BrokerCustomerImpl#getUtilizesVirtualTestbed <em>Utilizes Virtual Testbed</em>}</li>
 *   <li>{@link brokermodel.users.impl.BrokerCustomerImpl#getHasTestbedDesigner <em>Has Testbed Designer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrokerCustomerImpl extends BrokerUserImpl implements BrokerCustomer {
	/**
	 * The cached value of the '{@link #getUtilizesVirtualTestbed() <em>Utilizes Virtual Testbed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizesVirtualTestbed()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestedFederationScenario> utilizesVirtualTestbed;

	/**
	 * The cached value of the '{@link #getHasTestbedDesigner() <em>Has Testbed Designer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTestbedDesigner()
	 * @generated
	 * @ordered
	 */
	protected TestbedDesigner hasTestbedDesigner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrokerCustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersPackage.Literals.BROKER_CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestedFederationScenario> getUtilizesVirtualTestbed() {
		if (utilizesVirtualTestbed == null) {
			utilizesVirtualTestbed = new EObjectResolvingEList<RequestedFederationScenario>(RequestedFederationScenario.class, this, UsersPackage.BROKER_CUSTOMER__UTILIZES_VIRTUAL_TESTBED);
		}
		return utilizesVirtualTestbed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestbedDesigner getHasTestbedDesigner() {
		if (hasTestbedDesigner != null && hasTestbedDesigner.eIsProxy()) {
			InternalEObject oldHasTestbedDesigner = (InternalEObject)hasTestbedDesigner;
			hasTestbedDesigner = (TestbedDesigner)eResolveProxy(oldHasTestbedDesigner);
			if (hasTestbedDesigner != oldHasTestbedDesigner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsersPackage.BROKER_CUSTOMER__HAS_TESTBED_DESIGNER, oldHasTestbedDesigner, hasTestbedDesigner));
			}
		}
		return hasTestbedDesigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestbedDesigner basicGetHasTestbedDesigner() {
		return hasTestbedDesigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasTestbedDesigner(TestbedDesigner newHasTestbedDesigner) {
		TestbedDesigner oldHasTestbedDesigner = hasTestbedDesigner;
		hasTestbedDesigner = newHasTestbedDesigner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsersPackage.BROKER_CUSTOMER__HAS_TESTBED_DESIGNER, oldHasTestbedDesigner, hasTestbedDesigner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsersPackage.BROKER_CUSTOMER__UTILIZES_VIRTUAL_TESTBED:
				return getUtilizesVirtualTestbed();
			case UsersPackage.BROKER_CUSTOMER__HAS_TESTBED_DESIGNER:
				if (resolve) return getHasTestbedDesigner();
				return basicGetHasTestbedDesigner();
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
			case UsersPackage.BROKER_CUSTOMER__UTILIZES_VIRTUAL_TESTBED:
				getUtilizesVirtualTestbed().clear();
				getUtilizesVirtualTestbed().addAll((Collection<? extends RequestedFederationScenario>)newValue);
				return;
			case UsersPackage.BROKER_CUSTOMER__HAS_TESTBED_DESIGNER:
				setHasTestbedDesigner((TestbedDesigner)newValue);
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
			case UsersPackage.BROKER_CUSTOMER__UTILIZES_VIRTUAL_TESTBED:
				getUtilizesVirtualTestbed().clear();
				return;
			case UsersPackage.BROKER_CUSTOMER__HAS_TESTBED_DESIGNER:
				setHasTestbedDesigner((TestbedDesigner)null);
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
			case UsersPackage.BROKER_CUSTOMER__UTILIZES_VIRTUAL_TESTBED:
				return utilizesVirtualTestbed != null && !utilizesVirtualTestbed.isEmpty();
			case UsersPackage.BROKER_CUSTOMER__HAS_TESTBED_DESIGNER:
				return hasTestbedDesigner != null;
		}
		return super.eIsSet(featureID);
	}

} //BrokerCustomerImpl
