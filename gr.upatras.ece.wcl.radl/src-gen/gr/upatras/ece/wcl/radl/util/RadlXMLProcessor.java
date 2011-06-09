/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl.util;

import gr.upatras.ece.wcl.radl.RadlPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RadlXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadlXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    RadlPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the RadlResourceFactoryImpl factory.
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
      registrations.put(XML_EXTENSION, new RadlResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new RadlResourceFactoryImpl());
    }
    return registrations;
  }

} //RadlXMLProcessor
