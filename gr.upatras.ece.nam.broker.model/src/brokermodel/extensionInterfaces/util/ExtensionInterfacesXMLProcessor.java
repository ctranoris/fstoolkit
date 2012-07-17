/**
 */
package brokermodel.extensionInterfaces.util;

import brokermodel.extensionInterfaces.ExtensionInterfacesPackage;

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
public class ExtensionInterfacesXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionInterfacesXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ExtensionInterfacesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ExtensionInterfacesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ExtensionInterfacesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ExtensionInterfacesResourceFactoryImpl());
		}
		return registrations;
	}

} //ExtensionInterfacesXMLProcessor
