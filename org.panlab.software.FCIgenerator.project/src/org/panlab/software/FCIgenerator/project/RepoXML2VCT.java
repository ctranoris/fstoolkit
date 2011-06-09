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

package org.panlab.software.FCIgenerator.project;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;
import org.panlab.software.fci.panlab.PanlabServices;
import org.panlab.software.fci.panlab.RepoClient;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import FederationOffice.FederationOfficeFactory;
import FederationOffice.FederationOfficePackage;
import FederationOffice.Office;
import FederationOffice.federationscenarios.InfrastructureRequest;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ServiceRequest;
import FederationOffice.federationscenarios.ServicesRequest;
import FederationOffice.providersite.ProvidersiteFactory;
import FederationOffice.providersite.Site;
import FederationOffice.resources.OfferedResource;
import FederationOffice.resources.ResourcesFactory;
import FederationOffice.services.OfferedService;
import FederationOffice.services.ServiceSetting;
import FederationOffice.services.ServicesFactory;
import FederationOffice.users.Account;
import FederationOffice.users.OfficeUser;
import FederationOffice.users.ResourcesProvider;
import FederationOffice.users.UsersFactory;


/**
 * This class actually handles both the M2M and the M2T transformations.
 * Upon instantiation the M2M is made. Responses from the repo are used to instantiate the Office model.
 * Then, by calling the function {@link RepoXML2VCT#Model2Code(String, String)} the code is generated for the
 * target language.
 * @author ctranoris
 *
 */
public class RepoXML2VCT {

	private static Office office;
	private static RepoClient httpcli;
	private static OfficeUser officeTideUser;
	private static ResourcesProvider officePartner;
	private String OfficeUsername;
	private String OfficePassword;
	private String VCTname;
	private RequestedFederationScenario VCT;
	private Site partnerSite;
	
//	Un-comment the following lines to run it and test it
//	public static void main(String[] args) throws XPathExpressionException,
//			ParserConfigurationException, SAXException, IOException {
//		RepoXML2VCT process = new RepoXML2VCT("PanlabUsername", "PanlabPassword", "VCTname");
//		
//	}

	/**
	 * The constructor of the class {@link RepoXML2VCT}. The repository url is hardcoded for now
	 * @param requsername
	 * @param reqpassword
	 * @param reqVCT
	 * @author ctranoris
	 */
	public RepoXML2VCT(String requsername, String reqpassword, String reqVCT) {
		super();
		OfficeUsername = requsername;
		OfficePassword = reqpassword;
		VCTname = reqVCT;

		httpcli = new RepoClient( //hardcode the url for repo just for now
				PanlabServices.PanlabRepoGWCAlias, 
				OfficeUsername, OfficePassword);
		InitModel();
		XML2TargetModel();
	}
	
	/**
	 * Initializes the Office model
	 * @author ctranoris
	 */
	private void InitModel(){
		
		//create a temporary office
		office = FederationOfficeFactory.eINSTANCE.createOffice();		
		office.setName("Panlab");
		//create a temporary partner
		officePartner = UsersFactory.eINSTANCE.createResourcesProvider()  ;
		office.getRegisteredUsers().add( officePartner );		
		officePartner.setName("temp");
		officePartner.setId(0);
		partnerSite = ProvidersiteFactory.eINSTANCE.createSite();
		partnerSite.setId(0);
		partnerSite.setName("tempsite");
		officePartner.getOfferedSiteList().add(partnerSite);
		partnerSite.setBelongsToProvider(officePartner);		
		
		//create one user: our user
		officeTideUser = UsersFactory.eINSTANCE.createOfficeCustomer() ;
		Account account = UsersFactory.eINSTANCE.createAccount();
		account.setUsername(OfficeUsername);
		account.setPassword(OfficePassword);
		account.setName(OfficeUsername);			
		officeTideUser.setHasAccount(account);
		officeTideUser.setName(OfficeUsername);
		office.getRegisteredUsers().add(officeTideUser);
		//create a temporary VCT
		VCT =  FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createRequestedFederationScenario();
		VCT.setName(VCTname);
		office.getAvailableFederationScenarios().add(VCT);
	}
	
