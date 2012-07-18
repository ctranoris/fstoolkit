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

package gr.upatras.ece.nam.fci.panlab;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import brokermodel.BrokermodelFactory; 
import brokermodel.Broker;
import brokermodel.availabilityContract.Availability;
import brokermodel.availabilityContract.AvailabilityContractFactory;
import brokermodel.availabilityContract.Cost;
import brokermodel.availabilityContract.ResourceServiceContract;
import brokermodel.federationscenarios.InfrastructureRequest;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.federationscenarios.ResourceSettingInstance;
import brokermodel.providersite.DomainManager;
import brokermodel.providersite.ProvidersiteFactory;
import brokermodel.providersite.Site;
import brokermodel.providersite.SiteLocation;
import brokermodel.resources.OfferedResource;
import brokermodel.resources.ResourceSetting;
import brokermodel.resources.ResourcesFactory;
import brokermodel.services.OfferedService;
import brokermodel.services.ServiceResourceOperation;
import brokermodel.services.ServiceSetting;
import brokermodel.services.ServicesFactory;
import brokermodel.services.SettingConstraint;
import brokermodel.services.Taxonomy;
import brokermodel.users.Account;
import brokermodel.users.BrokerCustomer;
import brokermodel.users.BrokerUser;
import brokermodel.users.ResourcesProvider;
import brokermodel.users.TestbedDesigner;
import brokermodel.users.UsersFactory;


/**
 * This class actually handles both the M2M and the M2T transformations.
 * Upon instantiation the M2M is made. Responses from the repo are used to instantiate the Broker model.
 * @author ctranoris
 *
 */
public class RepoXML2BrokerModel {
	private boolean displayLog = true;

	private Broker broker;
//	private static RepoXML2BrokerModel instance;

	public  Broker getBroker() {
		return broker;
	}

	private static String BrokerUsername;
	private static String BrokerPassword;
	private Taxonomy generalTaxonomy;
	private XMLutils xmlutl;
	
	//some custom OfferedService
	private OfferedService xenvmdeploy;
	private OfferedService xenimagestore;
	private OfferedResource xenvmdeployResource;
	private OfferedResource xenimagestoreResource;
	
	
//	Un-comment the following lines to run it and test it
//	public static void main(String[] args) throws XPathExpressionException,
//			ParserConfigurationException, SAXException, IOException {
//		RepoXML2VCT process = new RepoXML2VCT("PanlabUsername", "PanlabPassword", "VCTname");
//		
//	}
	
	/**
	 * The constructor of the class {@link RepoXML2BrokerModel}. The repository url is hardcoded for now
	 * @param requsername
	 * @param reqpassword
	 * @param reqVCT
	 * @author ctranoris
	 */
	public RepoXML2BrokerModel(String requsername, String reqpassword) {
		super();
		BrokerUsername = requsername;
		BrokerPassword = reqpassword;
		xmlutl = new XMLutils(displayLog, new RepoClient( 
				PanlabServices.PanlabRepoGWCAlias , 
				BrokerUsername, BrokerPassword));

	}
	
	/**
	 * Initializes the Broker model
	 * @author ctranoris
	 */
	private void InitModel(){
		
		//create a temporary office
		broker = BrokermodelFactory.eINSTANCE.createBroker();	
		broker.setName("panlab");
		broker.setAPIGateway(PanlabServices.PanlabGWCAlias);
		
		//create a taxonomy
		generalTaxonomy = ServicesFactory.eINSTANCE.createTaxonomy(); 
		generalTaxonomy.setName("General");
		broker.getContributedTaxonomies().add(generalTaxonomy);
		generalTaxonomy.getTaxonomies().add(   ServicesFactory.eINSTANCE.createTaxonomy() );
		generalTaxonomy.getTaxonomies().get(0).setName("General Services");
		

		BrokerCustomer officeUser = UsersFactory.eINSTANCE.createBrokerCustomer()  ;	
		broker.getRegisteredUsers().add( officeUser );
		Account account = UsersFactory.eINSTANCE.createAccount() ;
		account.setUsername(BrokerUsername);
		account.setPassword(BrokerPassword);
		officeUser.setHasAccount(account );
	}
	


