package gr.upatras.ece.nam.fci.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import brokermodel.experimentRuntime.ExperimentRuntimeFactory;
import brokermodel.experimentRuntime.RuntimeElement;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.federationscenarios.ResourceSettingInstance;



public class ResourceProxy {

		private String ptmAlias;
		private String ResourceTypeName;
//		private Office office;
		private ResourceContext resourceContext;
		private ResourceProvider provider;
		private ServiceType serviceType;
		private List<ParameterValuePair> params;
		private ResourceRequest resourceRequest;
		
		/**
		 * @return the resourceRequest
		 */
		public ResourceRequest getResourceRequest() {
			return resourceRequest;
		}

		public ResourceProxy(String context, String resourceName, ResourceContext resourceContext, ResourceProvider provider,
				ServiceType service, String guid, ResourceRequest resRequest) {
			
			this.resourceRequest = resRequest;
			//should we check if the rtinfo already exists?
			RuntimeElement rtInfo = null;
			if (this.resourceRequest.getRuntimeInfo()==null){
				rtInfo = ExperimentRuntimeFactory.eINSTANCE.createRuntimeElement() ;
				resourceRequest.setRuntimeInfo(rtInfo );
			}else{
				rtInfo = this.resourceRequest.getRuntimeInfo();
			}
			

			rtInfo.setContext(context);
			rtInfo.setGUID(guid);
			
			this.setResourceContext(resourceContext);
			this.setProvider(provider);
			this.setServiceType(service);
			this.setPtmAlias(ptmAlias);
			this.setResourceTypeName(ResourceTypeName);
			
			//create an internal pair list to maintained proxied values
			List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();			
			for (ResourceSettingInstance resSetting : resourceRequest.getReqResourceSettings()) {				
				ParameterValuePair p = new ParameterValuePair(resSetting.getRefResourceSetting().getName() , resSetting.getStaticValue(), resSetting.getName() );
				params.add(p);
			}
			
			this.setParams(params);
		}

		public void setResourceTypeName(String resourceTypeName) {
			ResourceTypeName = resourceTypeName;
		}

		public String getResourceTypeName() {
			return ResourceTypeName;
		}

		public void setPtmAlias(String ptmAlias) {
			this.ptmAlias = ptmAlias;
		}

		public String getPtmAlias() {
			return ptmAlias;
		}
		
		/**
		 * Updates the Resource throug provided list of params
		 * @author ctranoris
		 * @return the response of the update
		 * @param ParameterValuePairList The alias of the resource type (e.g rubis_db)
		 */
		public String UpdateResource(List<ParameterValuePair> val){
			for (ParameterValuePair param_to_update : val) {
				
				for (ParameterValuePair param : params) {
					if ( param.getParameter().equalsIgnoreCase( param_to_update.getParameter() ) ){
						param.setValue(  param_to_update.getValue()  );
						break;
					}
				}
				
			} 
			
			return UpdateResource();
		}
		
		/**
		 * Updates the Resource with the stored params
		 * @author ctranoris
		 * @return the response of the update
		 */
		private String UpdateResource(){
			return FCI.getInstance().UpdateResource(this, params);
		}
		
	
		/**
		 * Returns the value of a given parameter
		 * @author ctranoris
		 * @param paramName The name of the parameter to retrieve
		 * @param forceUpdate If True will ask the actual resource through the API. If False it will return a cached value. If the cached values is empty then it will anyway ask the actual resource
		 * @return the value of a given parameter
		 */
		public String updateParameterValueOfResource(String paramName, String paramValue ){
			
			for (ParameterValuePair param : params) {
				if ( param.getParameter().equalsIgnoreCase(paramName) ){
					param.setValue( paramValue  );
					break;
				}
			}
			
			this.UpdateResource();
			return null;
			
		}
		
		/**
		 * Deletes the Resource
		 * @author ctranoris
		 * @return the response of the delete
		 */
		public String DeleteResource() {
			return FCI.getInstance().DeleteResource(this);
		}
		
		
		/**
		 * Returns the value of a given parameter
		 * @author ctranoris
		 * @param paramName The name of the parameter to retrieve
		 * @param forceUpdate If True will ask the actual resource through the API. If False it will return a cached value. If the cached values is empty then it will anyway ask the actual resource
		 * @return the value of a given parameter
		 */
		public String getParameterValueOfResource(String paramName, boolean forceUpdate){
			
			for (ParameterValuePair param : params) {
				if ( param.getParameter().equalsIgnoreCase(paramName) ){
					
					if (forceUpdate || ("".equals(param.getValue())) ){
						param.setValue( FCI.getInstance().getParameterValueOfResource(this, paramName)  );
					}
					return param.getValue();
					
				}
			}
			
			return null;
			
		}
		


		public void setProvider(ResourceProvider provider) {
			this.provider = provider;
		}



		public ResourceProvider getProvider() {
			return provider;
		}



		public void setServiceType(ServiceType serviceType) {
			this.serviceType = serviceType;
		}



		public ServiceType getServiceType() {
			return serviceType;
		}



		public void setParams(List<ParameterValuePair> params) {
			this.params = params;
		}



		public List<ParameterValuePair> getParams() {
			return params;
		}

		public String getGUID() {
			return this.resourceRequest.getRuntimeInfo().getGUID();
		}
		public String getContext() {
			return this.resourceRequest.getRuntimeInfo().getContext();
		}

		public String getName() {
			return this.resourceRequest.getName();
		}

		public void setResourceContext(ResourceContext resourceContext) {
			this.resourceContext = resourceContext;
		}

		public ResourceContext getResourceContext() {
			return resourceContext;
		}
	
}
