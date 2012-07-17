/**
 */
package brokermodel.fcielements.impl;

import brokermodel.fcielements.*;

import java.util.Map;

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
public class FcielementsFactoryImpl extends EFactoryImpl implements FcielementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FcielementsFactory init() {
		try {
			FcielementsFactory theFcielementsFactory = (FcielementsFactory)EPackage.Registry.INSTANCE.getEFactory("http://nam.ece.upatras.gr/broker/model/FCIElements"); 
			if (theFcielementsFactory != null) {
				return theFcielementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FcielementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FcielementsFactoryImpl() {
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
			case FcielementsPackage.FCI_CREDENTIALS: return createFCICredentials();
			case FcielementsPackage.AUTHORIZATION_KEY: return createAuthorizationKey();
			case FcielementsPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FCICredentials createFCICredentials() {
		FCICredentialsImpl fciCredentials = new FCICredentialsImpl();
		return fciCredentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationKey createAuthorizationKey() {
		AuthorizationKeyImpl authorizationKey = new AuthorizationKeyImpl();
		return authorizationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMap() {
		StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
		return stringToStringMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FcielementsPackage getFcielementsPackage() {
		return (FcielementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FcielementsPackage getPackage() {
		return FcielementsPackage.eINSTANCE;
	}

} //FcielementsFactoryImpl
