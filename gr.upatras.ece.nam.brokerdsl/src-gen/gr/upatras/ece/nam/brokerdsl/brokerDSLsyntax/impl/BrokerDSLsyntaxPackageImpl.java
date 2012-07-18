/**
 */
package gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl;

import brokermodel.BrokermodelPackage;

import gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxFactory;
import gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxPackage;
import gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule;
import gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.ImportBroker;

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
public class BrokerDSLsyntaxPackageImpl extends EPackageImpl implements BrokerDSLsyntaxPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass brokerRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importBrokerEClass = null;

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
   * @see gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BrokerDSLsyntaxPackageImpl()
  {
    super(eNS_URI, BrokerDSLsyntaxFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link BrokerDSLsyntaxPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BrokerDSLsyntaxPackage init()
  {
    if (isInited) return (BrokerDSLsyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(BrokerDSLsyntaxPackage.eNS_URI);

    // Obtain or create and register package
    BrokerDSLsyntaxPackageImpl theBrokerDSLsyntaxPackage = (BrokerDSLsyntaxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BrokerDSLsyntaxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BrokerDSLsyntaxPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    BrokermodelPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theBrokerDSLsyntaxPackage.createPackageContents();

    // Initialize created meta-data
    theBrokerDSLsyntaxPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBrokerDSLsyntaxPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BrokerDSLsyntaxPackage.eNS_URI, theBrokerDSLsyntaxPackage);
    return theBrokerDSLsyntaxPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBrokerRule()
  {
    return brokerRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBrokerRule_Imports()
  {
    return (EReference)brokerRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBrokerRule_TestbedBrokerv()
  {
    return (EReference)brokerRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportBroker()
  {
    return importBrokerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportBroker_ImportURI()
  {
    return (EAttribute)importBrokerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrokerDSLsyntaxFactory getBrokerDSLsyntaxFactory()
  {
    return (BrokerDSLsyntaxFactory)getEFactoryInstance();
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
    brokerRuleEClass = createEClass(BROKER_RULE);
    createEReference(brokerRuleEClass, BROKER_RULE__IMPORTS);
    createEReference(brokerRuleEClass, BROKER_RULE__TESTBED_BROKERV);

    importBrokerEClass = createEClass(IMPORT_BROKER);
    createEAttribute(importBrokerEClass, IMPORT_BROKER__IMPORT_URI);
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
    BrokermodelPackage theBrokermodelPackage = (BrokermodelPackage)EPackage.Registry.INSTANCE.getEPackage(BrokermodelPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(brokerRuleEClass, BrokerRule.class, "BrokerRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBrokerRule_Imports(), this.getImportBroker(), null, "imports", null, 0, -1, BrokerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBrokerRule_TestbedBrokerv(), theBrokermodelPackage.getBroker(), null, "testbedBrokerv", null, 0, 1, BrokerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importBrokerEClass, ImportBroker.class, "ImportBroker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportBroker_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, ImportBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BrokerDSLsyntaxPackageImpl
