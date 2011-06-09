/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.officeSDL.impl;

import FederationOffice.FederationOfficePackage;

import FederationOffice.services.ServicesPackage;

import gr.upatras.ece.wcl.officeSDL.Import;
import gr.upatras.ece.wcl.officeSDL.OfficeSDLFactory;
import gr.upatras.ece.wcl.officeSDL.OfficeSDLPackage;
import gr.upatras.ece.wcl.officeSDL.ServiceRule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OfficeSDLPackageImpl extends EPackageImpl implements OfficeSDLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

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
   * @see gr.upatras.ece.wcl.officeSDL.OfficeSDLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OfficeSDLPackageImpl()
  {
    super(eNS_URI, OfficeSDLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link OfficeSDLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OfficeSDLPackage init()
  {
    if (isInited) return (OfficeSDLPackage)EPackage.Registry.INSTANCE.getEPackage(OfficeSDLPackage.eNS_URI);

    // Obtain or create and register package
    OfficeSDLPackageImpl theOfficeSDLPackage = (OfficeSDLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OfficeSDLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OfficeSDLPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    FederationOfficePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theOfficeSDLPackage.createPackageContents();

    // Initialize created meta-data
    theOfficeSDLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOfficeSDLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OfficeSDLPackage.eNS_URI, theOfficeSDLPackage);
    return theOfficeSDLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceRule()
  {
    return serviceRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceRule_Imports()
  {
    return (EReference)serviceRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceRule_OfferedService()
  {
    return (EReference)serviceRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeSDLFactory getOfficeSDLFactory()
  {
    return (OfficeSDLFactory)getEFactoryInstance();
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
    serviceRuleEClass = createEClass(SERVICE_RULE);
    createEReference(serviceRuleEClass, SERVICE_RULE__IMPORTS);
    createEReference(serviceRuleEClass, SERVICE_RULE__OFFERED_SERVICE);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);
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
    ServicesPackage theServicesPackage = (ServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(serviceRuleEClass, ServiceRule.class, "ServiceRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServiceRule_Imports(), this.getImport(), null, "imports", null, 0, -1, ServiceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceRule_OfferedService(), theServicesPackage.getOfferedService(), null, "offeredService", null, 0, 1, ServiceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //OfficeSDLPackageImpl
