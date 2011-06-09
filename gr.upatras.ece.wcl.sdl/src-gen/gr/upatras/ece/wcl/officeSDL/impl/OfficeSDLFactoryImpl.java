/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.officeSDL.impl;

import gr.upatras.ece.wcl.officeSDL.*;

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
public class OfficeSDLFactoryImpl extends EFactoryImpl implements OfficeSDLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OfficeSDLFactory init()
  {
    try
    {
      OfficeSDLFactory theOfficeSDLFactory = (OfficeSDLFactory)EPackage.Registry.INSTANCE.getEFactory("http://wcl.ece.upatras.gr/SDL"); 
      if (theOfficeSDLFactory != null)
      {
        return theOfficeSDLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OfficeSDLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeSDLFactoryImpl()
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
      case OfficeSDLPackage.SERVICE_RULE: return createServiceRule();
      case OfficeSDLPackage.IMPORT: return createImport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceRule createServiceRule()
  {
    ServiceRuleImpl serviceRule = new ServiceRuleImpl();
    return serviceRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeSDLPackage getOfficeSDLPackage()
  {
    return (OfficeSDLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OfficeSDLPackage getPackage()
  {
    return OfficeSDLPackage.eINSTANCE;
  }

} //OfficeSDLFactoryImpl