	private boolean organizationExists(String organName) {
		for (BrokerUser user : broker.getRegisteredUsers()) {
			if (( user.getName()!=null )&&(user.getName().equals(organName)))
					return true;
		}
		return false;
	}
	/**
	 * 
	 * makes the transformation
	 * @author ctranoris
	 */
	public void TranformModel() {
		InitModel();
		//check if the OfferedService(resourceType) is already in the Broker model
		
		//Just load all the docs here. Don't make them fields of the Class.. let the VM free the memory then
		Document organisationDocument = xmlutl.getXMLDocFromURL("/organisation");
		Document resourceSpecDocument = xmlutl.getXMLDocFromURL("/resourceSpec");
		Document configParamCompositeDocument = xmlutl.getXMLDocFromURL("/configParamComposite");
		Document configParamAtomicDocument = xmlutl.getXMLDocFromURL("/configParamAtomic");
		Document ptmDocument = xmlutl.getXMLDocFromURL("/ptm");
		Document ptmInfoDocument = xmlutl.getXMLDocFromURL("/ptmInfo");
		

		//get organisation Specs
		NodeList organisationSpecNodes = xmlutl.getNodeListFromObject(organisationDocument, "//organisation");
		for (int ixOrgan = 0; ixOrgan < organisationSpecNodes.getLength(); ixOrgan++) {
			String organName = xmlutl.getNodeValueFromObject( organisationSpecNodes.item(ixOrgan), "name/text()" );
			String organID = xmlutl.getNodeValueFromObject( organisationSpecNodes.item(ixOrgan), "@id" );
			if (organizationExists(organName)){
				organName = organName+"_"+organID;
			}
			ResourcesProvider resourcesProvider;
			Site partnerSite;
			//create the partner
			resourcesProvider = UsersFactory.eINSTANCE. createResourcesProvider()  ;	
			broker.getRegisteredUsers().add( resourcesProvider );	
			log("officePartner organID: "+organID);
			resourcesProvider.setId( Integer.parseInt(organID) );
			resourcesProvider.setUniqueID("rp"+Integer.parseInt(organID));
			organName = organName.trim();
			log("offeredService organName: "+organName);
			resourcesProvider.setName( organName ); //we set the name also later in the ptm Name, to have something shorter!
			resourcesProvider.setDescription( organName );
			resourcesProvider.setOrganization(organName);
			partnerSite = ProvidersiteFactory.eINSTANCE.createSite();
			partnerSite.setId(0);
			partnerSite.setUniqueID(resourcesProvider.getUniqueID()+"_s"+Integer.parseInt(organID));
			partnerSite.setName("site");
			resourcesProvider.getOfferedSiteList().add(partnerSite);
			partnerSite.setBelongsToProvider(resourcesProvider);
			
			//Add now the PTM for the site
			DomainManager ptm = ProvidersiteFactory.eINSTANCE.createDomainManager();
			partnerSite.setDomainManager( ptm ); 
			
			ptm.setBelongsToSite(partnerSite);
			NodeList ptmSpecNodes = xmlutl.getNodeListFromObject( ptmDocument, "//ptm[provider/@id="+organID+"]");
			
			//get resource Specs From the organization node now
			NodeList resourceOrganisationSpecNodes = xmlutl.getNodeListFromObject(organisationSpecNodes.item(ixOrgan), "hasResources/resourceSpec");
			
			//before adding all resources of organization..let's do this
			xenvmdeployResource = null;
			xenimagestoreResource = null;
			
			//for each resourceSpecNode node of organization
			for (int ixOrganSpecNode = 0; ixOrganSpecNode < resourceOrganisationSpecNodes.getLength(); ixOrganSpecNode++) {
				log("resourceSpecNode: "+resourceOrganisationSpecNodes.item(ixOrganSpecNode).getNodeName() + '=' + resourceOrganisationSpecNodes.item(ixOrganSpecNode).getNodeValue());
				
				String resourceSpecID = xmlutl.getNodeValueFromObject( resourceOrganisationSpecNodes.item(ixOrganSpecNode), "@id" );
				log("offeredService resourceSpecID: "+resourceSpecID);
				
				CreateOfferedService_Resource_Contract(partnerSite, resourceSpecID,
						resourceSpecDocument, configParamCompositeDocument, configParamAtomicDocument, true); //we can toggle this false if we will create OfferedResources only from ptmInfo				
																												//This results in duplicated Resource names (..but the Repo and VCT is faulty here since they use two places to add ResourceSpecs)
			}//for (int ixOrganSpecNode = 0; ix
			
			
			if ( ptmSpecNodes.getLength()>0 ){
				String ptmName = xmlutl.getNodeValueFromObject(ptmSpecNodes.item(0), "commonName/text()");
				log("ptm commonName: "+ptmName);
				ptm.setName(ptmName);
				
				resourcesProvider.setName( ptmName ); //just to have a shorter name here
				
				ptm.setIP(ptmName);
				partnerSite.setUniqueID(partnerSite.getUniqueID()+"_ptminfo"+ptmName);
				ptm.setDescription(xmlutl.getNodeValueFromObject(ptmSpecNodes.item(0), "description/text()") );
				String describedByPtmInfo = xmlutl.getNodeValueFromObject(ptmSpecNodes.item(0), "describedByPtmInfo/@id") ;
				NodeList ptmInfoResourceSpecNodes = xmlutl.getNodeListFromObject( ptmInfoDocument, "//ptmInfo[@id="+describedByPtmInfo+"]/resourceSpecs/resourceSpec");
				for (int i = 0; i <ptmInfoResourceSpecNodes.getLength(); i++) {
					String resourceSpecID = ptmInfoResourceSpecNodes.item(i).getAttributes().getNamedItem("id").getNodeValue();
					log("resourceSpecID from PTMinfo: "+ptmName);
					CreateOfferedService_Resource_Contract(partnerSite, resourceSpecID,
							resourceSpecDocument, configParamCompositeDocument, configParamAtomicDocument, true);	
					//10792 , xenimagestore
					//10807, xenvmdeploy
				}
			}
			
//			IGW igw  = ProvidersiteFactory.eINSTANCE.createIGW() ;
//			partnerSite.getIgwlist().add(igw  );
//			igw.setBelongsToSite(partnerSite);
//			igw.setIP("");
			
			SiteLocation location = ProvidersiteFactory.eINSTANCE.createSiteLocation() ;
			partnerSite.setLocatedAt(location );

			int prefix= partnerSite.getBelongsToProvider().getId() ;
			if (prefix == 12){//uop
				location.setGeocoords("38.288291,21.788884");
				//igw.setIP("10.0.0.1");
			}
			else if (prefix == 11){//isi
				location.setGeocoords("38.298512,21.825099");
				//igw.setIP("10.0.7.1");
			}
			else  if (prefix == 13){//cosmote
				location.setGeocoords("38.043941,23.80271");
				//igw.setIP("10.0.3.1");
			}
			else  if (prefix == 15){//tssg
				location.setGeocoords("53.496542,-6.231079");
				//igw.setIP("10.0.2.1");
			}
			else  if (prefix == 21){//synchromedia
				location.setGeocoords("45.502025,-73.575404");
				//igw.setIP("10.0.1.2");
			}
			
			
//			if (organID.equals("13")){ //cosmote
//				//before adding all resources of organization..let's do this
//				xenvmdeployResource = null;
//				xenimagestoreResource = null;
//				
//				CreateOfferedService_Resource_Contract(partnerSite, "10792",
//						resourceSpecDocument, configParamCompositeDocument, configParamAtomicDocument, true);	
//				CreateOfferedService_Resource_Contract(partnerSite, "10807",
//						resourceSpecDocument, configParamCompositeDocument, configParamAtomicDocument, true);	
//			
//			}
//			
//
//			if (organID.equals("15")){ //tssg
//				//before adding all resources of organization..let's do this
//				xenvmdeployResource = null;
//				xenimagestoreResource = null;
//				
//				CreateOfferedService_Resource_Contract(partnerSite, "10792",
//						resourceSpecDocument, configParamCompositeDocument, configParamAtomicDocument, true);	
//				CreateOfferedService_Resource_Contract(partnerSite, "10807",
//						resourceSpecDocument, configParamCompositeDocument, configParamAtomicDocument, true);	
//			
//			}
			
			
		}//for (int ixOrgan = 0	
		
		
		
		AddVCTsOfUserAndShared( BrokerUsername );
		
	}


