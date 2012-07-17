package gr.upatras.ece.nam.fci.sfa;


import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import brokermodel.BrokermodelFactory;
import brokermodel.Broker;
import brokermodel.availabilityContract.Availability;
import brokermodel.availabilityContract.AvailabilityContractFactory;
import brokermodel.availabilityContract.Cost;
import brokermodel.availabilityContract.ResourceServiceContract;
import brokermodel.fcielements.AuthorizationKey;
import brokermodel.providersite.DomainManager;
import brokermodel.providersite.ProvidersiteFactory;
import brokermodel.providersite.Site;
import brokermodel.resources.OfferedResource;
import brokermodel.resources.ResourceSetting;
import brokermodel.resources.ResourceType;
import brokermodel.resources.ResourcesFactory;
import brokermodel.services.OfferedService;
import brokermodel.services.ServiceSetting;
import brokermodel.services.ServicesFactory;
import brokermodel.services.SettingType;
import brokermodel.services.Taxonomy;
import brokermodel.services.brTypeString;
import brokermodel.users.Account;
import brokermodel.users.BrokerCustomer;
import brokermodel.users.ResourcesProvider;
import brokermodel.users.UsersFactory;

public class SFAModel2OfficeModel {
	private boolean displayLog = true;

	private SFA_XMLRPCClient client;
	private Broker broker;
	private AuthorizationKey authorizationKey;
	private Taxonomy generalTaxonomy;

	private XMLutils xmlutl;
	
	
	public SFAModel2OfficeModel(AuthorizationKey authorizationKey) {
		this.authorizationKey=authorizationKey;
		client = new SFA_XMLRPCClient();
		client.Init_SFA_XMLRPCClient(authorizationKey);
		xmlutl = new XMLutils(displayLog);
	}

	
	
	public boolean checkAuthentication() {
		
		
		return (client.getSFACredential()!=null) && ( !client.getSFACredential().equals(""));
	}
	
	/**
	 * Initializes the Office model
	 * @author ctranoris
	 */
	private void InitModel(){
		
		//create a temporary office
		broker = BrokermodelFactory.eINSTANCE.createBroker();	
		broker.setName( this.authorizationKey.getCredentials().getCredoptions().get(SFAUtils.USERNAME  ) );
		broker.setAPIGateway( this.authorizationKey.getCredentials().getCredoptions().get(SFAUtils.SM_URL ) );
		
		//create a taxonomy
		generalTaxonomy = ServicesFactory.eINSTANCE.createTaxonomy(); 
		generalTaxonomy.setName("General");
		broker.getContributedTaxonomies().add(generalTaxonomy);
		generalTaxonomy.getTaxonomies().add(   ServicesFactory.eINSTANCE.createTaxonomy() );
		generalTaxonomy.getTaxonomies().get(0).setName("General Services");
		

		BrokerCustomer officeUser = UsersFactory.eINSTANCE.createBrokerCustomer()  ;	
		broker.getRegisteredUsers().add( officeUser );
		Account account = UsersFactory.eINSTANCE.createAccount() ;
		account.setAuthorizationKey(authorizationKey);
		officeUser.setHasAccount(account );
		
	}

