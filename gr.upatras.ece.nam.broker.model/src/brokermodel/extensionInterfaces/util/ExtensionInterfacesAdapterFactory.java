/**
 */
package brokermodel.extensionInterfaces.util;

import brokermodel.extensionInterfaces.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see brokermodel.extensionInterfaces.ExtensionInterfacesPackage
 * @generated
 */
public class ExtensionInterfacesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtensionInterfacesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionInterfacesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtensionInterfacesPackage.eINSTANCE;
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
	protected ExtensionInterfacesSwitch<Adapter> modelSwitch =
		new ExtensionInterfacesSwitch<Adapter>() {
			@Override
			public Adapter caseIBrokerRepository(IBrokerRepository object) {
				return createIBrokerRepositoryAdapter();
			}
			@Override
			public Adapter caseIBrokerRepositoryListener(IBrokerRepositoryListener object) {
				return createIBrokerRepositoryListenerAdapter();
			}
			@Override
			public Adapter caseIProvisionResource(IProvisionResource object) {
				return createIProvisionResourceAdapter();
			}
			@Override
			public Adapter caseIWorkflowEngine(IWorkflowEngine object) {
				return createIWorkflowEngineAdapter();
			}
			@Override
			public Adapter caseIProvisioningJobListener(IProvisioningJobListener object) {
				return createIProvisioningJobListenerAdapter();
			}
			@Override
			public Adapter caseIProvisioningJobEvent(IProvisioningJobEvent object) {
				return createIProvisioningJobEventAdapter();
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
	 * Creates a new adapter for an object of class '{@link brokermodel.extensionInterfaces.IBrokerRepository <em>IBroker Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.extensionInterfaces.IBrokerRepository
	 * @generated
	 */
	public Adapter createIBrokerRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.extensionInterfaces.IBrokerRepositoryListener <em>IBroker Repository Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.extensionInterfaces.IBrokerRepositoryListener
	 * @generated
	 */
	public Adapter createIBrokerRepositoryListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.extensionInterfaces.IProvisionResource <em>IProvision Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.extensionInterfaces.IProvisionResource
	 * @generated
	 */
	public Adapter createIProvisionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.extensionInterfaces.IWorkflowEngine <em>IWorkflow Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.extensionInterfaces.IWorkflowEngine
	 * @generated
	 */
	public Adapter createIWorkflowEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.extensionInterfaces.IProvisioningJobListener <em>IProvisioning Job Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.extensionInterfaces.IProvisioningJobListener
	 * @generated
	 */
	public Adapter createIProvisioningJobListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.extensionInterfaces.IProvisioningJobEvent <em>IProvisioning Job Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.extensionInterfaces.IProvisioningJobEvent
	 * @generated
	 */
	public Adapter createIProvisioningJobEventAdapter() {
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

} //ExtensionInterfacesAdapterFactory
