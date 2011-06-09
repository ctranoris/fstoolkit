/**
 * <copyright>
 * </copyright>
 *

 */
package org.panlab.officedl.dslOfficeModel;

import FederationOffice.Office;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Office Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.panlab.officedl.dslOfficeModel.OfficeRule#getImports <em>Imports</em>}</li>
 *   <li>{@link org.panlab.officedl.dslOfficeModel.OfficeRule#getTestbedOfficev <em>Testbed Officev</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.panlab.officedl.dslOfficeModel.DslOfficeModelPackage#getOfficeRule()
 * @model
 * @generated
 */
public interface OfficeRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.panlab.officedl.dslOfficeModel.ImportOffice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.panlab.officedl.dslOfficeModel.DslOfficeModelPackage#getOfficeRule_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportOffice> getImports();

  /**
   * Returns the value of the '<em><b>Testbed Officev</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testbed Officev</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testbed Officev</em>' containment reference.
   * @see #setTestbedOfficev(Office)
   * @see org.panlab.officedl.dslOfficeModel.DslOfficeModelPackage#getOfficeRule_TestbedOfficev()
   * @model containment="true"
   * @generated
   */
  Office getTestbedOfficev();

  /**
   * Sets the value of the '{@link org.panlab.officedl.dslOfficeModel.OfficeRule#getTestbedOfficev <em>Testbed Officev</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Testbed Officev</em>' containment reference.
   * @see #getTestbedOfficev()
   * @generated
   */
  void setTestbedOfficev(Office value);

} // OfficeRule
