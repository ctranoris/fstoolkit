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
package gr.upatras.ece.nam.fci.uop;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

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

import brokermodel.Broker;
import brokermodel.fcielements.AuthorizationKey;
import brokermodel.fcielements.IFCIService;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.federationscenarios.ResourceSettingInstance;

//The model can be called like:
//http://localhost:8081/org.panlab.software.ws.repos.m2m/repo/PanlabServices.office2
//The extension here of the webservice (eg .office2) must be registered
//also in the language (ie in officedl) under the extension point org.eclipse.xtext.extension_resourceServiceProvider
//uriExtension=office2, class= the same as the officedl extension
//So, as a result the response (which is an instance of the ecore model) can be seen inside the DSL

//Since there is a penalty here from the repository, caching can be used 
//(i.e. saving somewhere on the server the whole ecore model) instead of making
//on the fly transformation or use an Office Proxy

public class UoPServices implements IFCIService{
	
	private Broker uopOffice;
	public static String UoPGWCAlias = "http://creativese.no-ip.org:9000/teaglegw";
	public static String fedway= "http://nam.ece.upatras.gr/fedway";
	public String username;
	
	private static UoPServices instance;

	public static UoPServices getInstance() {
		if (instance == null)
			instance = new UoPServices();
		return instance;
	}
	
	public UoPServices() {
		
	}


	@Override
	public Broker getBroker() {
		if (uopOffice!=null)
			return uopOffice;
		return null;
	}

	@Override
	public Broker getBroker( String username,  String password,  boolean forceRefresh){
		if ( (uopOffice!=null) && (!forceRefresh) )
			return uopOffice;				  

		uopOffice = new UoPOfficeProxy(username, password,  forceRefresh);
		this.username = username;
		
		if (( (UoPOfficeProxy)uopOffice).officeLoaded() )
			return uopOffice;
		else
			return null;
	}
	
	public void	LoadFSbyVCT(RequestedFederationScenario fs){
		( (UoPOfficeProxy)uopOffice).LoadFSbyVCT(fs);
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
		
	

		UoPGWClient pgw = new UoPGWClient( UoPServices.UoPGWCAlias	);
		
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
					+"created by FCI with Alias: "+resourceReq.getName() +", for Scenario: "+scenario + 
					", by user: "+this.username;
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
//		UoPGWClient u = new UoPGWClient( "http://150.140.184.156:9000/teaglegw"	);
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


		
		UoPGWClient pgw = new UoPGWClient( UoPServices.UoPGWCAlias	);
		
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
//		UoPGWClient pgw = UoPGWClient.getInstance();
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
		
//		if (PanlabOfficeProxy.DONTPropagateToTeagleGW )
//			return "test-DeleteResource-"+resourceReq.getName();
		
		UoPGWClient pgw = new UoPGWClient( UoPServices.UoPGWCAlias	);
		
		
		
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


//		if (PanlabOfficeProxy.DONTPropagateToTeagleGW )
//			return "test-getParameterValueOfResource-"+paramName;
		
		UoPGWClient pgw = new UoPGWClient( UoPServices.UoPGWCAlias	);
	
		pgw.GETexecute( resourceRuntimeID, ptmAlias);
		XMLutils x = new XMLutils(true);
		String s = x.getNodeValueFromXML(pgw.getResponse_stream(), "//"+paramName+"/text()");
		System.out.println("Value = " + s);
		return s;
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
	public void setBroker(Broker value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Broker getBroker(AuthorizationKey authorizationKey,
			boolean forceRefresh) {
				return uopOffice;
		// TODO Auto-generated method stub
		
	}

}
