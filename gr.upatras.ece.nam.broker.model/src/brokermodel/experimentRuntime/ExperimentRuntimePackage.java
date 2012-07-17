/**
 */
package brokermodel.experimentRuntime;

import brokermodel.BrokermodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see brokermodel.experimentRuntime.ExperimentRuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface ExperimentRuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "experimentRuntime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nam.ece.upatras.gr/broker/model/experimentRuntime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr.upatras.ece.nam.broker.model.experimentRuntime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExperimentRuntimePackage eINSTANCE = brokermodel.experimentRuntime.impl.ExperimentRuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link brokermodel.experimentRuntime.impl.RuntimeElementImpl <em>Runtime Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.experimentRuntime.impl.RuntimeElementImpl
	 * @see brokermodel.experimentRuntime.impl.ExperimentRuntimePackageImpl#getRuntimeElement()
	 * @generated
	 */
	int RUNTIME_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__STATUS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__GUID = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT__CONTEXT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Runtime Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ELEMENT_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link brokermodel.experimentRuntime.impl.RunningScenariosImpl <em>Running Scenarios</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.experimentRuntime.impl.RunningScenariosImpl
	 * @see brokermodel.experimentRuntime.impl.ExperimentRuntimePackageImpl#getRunningScenarios()
	 * @generated
	 */
	int RUNNING_SCENARIOS = 1;

	/**
	 * The feature id for the '<em><b>Requested Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_SCENARIOS__REQUESTED_SCENARIOS = 0;

	/**
	 * The number of structural features of the '<em>Running Scenarios</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_SCENARIOS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link brokermodel.experimentRuntime.RuntimeElementStatus <em>Runtime Element Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.experimentRuntime.RuntimeElementStatus
	 * @see brokermodel.experimentRuntime.impl.ExperimentRuntimePackageImpl#getRuntimeElementStatus()
	 * @generated
	 */
	int RUNTIME_ELEMENT_STATUS = 2;


	/**
	 * Returns the meta object for class '{@link brokermodel.experimentRuntime.RuntimeElement <em>Runtime Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Element</em>'.
	 * @see brokermodel.experimentRuntime.RuntimeElement
	 * @generated
	 */
	EClass getRuntimeElement();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.experimentRuntime.RuntimeElement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see brokermodel.experimentRuntime.RuntimeElement#getStatus()
	 * @see #getRuntimeElement()
	 * @generated
	 */
	EAttribute getRuntimeElement_Status();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.experimentRuntime.RuntimeElement#getGUID <em>GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GUID</em>'.
	 * @see brokermodel.experimentRuntime.RuntimeElement#getGUID()
	 * @see #getRuntimeElement()
	 * @generated
	 */
	EAttribute getRuntimeElement_GUID();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.experimentRuntime.RuntimeElement#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see brokermodel.experimentRuntime.RuntimeElement#getContext()
	 * @see #getRuntimeElement()
	 * @generated
	 */
	EAttribute getRuntimeElement_Context();

	/**
	 * Returns the meta object for class '{@link brokermodel.experimentRuntime.RunningScenarios <em>Running Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Running Scenarios</em>'.
	 * @see brokermodel.experimentRuntime.RunningScenarios
	 * @generated
	 */
	EClass getRunningScenarios();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.experimentRuntime.RunningScenarios#getRequestedScenarios <em>Requested Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requested Scenarios</em>'.
	 * @see brokermodel.experimentRuntime.RunningScenarios#getRequestedScenarios()
	 * @see #getRunningScenarios()
	 * @generated
	 */
	EReference getRunningScenarios_RequestedScenarios();

	/**
	 * Returns the meta object for enum '{@link brokermodel.experimentRuntime.RuntimeElementStatus <em>Runtime Element Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Runtime Element Status</em>'.
	 * @see brokermodel.experimentRuntime.RuntimeElementStatus
	 * @generated
	 */
	EEnum getRuntimeElementStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExperimentRuntimeFactory getExperimentRuntimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link brokermodel.experimentRuntime.impl.RuntimeElementImpl <em>Runtime Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.experimentRuntime.impl.RuntimeElementImpl
		 * @see brokermodel.experimentRuntime.impl.ExperimentRuntimePackageImpl#getRuntimeElement()
		 * @generated
		 */
		EClass RUNTIME_ELEMENT = eINSTANCE.getRuntimeElement();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_ELEMENT__STATUS = eINSTANCE.getRuntimeElement_Status();

		/**
		 * The meta object literal for the '<em><b>GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_ELEMENT__GUID = eINSTANCE.getRuntimeElement_GUID();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_ELEMENT__CONTEXT = eINSTANCE.getRuntimeElement_Context();

		/**
		 * The meta object literal for the '{@link brokermodel.experimentRuntime.impl.RunningScenariosImpl <em>Running Scenarios</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.experimentRuntime.impl.RunningScenariosImpl
		 * @see brokermodel.experimentRuntime.impl.ExperimentRuntimePackageImpl#getRunningScenarios()
		 * @generated
		 */
		EClass RUNNING_SCENARIOS = eINSTANCE.getRunningScenarios();

		/**
		 * The meta object literal for the '<em><b>Requested Scenarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNING_SCENARIOS__REQUESTED_SCENARIOS = eINSTANCE.getRunningScenarios_RequestedScenarios();

		/**
		 * The meta object literal for the '{@link brokermodel.experimentRuntime.RuntimeElementStatus <em>Runtime Element Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.experimentRuntime.RuntimeElementStatus
		 * @see brokermodel.experimentRuntime.impl.ExperimentRuntimePackageImpl#getRuntimeElementStatus()
		 * @generated
		 */
		EEnum RUNTIME_ELEMENT_STATUS = eINSTANCE.getRuntimeElementStatus();

	}

} //ExperimentRuntimePackage
