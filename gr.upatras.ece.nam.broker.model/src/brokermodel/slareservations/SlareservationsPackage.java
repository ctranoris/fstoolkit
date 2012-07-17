/**
 */
package brokermodel.slareservations;

import brokermodel.BrokerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see brokermodel.slareservations.SlareservationsFactory
 * @model kind="package"
 * @generated
 */
public interface SlareservationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "slareservations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nam.ece.upatras.gr/broker/model/slareservations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr.upatras.ece.nam.broker.model.slareservations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlareservationsPackage eINSTANCE = brokermodel.slareservations.impl.SlareservationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link brokermodel.slareservations.impl.SLAImpl <em>SLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.slareservations.impl.SLAImpl
	 * @see brokermodel.slareservations.impl.SlareservationsPackageImpl#getSLA()
	 * @generated
	 */
	int SLA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__NAME = BrokerPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__ID = BrokerPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__DESCRIPTION = BrokerPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__UNIQUE_ID = BrokerPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Reserved Rsources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__RESERVED_RSOURCES = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For VT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__FOR_VT = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__VALID_FROM = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__VALID_UNTIL = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_FEATURE_COUNT = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link brokermodel.slareservations.impl.ReservedResourceContractImpl <em>Reserved Resource Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.slareservations.impl.ReservedResourceContractImpl
	 * @see brokermodel.slareservations.impl.SlareservationsPackageImpl#getReservedResourceContract()
	 * @generated
	 */
	int RESERVED_RESOURCE_CONTRACT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_RESOURCE_CONTRACT__NAME = BrokerPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_RESOURCE_CONTRACT__ID = BrokerPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_RESOURCE_CONTRACT__DESCRIPTION = BrokerPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_RESOURCE_CONTRACT__UNIQUE_ID = BrokerPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_RESOURCE_CONTRACT__VALID_FROM = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_RESOURCE_CONTRACT__FOR_RESOURCE = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_RESOURCE_CONTRACT__VALID_UNTIL = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reserved Resource Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_RESOURCE_CONTRACT_FEATURE_COUNT = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link brokermodel.slareservations.SLA <em>SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLA</em>'.
	 * @see brokermodel.slareservations.SLA
	 * @generated
	 */
	EClass getSLA();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.slareservations.SLA#getReservedRsources <em>Reserved Rsources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reserved Rsources</em>'.
	 * @see brokermodel.slareservations.SLA#getReservedRsources()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_ReservedRsources();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.slareservations.SLA#getForVT <em>For VT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For VT</em>'.
	 * @see brokermodel.slareservations.SLA#getForVT()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_ForVT();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.slareservations.SLA#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see brokermodel.slareservations.SLA#getValidFrom()
	 * @see #getSLA()
	 * @generated
	 */
	EAttribute getSLA_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.slareservations.SLA#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see brokermodel.slareservations.SLA#getValidUntil()
	 * @see #getSLA()
	 * @generated
	 */
	EAttribute getSLA_ValidUntil();

	/**
	 * Returns the meta object for class '{@link brokermodel.slareservations.ReservedResourceContract <em>Reserved Resource Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserved Resource Contract</em>'.
	 * @see brokermodel.slareservations.ReservedResourceContract
	 * @generated
	 */
	EClass getReservedResourceContract();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.slareservations.ReservedResourceContract#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see brokermodel.slareservations.ReservedResourceContract#getValidFrom()
	 * @see #getReservedResourceContract()
	 * @generated
	 */
	EAttribute getReservedResourceContract_ValidFrom();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.slareservations.ReservedResourceContract#getForResource <em>For Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Resource</em>'.
	 * @see brokermodel.slareservations.ReservedResourceContract#getForResource()
	 * @see #getReservedResourceContract()
	 * @generated
	 */
	EReference getReservedResourceContract_ForResource();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.slareservations.ReservedResourceContract#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see brokermodel.slareservations.ReservedResourceContract#getValidUntil()
	 * @see #getReservedResourceContract()
	 * @generated
	 */
	EAttribute getReservedResourceContract_ValidUntil();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SlareservationsFactory getSlareservationsFactory();

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
		 * The meta object literal for the '{@link brokermodel.slareservations.impl.SLAImpl <em>SLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.slareservations.impl.SLAImpl
		 * @see brokermodel.slareservations.impl.SlareservationsPackageImpl#getSLA()
		 * @generated
		 */
		EClass SLA = eINSTANCE.getSLA();

		/**
		 * The meta object literal for the '<em><b>Reserved Rsources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__RESERVED_RSOURCES = eINSTANCE.getSLA_ReservedRsources();

		/**
		 * The meta object literal for the '<em><b>For VT</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__FOR_VT = eINSTANCE.getSLA_ForVT();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLA__VALID_FROM = eINSTANCE.getSLA_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLA__VALID_UNTIL = eINSTANCE.getSLA_ValidUntil();

		/**
		 * The meta object literal for the '{@link brokermodel.slareservations.impl.ReservedResourceContractImpl <em>Reserved Resource Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.slareservations.impl.ReservedResourceContractImpl
		 * @see brokermodel.slareservations.impl.SlareservationsPackageImpl#getReservedResourceContract()
		 * @generated
		 */
		EClass RESERVED_RESOURCE_CONTRACT = eINSTANCE.getReservedResourceContract();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVED_RESOURCE_CONTRACT__VALID_FROM = eINSTANCE.getReservedResourceContract_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>For Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVED_RESOURCE_CONTRACT__FOR_RESOURCE = eINSTANCE.getReservedResourceContract_ForResource();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVED_RESOURCE_CONTRACT__VALID_UNTIL = eINSTANCE.getReservedResourceContract_ValidUntil();

	}

} //SlareservationsPackage
