/**
 */
package brokermodel.users.impl;

import brokermodel.users.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsersFactoryImpl extends EFactoryImpl implements UsersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsersFactory init() {
		try {
			UsersFactory theUsersFactory = (UsersFactory)EPackage.Registry.INSTANCE.getEFactory("http://nam.ece.upatras.gr/broker/model/users"); 
			if (theUsersFactory != null) {
				return theUsersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UsersPackage.ACCOUNT: return createAccount();
			case UsersPackage.RESOURCES_PROVIDER: return createResourcesProvider();
			case UsersPackage.TESTBED_DESIGNER: return createTestbedDesigner();
			case UsersPackage.ADMIN: return createAdmin();
			case UsersPackage.BROKER_CUSTOMER: return createBrokerCustomer();
			case UsersPackage.BROKER_PERSONEL: return createBrokerPersonel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesProvider createResourcesProvider() {
		ResourcesProviderImpl resourcesProvider = new ResourcesProviderImpl();
		return resourcesProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestbedDesigner createTestbedDesigner() {
		TestbedDesignerImpl testbedDesigner = new TestbedDesignerImpl();
		return testbedDesigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerCustomer createBrokerCustomer() {
		BrokerCustomerImpl brokerCustomer = new BrokerCustomerImpl();
		return brokerCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerPersonel createBrokerPersonel() {
		BrokerPersonelImpl brokerPersonel = new BrokerPersonelImpl();
		return brokerPersonel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsersPackage getUsersPackage() {
		return (UsersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsersPackage getPackage() {
		return UsersPackage.eINSTANCE;
	}

} //UsersFactoryImpl
