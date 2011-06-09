/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.officeSDL;

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
 * @see gr.upatras.ece.wcl.officeSDL.OfficeSDLFactory
 * @model kind="package"
 * @generated
 */
public interface OfficeSDLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "officeSDL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://wcl.ece.upatras.gr/SDL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "officeSDL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OfficeSDLPackage eINSTANCE = gr.upatras.ece.wcl.officeSDL.impl.OfficeSDLPackageImpl.init();

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.officeSDL.impl.ServiceRuleImpl <em>Service Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.officeSDL.impl.ServiceRuleImpl
   * @see gr.upatras.ece.wcl.officeSDL.impl.OfficeSDLPackageImpl#getServiceRule()
   * @generated
   */
  int SERVICE_RULE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_RULE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Offered Service</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_RULE__OFFERED_SERVICE = 1;

  /**
   * The number of structural features of the '<em>Service Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.officeSDL.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.officeSDL.impl.ImportImpl
   * @see gr.upatras.ece.wcl.officeSDL.impl.OfficeSDLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.officeSDL.ServiceRule <em>Service Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Rule</em>'.
   * @see gr.upatras.ece.wcl.officeSDL.ServiceRule
   * @generated
   */
  EClass getServiceRule();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.officeSDL.ServiceRule#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see gr.upatras.ece.wcl.officeSDL.ServiceRule#getImports()
   * @see #getServiceRule()
   * @generated
   */
  EReference getServiceRule_Imports();

  /**
   * Returns the meta object for the containment reference '{@link gr.upatras.ece.wcl.officeSDL.ServiceRule#getOfferedService <em>Offered Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Offered Service</em>'.
   * @see gr.upatras.ece.wcl.officeSDL.ServiceRule#getOfferedService()
   * @see #getServiceRule()
   * @generated
   */
  EReference getServiceRule_OfferedService();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.officeSDL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see gr.upatras.ece.wcl.officeSDL.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.officeSDL.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see gr.upatras.ece.wcl.officeSDL.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OfficeSDLFactory getOfficeSDLFactory();

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
     * The meta object literal for the '{@link gr.upatras.ece.wcl.officeSDL.impl.ServiceRuleImpl <em>Service Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.officeSDL.impl.ServiceRuleImpl
     * @see gr.upatras.ece.wcl.officeSDL.impl.OfficeSDLPackageImpl#getServiceRule()
     * @generated
     */
    EClass SERVICE_RULE = eINSTANCE.getServiceRule();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_RULE__IMPORTS = eINSTANCE.getServiceRule_Imports();

    /**
     * The meta object literal for the '<em><b>Offered Service</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_RULE__OFFERED_SERVICE = eINSTANCE.getServiceRule_OfferedService();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.officeSDL.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.officeSDL.impl.ImportImpl
     * @see gr.upatras.ece.wcl.officeSDL.impl.OfficeSDLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

  }

} //OfficeSDLPackage
