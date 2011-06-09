/*************************************************************************
Copyright 2010 Christos Tranoris, University of Patras 

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
package org.panlab.software.fci.core;

import java.util.List;

import org.panlab.software.fci.amazon.AmazonServices;
import org.panlab.software.fci.panlab.PanlabServices;
import org.panlab.software.fci.uop.UoPServices;

import FederationOffice.Office;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;
import FederationOffice.services.ServiceSetting;

/**
 * FCI class is used to manage resources.
 * @author ctranoris
 *
 */
public class FCI {


	private static FCI fci;
	/**
	 * 
	 */
	public FCI() {
			
	}
	
	public static FCI getInstance(){
		if (fci==null)
			fci = new FCI();
		return fci;
	}
	
	
	
	

	public AuthorizationKey createAuthorizationKey(FCICredentials cred) {
		AuthorizationKey akey = new AuthorizationKey(cred);
		
		return akey ;
	}

	
	public List<String> getAvailableResourceTypes(AuthorizationKey key){
		
		return null;
	}
	
	
	/**
	 * 
	 * @param key client must provide an Authorization key
	 * @param resoureTypeName a resource name to find providers that offer it (e.g. Computing)
	 * @return the available Resource Providers that offer a certain ResourceType
	 */	
	public List<String> getResourceProvidersForResourceType(AuthorizationKey key, String resoureTypeName){
		
		return null;
	}
	
	
	
	/**
	 * @return the available parameters of a certain ResourceType
	 * @param key client must provide an Authorization key
	 * @param resoureTypeName a resource name to return its available parameters (e.g. Computing)
	 */	
	public List<String> getAvailableParamsForResourceTypes(AuthorizationKey key, String resoureTypeName){
		
		return null;
	}
	
	/**
	 * @return the available scenarios of the user
	 * @param key client must provide an Authorization key
	 */	
	public List<String> getMyScenarios(AuthorizationKey key){
		
		return null;
	}
	


	public ResourceContext createResourceContext(String val,
			AuthorizationKey authKey) {
		if (val.toLowerCase().equals("panlab")){
			return CreatePanlabResourceContext(authKey);
		}
		else if (val.toLowerCase().equals("uop")){
			return CreateUoPResourceContext(authKey);
		}
		else if (val.toLowerCase().equals("amazon")){
			return CreateAmazonResourceContext(authKey);
		}
		return null;
	}

	private ResourceContext CreateUoPResourceContext(AuthorizationKey authKey) {
		Office office = UoPServices.getInstance().getOffice(
				authKey.getUsername(), authKey.getPasskey(), true);
		
		if (office != null) {
			return new ResourceContext( office );
		}
		
		return null;
	}

	private ResourceContext CreatePanlabResourceContext(AuthorizationKey authKey) {
		Office office = PanlabServices.getInstance().getOffice(
				authKey.getUsername(), authKey.getPasskey(), true);
		
		if (office != null) {
			return new ResourceContext( office );
		}
		
		return null;
	}
	
	private ResourceContext CreateAmazonResourceContext(AuthorizationKey authKey) {
		Office office = AmazonServices.getInstance().getOffice(
				authKey.getUsername(), authKey.getPasskey(), true);
		
		if (office != null) {
			return new ResourceContext( office );
		}
		
		return null;
	}


