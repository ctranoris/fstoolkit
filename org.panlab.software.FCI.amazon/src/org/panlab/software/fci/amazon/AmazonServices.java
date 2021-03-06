/*************************************************************************
Copyright 2010 Panlab 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 
Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*************************************************************************/
package org.panlab.software.fci.amazon;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import FederationOffice.Office;
import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.fcielements.IFCIService;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;

//The model can be called like:
//http://localhost:8081/org.panlab.software.ws.repos.m2m/repo/PanlabServices.office2
//The extension here of the webservice (eg .office2) must be registered
//also in the language (ie in officedl) under the extension point org.eclipse.xtext.extension_resourceServiceProvider
//uriExtension=office2, class= the same as the officedl extension
//So, as a result the response (which is an instance of the ecore model) can be seen inside the DSL

//Since there is a penalty here from the repository, caching can be used 
//(i.e. saving somewhere on the server the whole ecore model) instead of making
//on the fly transformation or use an Office Proxy

public class AmazonServices implements IFCIService{
	
	private Office amazonOffice;
	
	private static AmazonServices instance;

	public static AmazonServices getInstance() {
		if (instance == null)
			instance = new AmazonServices();
		return instance;
	}
	
	public AmazonServices() {
		
	}


	@Override
	public Office getOffice( String username,  String password,  boolean forceRefresh){
		if ( (amazonOffice!=null) && (!forceRefresh) )
			return amazonOffice;				  

		amazonOffice = new AmazonOfficeProxy(username, password,  forceRefresh);
		
		if (( (AmazonOfficeProxy)amazonOffice).officeLoaded() )
			return amazonOffice;
		else
			return null;
	}

	
	@Override
	public Office getOffice() {
		if (amazonOffice!=null)
			return amazonOffice;
		return null;
	}

	@Override
	public void setOffice(Office value) {
		// TODO Auto-generated method stub
		
	}

	

	/**
	 * Creates a Resource
	 * @author ctranoris
	 * @return the GUID of the created Resource
	 * @param scenario The name of scenario where the Resource is involved
	 * @param ptmAlias The alias of the PTM (e.g uop)
	 * @param ResourceTypeName The alias of the resource type (e.g rubis_db)
	 * @param resourceReq A ResourceRequest object containing  ResourceSettingInstances, a list with params to be created
	 */
	@Override
	public String CreateResource(String scenario, String ptmAlias, 
			String resourceTypeName, ResourceRequest resourceReq){
		
		if (AmazonOfficeProxy.DONTPropagateToGW )
			return "test-"+resourceReq.getName()+"-"+resourceTypeName;

		return "sample-12345678";
	}
	
	/**
	 * Updates a Resource
	 * @author ctranoris
	 * @return the response of the update
	 * @param runtimeID The RuntimeID (or GUID) of the resource to be updated. In Panlab, probably is something like resource-number (e.g. rubisdb-12)
	 * @param resourceReq A ResourceRequest object containing  ResourceSettingInstances, a list with params to be created
	*/
	@Override
	public String UpdateResource(String contextName, String providerURI, 
			String resourceTypeName, 
			String runtimeID, 
			ResourceRequest resourceReq){


		if (AmazonOfficeProxy.DONTPropagateToGW )
			return "test-"+resourceReq.getName();
		

		return "ec2-174-129-227-sample.compute-1.amazonaws.com";
	}


	@Override
	public String DeleteResource(String contextName, String providerURI, 
			String resourceTypeName, 
			String runtimeID, 
			ResourceRequest resourceReq) {
		
		if (AmazonOfficeProxy.DONTPropagateToGW )
			return "test-DeleteResource-"+resourceReq.getName();
		

		return "N/A";
	}
	
	/**
	*
	*Call '<em><b>getParameterValueOfResource</b></em>' when you want to get the value of a resource's attribute from down the actual resource
	*WARNING: Get currently works only with RAs implemented with RADL that
	*respond to get with their XML.(e.g. if(top.equalsIgnoreCase("get")) in RAService.java)
	*/
	@Override
	public String getParameterValueOfResource(String scenario, String ptmAlias, 
			String resourceRuntimeID, String paramName){


		if (AmazonOfficeProxy.DONTPropagateToGW )
			return "test-getParameterValueOfResource-"+paramName;
		

		return "N/A";
	}

	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments)
			throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Office getOffice(AuthorizationKey authorizationKey,
			boolean forceRefresh) {
				return amazonOffice;
		// TODO Auto-generated method stub
		
	}


	
}
