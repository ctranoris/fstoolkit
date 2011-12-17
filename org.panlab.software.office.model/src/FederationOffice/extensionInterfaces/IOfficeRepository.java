/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package FederationOffice.extensionInterfaces;

import org.eclipse.emf.ecore.EObject;

import FederationOffice.Office;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IOffice Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see FederationOffice.extensionInterfaces.ExtensionInterfacesPackage#getIOfficeRepository()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IOfficeRepository extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void LoadScenario(RequestedFederationScenario fedScenario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerOfficeRepositoryListener(IOfficeRepositoryListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Office> loadOffices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Office> getOffices();

} // IOfficeRepository
