/**
 */
package brokermodel.availabilityContract.util;

import brokermodel.availabilityContract.AvailabilityContractPackage;

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
public class AvailabilityContractXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityContractXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		AvailabilityContractPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the AvailabilityContractResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new AvailabilityContractResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new AvailabilityContractResourceFactoryImpl());
		}
		return registrations;
	}

} //AvailabilityContractXMLProcessor