	/**
	 * Creates a resource group
	 * @param groupName the Name of the group
	 * @return the new object
	 */	
	public ResourceGroup createResourceGroup(String groupName) {
		
		return new ResourceGroup(groupName);
	}
	
	
	/**
	 * Creates a resource on a certain resource Provider of a certain Office
	* @param scenario The name of scenario where the Resource is involved
	 * @param resourceName The alias name that the user wants of the resource (e.g myResource)
	 * @param resourceContext The office that we request the resource
	 * @param provider The Resource Provider that we request and can provide the resource
	 * @param ServiceType The ServiceType object describing the requested service type (e.g rubis_db)
	 * @param params a list with params to be created
	 * @return a ResourceProxy object for accessing the created resource, or null if the request failed
	 */
	public ResourceProxy CreateResource(String scenario,
			ResourceRequest resourceReq, ResourceContext resourceContext) {

		ServiceType serviceType = resourceContext.getServiceType(resourceReq.getRefOfferedResource().getImplOfferedService().getName())  ;
		ResourceProvider provider = resourceContext.getResourceProviderByResourceRequest(resourceReq );
		
		if ((resourceReq.getRuntimeInfo()!=null ) 
				&& (resourceReq.getRuntimeInfo().getGUID()!=null)
				&& (!"".equals(resourceReq.getRuntimeInfo().getGUID()))){
			return new ResourceProxy(scenario, resourceReq.getName(), resourceContext, provider, 
					serviceType, resourceReq.getRuntimeInfo().getGUID(), resourceReq);			
		}
		
		String guid=null;
		if (resourceContext.getOfficeModel().getName().toLowerCase().equals("panlab")){
			 guid = PanlabServices.getInstance().CreateResource(scenario, provider.getFirstURI(), 
					serviceType.getName(), resourceReq);
			 
		}else if (resourceContext.getOfficeModel().getName().toLowerCase().equals("uop")){
			 guid = UoPServices.getInstance().CreateResource(scenario, provider.getFirstURI(), 
						serviceType.getName(), resourceReq);
			}
		else if (resourceContext.getOfficeModel().getName().toLowerCase().equals("amazon")){
				 guid = AmazonServices.getInstance().CreateResource(scenario, provider.getFirstURI(), 
							serviceType.getName(), resourceReq);
			}
		
		if (guid!=null)
			 return new ResourceProxy(scenario, resourceReq.getName(), resourceContext, provider, serviceType, guid, resourceReq);
			
		return null;
	}
	
	
	/**
	 * Creates a resource on a certain resource Provider of a certain Office
	* @param scenario The name of scenario where the Resource is involved
	 * @param resourceName The alias name that the user wants of the resource (e.g myResource)
	 * @param resourceContext The office that we request the resource
	 * @param provider The Resource Provider that we request and can provide the resource
	 * @param ServiceType The ServiceType object describing the requested service type (e.g rubis_db)
	 * @param params a list with params to be created
	 * @return a ResourceProxy object for accessing the created resource, or null if the request failed
	 */
	public ResourceProxy CreateResource(String scenario, String resourceName, ResourceContext resourceContext, ResourceProvider provider,
			ServiceType serviceType, List<ParameterValuePair> params) {
		
		//construct a ResourceRequest object resourceReq
		ResourceRequest resourceReq = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceRequest();
		resourceReq.setName(  resourceName );
		resourceReq.setRefOfferedResource( resourceContext.getOfferedResourceByProvider(serviceType.getOfferedService(), provider) );
		
		
		for (ServiceSetting setting : serviceType.getOfferedService().getServiceSettings()) {
			ResourceSettingInstance resInst = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceSettingInstance() ;
			resInst.setName( setting.getName() );
			resourceReq.getReqResourceSettings().add(resInst);
			for (ParameterValuePair parameterValuePair : params) { //for all the requested params
				if (parameterValuePair.getParameter().equalsIgnoreCase(setting.getName()) ) //check if the param is in the settings and the set it to the static values requests
					resInst.setStaticValue( parameterValuePair.getValue() );
			}
		}
		
		String guid=null;
		if (resourceContext.getOfficeModel().getName().toLowerCase().equals("panlab")){
			 guid = PanlabServices.getInstance().CreateResource(scenario, provider.getFirstURI(), 
					serviceType.getName(), resourceReq);
			 
		}else if (resourceContext.getOfficeModel().getName().toLowerCase().equals("uop")){
			 guid = UoPServices.getInstance().CreateResource(scenario, provider.getFirstURI(), 
						serviceType.getName(), resourceReq);
				 
		}else if (resourceContext.getOfficeModel().getName().toLowerCase().equals("amazon")){
			 guid = AmazonServices.getInstance().CreateResource(scenario, provider.getFirstURI(), 
						serviceType.getName(), resourceReq);
				 
			}
		
		if (guid!=null)
			 return new ResourceProxy(scenario, resourceReq.getName(), resourceContext, provider, serviceType, guid, resourceReq);
		return null;
		
	}

	
	public String UpdateResource(ResourceProxy resource,
			List<ParameterValuePair> params) {
		
		ResourceRequest resourceReq = null;
		if (resource.getResourceRequest()!=null ){
			//construct a ResourceRequest object resourceReq
			resourceReq = 
				FederationOffice.federationscenarios.FederationscenariosFactory.
						eINSTANCE.createResourceRequest();
			resourceReq.setName(  resource.getName()   );
			
			
			
			for (ParameterValuePair parameterValuePair : params) {
				ResourceSettingInstance resInst = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceSettingInstance() ;
				resInst.setName( parameterValuePair.getParameter() );
				resInst.setStaticValue( parameterValuePair.getValue() );
				resourceReq.getReqResourceSettings().add(resInst);
			}
		}else
			resourceReq = resource.getResourceRequest();
		
		if (resource.getResourceContext().getOfficeModel().getName().toLowerCase().equals("panlab")){
			return PanlabServices.getInstance().UpdateResource(resource.getContext(), 
					resource.getProvider().getFirstURI() , resource.getResourceTypeName(),
					resource.getGUID(),resourceReq);
			 
		}else if (resource.getResourceContext().getOfficeModel().getName().toLowerCase().equals("uop")){
			return UoPServices.getInstance().UpdateResource(resource.getContext(), 
					resource.getProvider().getFirstURI() , resource.getResourceTypeName(),
					resource.getGUID(),resourceReq);
			 
		}else if (resource.getResourceContext().getOfficeModel().getName().toLowerCase().equals("amazon")){
			return AmazonServices.getInstance().UpdateResource(resource.getContext(), 
					resource.getProvider().getFirstURI() , resource.getResourceTypeName(),
					resource.getGUID(),resourceReq);
			 
		}
		
		return null;
	}

	public String DeleteResource(ResourceProxy resource) {
		
		//construct a ResourceRequest object resourceReq
		ResourceRequest resourceReq = 
			FederationOffice.federationscenarios.FederationscenariosFactory.
					eINSTANCE.createResourceRequest();
		resourceReq.setName(  resource.getName()   );
		
		if (resource.getResourceContext().getOfficeModel().getName().toLowerCase().equals("panlab")){
			return PanlabServices.getInstance().DeleteResource(resource.getContext(), 
					resource.getProvider().getFirstURI() , resource.getResourceTypeName(),
					resource.getGUID(), resourceReq  );
		}else if (resource.getResourceContext().getOfficeModel().getName().toLowerCase().equals("uop")){
			return UoPServices.getInstance().DeleteResource(resource.getContext(), 
					resource.getProvider().getFirstURI() , resource.getResourceTypeName(),
					resource.getGUID(), resourceReq);
		}else if (resource.getResourceContext().getOfficeModel().getName().toLowerCase().equals("amazon")){
			return AmazonServices.getInstance().DeleteResource(resource.getContext(), 
					resource.getProvider().getFirstURI() , resource.getResourceTypeName(),
					resource.getGUID(), resourceReq);
		}
		
		return null;
	}

	public ResourceProxy getResourceProxyFromResourceGUID(String context,
			String resourceGUID, ResourceContext resourceContext, ResourceProvider provider,
			ServiceType serviceType) {
		
		
		//construct a ResourceRequest object resourceReq
		ResourceRequest resourceReq = 
			FederationOffice.federationscenarios.FederationscenariosFactory.
					eINSTANCE.createResourceRequest();
		resourceReq.setName(  "UNKNOWN_"+serviceType.getName()   );
		
		for (ServiceSetting setting : serviceType.getOfferedService().getServiceSettings()) {
			ResourceSettingInstance resInst = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceSettingInstance() ;
			resInst.setName( setting.getName() );
			resInst.setStaticValue( "" );
			resourceReq.getReqResourceSettings().add(resInst);
		}
		
		
		if (resourceContext.getOfficeModel().getName().toLowerCase().equals("panlab")){
			 return new ResourceProxy(context, resourceGUID, resourceContext, provider, serviceType, resourceGUID, null);
		}else if (resourceContext.getOfficeModel().getName().toLowerCase().equals("uop")){
			 return new ResourceProxy(context, resourceGUID, resourceContext, provider, serviceType, resourceGUID, null);
		}else if (resourceContext.getOfficeModel().getName().toLowerCase().equals("amazon")){
			 return new ResourceProxy(context, resourceGUID, resourceContext, provider, serviceType, resourceGUID, null);
		}
		
		return null;
	}
	
	public String getParameterValueOfResource(ResourceProxy resource, String paramName){
		
		if (resource.getResourceContext().getOfficeModel().getName().toLowerCase().equals("panlab")){
			 return PanlabServices.getInstance().getParameterValueOfResource(
					 resource.getContext(), 
					 resource.getProvider().getFirstURI(), 
					 resource.getGUID(), paramName);
		}else if (resource.getResourceContext().getOfficeModel().getName().toLowerCase().equals("uop")){
			 return UoPServices.getInstance().getParameterValueOfResource(
					 resource.getContext(), 
					 resource.getProvider().getFirstURI(), 
					 resource.getGUID(), paramName);
		}else if (resource.getResourceContext().getOfficeModel().getName().toLowerCase().equals("amazon")){
			 return AmazonServices.getInstance().getParameterValueOfResource(
					 resource.getContext(), 
					 resource.getProvider().getFirstURI(), 
					 resource.getGUID(), paramName);
		}
		return null;
	}

	public void LoadFederationScenario(RequestedFederationScenario fedScenario, Office office) {
		if (office.getName().toLowerCase().equals("panlab")){
			PanlabServices.getInstance().LoadFSbyVCT(fedScenario);
		}			
		
	}

	
	

	

}