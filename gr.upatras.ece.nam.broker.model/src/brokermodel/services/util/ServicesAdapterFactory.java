/**
 */
package brokermodel.services.util;

import brokermodel.NamedElement;

import brokermodel.services.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see brokermodel.services.ServicesPackage
 * @generated
 */
public class ServicesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServicesPackage.eINSTANCE;
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
	protected ServicesSwitch<Adapter> modelSwitch =
		new ServicesSwitch<Adapter>() {
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServiceSetting(ServiceSetting object) {
				return createServiceSettingAdapter();
			}
			@Override
			public Adapter caseOfferedService(OfferedService object) {
				return createOfferedServiceAdapter();
			}
			@Override
			public Adapter caseServiceComposition(ServiceComposition object) {
				return createServiceCompositionAdapter();
			}
			@Override
			public Adapter caseSettingType(SettingType object) {
				return createSettingTypeAdapter();
			}
			@Override
			public Adapter casebrTypeString(brTypeString object) {
				return createbrTypeStringAdapter();
			}
			@Override
			public Adapter casebrTypeEnum(brTypeEnum object) {
				return createbrTypeEnumAdapter();
			}
			@Override
			public Adapter casebrTypeList(brTypeList object) {
				return createbrTypeListAdapter();
			}
			@Override
			public Adapter casebrTypeEnumItem(brTypeEnumItem object) {
				return createbrTypeEnumItemAdapter();
			}
			@Override
			public Adapter casebrTypeTideElement(brTypeTideElement object) {
				return createbrTypeTideElementAdapter();
			}
			@Override
			public Adapter caseTaxonomy(Taxonomy object) {
				return createTaxonomyAdapter();
			}
			@Override
			public Adapter caseAbstractSetting(AbstractSetting object) {
				return createAbstractSettingAdapter();
			}
			@Override
			public Adapter caseSettingConstraint(SettingConstraint object) {
				return createSettingConstraintAdapter();
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
	 * Creates a new adapter for an object of class '{@link brokermodel.services.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.ServiceSetting <em>Service Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.ServiceSetting
	 * @generated
	 */
	public Adapter createServiceSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.OfferedService <em>Offered Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.OfferedService
	 * @generated
	 */
	public Adapter createOfferedServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.ServiceComposition <em>Service Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.ServiceComposition
	 * @generated
	 */
	public Adapter createServiceCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.SettingType <em>Setting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.SettingType
	 * @generated
	 */
	public Adapter createSettingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.brTypeString <em>br Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.brTypeString
	 * @generated
	 */
	public Adapter createbrTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.brTypeEnum <em>br Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.brTypeEnum
	 * @generated
	 */
	public Adapter createbrTypeEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.brTypeList <em>br Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.brTypeList
	 * @generated
	 */
	public Adapter createbrTypeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.brTypeEnumItem <em>br Type Enum Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.brTypeEnumItem
	 * @generated
	 */
	public Adapter createbrTypeEnumItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.brTypeTideElement <em>br Type Tide Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.brTypeTideElement
	 * @generated
	 */
	public Adapter createbrTypeTideElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.Taxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.Taxonomy
	 * @generated
	 */
	public Adapter createTaxonomyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.AbstractSetting <em>Abstract Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.AbstractSetting
	 * @generated
	 */
	public Adapter createAbstractSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link brokermodel.services.SettingConstraint <em>Setting Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see brokermodel.services.SettingConstraint
	 * @generated
	 */
	public Adapter createSettingConstraintAdapter() {
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

} //ServicesAdapterFactory
