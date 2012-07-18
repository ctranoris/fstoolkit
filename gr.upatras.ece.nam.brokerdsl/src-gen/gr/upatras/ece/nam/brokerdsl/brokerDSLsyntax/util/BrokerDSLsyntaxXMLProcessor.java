/**
 */
package gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.util;

import gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxPackage;

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
public class BrokerDSLsyntaxXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrokerDSLsyntaxXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    BrokerDSLsyntaxPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the BrokerDSLsyntaxResourceFactoryImpl factory.
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
      registrations.put(XML_EXTENSION, new BrokerDSLsyntaxResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new BrokerDSLsyntaxResourceFactoryImpl());
    }
    return registrations;
  }

} //BrokerDSLsyntaxXMLProcessor