	/**
	 * 	Instantiate the model according to the XML responses
	 * @author ctranoris
	 */
	private void XML2TargetModel(){
		
		String id="0";
		id = getNodeValueFromURL(
					"/person", 
					"//person[userName='" + OfficeUsername + "']/@id");
		
		log("personID="+id   );
		officeTideUser.setId(Integer.parseInt(id));//get the ID from repository		
		
		
		id = getNodeValueFromURL("/vct", 
				"//vct[commonName='" + VCTname + "' and  user[@id='" +officeTideUser.getId()+ "']  ]/@id");
		//Un-comment the following line to provide to the user access to any vct
//		id = getNodeValueFromURL("/vct", "//vct[commonName='" + VCTname + "'  ]/@id");
	
		log("VCT="+id   );
		VCT.setId(Integer.parseInt(id));
		
		InfrastructureRequest infReq = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createInfrastructureRequest(); 
		VCT.setInfrastructureRequest(infReq);
		
		NodeList nodes = getNodeListFromURL(
				"/vct/"+VCT.getId(),
				"//vct/providesResources/resourceInstance/@id");


		//for each resourceInstance discover the resourceInstance and resourceType
		for (int i = 0; i < nodes.getLength(); i++) {
			log("resourceInstance: "+nodes.item(i).getNodeName() + '=' + nodes.item(i).getNodeValue());
			String ResourceInstanceid =  nodes.item(i).getNodeValue();
			log( "ResourceInstanceid =" + ResourceInstanceid  );	
			CreateOfferedServiceAndResource(ResourceInstanceid);		
		}
	}
	
	

	/**
	 * Creates offered service and resource in the Office model
	 * @param resourceInstanceid
	 * @see RepoXML2VCT#CreateOfferedService(String)
	 * @see RepoXML2VCT#CreateOfferedResource(OfferedService, String)
	 * @author ctranoris
	 */
	private void CreateOfferedServiceAndResource(String resourceInstanceid) {
		log( "CreateOfferedServiceAndResource for VCT_resourceInstanceid =" + resourceInstanceid  );

		NodeList nodes = getNodeListFromURL("/resourceInstance/"+resourceInstanceid,
							"//resourceInstance");
		log("Process nodes: "+nodes.item(0).getNodeName() + '=' + nodes.item(0).getNodeValue());

		String resInstancename = getNodeValueFromObject( nodes.item(0), "//resourceInstance/commonName/text()" );
		log( "resInstancename=" + resInstancename );

		String resourceSpecID = getNodeValueFromObject( nodes.item(0), "//resourceInstance/resourceSpec/@id" );
		log( "resourceSpecID=" + resourceSpecID );
		OfferedService offeredService = CreateOfferedService(resourceSpecID);

		log( "Offered Service created  =" + offeredService.getName() );
		
		OfferedResource offeredResource = CreateOfferedResource(offeredService, resInstancename);
		log( "Offered Resource created  =" + offeredResource.getName() +" and its service = "+ offeredResource.getImplOfferedService().getName() );
		
		
	}

	/**
	 * @param resourceSpecID
	 * @return an Offered Service from the Office model
	 * @author ctranoris
	 */
	private OfferedService CreateOfferedService(String resourceSpecID) {
		//check if the OfferedService(resourceType) is already in the Office model
		//http://repos.pii.tssg.org:8080/repository/rest/resourceSpec/592
		
		//http://repos.pii.tssg.org:8080/repository/rest/resourceSpec/592
		NodeList resNode = getNodeListFromURL("/resourceSpec/"+resourceSpecID, "//resourceSpec");
		String offeredServiceName = getNodeValueFromObject(resNode.item(0), "//commonName/text()");
		
		
		log("offeredServiceName = "+offeredServiceName);
				
		//check if the OfferedService is already in the Office model
		for (int i = 0; i < office.getOfferedServices().size() ; i++) {
			OfferedService os = office.getOfferedServices().get(i);
			if (os.getName().equals(offeredServiceName) ){
				return os;
			}
		}

		OfferedService e = ServicesFactory.eINSTANCE.createOfferedService();
		e.setId( office.getOfferedServices().size() );
		e.setName(offeredServiceName);
		office.getOfferedServices().add(e);	

		String configurationParametersID = getNodeValueFromObject(resNode.item(0), "//configurationParameters/@id");
		createServiceSettings(e, configurationParametersID);	
		
		
		ServiceRequest sr = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createServiceRequest() ;
		sr.setName("my"+offeredServiceName);
		sr.setRefService(e);
		sr.setNumOfServices(1);
		
		ServicesRequest servicesReq = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createServicesRequest();
		VCT.setServicesRequest(servicesReq);
		VCT.getServicesRequest().getServiceRequestList().add(sr); 	
		
		return e;
		
	}

	/**
	 * @param e The Offered Service
	 * @param configParamCompositeId as appears in the repo
	 * @author ctranoris
	 */
	private void createServiceSettings(OfferedService e, String configParamCompositeId) {
		// http://repos.pii.tssg.org:8080/repository/rest/configParamComposite/591
		log("createServiceSettings offServ="+e.getName()+", id="+configParamCompositeId);
		NodeList resNode = getNodeListFromURL("/configParamComposite/"+configParamCompositeId, "//configParamAtomic");
		for (int i = 0; i <resNode.getLength(); i++) {
			String setId = resNode.item(i).getAttributes().getNamedItem("id").getNodeValue();
			log("settingId (configParamAtomic id)= "+ setId );
			//http://repos.pii.tssg.org:8080/repository/rest/configParamAtomic/586

			NodeList ParamAtomicNode = getNodeListFromURL("/configParamAtomic/"+setId, "//configParamAtomic");
			//String setName = getNodeValueFromURL("/configParamAtomic/"+setId,  "//commonName/text()");
			String setName = getNodeValueFromObject( ParamAtomicNode.item(0) ,  "//commonName/text()");
			String setDescription = getNodeValueFromObject( ParamAtomicNode.item(0) ,  "//description/text()");
			log("setName = "+ setName );			
			log("setDescription = "+ setDescription );			
			ServiceSetting servSetting = ServicesFactory.eINSTANCE.createServiceSetting();
			servSetting.setName(setName);
			servSetting.setDescription(setDescription);
			servSetting.setId(i);
			e.getServiceSettings().add(servSetting);
		} 
		
	}
	
	/**
	 * @param offServ The offered service that this Resource will offer
	 * @param resInstancename The name of the resource
	 * @return the created Offered Resource object
	 * @author ctranoris
	 */
	private OfferedResource CreateOfferedResource(OfferedService offServ, String resInstancename) {
		//check if the OfferedResource is already in the Office model
		
		//check if the resourceType is already in the Office model
		OfferedResource or;
		for (int i = 0; i < partnerSite.getOfferedResourcesList().size() ; i++) {
			or = partnerSite.getOfferedResourcesList().get(i);
			if (or.getName().equals(resInstancename) ){
				return or;
			}
		}

		or = ResourcesFactory.eINSTANCE.createOfferedResource();
		or.setName(resInstancename);
		or.setImplOfferedService(offServ);
		or.setBelongsToSite(partnerSite);
		or.setId(partnerSite.getOfferedResourcesList().size());
		partnerSite.getOfferedResourcesList().add(or);
		
		ResourceRequest orInstance= FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceRequest();
		//OfferedResourceInstance orInstance = VirtualtestbedFactory.eINSTANCE.createOfferedResourceInstance();
		orInstance.setId( or.getId());
		orInstance.setName(resInstancename);
		orInstance.setRefOfferedResource(or);
		
		
		VCT.getInfrastructureRequest().getReqOfferedResources().add(orInstance);
		
		return or;
		
	}
	

	/**
	 * Initiates the M2T transformation and dispatches it to the proper function
	 * @param fpath the src path to save the generated code
	 * @param targetLanguage currently takes values: Java, C
	 * @author ctranoris
	 */
	public void Model2Code(String fpath, String targetLanguage){
		log("Model2Code for "+targetLanguage);
		if (targetLanguage.equalsIgnoreCase("Java")){
			Model2JavaCode(fpath);
		}
		else if (targetLanguage.equalsIgnoreCase("C")){
			Model2C(fpath);
		}
	}

