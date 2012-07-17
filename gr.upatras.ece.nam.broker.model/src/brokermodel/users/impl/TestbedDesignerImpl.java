/**
 */
package brokermodel.users.impl;

import brokermodel.federationscenarios.RequestedFederationScenario;

import brokermodel.users.TestbedDesigner;
import brokermodel.users.UsersPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testbed Designer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link brokermodel.users.impl.TestbedDesignerImpl#getDesignsVirtualTestbeds <em>Designs Virtual Testbeds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestbedDesignerImpl extends BrokerUserImpl implements TestbedDesigner {
	/**
	 * The cached value of the '{@link #getDesignsVirtualTestbeds() <em>Designs Virtual Testbeds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignsVirtualTestbeds()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestedFederationScenario> designsVirtualTestbeds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestbedDesignerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsersPackage.Literals.TESTBED_DESIGNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestedFederationScenario> getDesignsVirtualTestbeds() {
		if (designsVirtualTestbeds == null) {
			designsVirtualTestbeds = new EObjectResolvingEList<RequestedFederationScenario>(RequestedFederationScenario.class, this, UsersPackage.TESTBED_DESIGNER__DESIGNS_VIRTUAL_TESTBEDS);
		}
		return designsVirtualTestbeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsersPackage.TESTBED_DESIGNER__DESIGNS_VIRTUAL_TESTBEDS:
				return getDesignsVirtualTestbeds();
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
			case UsersPackage.TESTBED_DESIGNER__DESIGNS_VIRTUAL_TESTBEDS:
				getDesignsVirtualTestbeds().clear();
				getDesignsVirtualTestbeds().addAll((Collection<? extends RequestedFederationScenario>)newValue);
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
			case UsersPackage.TESTBED_DESIGNER__DESIGNS_VIRTUAL_TESTBEDS:
				getDesignsVirtualTestbeds().clear();
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
			case UsersPackage.TESTBED_DESIGNER__DESIGNS_VIRTUAL_TESTBEDS:
				return designsVirtualTestbeds != null && !designsVirtualTestbeds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestbedDesignerImpl
