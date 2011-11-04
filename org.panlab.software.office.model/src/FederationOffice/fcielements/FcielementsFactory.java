/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package FederationOffice.fcielements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see FederationOffice.fcielements.FcielementsPackage
 * @generated
 */
public interface FcielementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FcielementsFactory eINSTANCE = FederationOffice.fcielements.impl.FcielementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IFCI Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFCI Service</em>'.
	 * @generated
	 */
	IFCIService createIFCIService();

	/**
	 * Returns a new object of class '<em>FCI Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FCI Credentials</em>'.
	 * @generated
	 */
	FCICredentials createFCICredentials();

	/**
	 * Returns a new object of class '<em>Authorization Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Key</em>'.
	 * @generated
	 */
	AuthorizationKey createAuthorizationKey();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FcielementsPackage getFcielementsPackage();

} //FcielementsFactory
