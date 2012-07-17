/**
 */
package brokermodel.services.impl;

import brokermodel.services.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ServicesFactoryImpl extends EFactoryImpl implements ServicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServicesFactory init() {
		try {
			ServicesFactory theServicesFactory = (ServicesFactory)EPackage.Registry.INSTANCE.getEFactory("http://nam.ece.upatras.gr/broker/model/services"); 
			if (theServicesFactory != null) {
				return theServicesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesFactoryImpl() {
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
			case ServicesPackage.SERVICE: return createService();
			case ServicesPackage.SERVICE_SETTING: return createServiceSetting();
			case ServicesPackage.OFFERED_SERVICE: return createOfferedService();
			case ServicesPackage.SERVICE_COMPOSITION: return createServiceComposition();
			case ServicesPackage.BR_TYPE_STRING: return createbrTypeString();
			case ServicesPackage.BR_TYPE_ENUM: return createbrTypeEnum();
			case ServicesPackage.BR_TYPE_LIST: return createbrTypeList();
			case ServicesPackage.BR_TYPE_ENUM_ITEM: return createbrTypeEnumItem();
			case ServicesPackage.BR_TYPE_TIDE_ELEMENT: return createbrTypeTideElement();
			case ServicesPackage.TAXONOMY: return createTaxonomy();
			case ServicesPackage.ABSTRACT_SETTING: return createAbstractSetting();
			case ServicesPackage.SETTING_CONSTRAINT: return createSettingConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ServicesPackage.SERVICE_RESOURCE_OPERATION:
				return createServiceResourceOperationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ServicesPackage.SERVICE_RESOURCE_OPERATION:
				return convertServiceResourceOperationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSetting createServiceSetting() {
		ServiceSettingImpl serviceSetting = new ServiceSettingImpl();
		return serviceSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferedService createOfferedService() {
		OfferedServiceImpl offeredService = new OfferedServiceImpl();
		return offeredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComposition createServiceComposition() {
		ServiceCompositionImpl serviceComposition = new ServiceCompositionImpl();
		return serviceComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public brTypeString createbrTypeString() {
		brTypeStringImpl brTypeString = new brTypeStringImpl();
		return brTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public brTypeEnum createbrTypeEnum() {
		brTypeEnumImpl brTypeEnum = new brTypeEnumImpl();
		return brTypeEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public brTypeList createbrTypeList() {
		brTypeListImpl brTypeList = new brTypeListImpl();
		return brTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public brTypeEnumItem createbrTypeEnumItem() {
		brTypeEnumItemImpl brTypeEnumItem = new brTypeEnumItemImpl();
		return brTypeEnumItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public brTypeTideElement createbrTypeTideElement() {
		brTypeTideElementImpl brTypeTideElement = new brTypeTideElementImpl();
		return brTypeTideElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Taxonomy createTaxonomy() {
		TaxonomyImpl taxonomy = new TaxonomyImpl();
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSetting createAbstractSetting() {
		AbstractSettingImpl abstractSetting = new AbstractSettingImpl();
		return abstractSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingConstraint createSettingConstraint() {
		SettingConstraintImpl settingConstraint = new SettingConstraintImpl();
		return settingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceResourceOperation createServiceResourceOperationFromString(EDataType eDataType, String initialValue) {
		ServiceResourceOperation result = ServiceResourceOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceResourceOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesPackage getServicesPackage() {
		return (ServicesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicesPackage getPackage() {
		return ServicesPackage.eINSTANCE;
	}

} //ServicesFactoryImpl
