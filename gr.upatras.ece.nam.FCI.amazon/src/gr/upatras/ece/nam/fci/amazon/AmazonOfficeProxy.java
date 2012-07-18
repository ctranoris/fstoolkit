package gr.upatras.ece.nam.fci.amazon;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import gr.upatras.ece.nam.brokerdsl.BrokerDSLStandaloneSetup;
import gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule;

import brokermodel.BrokermodelPackage;
import brokermodel.Broker;
import brokermodel.availabilityContract.ResourceServiceContract;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.services.OfferedService;
import brokermodel.services.ServiceComposition;
import brokermodel.services.Taxonomy;
import brokermodel.slareservations.SLA;
import brokermodel.users.BrokerUser;


public class AmazonOfficeProxy implements Broker {

	public static boolean DONTPropagateToGW = false; //mark false in production. True means:  will not propagate the jobs to gateway
	private Broker office;
	private String OfficeUsername ;
	private String OfficePassword ;
	//TODO: Set a variable to store the temporary folder of saving the Panlab office
	//TODO: On the FSDL project wizard add options from which offices the user wants resources. They will be included in the "import office" statement
	
	
//	AmazonOfficeLoader amloader;
	
	public boolean officeLoaded(){
		return office != null;
	}

	public AmazonOfficeProxy(String username, String password,  Boolean forceRefresh) {
		super();
		OfficeUsername = username;
		OfficePassword = password;
		office = PreloadedBroker();
		
		
	}	
	
	
	private Broker PreloadedBroker() {

		if (!EPackage.Registry.INSTANCE.containsKey("http://www.panlab.org/software/officedl2/OfficeDL")) {
			new BrokerDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		
		//String uri = "file:/C:/Users/ctranoris/runtime-FSToolkit/myProject/src/Amazon.officedl";
		String uri ="http://nam.ece.upatras.gr/fstoolkit/utils/Amazon.officedl";
		System.out.println("Loading amazon definition from: "+uri);		
		
		//ResourceSet set = resourceSetProvider.get();
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resourceAmazonOffice = resourceSet.getResource(URI.createURI(uri), true);
		

		// Get the first model element and cast it to the right type
		BrokerRule officeRule = (BrokerRule) resourceAmazonOffice.getContents().get(0);
		officeRule.getTestbedBrokerv().setResourceURI( resourceAmazonOffice.getURI().toString() );
		
		return officeRule.getTestbedBrokerv();
	}

	@Override
	public String getName() {
		return office.getName();
	}

	@Override
	public void setName(String value) {
		office.setName(value);
		
	}

	@Override
	public int getId() {
		return office.getId();
	}

	@Override
	public void setId(int value) {
		office.setId(value);
		
	}

	@Override
	public String getDescription() {
		return office.getDescription();
	}

	@Override
	public void setDescription(String value) {
		office.setDescription(value);
		
	}

	@Override
	public EClass eClass() {
		return office.eClass();
	}

	@Override
	public Resource eResource() {
		return office.eResource();
	}

	@Override
	public EObject eContainer() {
		return office.eContainer();
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		return office.eContainingFeature();
	}

	@Override
	public EReference eContainmentFeature() {
		return office.eContainmentFeature();
	}

	@Override
	public EList<EObject> eContents() {
		return office.eContents();
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		return office.eAllContents();
	}

	@Override
	public boolean eIsProxy() {
		//return true;//well this is for sure a proxy #:-)
		return office.eIsProxy();
	}

	@Override
	public EList<EObject> eCrossReferences() {
		return office.eCrossReferences();
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		return office.eGet(feature);
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return office.eGet(feature, resolve);
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		office.eSet(feature, newValue);
		
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		return office.eIsSet(feature);
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		office.eUnset(feature);
		
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments)
			throws InvocationTargetException {
		return office.eInvoke(operation, arguments);
	}

	@Override
	public EList<Adapter> eAdapters() {
		return office.eAdapters();
	}

	@Override
	public boolean eDeliver() {
		return office.eDeliver();
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		office.eSetDeliver(deliver);
		
	}

	@Override
	public void eNotify(Notification notification) {
		office.eNotify(notification);
		
	}

	@Override
	public EList<BrokerUser> getRegisteredUsers() {
		return office.getRegisteredUsers();
	}

	@Override
	public EList<Taxonomy> getContributedTaxonomies() {
		return office.getContributedTaxonomies();
	}

	@Override
	public EList<OfferedService> getOfferedServices() {
		return office.getOfferedServices();
	}

	@Override
	public EList<RequestedFederationScenario> getAvailableFederationScenarios() {
		return office.getAvailableFederationScenarios();
	}

	@Override
	public EList<ServiceComposition> getOfferedServiceCompositions() {
		return office.getOfferedServiceCompositions();
	}

	@Override
	public EList<ResourceServiceContract> getResourceServiceContracts() {
		return office.getResourceServiceContracts();
	}

	@Override
	public EList<SLA> getSLAs() {
		return office.getSLAs();
	}

	@Override
	public String getResourceURI() {
		return office.getResourceURI();
	}

	@Override
	public void setResourceURI(String value) {
		office.setResourceURI(value);
		
	}


	@Override
	public String getAPIGateway() {
		return office.getAPIGateway();
	}

	@Override
	public void setAPIGateway(String value) {
		office.setAPIGateway(value);
		
	}

	public void LoadFSbyVCT(RequestedFederationScenario fs) {
		
	}
	@Override
	public String getUniqueID() {
		return office.getUniqueID();
	}

	@Override
	public void setUniqueID(String value) {
		office.setUniqueID(value);
		
	}
	
}