	private void CreateOfferedService_Resource_Contract(Site partnerSite, String resourceSpecID,
			Document resourceSpecDocument, Document configParamCompositeDocument, Document configParamAtomicDocument, Boolean createResource) {

		NodeList resourceSpecNodes = xmlutl.getNodeListFromObject( resourceSpecDocument, "//resourceSpec [@id="+resourceSpecID+"]");								
		String offeredServiceName = xmlutl.getNodeValueFromObject(resourceSpecNodes.item(0), "commonName/text()");
		log("offeredService offeredServiceName: "+offeredServiceName);				
		String offeredServiceDescr = xmlutl.getNodeValueFromObject(resourceSpecNodes.item(0), "description/text()");
		//add back these for the service settings
		String configParamCompositeId = xmlutl.getNodeValueFromObject(resourceSpecNodes.item(0), "configurationParameters/@id");
		log("configParamCompositeId offServ="+offeredServiceName+", configParamCompositeId ="+configParamCompositeId);
		
		//before creating the service, check if exists
		Boolean newServiceCreated = false;
		
		OfferedService offService = FindOfferedServiceFromID(  resourceSpecID );
		if (offService==null)
			 offService = FindOfferedServiceFromName(offeredServiceName);
		
		if (offService==null){
			offService = ServicesFactory.eINSTANCE.createOfferedService();
			offService.setId( Integer.parseInt(resourceSpecID) );
			offService.setUniqueID("os"+Integer.parseInt(resourceSpecID));
			offService.setName(offeredServiceName);
			
			//offService.setDefaultValue();
			offService.setDescription(offeredServiceDescr);
			log("offeredService offeredServiceDescr: "+offeredServiceDescr);
			broker.getOfferedServices().add(offService);	
			newServiceCreated = true;
		}
		
		//IF <configParamType>reference</configParamType> can be assigned
		
		//add the service as offered Resource also of Partner...a Contract must be also created here!
		OfferedResource offeredResource = null;
		if (createResource){
			offeredResource = ResourcesFactory.eINSTANCE.createOfferedResource() ;
			partnerSite.getOfferedResourcesList().add(offeredResource);
			offeredResource.setBelongsToSite(partnerSite);
			offeredResource.setId( offService.getId() );
			offeredResource.setUniqueID(partnerSite.getUniqueID()+ "_or"+offService.getId());
//			String prefix="";
//			if ((partnerSite.getPtm() != null) && (partnerSite.getPtm().getName() != null))
//				prefix = partnerSite.getPtm().getName(); 
			offeredResource.setName(offeredServiceName+"_"+offeredResource.getUniqueID() );
			offeredResource.setDescription(offeredServiceDescr);
			offeredResource.setImplOfferedService(offService);	

			int prefix= partnerSite.getBelongsToProvider().getId() ;
			
			if (prefix == 12)//uop
				offeredResource.setMultitonMaxOccur(4);
			else if (prefix == 11)//isi
				offeredResource.setMultitonMaxOccur(1);
			else  if (prefix == 13)//cosmote
				offeredResource.setMultitonMaxOccur(1);
			else  if (prefix == 15)//tssg
				offeredResource.setMultitonMaxOccur(1);
			else  if (prefix == 21)//synchromedia
				offeredResource.setMultitonMaxOccur(4);
			else
				offeredResource.setMultitonMaxOccur(5);
			
			CreateResourceContract(offeredResource);
		}
		
		NodeList configParamAtomicNodes = xmlutl.getNodeListFromObject(configParamCompositeDocument , "//configParamComposite[@id="+configParamCompositeId+"]/configParams/configParamAtomic");
		
		for (int ixcPANodes = 0; ixcPANodes <configParamAtomicNodes.getLength(); ixcPANodes++) {
			String setId = configParamAtomicNodes.item(ixcPANodes).getAttributes().getNamedItem("id").getNodeValue();
			log("configParamAtomic id = "+ setId );
			//http://repos.pii.tssg.org:8080/repository/rest/configParamAtomic/586

			//NodeList ParamAtomicNode = xmlutl.getNodeListFromObject ( configParamAtomicDocument , "//configParamAtomic[@id="+setId+"]");
			String setName = xmlutl.getNodeValueFromObject( configParamAtomicDocument ,  "//configParamAtomic[@id="+setId+"]/commonName/text()");
			log("setName = "+ setName );			
			String setDescription = xmlutl.getNodeValueFromObject( configParamAtomicDocument ,  "//configParamAtomic[@id="+setId+"]/description/text()");
			log("setDescription = "+ setDescription );
			
			ServiceSetting servSetting = null;
			if (!newServiceCreated) {
				log("try to find  servSetting : "+ setName +" for service : "+offService );
				servSetting = FindServiceSettingOfOfferedService(offService, setName);
			}
			
			if (newServiceCreated || (servSetting==null) ) {
				servSetting = ServicesFactory.eINSTANCE.createServiceSetting();
				servSetting.setName(setName);
				servSetting.setDescription(setDescription);
				servSetting.setId(ixcPANodes + 1);
				servSetting.setUniqueID( offService.getUniqueID() +"_set_"+servSetting.getId() );
				servSetting.setCanBePublished(false);
				servSetting.setUserEditable(true);
				servSetting.setUserExposed(true);
				servSetting.setReadable(true);
				servSetting.setWritable(true);
				
				//The following constraint means that the parameter is available after the CREATE operation!
//				SettingConstraint setconstraint = ServicesFactory.eINSTANCE.createSettingConstraint();
//				setconstraint.setForOperation(ServiceResourceOperation.OP_CREATE);
//				setconstraint.setAvailableAfterOperation(true);
//				servSetting.getSettingConstraints().add(setconstraint);
				
				
				offService.getServiceSettings().add(servSetting);
				log("servSettings = OK!");
			}
			//service settings now to resource settings
			
			if (offeredResource != null){
				ResourceSetting resourceSetting = ResourcesFactory.eINSTANCE.createResourceSetting() ;
				resourceSetting.setName(setName);
				resourceSetting.setDescription(setDescription);
				resourceSetting.setId( servSetting.getId());
				resourceSetting.setUniqueID(offeredResource.getUniqueID()+"_set_"+servSetting.getId() );				
				resourceSetting.setCanBePublished( false );
				resourceSetting.setUserEditable(true);
				resourceSetting.setUserExposed(true);
				resourceSetting.setReadable(true);
				resourceSetting.setWritable(true);
				resourceSetting.setImplServiceSetting(servSetting);
				offeredResource.getResourceSettings().add(resourceSetting );
				log("ResourceSettings = OK!" );		
			}
			
		}//for (int ixcPANodes = 0
		
		
		//custom annotations to objects
		//if (newServiceCreated) {
			if (offeredServiceName.equals("xenvmdeploy")){
				AttachInfoForService_xenvmdeploy(offService);
				if (offeredResource != null)
					AttachInfoForResource_xenvmdeploy(offeredResource);
				
			}
			if (offeredServiceName.equals("xenimagestore")){
				AttachInfoForService_xenimagestore(offService);
				if (offeredResource != null)
					AttachInfoForResource_xenimagestore(offeredResource);
				
			}
		//}
		
		//Finally add service to the general ServiceCategories
		generalTaxonomy.getTaxonomies().get(0).getHasServices().add(offService);
		
	}

