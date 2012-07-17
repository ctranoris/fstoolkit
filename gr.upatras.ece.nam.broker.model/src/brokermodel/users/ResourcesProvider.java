/**
 */
package brokermodel.users;

import brokermodel.providersite.Site;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.users.ResourcesProvider#getOfferedSiteList <em>Offered Site List</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.users.UsersPackage#getResourcesProvider()
 * @model
 * @generated
 */
public interface ResourcesProvider extends BrokerUser {
	/**
	 * Returns the value of the '<em><b>Offered Site List</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.providersite.Site}.
	 * It is bidirectional and its opposite is '{@link brokermodel.providersite.Site#getBelongsToProvider <em>Belongs To Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Site List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Site List</em>' containment reference list.
	 * @see brokermodel.users.UsersPackage#getResourcesProvider_OfferedSiteList()
	 * @see brokermodel.providersite.Site#getBelongsToProvider
	 * @model opposite="belongsToProvider" containment="true"
	 * @generated
	 */
	EList<Site> getOfferedSiteList();

} // ResourcesProvider
