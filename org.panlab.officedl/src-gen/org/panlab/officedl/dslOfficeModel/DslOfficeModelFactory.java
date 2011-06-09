/**
 * <copyright>
 * </copyright>
 *

 */
package org.panlab.officedl.dslOfficeModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.panlab.officedl.dslOfficeModel.DslOfficeModelPackage
 * @generated
 */
public interface DslOfficeModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslOfficeModelFactory eINSTANCE = org.panlab.officedl.dslOfficeModel.impl.DslOfficeModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Office Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Office Rule</em>'.
   * @generated
   */
  OfficeRule createOfficeRule();

  /**
   * Returns a new object of class '<em>Import Office</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Office</em>'.
   * @generated
   */
  ImportOffice createImportOffice();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DslOfficeModelPackage getDslOfficeModelPackage();

} //DslOfficeModelFactory