	private void CreateResourceContract(OfferedResource offeredResource) {
		
		//the contracts...to be used later on resource advisor
		
		//add a dummy  contract between one service and one exact resource (but multiton..we can instantiate a lot of them )
		Cost cost= AvailabilityContractFactory.eINSTANCE.createCost();

		Random generator = new Random();
		cost.setAmount( (double)generator.nextInt(10)/20  + (double)generator.nextInt(10)/20 );
		cost.setPerUnit( brokermodel.availabilityContract.costUnit.HOUR );
		
//		costUnit unit = AvailabilityContractFactory.eINSTANCE.;
//		cost.setPerUnit(unit );
		
		Availability availability = AvailabilityContractFactory.eINSTANCE.createAvailability() ;
		availability.setCost(cost);
		Calendar rightNow = Calendar.getInstance();
		Date fromdate = rightNow.getTime();
		availability.setFromDate(fromdate);
		rightNow.add(Calendar.MONTH, 36);
		Date todate = rightNow.getTime();
		availability.setToDate(todate);
		
		ResourceServiceContract contract = AvailabilityContractFactory.eINSTANCE.createResourceServiceContract();
		
		contract.setAvailability(availability );
		contract.setDescription("a contract between service "+offeredResource.getImplOfferedService().getName()+
				" and offered resource "+ offeredResource.getName()+
				", offered by site "+offeredResource.getBelongsToSite().getName()+
				" of provider "+ offeredResource.getBelongsToSite().getBelongsToProvider().getName() );
		contract.setForOfferedResource(offeredResource);
		contract.setForOfferedService(offeredResource.getImplOfferedService() );
		contract.setStartDate(fromdate);
		contract.setEndDate(todate);
		
		broker.getResourceServiceContracts().add(contract );

		contract.setId( broker.getResourceServiceContracts().size() );
		contract.setUniqueID("contr_"+ broker.getResourceServiceContracts().size() );
		contract.setName("C"+broker.getResourceServiceContracts().size()+
				"_"+offeredResource.getName()+
				"_"+offeredResource.getImplOfferedService().getName());
		
	}
	
	
	public Broker AddVCTsOfUserAndShared(String requsername){

		//create by default two taxonomies
		Taxonomy myVCTs = ServicesFactory.eINSTANCE.createTaxonomy(); 
		myVCTs.setName("my VCTs");
		broker.getContributedTaxonomies().add(myVCTs);
		Taxonomy publicVCTs = ServicesFactory.eINSTANCE.createTaxonomy(); 
		publicVCTs.setName("Public VCTs");
		broker.getContributedTaxonomies().add(publicVCTs);
		
			
		
		Document personDoc = xmlutl.getXMLDocFromURL("/person");
		Document vctDoc = xmlutl.getXMLDocFromURL("/vct");
		
		//will create a temporary office and just add some RequestedFedScenarios
		//create a temporary office

		NodeList personSpecNodes = xmlutl.getNodeListFromObject( personDoc, "//person[userName='" + requsername + "']");
		String personID = xmlutl.getNodeValueFromObject(personSpecNodes.item(0), "@id");
		
		TestbedDesigner eUser = brokermodel.users.UsersFactory.eINSTANCE.createTestbedDesigner()  ;
		eUser.setName(requsername);
		eUser.setId(Integer.parseInt(personID));	
		eUser.setUniqueID("user_"+Integer.parseInt(personID));
		broker.getRegisteredUsers().add(eUser );
		
		//get VCTs and add them as FSs
		NodeList vctSpecNodes = xmlutl.getNodeListFromObject( vctDoc, "//vct[user/@id=" + personID + " or shared/text()='false']");
		for (int i = 0; i < vctSpecNodes.getLength(); i++) {
			RequestedFederationScenario reqFS = brokermodel.federationscenarios.FederationscenariosFactory.eINSTANCE.createRequestedFederationScenario();

//			log( "vctSpecNodes.toString()  =" + vctSpecNodes.toString() );
//			log( "vctSpecNodes.item(i).toString()  =" + vctSpecNodes.item(i).toString() );
			String vctName = xmlutl.getNodeValueFromObject(vctSpecNodes.item(i), "commonName/text()");
			reqFS.setName( vctName );
			String vctPersonID = xmlutl.getNodeValueFromObject(vctSpecNodes.item(i), "user/@id");
			reqFS.setId( Integer.parseInt(  xmlutl.getNodeValueFromObject(vctSpecNodes.item(i), "@id") ) );
			reqFS.setUniqueID("vct_"+reqFS.getId());
			reqFS.setDescription(   xmlutl.getNodeValueFromObject(vctSpecNodes.item(i), "description/text()")  );

			String shared = xmlutl.getNodeValueFromObject(vctSpecNodes.item(i), "shared/text()");
			
			if ( (shared.equals( "false" ))  || shared.equals( "true" ) //for now we just show ALL the VCTs in repo!
					|| (personID.equals(vctPersonID))   ){ 
				broker.getAvailableFederationScenarios().add(reqFS);
				reqFS.setIsShared(true); 
				publicVCTs.getHasScenarios().add(reqFS); 
				if (personID.equals(vctPersonID)){
					eUser.getDesignsVirtualTestbeds().add(reqFS);
					myVCTs.getHasScenarios().add(reqFS);

					//For Panlab all VCT are considered running for now
//					RunningScenario rs = brokermodelFactory.eINSTANCE.createRunningScenario();
//					rs.setRequestedScenario(reqFS);
//					office.getRunningScenarios().add(rs);
					
				}
			}			
		
		}
		
		return broker;
	}
	
	
	
