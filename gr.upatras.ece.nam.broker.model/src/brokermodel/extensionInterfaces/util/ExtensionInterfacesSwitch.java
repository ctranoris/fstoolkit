/**
 */
package brokermodel.extensionInterfaces.util;

import brokermodel.extensionInterfaces.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see brokermodel.extensionInterfaces.ExtensionInterfacesPackage
 * @generated
 */
public class ExtensionInterfacesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtensionInterfacesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionInterfacesSwitch() {
		if (modelPackage == null) {
			modelPackage = ExtensionInterfacesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExtensionInterfacesPackage.IBROKER_REPOSITORY: {
				IBrokerRepository iBrokerRepository = (IBrokerRepository)theEObject;
				T result = caseIBrokerRepository(iBrokerRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionInterfacesPackage.IBROKER_REPOSITORY_LISTENER: {
				IBrokerRepositoryListener iBrokerRepositoryListener = (IBrokerRepositoryListener)theEObject;
				T result = caseIBrokerRepositoryListener(iBrokerRepositoryListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionInterfacesPackage.IPROVISION_RESOURCE: {
				IProvisionResource iProvisionResource = (IProvisionResource)theEObject;
				T result = caseIProvisionResource(iProvisionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionInterfacesPackage.IWORKFLOW_ENGINE: {
				IWorkflowEngine iWorkflowEngine = (IWorkflowEngine)theEObject;
				T result = caseIWorkflowEngine(iWorkflowEngine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionInterfacesPackage.IPROVISIONING_JOB_LISTENER: {
				IProvisioningJobListener iProvisioningJobListener = (IProvisioningJobListener)theEObject;
				T result = caseIProvisioningJobListener(iProvisioningJobListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionInterfacesPackage.IPROVISIONING_JOB_EVENT: {
				IProvisioningJobEvent iProvisioningJobEvent = (IProvisioningJobEvent)theEObject;
				T result = caseIProvisioningJobEvent(iProvisioningJobEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBroker Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBroker Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBrokerRepository(IBrokerRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBroker Repository Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBroker Repository Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBrokerRepositoryListener(IBrokerRepositoryListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProvision Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProvision Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProvisionResource(IProvisionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IWorkflow Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IWorkflow Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIWorkflowEngine(IWorkflowEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProvisioning Job Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProvisioning Job Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProvisioningJobListener(IProvisioningJobListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProvisioning Job Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProvisioning Job Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProvisioningJobEvent(IProvisioningJobEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExtensionInterfacesSwitch
