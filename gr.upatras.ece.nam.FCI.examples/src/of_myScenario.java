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
		
		
		import java.util.ArrayList;
import java.util.Iterator;
		import java.util.List;		
import java.util.Set;

		import gr.upatras.ece.nam.fci.core.FCI;
		import gr.upatras.ece.nam.fci.core.ParameterValuePair;
		import gr.upatras.ece.nam.fci.core.ResourceContext;
		import gr.upatras.ece.nam.fci.core.ResourceGroup;
		import gr.upatras.ece.nam.fci.core.ResourceProvider;
		import gr.upatras.ece.nam.fci.core.ResourceProxy;
import gr.upatras.ece.nam.fci.core.ServiceType;

import brokermodel.fcielements.AuthorizationKey;
import brokermodel.fcielements.FCICredentials;
		
		public class of_myScenario {
			
			//make VPN with UoP
			//Connect to Openflow1->.227->ptm
			//verify ssh from ptm to .227
			//verify  with "sudo ovs-vsctl list sflow" that there are no sflows
			//opens FlowTrend
			//monitor ptm
			//ssh to openflow1...and run netperf
			//run this java file
			//in the end remove sflows manually by executing:
			//"sudo ovs-vsctl remove bridge pubbr0 sflow 5ba7c447-704c-43b6-bb5e-19135ddf5e13"
			
			
			//TODO: Please enter here identity for UoP
			String _username_UoP ="ctranoris";
			String _password_UoP ="PASSWORD";
			
			boolean createsflow = true;
			
			FCI fci = FCI.getInstance();
			
			ResourceContext _context_UoP;
			
			public ResourceContext _return_context_UoP(){ 
				//credentials for amazon Office
				
				FCICredentials cred = fci.createFCICredentials(_username_UoP, _password_UoP);
				AuthorizationKey authKey = fci.createAuthorizationKey(cred);
				ResourceContext _context_UoP = fci.createResourceContext("UoP", authKey);
				return _context_UoP;
			}
			
					
			//
			private ResourceProxy createResource_mysflow(){
				//Create a service type by its name
				ServiceType service = _context_UoP.getServiceType("sflow");
				
				//get a resource provider 
				ResourceProvider provider = _context_UoP.getResourceProviderBySiteURI("nam");
				
				//create Parameters of a resource
				List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
				ParameterValuePair p;
//				p = new ParameterValuePair("target", "150.140.255.162:6343");
				p = new ParameterValuePair("target", "150.140.184.212:6343", "myinp");
				params.add(p);
				p = new ParameterValuePair("sflow_id", "-", "myinp");
				params.add(p);
				ResourceProxy resource_mysflow = _context_UoP.createResourceProxy("myScenario", "resource_mysflow", provider, service, params);
				return  resource_mysflow;
			}
			private ResourceProxy createResource_myqos_rate_limiting(){
				//Create a service type by its name
				ServiceType service = _context_UoP.getServiceType("qos_rate_limiting");
				
				//get a resource provider 
				ResourceProvider provider = _context_UoP.getResourceProviderBySiteURI("nam");
				
				//create Parameters of a resource
				List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
				ParameterValuePair p;
				p = new ParameterValuePair("vif", "vif6.0", "myinp");
				params.add(p);
				p = new ParameterValuePair("ingress_policing_rate", "1000000", "myinp");
				params.add(p);
				p = new ParameterValuePair("ingress_policing_burst", "100000", "myinp");
				params.add(p);
				ResourceProxy resource_myqos_rate_limiting = _context_UoP.createResourceProxy("myScenario", "resource_myqos_rate_limiting", provider, service, params);
				return  resource_myqos_rate_limiting;
			}
			/**
			 * @param args
			 */
			public static void main(String[] args) {
				new of_myScenario();
		
			}
			
			//for each imported office, we need credentials
		
			public of_myScenario() {
				CreateContexts();
				CreateScenario();
				Set<ServiceType> uopservices = _context_UoP.getAvailableServices();
				for (Iterator iterator = uopservices.iterator(); iterator
						.hasNext();) {
					ServiceType serviceType = (ServiceType) iterator.next();
					System.out.println(serviceType.getName());
					System.out.println(serviceType.getDescription());
					
				}
			}
			
			public void CreateContexts(){
				_context_UoP = _return_context_UoP();
				_context_UoP = _return_context_UoP();
				
			}
		
			private void CreateScenario() {
		    //    Group (for grouping resources)
				ResourceGroup myGroup = FCI.getInstance().createResourceGroup("myGroup");
				//all creates			
				if (createsflow){
					ResourceProxy resource_mysflow = createResource_mysflow();
					System.out.println("mysflow resource GUID: " + resource_mysflow.getGUID());
					myGroup.addResourceProxy(resource_mysflow);
				}
				ResourceProxy resource_myqos_rate_limiting = createResource_myqos_rate_limiting();
				System.out.println("myqos_rate_limiting resource GUID: " + resource_myqos_rate_limiting.getGUID());
				myGroup.addResourceProxy(resource_myqos_rate_limiting);
				
				try {

					Thread.sleep(5*60*1000);
					RemoveLimit( resource_myqos_rate_limiting );
					Thread.sleep(5*60*1000);
					SetLimit( resource_myqos_rate_limiting );
					Thread.sleep(5*60*1000);
					RemoveLimit( resource_myqos_rate_limiting );
					Thread.sleep(5*60*1000);
					SetLimit( resource_myqos_rate_limiting );
					Thread.sleep(5*60*1000);
					RemoveLimit( resource_myqos_rate_limiting );
					Thread.sleep(5*60*1000);
					SetLimit( resource_myqos_rate_limiting );
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		
				//example reads
//				System.out.println("mysflow target = "+ resource_mysflow.getParameterValueOfResource("target", true));
//				System.out.println("mysflow sflow_id = "+ resource_mysflow.getParameterValueOfResource("sflow_id", true));
//				System.out.println("myqos_rate_limiting vif = "+ resource_myqos_rate_limiting.getParameterValueOfResource("vif", true));
//				System.out.println("myqos_rate_limiting ingress_policing_rate = "+ resource_myqos_rate_limiting.getParameterValueOfResource("ingress_policing_rate", true));
//				System.out.println("myqos_rate_limiting ingress_policing_burst = "+ resource_myqos_rate_limiting.getParameterValueOfResource("ingress_policing_burst", true));
				
				// Terminate the group..terminate any contained resources and release scenario
				myGroup.TearDownResources();
				}


			private void SetLimit(ResourceProxy resource) {
				
				List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
				ParameterValuePair p;
				p = new ParameterValuePair("ingress_policing_rate", "1000000", "myinp");//1Gbps
				params.add(p);
				p = new ParameterValuePair("ingress_policing_burst", "100000", "myinp");
				params.add(p);
				resource.UpdateResource(params); 
				
			}
			
			private void RemoveLimit(ResourceProxy resource) {
				
				List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
				ParameterValuePair p;
				p = new ParameterValuePair("ingress_policing_rate", "2000000", "myinp");//2Gbps
				params.add(p);
				p = new ParameterValuePair("ingress_policing_burst", "200000", "myinp");
				params.add(p);
				resource.UpdateResource(params); 
				
			}
		
			
		
		
		}
		
