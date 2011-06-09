/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.officeSDL;

import FederationOffice.services.OfferedService;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.officeSDL.ServiceRule#getImports <em>Imports</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.officeSDL.ServiceRule#getOfferedService <em>Offered Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see gr.upatras.ece.wcl.officeSDL.OfficeSDLPackage#getServiceRule()
 * @model
 * @generated
 */
public interface ServiceRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link gr.upatras.ece.wcl.officeSDL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see gr.upatras.ece.wcl.officeSDL.OfficeSDLPackage#getServiceRule_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Offered Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Offered Service</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offered Service</em>' containment reference.
   * @see #setOfferedService(OfferedService)
   * @see gr.upatras.ece.wcl.officeSDL.OfficeSDLPackage#getServiceRule_OfferedService()
   * @model containment="true"
   * @generated
   */
  OfferedService getOfferedService();

  /**
   * Sets the value of the '{@link gr.upatras.ece.wcl.officeSDL.ServiceRule#getOfferedService <em>Offered Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offered Service</em>' containment reference.
   * @see #getOfferedService()
   * @generated
   */
  void setOfferedService(OfferedService value);

} // ServiceRule
