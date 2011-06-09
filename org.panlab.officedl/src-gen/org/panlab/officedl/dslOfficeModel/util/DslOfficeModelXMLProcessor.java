/**
 * <copyright>
 * </copyright>
 *

 */
package org.panlab.officedl.dslOfficeModel.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.panlab.officedl.dslOfficeModel.DslOfficeModelPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DslOfficeModelXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslOfficeModelXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    DslOfficeModelPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the DslOfficeModelResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations()
  {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new DslOfficeModelResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new DslOfficeModelResourceFactoryImpl());
    }
    return registrations;
  }

} //DslOfficeModelXMLProcessor