	public void TranformModel() {
		InitModel();
		
		String rspec = client.ListResources();

		System.out.println(rspec);
		System.out.println("=======================================================================");
		if (rspec.equals(""))
			return;
		
		
		Document resourceSpecDocument = xmlutl.getXMLDocFromString( rspec );


		//NodeList aggregates = xmlutl.getNodeListFromObject(resourceSpecDocument, "//aggregate");
		
		
		NodeList networks = xmlutl.getNodeListFromObject(resourceSpecDocument, "//network");
		
		if (networks == null)
			return;
		
		for (int ixOrgan = 0; ixOrgan < networks.getLength(); ixOrgan++) {
			Node network = networks.item(ixOrgan);
			//String organName = xmlutl.getNodeValueFromObject( item, "name/text()" );
			//String organID = xmlutl.getNodeValueFromObject( organisationSpecNodes.item(ixOrgan), "@id" );
			String organName = xmlutl.getNodeValueFromObject( network, "@name" );
			String organID = organName; //will be the same
			System.out.println(organName );	
			
			ResourcesProvider resourcesProvider;
			Site partnerSite;
			//create the partner
			resourcesProvider = UsersFactory.eINSTANCE. createResourcesProvider()  ;	
			broker.getRegisteredUsers().add( resourcesProvider );	
			log("officePartner organID: "+organID);
			resourcesProvider.setId( ixOrgan );
			resourcesProvider.setUniqueID("rp"+organID);
			organName = organName.trim();
			log("resourcesProvider organName: "+organName);
			resourcesProvider.setName( organName ); //we set the name also later in the ptm Name, to have something shorter!
			resourcesProvider.setDescription( organName );
			resourcesProvider.setOrganization(organName);
			partnerSite = ProvidersiteFactory.eINSTANCE.createSite();
			partnerSite.setId(0);
			partnerSite.setUniqueID(resourcesProvider.getUniqueID()+"_s"+ organID );
			partnerSite.setName("site");
			resourcesProvider.getOfferedSiteList().add(partnerSite);
			partnerSite.setBelongsToProvider(resourcesProvider);
			
			//Add now the PTM for the site
			DomainManager ptm = ProvidersiteFactory.eINSTANCE.createDomainManager();
			partnerSite.setPtm( ptm ); 
			
			ptm.setBelongsToSite(partnerSite);
			NodeList resourceSpecNodes = xmlutl.getNodeListFromObject(resourceSpecDocument, "//network[@name=\""+organName+"\"]/node");
			
			//String organName = xmlutl.getNodeValueFromObject( item, "name/text()" );
			//String organID = xmlutl.getNodeValueFromObject( organisationSpecNodes.item(ixOrgan), "@id" );
			for (int ixNode = 0; ixNode < resourceSpecNodes.getLength(); ixNode++) {

				Node resNode = resourceSpecNodes.item(ixNode);
				//SFA mainly offers nodes?!
				CreateOfferedService_Resource_Contract("node", partnerSite, resNode,
					 true); //we can toggle this false if we will create OfferedResources only from ptmInfo				
								
				
			}
			
		}
		
		//slices should be also added as resources/offered services. 
		//And each node will have a setting called sliver that the user can
		//assign the slice name..
		//Slices can be added to a different taxonomy
		
	}
	
	private void CreateOfferedService_Resource_Contract(String serviceName, Site partnerSite, Node resNode,
			Boolean createResource) {
		

		String resourceName = xmlutl.getNodeValueFromObject( resNode, "@component_name" );
		log("resourceName : "+resourceName);
		String resourceSpecID = xmlutl.getNodeValueFromObject( resNode, "@component_id" );
		
		if (resourceName.equals("")){
			resourceName = xmlutl.getNodeValueFromObject( resNode, "hostname/text()" );			
			
		}
		
//		NodeList resourceSpecNodes = xmlutl.getNodeListFromObject( resourceSpecDocument, "//resourceSpec [@id="+resourceSpecID+"]");								
		String offeredServiceName = serviceName; 
		
		log("offeredService offeredServiceName: "+offeredServiceName);				
		String offeredServiceDescr = "sfa "+offeredServiceName;
//		//add back these for the service settings
//		String configParamCompositeId = xmlutl.getNodeValueFromObject(resourceSpecNodes.item(0), "configurationParameters/@id");
//		log("configParamCompositeId offServ="+offeredServiceName+", configParamCompositeId ="+configParamCompositeId);
//		
//		//before creating the service, check if exists
		Boolean newServiceCreated = false;
		
//		OfferedService offService = FindOfferedServiceFromID(  resourceSpecID );
//		if (offService==null)
		OfferedService 	 offService = FindOfferedServiceFromName(offeredServiceName);
		
		if (offService==null){
			offService = ServicesFactory.eINSTANCE.createOfferedService();
			offService.setId( 0 ); //not used in SFA?!
//			offService.setUniqueID("os"+Integer.parseInt(resourceSpecID));
			offService.setUniqueID("os"+offeredServiceName);
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
			offeredResource.setId( 0 ); //not used in SFA?!
			offeredResource.setUniqueID( resourceName );
//			String prefix="";
//			if ((partnerSite.getPtm() != null) && (partnerSite.getPtm().getName() != null))
//				prefix = partnerSite.getPtm().getName(); 
			offeredResource.setName(resourceName ); //in SFA seems node names are unique//Will replace . with _
			offeredResource.setDescription(offeredServiceDescr);
			offeredResource.setImplOfferedService(offService);	
			offeredResource.setMultitonMaxOccur(1);//we have atleast one of these resources to be reserved
			
			int prefix= partnerSite.getBelongsToProvider().getId() ;
			
			offeredResource.setGeocoords("-170, 50");
			
			CreateResourceContract(offeredResource);
		}

		CreateSetting("hostname", "defvalHostNameSet", "node hostname", newServiceCreated, offService, offeredResource, true, false, true);
		CreateSetting("vsys", "", "request access to a vsys script on the selected node", newServiceCreated, offService, offeredResource, true, true, true);
		CreateSetting("initscript", "", "initscript on the selected node", newServiceCreated, offService, offeredResource, true, true, true);
		CreateSetting("vsys_vnet", "", "initscript on the selected node", newServiceCreated, offService, offeredResource, true, true, true);
		
		//Finally add service to the general ServiceCategories
		generalTaxonomy.getTaxonomies().get(0).getHasServices().add(offService);
		
	}

	
	
