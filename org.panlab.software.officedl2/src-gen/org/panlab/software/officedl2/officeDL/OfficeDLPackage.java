/**
 * <copyright>
 * </copyright>
 *

 */
package org.panlab.software.officedl2.officeDL;

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
 * @see org.panlab.software.officedl2.officeDL.OfficeDLFactory
 * @model kind="package"
 * @generated
 */
public interface OfficeDLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "officeDL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.panlab.org/software/officedl2/OfficeDL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "officeDL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OfficeDLPackage eINSTANCE = org.panlab.software.officedl2.officeDL.impl.OfficeDLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.panlab.software.officedl2.officeDL.impl.OfficeRuleImpl <em>Office Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.panlab.software.officedl2.officeDL.impl.OfficeRuleImpl
   * @see org.panlab.software.officedl2.officeDL.impl.OfficeDLPackageImpl#getOfficeRule()
   * @generated
   */
  int OFFICE_RULE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFICE_RULE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Testbed Officev</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFICE_RULE__TESTBED_OFFICEV = 1;

  /**
   * The number of structural features of the '<em>Office Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFFICE_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.panlab.software.officedl2.officeDL.impl.ImportOfficeImpl <em>Import Office</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.panlab.software.officedl2.officeDL.impl.ImportOfficeImpl
   * @see org.panlab.software.officedl2.officeDL.impl.OfficeDLPackageImpl#getImportOffice()
   * @generated
   */
  int IMPORT_OFFICE = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_OFFICE__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import Office</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_OFFICE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.panlab.software.officedl2.officeDL.OfficeRule <em>Office Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Office Rule</em>'.
   * @see org.panlab.software.officedl2.officeDL.OfficeRule
   * @generated
   */
  EClass getOfficeRule();

  /**
   * Returns the meta object for the containment reference list '{@link org.panlab.software.officedl2.officeDL.OfficeRule#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.panlab.software.officedl2.officeDL.OfficeRule#getImports()
   * @see #getOfficeRule()
   * @generated
   */
  EReference getOfficeRule_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.panlab.software.officedl2.officeDL.OfficeRule#getTestbedOfficev <em>Testbed Officev</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Testbed Officev</em>'.
   * @see org.panlab.software.officedl2.officeDL.OfficeRule#getTestbedOfficev()
   * @see #getOfficeRule()
   * @generated
   */
  EReference getOfficeRule_TestbedOfficev();

  /**
   * Returns the meta object for class '{@link org.panlab.software.officedl2.officeDL.ImportOffice <em>Import Office</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Office</em>'.
   * @see org.panlab.software.officedl2.officeDL.ImportOffice
   * @generated
   */
  EClass getImportOffice();

  /**
   * Returns the meta object for the attribute '{@link org.panlab.software.officedl2.officeDL.ImportOffice#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.panlab.software.officedl2.officeDL.ImportOffice#getImportURI()
   * @see #getImportOffice()
   * @generated
   */
  EAttribute getImportOffice_ImportURI();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OfficeDLFactory getOfficeDLFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.panlab.software.officedl2.officeDL.impl.OfficeRuleImpl <em>Office Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.panlab.software.officedl2.officeDL.impl.OfficeRuleImpl
     * @see org.panlab.software.officedl2.officeDL.impl.OfficeDLPackageImpl#getOfficeRule()
     * @generated
     */
    EClass OFFICE_RULE = eINSTANCE.getOfficeRule();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OFFICE_RULE__IMPORTS = eINSTANCE.getOfficeRule_Imports();

    /**
     * The meta object literal for the '<em><b>Testbed Officev</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OFFICE_RULE__TESTBED_OFFICEV = eINSTANCE.getOfficeRule_TestbedOfficev();

    /**
     * The meta object literal for the '{@link org.panlab.software.officedl2.officeDL.impl.ImportOfficeImpl <em>Import Office</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.panlab.software.officedl2.officeDL.impl.ImportOfficeImpl
     * @see org.panlab.software.officedl2.officeDL.impl.OfficeDLPackageImpl#getImportOffice()
     * @generated
     */
    EClass IMPORT_OFFICE = eINSTANCE.getImportOffice();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_OFFICE__IMPORT_URI = eINSTANCE.getImportOffice_ImportURI();

  }

} //OfficeDLPackage
