package gr.upatras.ece.nam.fci.sfa;

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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import brokermodel.BrokermodelPackage;
import brokermodel.Broker;
import brokermodel.availabilityContract.ResourceServiceContract;
import brokermodel.fcielements.AuthorizationKey;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.services.OfferedService;
import brokermodel.services.ServiceComposition;
import brokermodel.services.Taxonomy;
import brokermodel.slareservations.SLA;
import brokermodel.users.BrokerUser;

public class SFAOfficeProxy implements Broker {
	public static boolean UsePreloadOfficeTest = false; //mark false in production. True means: will not load the model 
	public static boolean DONTPropagateToSFAGW = false; //mark false in production. True means:  will not propagate the jobs to SFAGW (SliceM, AM)
	private Broker broker;
	private AuthorizationKey authorizationKey;
	
	public boolean officeLoaded(){
		return broker != null;
	}
	
	public SFAOfficeProxy(AuthorizationKey authorizationKey,  Boolean forceRefresh) {
		super();
		this.authorizationKey = authorizationKey;
		
		String s = authorizationKey.getCredentials().getCredoptions().get(SFAUtils.CACHE_MODEL);
		if ( (s!=null) && (s.equalsIgnoreCase("true")) )
			UsePreloadOfficeTest = true;
		
		
		
		if (UsePreloadOfficeTest )
			broker = PreloadedBroker();
		else
			broker = getBrokerModel( forceRefresh);
	}

	private Broker getBrokerModel(Boolean forceRefresh){
		SFAModel2OfficeModel sfaM2MTransform = new SFAModel2OfficeModel(authorizationKey);
		
		if  ( this.authorizationKey!=null ){ //if credentials		
			
			if  ( sfaM2MTransform.checkAuthentication() ){
				//monitor.worked(1);
				System.out.println("checkAuthentication");
				//monitor.setTaskName("Downloading model and transforming...");
				sfaM2MTransform.TranformModel();
				//monitor.worked(1);
			}else {//for some reason (i.e. auth problem) the office is not there
				return null;	
			}
			
		}else if( (sfaM2MTransform.getBroker()==null) ){ //for some reason (i.e. auth problem) the office is not there or not cached
			return null;			
		}
		
		// As of here we preparing to save the model content
		// Register the XMI resource factory for the .office extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("office", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Create a resource
		String uri = "sfamodel_"+  
				authorizationKey.getCredentials().getCredoptions().get(SFAUtils.USERNAME )
					+".office"; //here the name depend to the sfaurl...since we can have multiple urls
//		try {
//			if (Activator.getDefault()!=null)
//				uri = Activator.getDefault().getStateLocation().toOSString() + "\\"+uri;
//		} catch (NoClassDefFoundError  e) {
//			System.out.println("NoClassDefFoundError but don't worry. Activated only as plugin");
//			e.printStackTrace();
//			System.out.println("Continue with saving the uri ");
//		}
		
		Resource resourceSFAOffice = resSet.createResource( URI.createFileURI( uri ));
		//add the top model element office
		resourceSFAOffice.getContents().add( sfaM2MTransform.getBroker() );
		
		
		try {
				System.out.println("Saving SFA office to: "+uri);
				//monitor.setTaskName("Saving local temporary model...");				
				resourceSFAOffice.save(Collections.EMPTY_MAP);
				//the following to hold the Office Resource URI ti be used later on by Imports
				sfaM2MTransform.getBroker().setResourceURI(  resourceSFAOffice.getURI().toString() );
				
				//monitor.worked(1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Get the first model element and cast it to the right type
		return  (Broker)resourceSFAOffice.getContents().get(0);
	}
	

	private Broker PreloadedBroker() {
		// Initialize the model
				BrokermodelPackage.eINSTANCE.eClass();

				
				// As of here we preparing to save the model content
				// Register the XMI resource factory for the .office extension

				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("office", new XMIResourceFactoryImpl());

				// Obtain a new resource set
				ResourceSet resSet = new ResourceSetImpl();


				// Create a resource
				String uri = "sfamodel_"+  
						authorizationKey.getCredentials().getCredoptions().get(SFAUtils.USERNAME )
							+".office"; //here the name depend to the sfaurl...since we can have multiple urls
				
//				try {
//					if (Activator.getDefault()!=null)
//						uri = Activator.getDefault().getStateLocation().toOSString() + "\\"+uri;
//				} catch (NoClassDefFoundError  e) {
//					System.out.println("NoClassDefFoundError but don't worry. Activated only as plugin");
//					e.printStackTrace();
//					System.out.println("Continue with saving the uri ");
//				}
				Resource resourceSFAOffice = resSet.createResource( URI.createFileURI( uri ));
				
				try {
						System.out.println("Loading SFA office from: "+uri);				
						resourceSFAOffice.load(Collections.EMPTY_MAP);
				} catch (IOException e) {
					e.printStackTrace();
				}

				// Get the first model element and cast it to the right type
				((Broker)resourceSFAOffice.getContents().get(0)).setResourceURI( resourceSFAOffice.getURI().toString() );
				
				return (Broker)resourceSFAOffice.getContents().get(0);
	}

	
	public void LoadFSbySliceName(RequestedFederationScenario fs) {
		
		
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
		//return true;//well this is for sure a proxy #:-)
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

	
	@Override
	public String getUniqueID() {
		return broker.getUniqueID();
	}

	@Override
	public void setUniqueID(String value) {
		broker.setUniqueID(value);
		
	}

}
