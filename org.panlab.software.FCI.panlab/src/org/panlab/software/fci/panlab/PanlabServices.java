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
package org.panlab.software.fci.panlab;

import java.util.Date;

import FederationOffice.Office;
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

public class PanlabServices {
	
	private Office panlabOffice;
	//public static String PanlabGWCAlias = "http://teaglegw.dyndns.org:9000/teaglegw";
	public static String PanlabGWCAlias = "http://creativese.no-ip.org:9000/teaglegw";
	public static String PanlabRepoGWCAlias = "http://repos.pii.tssg.org:8080/repository/rest";
	//http://nam.ece.upatras.gr/fedway/submit_event.php?subject=aResource&descr=myDescription&resourceid=123456&start_ts=2011-09-15%2017:00:00&end_ts=2011-09-17%2011:01:31&guid=guid5&scenarioid=scen1234&scenarioName=myScenario
	public static String fedway= "http://nam.ece.upatras.gr/fedway";
	public String username;
	
	private static PanlabServices instance;

	public static PanlabServices getInstance() {
		if (instance == null)
			instance = new PanlabServices();
		return instance;
	}
	
	public PanlabServices() {
		
	}

	
	public Office getOffice(final String username, final String password, final Boolean forceRefresh){
		if ( (panlabOffice!=null) && (!forceRefresh) )
			return panlabOffice;				  

		panlabOffice = new PanlabOfficeProxy(username, password,  forceRefresh);
		this.username = username;
		
		if (( (PanlabOfficeProxy)panlabOffice).officeLoaded() )
			return panlabOffice;
		else
			return null;
	}
	
	public void	LoadFSbyVCT(RequestedFederationScenario fs){
		( (PanlabOfficeProxy)panlabOffice).LoadFSbyVCT(fs);
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
	public String CreateResource(String scenario, String ptmAlias, 
			String resourceTypeName, ResourceRequest resourceReq){
		
		if (PanlabOfficeProxy.DONTPropagateToTeagleGW )
			return "test-"+resourceReq.getName();

		PanlabGWClient pgw = new PanlabGWClient( PanlabServices.PanlabGWCAlias	);
		
		String params="";
		
		for (ResourceSettingInstance pv : resourceReq.getReqResourceSettings()) {
			if ( (pv.getStaticValue()!=null)&&(!"".equals( pv.getStaticValue())) ){ //propagate only if not empty
				
				if (pv.getRefResourceSetting()!=null)
					params+= "<"+pv.getRefResourceSetting().getName()  +">"+pv.getStaticValue() +"</"+pv.getRefResourceSetting().getName() +">" ;
				else
					params+= "<"+pv.getName()  +">"+pv.getStaticValue() +"</"+pv.getName() +">" ;
			}
		}
		boolean req =pgw.POSTExecute( ptmAlias+".top-0", ptmAlias,
		 "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
		 	"<"+resourceTypeName+">" +
		 		"<context><vctId>"+scenario+"</vctId></context>" +
		 		"<configuration>" +
		 		params +
		 		"</configuration>" +
		 "</"+resourceTypeName+">"
		 	);
		 
		String s = "";
		if (req){
			XMLutils x = new XMLutils(true);
			s = x.getNodeValueFromXML( pgw.getResponse_stream(), "//uuid/text()");
			//<?xml version="1.0" encoding="utf-8"?><rubis_db status="SUCCESS"><uuid type="string">uop.rubis_db-58</uuid></rubis_db>
		}else
			s=ptmAlias+"."+resourceTypeName+".node-0";
		
		try {
			////http://nam.ece.upatras.gr/fedway/submit_event.php?subject=aResource&descr=myDescription&resourceid=123456&start_ts=2011-09-15%2017:00:00&end_ts=2011-09-17%2011:01:31&guid=guid5&scenarioid=scen1234&scenarioName=myScenario
			
			
			String subject = resourceReq.getRefOfferedResource().getName();
			String myDescription = resourceReq.getRefOfferedResource().getName() 
					+"created by FCI with Alias: "+resourceReq.getName() +", for Scenario: "+scenario + ", by user: "+this.username;
			String resourceid = resourceReq.getRefOfferedResource().getUniqueID(); 		
			Date start_ts = new Date ();
			Date end_ts = new Date ();
			String guid = s;
			String scenarioid = scenario;
			String scenarioName = scenario;
			
			
			pgw.informFedWay(fedway, subject , myDescription, resourceid, 
					start_ts, end_ts, guid, scenarioid, scenarioName, this.username);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return s;
		

//		//a CREATE resource example
//		PanlabGWClient u = new PanlabGWClient( "http://150.140.184.156:9000/teaglegw"	);
//		 u.POSTexecute( "uop.top-0", "uop",
//		 "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
//		 		"<rubis_db>" +
//		 		"<context><vctId>ctranoris_rubbis_db</vctId></context>" +
//		 		"<configuration>" +
//		 			"<VLANID>23</VLANID><IP>10.0.0.1</IP>" +
//		 			"<GW>10.0.0.250</GW>" +
//		 			"<MEM>256</MEM>" +
//		 			"<DISKSPACE>10000</DISKSPACE>" +
//		 			"<CPUCAP>0</CPUCAP>" +
//		 		"</configuration>" +
//		 "</rubis_db>"
//		 	);
	}
	
	/**
	 * Updates a Resource
	 * @author ctranoris
	 * @return the response of the update
	 * @param runtimeID The RuntimeID (or GUID) of the resource to be updated. In Panlab, probably is something like resource-number (e.g. rubisdb-12)
	 * @param resourceReq A ResourceRequest object containing  ResourceSettingInstances, a list with params to be created
	*/
	public String UpdateResource(String contextName, String providerURI, 
			String resourceTypeName, 
			String runtimeID, 
			ResourceRequest resourceReq){


		if (PanlabOfficeProxy.DONTPropagateToTeagleGW )
			return "test-"+resourceReq.getName();
		
		PanlabGWClient pgw = new PanlabGWClient( PanlabServices.PanlabGWCAlias	);
		
		String params="";
	
		
		for (ResourceSettingInstance pv : resourceReq.getReqResourceSettings()) {
			if ( (pv.getStaticValue()!=null)&&(!"".equals( pv.getStaticValue())) ){ //propagate only if not empty
				
				if (pv.getRefResourceSetting()!=null)
					params+= "<"+pv.getRefResourceSetting().getName()  +">"+pv.getStaticValue() +"</"+pv.getRefResourceSetting().getName() +">" ;
				else
					params+= "<"+pv.getName()  +">"+pv.getStaticValue() +"</"+pv.getName() +">" ;
			}
		}
		
		//ptmAlias.«name»
//		System.out.println("update «name» "+ this.getInstanceName() );
//		PanlabGWClient pgw = PanlabGWClient.getInstance();
//		String cname = this.getClass().getName();
//		pgw.POSTexecute(this.getInstanceName(), ptmAlias,  
//				"<"+cname+" action=\"update\">" +
//				"<configuration>" +
//				"<context><vctId>" +
//				this.getVCTid()+
//				"</vctId></context>" +
//					"<configuration>" +
//					args+
//					"</configuration>" +
//				"</configuration></"+cname+">");
		
		boolean req = pgw.POSTExecute( runtimeID, providerURI,
		 "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
		 	"<"+resourceTypeName+" action=\"update\">" +
		 		"<context><vctId>"+contextName+"</vctId></context>" +
		 		"<configuration>" +
		 		params +
		 		"</configuration>" +
		 "</"+resourceTypeName+">"
		 	);
		 
		String s = "";
		if (req){
			XMLutils x = new XMLutils(true);
			s = x.getNodeValueFromXML( pgw.getResponse_stream(), "//uuid/text()");
			//<?xml version="1.0" encoding="utf-8"?><rubis_db status="SUCCESS"><uuid type="string">uop.rubis_db-58</uuid></rubis_db>
		}else
			s=providerURI+"."+resourceTypeName+".node-0";
		
		//System.out.println("Value = " + s);
		return s;
	}

	public String DeleteResource(String contextName, String providerURI, 
			String resourceTypeName, 
			String runtimeID, 
			ResourceRequest resourceReq) {
		
		if (PanlabOfficeProxy.DONTPropagateToTeagleGW )
			return "test-DeleteResource-"+resourceReq.getName();
		
		PanlabGWClient pgw = new PanlabGWClient( PanlabServices.PanlabGWCAlias	);
		
		
		
		pgw.DELETEexecute( runtimeID, providerURI,
		 "<delete>" +
		 "</delete>"
		 	);
		 
		XMLutils x = new XMLutils(true);
		String s = x.getNodeValueFromXML( pgw.getResponse_stream(), "//uuid/text()");
		//System.out.println("Value = " + s);
		
		
		try {
			////http://nam.ece.upatras.gr/fedway/submit_event.php?subject=aResource&descr=myDescription&resourceid=123456&start_ts=2011-09-15%2017:00:00&end_ts=2011-09-17%2011:01:31&guid=guid5&scenarioid=scen1234&scenarioName=myScenario
			
			
			String subject = "";
			String myDescription = "";
			String resourceid = ""; 		
			Date start_ts = new Date ();
			Date end_ts = new Date ();
			String guid = runtimeID;
			String scenarioid = "";
			String scenarioName = "";
			
			
			pgw.informFedWay(fedway, subject , myDescription, resourceid, 
					start_ts, end_ts, guid, scenarioid, scenarioName, this.username  );
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return s;
	}
	
	/**
	*
	*Call '<em><b>getParameterValueOfResource</b></em>' when you want to get the value of a resource's attribute from down the actual resource
	*WARNING: Get currently works only with RAs implemented with RADL that
	*respond to get with their XML.(e.g. if(top.equalsIgnoreCase("get")) in RAService.java)
	*/
	public String getParameterValueOfResource(String scenario, String ptmAlias, 
			String resourceRuntimeID, String paramName){


		if (PanlabOfficeProxy.DONTPropagateToTeagleGW )
			return "test-getParameterValueOfResource-"+paramName;
		
		PanlabGWClient pgw = new PanlabGWClient( PanlabServices.PanlabGWCAlias	);
	
		pgw.GETexecute( resourceRuntimeID, ptmAlias);
		XMLutils x = new XMLutils(true);
		String s = x.getNodeValueFromXML(pgw.getResponse_stream(), "//"+paramName+"/text()");
		System.out.println("Value = " + s);
		return s;
	}

	
}