	/**Given a vctID will transformIt to FS object
	 * @param vctID
	 * @author ctranoris
	 */
	public void LoadFSbyVCT(RequestedFederationScenario fs){
		
		
		
		if (fs.getInfrastructureRequest() !=null){
			return;//it is already loaded
		}
		
		Document vctDoc = xmlutl.getXMLDocFromURL("/vct");
		Document vctResInstanceDoc = xmlutl.getXMLDocFromURL("/resourceInstance");
		Document configletDoc = xmlutl.getXMLDocFromURL("/configlet");
		
		NodeList resInstancesNodesOfVCT = xmlutl.getNodeListFromObject(
				vctDoc ,
				"//vct[@id="+ fs.getId() +"]/providesResources/resourceInstance/@id");
		//for each resourceInstance discover the resourceInstance and resourceType
		
		InfrastructureRequest infrReq = brokermodel.federationscenarios.FederationscenariosFactory.eINSTANCE.createInfrastructureRequest();
		fs.setInfrastructureRequest(infrReq );
		
		
		
		for (int i = 0; i < resInstancesNodesOfVCT.getLength(); i++) {
			log("resourceInstance: "+resInstancesNodesOfVCT.item(i).getNodeName() + '=' + resInstancesNodesOfVCT.item(i).getNodeValue());
			String ResourceInstanceid =  resInstancesNodesOfVCT.item(i).getNodeValue();
			NodeList resInstancesNodes = xmlutl.getNodeListFromObject(vctResInstanceDoc, 
					"//resourceInstance[@id="+ ResourceInstanceid +"]");
			
			ResourceRequest resourceReq = brokermodel.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceRequest();
			resourceReq.setId(Integer.parseInt(ResourceInstanceid));
			resourceReq.setUniqueID("resreq_"+resourceReq.getId());
			resourceReq.setName(  xmlutl.getNodeValueFromObject( resInstancesNodes.item(0), "commonName/text()").replaceAll("-", "_").replaceAll(" ", "_") );
			log("resourceReq name is : "+ resourceReq.getName() );
			String ptmQualName = ""; 
			if (resourceReq.getName().contains(".") ){
				String splits[]= resourceReq.getName().split( "\\." )  ;
				ptmQualName = splits[0]; 
				log("ptmQualName = "+ptmQualName);
				log("splits[1] = "+splits[1]);
				resourceReq.setName( splits[1] );
				//must find here the organizational site from the PTM name... VCT yikesss!
			}
			
			infrReq.getReqOfferedResources().add(resourceReq );
			
			String resSpecID = xmlutl.getNodeValueFromObject( resInstancesNodes.item(0), "resourceSpec/@id");
			log("resSpecID: "+ resSpecID );
			
			OfferedResource refOfferedResource; //Find offeredResource object from ID 
			refOfferedResource = FindOfferedResourceFromID( (Broker)fs.eContainer(), resSpecID, ptmQualName );
			resourceReq.setRefOfferedResource( refOfferedResource );
			if (refOfferedResource!=null)
				log("refOfferedResource found : "+ refOfferedResource.getName() );
						
			NodeList resconfigurationDataNodes = xmlutl.getNodeListFromObject(resInstancesNodes.item(0),  "configurationData/configlet");
			for (int j = 0; j < resconfigurationDataNodes.getLength(); j++) {
				String configletID = xmlutl.getNodeValueFromObject( resconfigurationDataNodes.item(j), "@id");
				log("	configletID: "+configletID  );
				
				NodeList configletNodes = xmlutl.getNodeListFromObject(configletDoc,  "//configlet[@id="+configletID+"]");
				ResourceSettingInstance resInst = brokermodel.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceSettingInstance() ;
				resInst.setName( xmlutl.getNodeValueFromObject( configletNodes.item(0), "commonName/text()") );
				resInst.setStaticValue( xmlutl.getNodeValueFromObject( configletNodes.item(0), "paramValue/text()") );
				resourceReq.getReqResourceSettings().add(resInst);
			}			
		}
	}
	
