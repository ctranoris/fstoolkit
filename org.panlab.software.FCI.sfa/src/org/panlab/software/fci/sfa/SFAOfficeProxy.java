package org.panlab.software.fci.sfa;

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

import FederationOffice.FederationOfficePackage;
import FederationOffice.Office;
import FederationOffice.availabilityContract.ResourceServiceContract;
import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.services.OfferedService;
import FederationOffice.services.ServiceComposition;
import FederationOffice.services.Taxonomy;
import FederationOffice.slareservations.SLA;
import FederationOffice.users.OfficeUser;

public class SFAOfficeProxy implements Office {
	public static boolean UsePreloadOfficeTest = false; //mark false in production. True means: will not load the model 
	public static boolean DONTPropagateToSFAGW = false; //mark false in production. True means:  will not propagate the jobs to SFAGW (SliceM, AM)
	private Office office;
	private AuthorizationKey authorizationKey;
	
	public boolean officeLoaded(){
		return office != null;
	}
	
	public SFAOfficeProxy(AuthorizationKey authorizationKey,  Boolean forceRefresh) {
		super();
		this.authorizationKey = authorizationKey;
		if (UsePreloadOfficeTest )
			office = PreloadedOffice();
		else
			office = getOfficeModel( forceRefresh);
	}

	private Office getOfficeModel(Boolean forceRefresh){
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
			
		}else if( (sfaM2MTransform.getOffice()==null) ){ //for some reason (i.e. auth problem) the office is not there or not cached
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
		try {
			if (Activator.getDefault()!=null)
				uri = Activator.getDefault().getStateLocation().toOSString() + "\\"+uri;
		} catch (NoClassDefFoundError  e) {
			System.out.println("NoClassDefFoundError but don't worry. Activated only as plugin");
			e.printStackTrace();
			System.out.println("Continue with saving the uri ");
		}
		
		Resource resourceSFAOffice = resSet.createResource( URI.createFileURI( uri ));
		//add the top model element office
		resourceSFAOffice.getContents().add( sfaM2MTransform.getOffice() );
		
		
		try {
				System.out.println("Saving SFA office to: "+uri);
				//monitor.setTaskName("Saving local temporary model...");				
				resourceSFAOffice.save(Collections.EMPTY_MAP);
				//the following to hold the Office Resource URI ti be used later on by Imports
				sfaM2MTransform.getOffice().setResourceURI(  resourceSFAOffice.getURI().toString() );
				
				//monitor.worked(1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Get the first model element and cast it to the right type
		return  (Office)resourceSFAOffice.getContents().get(0);
	}
	

	private Office PreloadedOffice() {
		// Initialize the model
				FederationOfficePackage.eINSTANCE.eClass();

				
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
				
				try {
					if (Activator.getDefault()!=null)
						uri = Activator.getDefault().getStateLocation().toOSString() + "\\"+uri;
				} catch (NoClassDefFoundError  e) {
					System.out.println("NoClassDefFoundError but don't worry. Activated only as plugin");
					e.printStackTrace();
					System.out.println("Continue with saving the uri ");
				}
				Resource resourceSFAOffice = resSet.createResource( URI.createFileURI( uri ));
				
				try {
						System.out.println("Loading SFA office from: "+uri);				
						resourceSFAOffice.load(Collections.EMPTY_MAP);
				} catch (IOException e) {
					e.printStackTrace();
				}

				// Get the first model element and cast it to the right type
				((Office)resourceSFAOffice.getContents().get(0)).setResourceURI( resourceSFAOffice.getURI().toString() );
				
				return (Office)resourceSFAOffice.getContents().get(0);
	}

	
	public void LoadFSbySliceName(RequestedFederationScenario fs) {
		
		
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
		if (office!=null)
			return office.eIsProxy();
		else
			return true;
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
	public EList<OfficeUser> getRegisteredUsers() {
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

	
	@Override
	public String getUniqueID() {
		return office.getUniqueID();
	}

	@Override
	public void setUniqueID(String value) {
		office.setUniqueID(value);
		
	}

}