	/**
	 * 	Generate the java code from the model
	 * @param fpath
	 * @author ctranoris
	 */
	public void Model2JavaCode(String fpath){
		
		 // get project root folder as absolute file system path
	    //IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	    //IResource resource = root.findMember(new Path(buildSpec.getProject().getName()));
	    //String containerName = resource.getLocation().toPortableString();

	    // configure outlets
	    OutputImpl output = new OutputImpl();

	    Outlet outlet = new Outlet( fpath );
		log("Model2Code Java code will be generated to: "+fpath);
	    outlet.setOverwrite(true);
	    output.addOutlet(outlet);

	    // create execution context
	    Map<String, Variable> globalVarsMap = new HashMap<String, Variable>();
	    XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null, globalVarsMap, null, null);
	    EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
	        @Override
	        protected EPackage[] allPackages() {
	            return new EPackage[] { FederationOfficePackage.eINSTANCE, EcorePackage.eINSTANCE };
	        }
	    };
	    execCtx.registerMetaModel(metamodel);

	    // generate
		log("Model2Code generate Java facade");

	    XpandFacade facade = XpandFacade.create(execCtx);
	    String templatePath = "template::Template::main";
	    facade.evaluate(templatePath, office);

	    // refresh the project to get external updates:
	    //resource.refreshLocal(IResource.DEPTH_INFINITE, monitor);

	
	}

	/**
	 * 	Generate the C code from the model
	 * @param fpath
	 * @author ctranoris
	 */
	public void Model2C(String fpath){
		
		 // get project root folder as absolute file system path
	    //IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	    //IResource resource = root.findMember(new Path(buildSpec.getProject().getName()));
	    //String containerName = resource.getLocation().toPortableString();

	    // configure outlets
	    OutputImpl output = new OutputImpl();
	    Outlet outlet = new Outlet( fpath );
		log("Model2Code C code will be generated to: "+fpath);
	    outlet.setOverwrite(true);
	    output.addOutlet(outlet);

	    // create execution context
	    Map<String, Variable> globalVarsMap = new HashMap<String, Variable>();
	    XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null, globalVarsMap, null, null);
	    EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
	        @Override
	        protected EPackage[] allPackages() {
	            return new EPackage[] { FederationOfficePackage.eINSTANCE, EcorePackage.eINSTANCE };
	        }
	    };
	    execCtx.registerMetaModel(metamodel);

	    // generate
		log("Model2Code generate C facade");
	    XpandFacade facade = XpandFacade.create(execCtx);
	    String templatePath = "templateC::Template::main";
	    facade.evaluate(templatePath, office);
		log("Model2Code generate C facade.evaluate");

	    // refresh the project to get external updates:
	    //resource.refreshLocal(IResource.DEPTH_INFINITE, monitor);

	
	}

	
	/**
	 * Returns a list value for a node from a given xml url according to an XPATH expression
	 * @param xmlurl
	 * @param exp an XPATH expression
	 * @return a value for a node
	 * @author ctranoris
	 */
	public String getNodeValueFromURL(String xmlurl, String exp)  {
		
		NodeList nodes = getNodeListFromURL( xmlurl,  exp);

		if (nodes.getLength()>0)
			return nodes.item(0).getNodeValue();//always return the i=0 node
		else
			return "";

	}
	
	public String getNodeValueFromObject(Object item, String exp)  {
		
		NodeList nodes = getNodeListFromObject( item,  exp);

		if (nodes.getLength()>0)
			return nodes.item(0).getNodeValue();//always return the i=0 node
		else
			return "";

	}
	
	/**
	 * Returns a list of nodes from a given xml url according to an XPATH expression
	 * @param xmlurl
	 * @param exp an XPATH expression
	 * @return a nodelist
	 * @author ctranoris
	 */
	public NodeList getNodeListFromURL(String xmlurl, String exp)  {
		// Standard of reading a XML file
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		
		try {
			httpcli.execute(xmlurl);
			doc = builder.parse(httpcli.getResponse_stream()); // parse("mpla.xml");
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return  getNodeListFromObject(doc, exp );
	}
	
	
	/**
	 * helper function to extract a Node List from an Object Item according to an XPATH expression
	 * @param item is usually the xml Document
	 * @param exp an XPATH expression
	 * @return a nodelist
	 * @author ctranoris
	 */
	public NodeList getNodeListFromObject(Object item, String exp)  {
		XPathExpression expr = null;			

		// Create a XPathFactory
		XPathFactory xFactory = XPathFactory.newInstance();

		// Create a XPath object
		XPath xpath = xFactory.newXPath();

		// Compile the XPath expression
		try {
			log("XPath expression = "+exp   );
			expr = xpath.compile(exp);
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		
		// Run the query and get a nodeset
		Object result = null;
		try {
			result = expr.evaluate(item, XPathConstants.NODESET);
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}

		// Cast the result to a DOM NodeList
		NodeList nodes = (NodeList) result;
		return nodes;

	}
	
	private void log(String txt){
		System.out.println(  txt);
	}

}