	/**
	 * 
	 * @param resSpecID
	 * @return the OfferedService having the given ID
	 * @author ctranoris
	 */
	private OfferedResource FindOfferedResourceFromID(Broker o, String resSpecID, String ptmQualName) {
		//we can search for the proper resource either by browsing each organization or from the contracts
		OfferedResource or = null;
		for (int i = 0; i < o.getResourceServiceContracts().size() ; i++) {
			
			if (o.getResourceServiceContracts().get(i).getForOfferedResource().getImplOfferedService().getId() == Integer.parseInt(resSpecID) ){
				or = o.getResourceServiceContracts().get(i).getForOfferedResource();				
				log( "FindOfferedResourceFromID return= "+ or.getName() );
				log( "FindOfferedResourceFromID ptm= "+ or.getBelongsToSite().getDomainManager().getName() );
			}
		}

		return or;
	}
	
	/**
	 * 
	 * @param resSpecID
	 * @return the OfferedService having the given ID
	 * @author ctranoris
	 */
	private OfferedService FindOfferedServiceFromID(String resSpecID) {
		//we can search for the proper service  by browsing 
		for (int i = 0; i < broker.getOfferedServices().size() ; i++) {
			if (broker.getOfferedServices().get(i).getId() == Integer.parseInt(resSpecID) ){
				return broker.getOfferedServices().get(i);	
			}
		}

		return null;
	}
	
	
	/**
	 * 
	 * @param resSpecID
	 * @return the OfferedService having the given ID
	 * @author ctranoris
	 */
	private OfferedService FindOfferedServiceFromName(String resName) {
		//we can search for the proper service  by browsing 
		for (int i = 0; i < broker.getOfferedServices().size() ; i++) {
			if (broker.getOfferedServices().get(i).getName().equalsIgnoreCase(resName) ){
				log("FindOfferedServiceFromName offServ="+resName+", exists!");				
				return broker.getOfferedServices().get(i);	
			}
		}

		return null;
	}
	
