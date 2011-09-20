package org.panlab.software.fstoolkit.scenariotofci

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import FederationOffice.Office
import FederationOffice.federationscenarios.ResourceRequest
import FederationOffice.federationscenarios.RequestedFederationScenario
import FederationOffice.resources.OfferedResource
import org.eclipse.xtext.naming.IQualifiedNameProvider

class JavaFCIGenerator  implements IGenerator {


	@Inject extension IQualifiedNameProvider nameProvider 
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		System::out.println( "resource="+resource.toString )
		for(EObject e: resource.allContentsIterable.filter(typeof( RequestedFederationScenario ))) {
			e.toClass(fsa)
			
			
    	}
    	
	}

	def addResourceContext(Office e) {
		 '''
		ResourceContext _context_«e.name»;
		
		public ResourceContext _return_context_«e.name»(){ 
			//credentials for amazon Office
			FCICredentials cred = new FCICredentials(_username_«e.name», _password_«e.name»);
			AuthorizationKey authKey = fci.createAuthorizationKey(cred);
			ResourceContext _context_«e.name» = fci.createResourceContext("«e.name»", authKey);
			return _context_«e.name»;
		}
		
		'''
	}

	def addcreateResource(Office o, ResourceRequest e) {
		'''
		private ResourceProxy createResource_«e.name»(){
			//Create a service type by its name
			ServiceType service = _context_«o.name».getServiceType("«e.refOfferedResource.implOfferedService.name»");
			
			//get a resource provider 
			ResourceProvider provider = _context_«o.name».getResourceProviderByURI("«e.refOfferedResource.belongsToSite.name»");
			
			//create Parameters of a resource
			List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
			ParameterValuePair p;
			«FOR p : e.reqResourceSettings »
			p = new ParameterValuePair("«p.refResourceSetting.name»", "«p.staticValue»");
			params.add(p);
			«ENDFOR»
			ResourceProxy resource_«e.name» = _context_«o.name».createResourceProxy("myScenario", "echo_rp12_s12_or10782", provider, service, params);
			return  resource_«e.name»;
		}
		'''	
		
	}

	

	def dispatch toClass(RequestedFederationScenario e, IFileSystemAccess fsa) {
		System::out.println( "compile2="+e.toString )
		
		for(reqResource : e.infrastructureRequest.reqOfferedResources ){
			reqResource.refOfferedResource.toClass(fsa);	
		}
		
		fsa.generateFile("scenario/"+e.name + ".java", '''
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
		
		package scenario;
		
		import java.util.ArrayList;
		import java.util.List;		
		import org.panlab.software.fci.core.AuthorizationKey;
		import org.panlab.software.fci.core.FCI;
		import org.panlab.software.fci.core.FCICredentials;
		import org.panlab.software.fci.core.ParameterValuePair;
		import org.panlab.software.fci.core.ResourceContext;
		import org.panlab.software.fci.core.ResourceGroup;
		import org.panlab.software.fci.core.ResourceProvider;
		import org.panlab.software.fci.core.ResourceProxy;
		import org.panlab.software.fci.core.ServiceType;
		
		public class «e.name» {
			
			«FOR  s : e.infrastructureRequest.reqOfferedResources»
				«var office =  s.refOfferedResource.belongsToSite.belongsToProvider.eContainer as Office»
				//TODO: Please enter here identity for «office.name»
				String _username_«office.name» ="ENTER USERNAME";
				String _password_«office.name» ="ENTER PASSWORD";
			«ENDFOR»
			
			FCI fci = FCI.getInstance();
			
			//for each imported office, we need a Resource Context	
			«FOR  s : e.infrastructureRequest.reqOfferedResources»
				«var office =  s.refOfferedResource.belongsToSite.belongsToProvider.eContainer as Office»
				«addResourceContext(office)»
			«ENDFOR»
					
			//
			«FOR  s : e.infrastructureRequest.reqOfferedResources»
				«var office =  s.refOfferedResource.belongsToSite.belongsToProvider.eContainer as Office»
				«addcreateResource(office, s)»
			«ENDFOR»
			/**
			 * @param args
			 */
			public static void main(String[] args) {
				new «e.name»();
		
			}
			
			//for each imported office, we need credentials
		
			public «e.name»() {
				CreateContexts();
				CreateScenario();
			}
			
			public void CreateContexts(){
				«FOR  s : e.infrastructureRequest.reqOfferedResources»
				«var office =  s.refOfferedResource.belongsToSite.belongsToProvider.eContainer as Office»
				_context_«office.name» = _return_context_«office.name»();
				«ENDFOR»
				
			}
		
			private void CreateScenario() {
		    //    Group (for grouping resources)
				ResourceGroup myGroup = FCI.getInstance().createResourceGroup("myGroup");
				//all creates				
				«FOR  s : e.infrastructureRequest.reqOfferedResources»
				ResourceProxy resource_«s.name» = createResource_«s.name»();
				System.out.println("«s.name» resource GUID: " + resource_«s.name».getGUID());
				myGroup.addResourceProxy(resource_«s.name»);
				«ENDFOR»
								 
				
//				System.out.println("Echo input = "+ resource_myecho.getParameterValueOfResource("input", true));
//				//assignments
//				// Update assignments for resources of group

				«FOR  reqResource : e.infrastructureRequest.reqOfferedResources»
				«FOR reqSetting : reqResource.reqResourceSettings »
				«IF reqSetting.assignSetting.size >0  »
					«FOR s : reqSetting.assignSetting »
					«var assignedResReq = s.eContainer as ResourceRequest»
					String resource_«assignedResReq.name»_«s.name» = resource_«assignedResReq.name».getParameterValueOfResource("«s.name»", true);
					resource_«reqResource.name».updateParameterValueOfResource("«reqSetting.refResourceSetting.name»", resource_«assignedResReq.name»_«s.name»);
					«ENDFOR»
				«ENDIF»
				«ENDFOR»
				«ENDFOR»				
				
				//example reads
				«FOR  reqResource : e.infrastructureRequest.reqOfferedResources»
				«FOR reqSetting : reqResource.reqResourceSettings »
					System.out.println("«reqResource.name» «reqSetting.name» = "+ resource_«reqResource.name».getParameterValueOfResource("«reqSetting.refResourceSetting.name»", true));
				«ENDFOR»
				«ENDFOR»
				
				// Terminate the group..terminate any contained resources and release scenario
				myGroup.TearDownResources();
				}
		
			
		
		
		}
		
		''')
	}
	
	

	

	def dispatch void toClass(EObject m, IFileSystemAccess fsa) { }

}
	