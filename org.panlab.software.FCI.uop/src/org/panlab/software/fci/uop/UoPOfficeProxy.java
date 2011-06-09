package org.panlab.software.fci.uop;

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
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.services.OfferedService;
import FederationOffice.services.ServiceComposition;
import FederationOffice.services.Taxonomy;
import FederationOffice.slareservations.SLA;
import FederationOffice.users.OfficeUser;

public class UoPOfficeProxy implements Office {

	private Office office;
	private String OfficeUsername ;
	private String OfficePassword ;
	
	public boolean officeLoaded(){
		return office != null;
	}

	public UoPOfficeProxy(String username, String password,  Boolean forceRefresh) {
		super();
		setOfficeUsername(username);
		setOfficePassword(password);
		office = PreloadedOffice();			
	}	
		
	private Office PreloadedOffice() {
		
		// Initialize the model
		FederationOfficePackage.eINSTANCE.eClass();

		// As of here we preparing to save the model content
		// Register the XMI resource factory for the .office extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Create a resource 
		String uri =  "C:\\Users\\ctranoris\\wsHeliosM4\\org.panlab.software.FCI.uop\\src\\org\\panlab\\software\\fci\\uop\\uop.xmi";
		Resource resourcePanlabOffice = resSet.createResource( URI.createFileURI(uri) );
		
		try {
				System.out.println("Loading panlab.office from: "+uri);				
				resourcePanlabOffice.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Get the first model element and cast it to the right type
		return (Office)resourcePanlabOffice.getContents().get(0);
		
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
		return true;//well this is for sure a proxy #:-)
		//return office.eIsProxy();
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
		return office.getUniqueID();
	}

	@Override
	public void setUniqueID(String value) {
		office.setUniqueID(value);
		
	}
}
