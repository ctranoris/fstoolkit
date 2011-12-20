/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package FederationOffice.fcielements;

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
 * @see FederationOffice.fcielements.FcielementsFactory
 * @model kind="package"
 * @generated
 */
public interface FcielementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fcielements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.panlab.org/FederationOffice/model/FCIElements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.panlab.FederationOffice.model.FCIElements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FcielementsPackage eINSTANCE = FederationOffice.fcielements.impl.FcielementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link FederationOffice.fcielements.IFCIService <em>IFCI Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FederationOffice.fcielements.IFCIService
	 * @see FederationOffice.fcielements.impl.FcielementsPackageImpl#getIFCIService()
	 * @generated
	 */
	int IFCI_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Office</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFCI_SERVICE__OFFICE = 0;

	/**
	 * The number of structural features of the '<em>IFCI Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFCI_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link FederationOffice.fcielements.impl.FCICredentialsImpl <em>FCI Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FederationOffice.fcielements.impl.FCICredentialsImpl
	 * @see FederationOffice.fcielements.impl.FcielementsPackageImpl#getFCICredentials()
	 * @generated
	 */
	int FCI_CREDENTIALS = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCI_CREDENTIALS__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCI_CREDENTIALS__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Credoptions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCI_CREDENTIALS__CREDOPTIONS = 2;

	/**
	 * The number of structural features of the '<em>FCI Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FCI_CREDENTIALS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link FederationOffice.fcielements.impl.AuthorizationKeyImpl <em>Authorization Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FederationOffice.fcielements.impl.AuthorizationKeyImpl
	 * @see FederationOffice.fcielements.impl.FcielementsPackageImpl#getAuthorizationKey()
	 * @generated
	 */
	int AUTHORIZATION_KEY = 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_KEY__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_KEY__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_KEY__CREDENTIALS = 2;

	/**
	 * The number of structural features of the '<em>Authorization Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_KEY_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link FederationOffice.fcielements.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FederationOffice.fcielements.impl.StringToStringMapImpl
	 * @see FederationOffice.fcielements.impl.FcielementsPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link FederationOffice.fcielements.IFCIService <em>IFCI Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFCI Service</em>'.
	 * @see FederationOffice.fcielements.IFCIService
	 * @generated
	 */
	EClass getIFCIService();

	/**
	 * Returns the meta object for the reference '{@link FederationOffice.fcielements.IFCIService#getOffice <em>Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Office</em>'.
	 * @see FederationOffice.fcielements.IFCIService#getOffice()
	 * @see #getIFCIService()
	 * @generated
	 */
	EReference getIFCIService_Office();

	/**
	 * Returns the meta object for class '{@link FederationOffice.fcielements.FCICredentials <em>FCI Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FCI Credentials</em>'.
	 * @see FederationOffice.fcielements.FCICredentials
	 * @generated
	 */
	EClass getFCICredentials();

	/**
	 * Returns the meta object for the attribute '{@link FederationOffice.fcielements.FCICredentials#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see FederationOffice.fcielements.FCICredentials#getUsername()
	 * @see #getFCICredentials()
	 * @generated
	 */
	EAttribute getFCICredentials_Username();

	/**
	 * Returns the meta object for the attribute '{@link FederationOffice.fcielements.FCICredentials#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see FederationOffice.fcielements.FCICredentials#getPassword()
	 * @see #getFCICredentials()
	 * @generated
	 */
	EAttribute getFCICredentials_Password();

	/**
	 * Returns the meta object for the map '{@link FederationOffice.fcielements.FCICredentials#getCredoptions <em>Credoptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Credoptions</em>'.
	 * @see FederationOffice.fcielements.FCICredentials#getCredoptions()
	 * @see #getFCICredentials()
	 * @generated
	 */
	EReference getFCICredentials_Credoptions();

	/**
	 * Returns the meta object for class '{@link FederationOffice.fcielements.AuthorizationKey <em>Authorization Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Key</em>'.
	 * @see FederationOffice.fcielements.AuthorizationKey
	 * @generated
	 */
	EClass getAuthorizationKey();

	/**
	 * Returns the meta object for the attribute '{@link FederationOffice.fcielements.AuthorizationKey#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see FederationOffice.fcielements.AuthorizationKey#getUsername()
	 * @see #getAuthorizationKey()
	 * @generated
	 */
	EAttribute getAuthorizationKey_Username();

	/**
	 * Returns the meta object for the attribute '{@link FederationOffice.fcielements.AuthorizationKey#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see FederationOffice.fcielements.AuthorizationKey#getPassword()
	 * @see #getAuthorizationKey()
	 * @generated
	 */
	EAttribute getAuthorizationKey_Password();

	/**
	 * Returns the meta object for the containment reference '{@link FederationOffice.fcielements.AuthorizationKey#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentials</em>'.
	 * @see FederationOffice.fcielements.AuthorizationKey#getCredentials()
	 * @see #getAuthorizationKey()
	 * @generated
	 */
	EReference getAuthorizationKey_Credentials();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FcielementsFactory getFcielementsFactory();

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
		 * The meta object literal for the '{@link FederationOffice.fcielements.IFCIService <em>IFCI Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FederationOffice.fcielements.IFCIService
		 * @see FederationOffice.fcielements.impl.FcielementsPackageImpl#getIFCIService()
		 * @generated
		 */
		EClass IFCI_SERVICE = eINSTANCE.getIFCIService();

		/**
		 * The meta object literal for the '<em><b>Office</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFCI_SERVICE__OFFICE = eINSTANCE.getIFCIService_Office();

		/**
		 * The meta object literal for the '{@link FederationOffice.fcielements.impl.FCICredentialsImpl <em>FCI Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FederationOffice.fcielements.impl.FCICredentialsImpl
		 * @see FederationOffice.fcielements.impl.FcielementsPackageImpl#getFCICredentials()
		 * @generated
		 */
		EClass FCI_CREDENTIALS = eINSTANCE.getFCICredentials();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FCI_CREDENTIALS__USERNAME = eINSTANCE.getFCICredentials_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FCI_CREDENTIALS__PASSWORD = eINSTANCE.getFCICredentials_Password();

		/**
		 * The meta object literal for the '<em><b>Credoptions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FCI_CREDENTIALS__CREDOPTIONS = eINSTANCE.getFCICredentials_Credoptions();

		/**
		 * The meta object literal for the '{@link FederationOffice.fcielements.impl.AuthorizationKeyImpl <em>Authorization Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FederationOffice.fcielements.impl.AuthorizationKeyImpl
		 * @see FederationOffice.fcielements.impl.FcielementsPackageImpl#getAuthorizationKey()
		 * @generated
		 */
		EClass AUTHORIZATION_KEY = eINSTANCE.getAuthorizationKey();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_KEY__USERNAME = eINSTANCE.getAuthorizationKey_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_KEY__PASSWORD = eINSTANCE.getAuthorizationKey_Password();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_KEY__CREDENTIALS = eINSTANCE.getAuthorizationKey_Credentials();

		/**
		 * The meta object literal for the '{@link FederationOffice.fcielements.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FederationOffice.fcielements.impl.StringToStringMapImpl
		 * @see FederationOffice.fcielements.impl.FcielementsPackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

	}

} //FcielementsPackage
