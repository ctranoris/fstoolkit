/**
 */
package brokermodel.services.util;

import brokermodel.NamedElement;

import brokermodel.services.*;

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
 * @see brokermodel.services.ServicesPackage
 * @generated
 */
public class ServicesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesSwitch() {
		if (modelPackage == null) {
			modelPackage = ServicesPackage.eINSTANCE;
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
			case ServicesPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.SERVICE_SETTING: {
				ServiceSetting serviceSetting = (ServiceSetting)theEObject;
				T result = caseServiceSetting(serviceSetting);
				if (result == null) result = caseAbstractSetting(serviceSetting);
				if (result == null) result = caseNamedElement(serviceSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.OFFERED_SERVICE: {
				OfferedService offeredService = (OfferedService)theEObject;
				T result = caseOfferedService(offeredService);
				if (result == null) result = caseService(offeredService);
				if (result == null) result = caseNamedElement(offeredService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.SERVICE_COMPOSITION: {
				ServiceComposition serviceComposition = (ServiceComposition)theEObject;
				T result = caseServiceComposition(serviceComposition);
				if (result == null) result = caseNamedElement(serviceComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.SETTING_TYPE: {
				SettingType settingType = (SettingType)theEObject;
				T result = caseSettingType(settingType);
				if (result == null) result = caseNamedElement(settingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.BR_TYPE_STRING: {
				brTypeString brTypeString = (brTypeString)theEObject;
				T result = casebrTypeString(brTypeString);
				if (result == null) result = caseSettingType(brTypeString);
				if (result == null) result = caseNamedElement(brTypeString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.BR_TYPE_ENUM: {
				brTypeEnum brTypeEnum = (brTypeEnum)theEObject;
				T result = casebrTypeEnum(brTypeEnum);
				if (result == null) result = caseSettingType(brTypeEnum);
				if (result == null) result = caseNamedElement(brTypeEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.BR_TYPE_LIST: {
				brTypeList brTypeList = (brTypeList)theEObject;
				T result = casebrTypeList(brTypeList);
				if (result == null) result = caseSettingType(brTypeList);
				if (result == null) result = caseNamedElement(brTypeList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.BR_TYPE_ENUM_ITEM: {
				brTypeEnumItem brTypeEnumItem = (brTypeEnumItem)theEObject;
				T result = casebrTypeEnumItem(brTypeEnumItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.BR_TYPE_TIDE_ELEMENT: {
				brTypeTideElement brTypeTideElement = (brTypeTideElement)theEObject;
				T result = casebrTypeTideElement(brTypeTideElement);
				if (result == null) result = caseSettingType(brTypeTideElement);
				if (result == null) result = caseNamedElement(brTypeTideElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.TAXONOMY: {
				Taxonomy taxonomy = (Taxonomy)theEObject;
				T result = caseTaxonomy(taxonomy);
				if (result == null) result = caseNamedElement(taxonomy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.ABSTRACT_SETTING: {
				AbstractSetting abstractSetting = (AbstractSetting)theEObject;
				T result = caseAbstractSetting(abstractSetting);
				if (result == null) result = caseNamedElement(abstractSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicesPackage.SETTING_CONSTRAINT: {
				SettingConstraint settingConstraint = (SettingConstraint)theEObject;
				T result = caseSettingConstraint(settingConstraint);
				if (result == null) result = caseNamedElement(settingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSetting(ServiceSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offered Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offered Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfferedService(OfferedService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceComposition(ServiceComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setting Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setting Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettingType(SettingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>br Type String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>br Type String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebrTypeString(brTypeString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>br Type Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>br Type Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebrTypeEnum(brTypeEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>br Type List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>br Type List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebrTypeList(brTypeList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>br Type Enum Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>br Type Enum Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebrTypeEnumItem(brTypeEnumItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>br Type Tide Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>br Type Tide Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebrTypeTideElement(brTypeTideElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Taxonomy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Taxonomy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaxonomy(Taxonomy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSetting(AbstractSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setting Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setting Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettingConstraint(SettingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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

} //ServicesSwitch
