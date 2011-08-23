/**
 * <copyright>
 * </copyright>
 *

 */
package org.panlab.software.officedl2.officeDL.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.panlab.software.officedl2.officeDL.OfficeDLPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OfficeDLXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfficeDLXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    OfficeDLPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the OfficeDLResourceFactoryImpl factory.
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
      registrations.put(XML_EXTENSION, new OfficeDLResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new OfficeDLResourceFactoryImpl());
    }
    return registrations;
  }

} //OfficeDLXMLProcessor
