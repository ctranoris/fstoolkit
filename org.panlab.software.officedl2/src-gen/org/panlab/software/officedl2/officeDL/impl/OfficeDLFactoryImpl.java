/**
 * <copyright>
 * </copyright>
 *

 */
package org.panlab.software.officedl2.officeDL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.panlab.software.officedl2.officeDL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OfficeDLFactoryImpl extends EFactoryImpl implements OfficeDLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OfficeDLFactory init()
  {
    try
    {
      OfficeDLFactory theOfficeDLFactory = (OfficeDLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.panlab.org/software/officedl2/OfficeDL"); 
      if (theOfficeDLFactory != null)
      {
        return theOfficeDLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OfficeDLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeDLFactoryImpl()
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
      case OfficeDLPackage.OFFICE_RULE: return createOfficeRule();
      case OfficeDLPackage.IMPORT_OFFICE: return createImportOffice();
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
  public OfficeDLPackage getOfficeDLPackage()
  {
    return (OfficeDLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OfficeDLPackage getPackage()
  {
    return OfficeDLPackage.eINSTANCE;
  }

} //OfficeDLFactoryImpl