	public void CreateSetting( String setttingName,String defaultValue,
			String settingDescription, boolean newServiceCreated,
			OfferedService offService, OfferedResource offeredResource,
			boolean readable, boolean writable, boolean isOptional) {

		// http://repos.pii.tssg.org:8080/repository/rest/configParamAtomic/586

		// NodeList ParamAtomicNode = xmlutl.getNodeListFromObject (
		// configParamAtomicDocument , "//configParamAtomic[@id="+setId+"]");
		log("setttingName = " + setttingName);
		log("setDescription = " + settingDescription);

		ServiceSetting servSetting = null;
		if (!newServiceCreated) {
			log("try to find  servSetting : " + setttingName
					+ " for service : " + offService);
			servSetting = FindServiceSettingOfOfferedService(offService,	setttingName);
		}

		if (newServiceCreated || (servSetting == null)) {
			servSetting = ServicesFactory.eINSTANCE.createServiceSetting();
			servSetting.setName(setttingName);
			servSetting.setDescription(settingDescription);
			servSetting.setId(offService.getServiceSettings().size()  + 1);
			servSetting.setUniqueID(offService.getUniqueID() + "_set_"	+ servSetting.getId());
			servSetting.setCanBePublished(false);
			servSetting.setUserEditable(writable);
			servSetting.setUserExposed(true);
			servSetting.setReadable( readable );
			servSetting.setWritable( writable );
			

			// The following constraint means that the parameter is available
			// after the CREATE operation!
			// SettingConstraint setconstraint =
			// ServicesFactory.eINSTANCE.createSettingConstraint();
			// setconstraint.setForOperation(ServiceResourceOperation.OP_CREATE);
			// setconstraint.setAvailableAfterOperation(true);
			// servSetting.getSettingConstraints().add(setconstraint);

			offService.getServiceSettings().add(servSetting);
			log("servSettings = OK!");
		}
		// service settings now to resource settings

		if (offeredResource != null) {
			ResourceSetting resourceSetting = ResourcesFactory.eINSTANCE
					.createResourceSetting();
			resourceSetting.setName(setttingName);
			
			brTypeString  sType = brokermodel.services.ServicesFactory.eINSTANCE.createbrTypeString();
			sType.setDefaultValue(defaultValue);
			resourceSetting.setSettingType(sType);
			
			resourceSetting.setDescription(settingDescription);
			resourceSetting.setId(servSetting.getId());
			resourceSetting.setUniqueID(offeredResource.getUniqueID() + "_set_"
					+ servSetting.getId());
			resourceSetting.setCanBePublished(false);
			resourceSetting.setUserEditable(writable);
			resourceSetting.setUserExposed(true);
			resourceSetting.setReadable(readable);
			resourceSetting.setWritable(writable);
			resourceSetting.setOptional(isOptional);
			resourceSetting.setImplServiceSetting(servSetting);
			offeredResource.getResourceSettings().add(resourceSetting);
			
			log("ResourceSettings = OK!");
		}

	}
	
	public Broker getBroker() {
		return this.broker;
	}
	
	
	private ServiceSetting FindServiceSettingOfOfferedService(OfferedService offService, String setName) {
		for (int i = 0; i < offService.getServiceSettings().size() ; i++) {
			if (offService.getServiceSettings().get(i).getName().equalsIgnoreCase(setName) ){
				return offService.getServiceSettings().get(i);	
			}
		}

		return null;
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
	
	

//	/**
//	 * 
//	 * @param resSpecID
//	 * @return the OfferedService having the given ID
//	 * @author ctranoris
//	 */
//	private OfferedService FindOfferedServiceFromID(String resSpecID) {
//		//we can search for the proper service  by browsing 
//		for (int i = 0; i < office.getOfferedServices().size() ; i++) {
//			if (office.getOfferedServices().get(i).getId() == Integer.parseInt(resSpecID) ){
//				return office.getOfferedServices().get(i);	
//			}
//		}
//
//		return null;
//	}
//	

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
	
	private void log(String txt){
		if (displayLog)
			System.out.println(  txt);
	}
	
	
}


















