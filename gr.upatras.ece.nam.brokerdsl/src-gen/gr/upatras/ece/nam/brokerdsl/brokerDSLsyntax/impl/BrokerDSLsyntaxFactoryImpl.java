/**
 */
package gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl;

import gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrokerDSLsyntaxFactoryImpl extends EFactoryImpl implements BrokerDSLsyntaxFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BrokerDSLsyntaxFactory init()
  {
    try
    {
      BrokerDSLsyntaxFactory theBrokerDSLsyntaxFactory = (BrokerDSLsyntaxFactory)EPackage.Registry.INSTANCE.getEFactory("http://nam.ece.upatras.gr/brokerdsl/BrokerDSL"); 
      if (theBrokerDSLsyntaxFactory != null)
      {
        return theBrokerDSLsyntaxFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BrokerDSLsyntaxFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrokerDSLsyntaxFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BrokerDSLsyntaxPackage.BROKER_RULE: return createBrokerRule();
      case BrokerDSLsyntaxPackage.IMPORT_BROKER: return createImportBroker();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrokerRule createBrokerRule()
  {
    BrokerRuleImpl brokerRule = new BrokerRuleImpl();
    return brokerRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportBroker createImportBroker()
  {
    ImportBrokerImpl importBroker = new ImportBrokerImpl();
    return importBroker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrokerDSLsyntaxPackage getBrokerDSLsyntaxPackage()
  {
    return (BrokerDSLsyntaxPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BrokerDSLsyntaxPackage getPackage()
  {
    return BrokerDSLsyntaxPackage.eINSTANCE;
  }

} //BrokerDSLsyntaxFactoryImpl
