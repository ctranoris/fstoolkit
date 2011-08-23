/**
 * <copyright>
 * </copyright>
 *

 */
package org.panlab.software.officedl2.officeDL.impl;

import FederationOffice.FederationOfficePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.panlab.software.officedl2.officeDL.ImportOffice;
import org.panlab.software.officedl2.officeDL.OfficeDLFactory;
import org.panlab.software.officedl2.officeDL.OfficeDLPackage;
import org.panlab.software.officedl2.officeDL.OfficeRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OfficeDLPackageImpl extends EPackageImpl implements OfficeDLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass officeRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importOfficeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.panlab.software.officedl2.officeDL.OfficeDLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OfficeDLPackageImpl()
  {
    super(eNS_URI, OfficeDLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OfficeDLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OfficeDLPackage init()
  {
    if (isInited) return (OfficeDLPackage)EPackage.Registry.INSTANCE.getEPackage(OfficeDLPackage.eNS_URI);

    // Obtain or create and register package
    OfficeDLPackageImpl theOfficeDLPackage = (OfficeDLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OfficeDLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OfficeDLPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    FederationOfficePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theOfficeDLPackage.createPackageContents();

    // Initialize created meta-data
    theOfficeDLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOfficeDLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OfficeDLPackage.eNS_URI, theOfficeDLPackage);
    return theOfficeDLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOfficeRule()
  {
    return officeRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOfficeRule_Imports()
  {
    return (EReference)officeRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOfficeRule_TestbedOfficev()
  {
    return (EReference)officeRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportOffice()
  {
    return importOfficeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportOffice_ImportURI()
  {
    return (EAttribute)importOfficeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeDLFactory getOfficeDLFactory()
  {
    return (OfficeDLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    officeRuleEClass = createEClass(OFFICE_RULE);
    createEReference(officeRuleEClass, OFFICE_RULE__IMPORTS);
    createEReference(officeRuleEClass, OFFICE_RULE__TESTBED_OFFICEV);

    importOfficeEClass = createEClass(IMPORT_OFFICE);
    createEAttribute(importOfficeEClass, IMPORT_OFFICE__IMPORT_URI);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    FederationOfficePackage theFederationOfficePackage = (FederationOfficePackage)EPackage.Registry.INSTANCE.getEPackage(FederationOfficePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(officeRuleEClass, OfficeRule.class, "OfficeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOfficeRule_Imports(), this.getImportOffice(), null, "imports", null, 0, -1, OfficeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOfficeRule_TestbedOfficev(), theFederationOfficePackage.getOffice(), null, "testbedOfficev", null, 0, 1, OfficeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importOfficeEClass, ImportOffice.class, "ImportOffice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportOffice_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, ImportOffice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //OfficeDLPackageImpl