	private ServiceSetting FindServiceSettingOfOfferedService(OfferedService offService, String setName) {
		for (int i = 0; i < offService.getServiceSettings().size() ; i++) {
			if (offService.getServiceSettings().get(i).getName().equalsIgnoreCase(setName) ){
				return offService.getServiceSettings().get(i);	
			}
		}

		return null;
	}

	
	
	
	
		
	
	
	private void log(String txt){
		if (displayLog)
			System.out.println(  txt);
	}

	
	public static String MungPass(String pass) throws NoSuchAlgorithmException  {
		MessageDigest m = MessageDigest.getInstance("MD5");
		byte[] data = pass.getBytes(); 
		m.update(data,0,data.length);
		BigInteger i = new BigInteger(1,m.digest());
		return String.format("%1$032X", i);
	}
	
	public Boolean checkAuthentication() {

		
		//probably it will fail no
		Document personDoc = xmlutl.getXMLDocFromURL("/person");
		if (personDoc==null){
			return false;
		}
		
		NodeList personSpecNodes = xmlutl.getNodeListFromObject( personDoc, "//person[userName='" + BrokerUsername + "']");
		String personID = xmlutl.getNodeValueFromObject(personSpecNodes.item(0), "@id");
		String personPass = xmlutl.getNodeValueFromObject(personSpecNodes.item(0), "password/text()");
		
		BrokerUser eUser = brokermodel.users.UsersFactory.eINSTANCE.createBrokerCustomer() ;
		eUser.setName(BrokerUsername);
		eUser.setId(Integer.parseInt(personID));
		eUser.setUniqueID("user_"+Integer.parseInt(personID));
		Account account = brokermodel.users.UsersFactory.eINSTANCE.createAccount();
		account.setUsername(BrokerUsername);
		
		try {
			System.out.println("personPass = "+personPass);
			System.out.println("reqpasswordMD5 = "+MungPass (BrokerPassword));
			if (personPass.equalsIgnoreCase( MungPass (BrokerPassword)) )
				return true;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return false;
	}
	

	private void AttachInfoForService_xenvmdeploy(OfferedService offService) {
		this.xenvmdeploy = offService;
		
		if ((this.xenimagestore!= null) && (this.xenvmdeploy.getRequiresServices().size()==0) ){
			this.xenvmdeploy.getRequiresServices().add(xenimagestore);
			FixXenvmdeployImageURL();
		}
		this.xenvmdeploy.setDescription("A handy service deploying XEN VM images");
		for (ServiceSetting s : this.xenvmdeploy.getServiceSettings() ) {
			if (s.getName().equals("CAP")){
				s.setDescription("The cap optionally fixes the maximum amount of CPU a domain will be able to consume, even if the host system has idle CPU cycles. The               cap is expressed in percentage of one physical CPU: 100 is 1 physical CPU, 50 is half a CPU, 400 is 4 CPUs, etc. The default, 0, means there is no upper cap");
			}
		}
	}
	

	private void FixXenvmdeployImageURL() {
		if ((this.xenimagestore== null)||(this.xenvmdeploy== null))
			return;

		ServiceSetting imageURLsetting = null;
		for (ServiceSetting s : this.xenvmdeploy.getServiceSettings() ) {			
			if (s.getName().equals("URL")){
				imageURLsetting=s;
			}			
		}
		
		for (ServiceSetting s :  this.xenimagestore.getServiceSettings()) {
			if (s.getName().equals("OutputURL")){
				imageURLsetting.getRequiresParams().add(s);
			}
		}
		
		SettingConstraint constraint = ServicesFactory.eINSTANCE.createSettingConstraint() ;
		constraint.setRequiredBeforeOperation(true);
		constraint.setUniqueID("FixXenvmdeployImageURLConstraint");
		constraint.setName("Image Available before VM Create");
		constraint.setForOperation( ServiceResourceOperation.OP_CREATE );
		imageURLsetting.getSettingConstraints().add(constraint );
		
	}

	private void AttachInfoForService_xenimagestore(OfferedService offService) {		
		this.xenimagestore = offService;
		if ((this.xenvmdeploy!= null) && (this.xenvmdeploy.getRequiresServices().size()==0) ){
			this.xenvmdeploy.getRequiresServices().add(xenimagestore);
			FixXenvmdeployImageURL();
		}
		
		this.xenimagestore.setDescription(" service copying XEN VM images from remote locations to a provider's s");
		for (ServiceSetting s : this.xenimagestore.getServiceSettings() ) {
			if (s.getName().equals("InputURL")){
				s.setDescription("The input url to copy from");
			}
			if (s.getName().equals("OutputURL")){
				s.setDescription("holds the location of the stored image, to be used by testbed's resources");
				s.setWritable(false);
			}
			if (s.getName().equals("Name")){
				s.setWritable(true);
				s.setDescription("");
			}
			
		}
		
	}
	

	private void AttachInfoForResource_xenimagestore(
			OfferedResource offeredResource) {
		
		xenimagestoreResource =  offeredResource;
		
		if ( (xenvmdeployResource!=null) && (xenvmdeployResource.getRequiresResources().size()==0) ){
			xenvmdeployResource.getRequiresResources().add(xenimagestoreResource) ;
			FixResource_XenvmdeployImageURL();
		}
		
		
		for (ResourceSetting s : offeredResource.getResourceSettings() ) {
			if (s.getName().equals("OutputURL")){
				s.setDescription("holds the location of the stored image, to be used by testbed's resources");
				s.setWritable(false);
				SettingConstraint constraint = ServicesFactory.eINSTANCE.createSettingConstraint() ;
				constraint.setAvailableAfterOperation(true) ;
				constraint.setUniqueID(s.getUniqueID()+"_OutputURLConstraint");
				constraint.setName("Image Available before VM Create");
				constraint.setForOperation( ServiceResourceOperation.OP_CREATE );
				s.getSettingConstraints().add(constraint );
				
			}
		}
		
	}
	
	

	private void AttachInfoForResource_xenvmdeploy(OfferedResource offeredResource) {

		xenvmdeployResource =  offeredResource;
		
		if ( (xenimagestoreResource!=null) ){
			xenvmdeployResource.getRequiresResources().add(xenimagestoreResource) ;
			FixResource_XenvmdeployImageURL();
		}
		
		for (ResourceSetting s : offeredResource.getResourceSettings() ) {
			if (s.getName().equals("URL")){
				s.setDescription("holds the location of the stored image, to be used by testbed's resources");
				SettingConstraint constraint = ServicesFactory.eINSTANCE.createSettingConstraint() ;
				constraint.setRequiredBeforeOperation(true) ;
				constraint.setUniqueID(s.getUniqueID()+"_URLConstraint");
				constraint.setName("Image Available before VM Create");
				constraint.setForOperation( ServiceResourceOperation.OP_CREATE );
				s.getSettingConstraints().add(constraint );
				
			}
		}
		
	}
	
	private void FixResource_XenvmdeployImageURL() {
		if ((this.xenimagestoreResource== null)||(this.xenvmdeployResource== null))
			return;

		ResourceSetting imageURLsetting = null;
		for (ResourceSetting s : this.xenvmdeployResource.getResourceSettings() ) {			
			if (s.getName().equals("URL")){
				imageURLsetting=s;
			}			
		}
		
		for (ResourceSetting s :  this.xenimagestoreResource.getResourceSettings() ) {
			if (s.getName().equals("OutputURL")){
				imageURLsetting.getRequiresParams().add(s);
			}
		}
		
		SettingConstraint constraint = ServicesFactory.eINSTANCE.createSettingConstraint() ;
		constraint.setRequiredBeforeOperation(true);
		constraint.setUniqueID("FixResourceXenvmdeployImageURLConstraint");
		constraint.setName("Image Available before VM Create");
		constraint.setForOperation( ServiceResourceOperation.OP_CREATE );
		imageURLsetting.getSettingConstraints().add(constraint );
		
	}



}
