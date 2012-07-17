/**
 */
package brokermodel.users.util;

import brokermodel.NamedElement;

import brokermodel.users.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see brokermodel.users.UsersPackage
 * @generated
 */
public class UsersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UsersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UsersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsersSwitch<Adapter> modelSwitch =
		new UsersSwitch<Adapter>() {
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseResourcesProvider(ResourcesProvider object) {
				return createResourcesProviderAdapter();
			}
			@Override
			public Adapter caseTestbedDesigner(TestbedDesigner object) {
				return createTestbedDesignerAdapter();
			}
			@Override
			public Adapter caseAdmin(Admin object) {
				return createAdminAdapter();
			}
			@Override
			public Adapter caseBrokerCustomer(BrokerCustomer object) {
				return createBrokerCustomerAdapter();
			}
			@Override
			public Adapter caseBrokerUser(BrokerUser object) {
				return createBrokerUserAdapter();
			}
			@Override
			public Adapter caseBrokerPersonel(BrokerPersonel object) {
				return createBrokerPersonelAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.users.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.users.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.users.ResourcesProvider <em>Resources Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.users.ResourcesProvider
	 * @generated
	 */
	public Adapter createResourcesProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.users.TestbedDesigner <em>Testbed Designer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.users.TestbedDesigner
	 * @generated
	 */
	public Adapter createTestbedDesignerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.users.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.users.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.users.BrokerCustomer <em>Broker Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.users.BrokerCustomer
	 * @generated
	 */
	public Adapter createBrokerCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.users.BrokerUser <em>Broker User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.users.BrokerUser
	 * @generated
	 */
	public Adapter createBrokerUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.users.BrokerPersonel <em>Broker Personel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.users.BrokerPersonel
	 * @generated
	 */
	public Adapter createBrokerPersonelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UsersAdapterFactory
