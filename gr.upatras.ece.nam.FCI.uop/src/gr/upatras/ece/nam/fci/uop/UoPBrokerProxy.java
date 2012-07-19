package gr.upatras.ece.nam.fci.uop;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;

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
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
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

public class UoPBrokerProxy implements Broker {

	private Broker broker;
	private String OfficeUsername ;
	private String OfficePassword ;
	
	public boolean officeLoaded(){
		return broker != null;
	}

	public UoPBrokerProxy(String username, String password,  Boolean forceRefresh) {
		super();
		setOfficeUsername(username);
		setOfficePassword(password);
		broker = PreloadedBroker();			
	}	
		
	private Broker PreloadedBroker() {
		
		if (!EPackage.Registry.INSTANCE.containsKey("http://nam.ece.upatras.gr/brokerdsl/BrokerDSL")) {
			new BrokerDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		
		// Initialize the model
		BrokermodelPackage.eINSTANCE.eClass();

		// As of here we preparing to save the model content
		// Register the XMI resource factory for the .office extension

//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Create a resource 
		//String uri =  "C:\\Users\\ctranoris\\wsHeliosM4\\org.panlab.software.FCI.uop\\src\\org\\panlab\\software\\fci\\uop\\uop.xmi";
		
		String uri =  "http://nam.ece.upatras.gr/fstoolkit/utils/uop.brokerdsl";
		Resource resourceUoPOffice = resSet.createResource( URI.createURI(uri) );
		
		try {
				System.out.println("Loading uop resource definition from: "+uri);				
				resourceUoPOffice.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Get the first model element and cast it to the right type
		BrokerRule officeRule = (BrokerRule) resourceUoPOffice.getContents().get(0);
		officeRule.getTestbedBrokerv().setResourceURI( resourceUoPOffice.getURI().toString() );
		
		return officeRule.getTestbedBrokerv();
		
	}

	@Override
	public String getName() {
		return broker.getName();
	}

	@Override
	public void setName(String value) {
		broker.setName(value);
		
	}

	@Override
	public int getId() {
		return broker.getId();
	}

	@Override
	public void setId(int value) {
		broker.setId(value);
		
	}

	@Override
	public String getDescription() {
		return broker.getDescription();
	}

	@Override
	public void setDescription(String value) {
		broker.setDescription(value);
		
	}

	@Override
	public EClass eClass() {
		return broker.eClass();
	}

	@Override
	public Resource eResource() {
		return broker.eResource();
	}

	@Override
	public EObject eContainer() {
		return broker.eContainer();
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		return broker.eContainingFeature();
	}

	@Override
	public EReference eContainmentFeature() {
		return broker.eContainmentFeature();
	}

	@Override
	public EList<EObject> eContents() {
		return broker.eContents();
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		return broker.eAllContents();
	}

	@Override
	public boolean eIsProxy() {
		if (broker!=null)
			return broker.eIsProxy();
		else
			return true;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		return broker.eCrossReferences();
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		return broker.eGet(feature);
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return broker.eGet(feature, resolve);
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		broker.eSet(feature, newValue);
		
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		return broker.eIsSet(feature);
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		broker.eUnset(feature);
		
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments)
			throws InvocationTargetException {
		return broker.eInvoke(operation, arguments);
	}

	@Override
	public EList<Adapter> eAdapters() {
		return broker.eAdapters();
	}

	@Override
	public boolean eDeliver() {
		return broker.eDeliver();
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		broker.eSetDeliver(deliver);
		
	}

	@Override
	public void eNotify(Notification notification) {
		broker.eNotify(notification);
		
	}

	@Override
	public EList<BrokerUser> getRegisteredUsers() {
		return broker.getRegisteredUsers();
	}

	@Override
	public EList<Taxonomy> getContributedTaxonomies() {
		return broker.getContributedTaxonomies();
	}

	@Override
	public EList<OfferedService> getOfferedServices() {
		return broker.getOfferedServices();
	}

	@Override
	public EList<RequestedFederationScenario> getAvailableFederationScenarios() {
		return broker.getAvailableFederationScenarios();
	}

	@Override
	public EList<ServiceComposition> getOfferedServiceCompositions() {
		return broker.getOfferedServiceCompositions();
	}

	@Override
	public EList<ResourceServiceContract> getResourceServiceContracts() {
		return broker.getResourceServiceContracts();
	}

	@Override
	public EList<SLA> getSLAs() {
		return broker.getSLAs();
	}

	@Override
	public String getResourceURI() {
		return broker.getResourceURI();
	}

	@Override
	public void setResourceURI(String value) {
		broker.setResourceURI(value);
		
	}


	@Override
	public String getAPIGateway() {
		return broker.getAPIGateway();
	}

	@Override
	public void setAPIGateway(String value) {
		broker.setAPIGateway(value);
		
	}

	public void LoadFSbyVCT(RequestedFederationScenario fs) {
		//TODO: not sure how to implement this yet
	}

	public void setOfficeUsername(String officeUsername) {
		OfficeUsername = officeUsername;
	}

	public String getOfficeUsername() {
		return OfficeUsername;
	}

	public void setOfficePassword(String officePassword) {
		OfficePassword = officePassword;
	}

	public String getOfficePassword() {
		return OfficePassword;
	}


	@Override
	public String getUniqueID() {
		return broker.getUniqueID();
	}

	@Override
	public void setUniqueID(String value) {
		broker.setUniqueID(value);
		
	}
}
