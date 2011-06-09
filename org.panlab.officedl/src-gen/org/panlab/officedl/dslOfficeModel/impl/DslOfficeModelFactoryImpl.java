/**
 * <copyright>
 * </copyright>
 *

 */
package org.panlab.officedl.dslOfficeModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.panlab.officedl.dslOfficeModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslOfficeModelFactoryImpl extends EFactoryImpl implements DslOfficeModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DslOfficeModelFactory init()
  {
    try
    {
      DslOfficeModelFactory theDslOfficeModelFactory = (DslOfficeModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.panlab.org/dslOfficeModel"); 
      if (theDslOfficeModelFactory != null)
      {
        return theDslOfficeModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DslOfficeModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslOfficeModelFactoryImpl()
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
      case DslOfficeModelPackage.OFFICE_RULE: return createOfficeRule();
      case DslOfficeModelPackage.IMPORT_OFFICE: return createImportOffice();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeRule createOfficeRule()
  {
    OfficeRuleImpl officeRule = new OfficeRuleImpl();
    return officeRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportOffice createImportOffice()
  {
    ImportOfficeImpl importOffice = new ImportOfficeImpl();
    return importOffice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslOfficeModelPackage getDslOfficeModelPackage()
  {
    return (DslOfficeModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DslOfficeModelPackage getPackage()
  {
    return DslOfficeModelPackage.eINSTANCE;
  }

} //DslOfficeModelFactoryImpl
