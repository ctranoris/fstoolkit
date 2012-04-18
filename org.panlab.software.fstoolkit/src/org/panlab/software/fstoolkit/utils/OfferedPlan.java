package org.panlab.software.fstoolkit.utils;

import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

import FederationOffice.Office;
import FederationOffice.availabilityContract.ResourceServiceContract;
import FederationOffice.federationscenarios.InfrastructureRequest;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceGroup;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;
import FederationOffice.federationscenarios.ScheduledPlan;
import FederationOffice.federationscenarios.ServiceRequest;
import FederationOffice.federationscenarios.ServiceSettingInstance;
import FederationOffice.federationscenarios.SettingInstance;
import FederationOffice.providersite.Site;
import FederationOffice.resources.OfferedResource;
import FederationOffice.resources.Resource;
import FederationOffice.resources.ResourceSetting;
import FederationOffice.services.AbstractSetting;
import FederationOffice.services.Service;
import FederationOffice.users.ResourcesProvider;


public class OfferedPlan{
	private Vector<AdvicedOffer> advicedOffers;
	private RequestedFederationScenario proposedScenario = null ;
	private RequestedFederationScenario sourceFedScenario = null ;
	private int injectedVar = 1;
	
	
	public OfferedPlan(RequestedFederationScenario srcFedScenario) {
		super();
		this.advicedOffers = new Vector<AdvicedOffer>();
		this.sourceFedScenario = srcFedScenario;	
		this.createProposedScenario();
	}
	
	
	public Vector<AdvicedOffer> getAdvicedOffers() {
		return advicedOffers;
	}
	
	
	public boolean ContractOffered(ResourceServiceContract rs) {
		for (Iterator<AdvicedOffer> iterator = advicedOffers.iterator(); iterator.hasNext();) {
			AdvicedOffer aoff = (AdvicedOffer) iterator.next();
			if (aoff.getAdvicedRSContract().equals(rs))
				return true;
		}
		return false;
	}
	
	
	public void createProposedScenario() {
		this.proposedScenario = 
			FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createRequestedFederationScenario();
		this.proposedScenario.setName( sourceFedScenario.getName());
		
		InfrastructureRequest infReq = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createInfrastructureRequest();
		this.proposedScenario.setInfrastructureRequest(infReq );
		
		
		for (Iterator<FederationOffice.federationscenarios.Import> iterator =  sourceFedScenario.getImports().iterator(); iterator.hasNext();) {
			FederationOffice.federationscenarios.Import imp = (FederationOffice.federationscenarios.Import) iterator.next();
			FederationOffice.federationscenarios.Import importval = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createImport();
			importval.setImportURI( imp.getImportURI());
			this.proposedScenario.getImports().add(importval);
		}
		
		//now create a sched plan
		if ( sourceFedScenario.getScheduledPlan()!=null ){				
			ScheduledPlan splan = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createScheduledPlan() ;
			this.proposedScenario.setScheduledPlan(splan );
			splan.setValidFrom( sourceFedScenario.getScheduledPlan().getValidFrom() );
			splan.setValidUntil( sourceFedScenario.getScheduledPlan().getValidUntil() );
		}		
		
		for (Iterator< ServiceRequest > iterator =  sourceFedScenario.getServicesRequest().getServiceRequestList().iterator(); iterator.hasNext();) {
			ServiceRequest servReq = (ServiceRequest) iterator.next();
			if (servReq instanceof ServiceRequest) {
				ServiceRequest serviceRequest = (ServiceRequest) servReq;
				
				
				if (servReq.getNumOfServices()>0 ){

					ResourceGroup  resGroup = 
						FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceGroup() ;
					resGroup.setName(serviceRequest.getName());
					infReq.getResourceGroups().add(resGroup );
				
					
					for(int i=0; i<servReq.getNumOfServices(); i++){
						ResourceRequest reqResource = addResourceForService(serviceRequest, serviceRequest.getName()+"ixix"+ (i+1));
						if (reqResource!=null)
							resGroup.getGroupedResources().add(reqResource );		
					}
				}else{
					addResourceForService(serviceRequest, serviceRequest.getName());
				}
			}
		}
		
		
		restoreSettingsAndAssignedLinksToResources();
		while (MoreRequiredResources() );
		
	}
	
	
	private ResourceRequest  addResourceForService(ServiceRequest serviceReq, String proposedResourceName) {

		Office tempoffice = (FederationOffice.Office) serviceReq.getRefService().eContainer();
		Service refService = serviceReq.getRefService();
		if (refService==null){
			System.out.println("addResourceForService refService=NULL !!!!!!!!!!!!!!!");
			return null;
		}
		if (tempoffice==null){
			System.out.println("addResourceForService tempoffice=NULL !!!!!!!!!!!!!!!");
			return null;
		}
		
		Vector<ResourceServiceContract> candidateContracts = new Vector<ResourceServiceContract>();
		
		for (int j = 0; j < tempoffice.getResourceServiceContracts().size(); j++) {
			ResourceServiceContract rs = tempoffice.getResourceServiceContracts().get(j);
			if (rs.getForOfferedService().equals(refService) && offeredByRuleIsTrue(rs, serviceReq)){
				System.out.println("Possible Contract found=" + rs.getName()   );
				if ( (!this.ContractOffered(rs)) || ( (rs.getForOfferedResource()!=null) && (rs.getForOfferedResource().getMultitonMaxOccur()>0)) ){
					System.out.println("Contract advised=" + rs.getName()   );
					if (rs.getForOfferedResource().getMultitonMaxOccur()>0 ){ //add it so many times
						for (int i=0; i<rs.getForOfferedResource().getMultitonMaxOccur();i++)
							candidateContracts.add(rs);//							
					}else
						candidateContracts.add(rs);
				}
			}
		}
				

		System.out.println("AddOfferedResourceForService refService=" + 
							refService.getName() +"("+serviceReq.getName() +")"+
							"for office"+tempoffice.getName() +
							" candidateContracts: "+ candidateContracts.size());
		Random generator = new Random();
		
		if (candidateContracts.size()>0){
			int ix ;
			int safeguard = 0;
			int countContracts =0 ;
			int maximumResourcesToOffer =0;
			
			do{
				ix = generator.nextInt( candidateContracts.size() )  ; //for now just get a random one.
				
					countContracts = CountProposedContract( candidateContracts.get(ix)) ;
					maximumResourcesToOffer = candidateContracts.get(ix).getForOfferedResource().getMultitonMaxOccur()  ;
				
				safeguard++;
			}while ( (countContracts >= maximumResourcesToOffer) && (safeguard<10000) && (maximumResourcesToOffer!=-1) );
			
//			while ( (countContracts > maximumResourcesToOffer) && (safeguard<1000) ){
//				ix = generator.nextInt( candidateContracts.size() );
//				countContracts = CountProposedContract( candidateContracts.get(ix)) ;
//				maximumResourcesToOffer = candidateContracts.get(ix).getForOfferedResource().getMultitonMaxOccur();
//				safeguard++;
//			}
			
			if ( (countContracts< maximumResourcesToOffer) || (maximumResourcesToOffer==-1) ){
				AdvicedOffer offer = AddOfferForContract(tempoffice, serviceReq, candidateContracts.get(ix),proposedResourceName );
				return offer.getResourceRequest();
			}
		}
		
		return null;
	}
	

	private int CountProposedContract(ResourceServiceContract resourceServiceContract) {
		int offerscnt = 0;
		for (ResourceRequest resReq : this.proposedScenario.getInfrastructureRequest().getReqOfferedResources()) {
			if (resReq.getRefOfferedResource().getUniqueID().equals( resourceServiceContract.getForOfferedResource().getUniqueID() ) ){
				offerscnt ++;
			}
		}
		return offerscnt;
	}


	private boolean offeredByRuleIsTrue(ResourceServiceContract rs, ServiceRequest serviceReq) {
		if (serviceReq.getOfferedByProviders()==null )
			return true; //if the offeredby Rule is null, return true
				
		ResourcesProvider requestedProvider = serviceReq.getOfferedByProviders();
		if (rs.getForOfferedResource().eContainer().eContainer() instanceof ResourcesProvider ){
			ResourcesProvider contractProvider = (ResourcesProvider)rs.getForOfferedResource().eContainer().eContainer();		
			return requestedProvider.equals(contractProvider);
		}
		
		return false;
	}


	private AdvicedOffer AddOfferForContract( Office tempoffice,
			ServiceRequest serviceReq, ResourceServiceContract resourceServiceContract, String resourceReqProposedName) {

		AdvicedOffer arg0 = new AdvicedOffer() ;			
		this.getAdvicedOffers().add(arg0);  //pros8ese ena offer gia auto to plan
		arg0.setId(20000 +  this.getAdvicedOffers().size() );
		arg0.setAdvicedRSContract( resourceServiceContract );
		arg0.setServiceReq(serviceReq);
		arg0.setForOffice(tempoffice.getName());
		System.out.println("Advice add=" + arg0.getId() +" for office "+tempoffice.getName() );
		//create a resourceRequest
		ResourceRequest reqResource = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceRequest();
		reqResource.setRefOfferedResource( arg0.getOfferedResource() );
		reqResource.setName( resourceReqProposedName );
		arg0.setResourceRequest(reqResource);
//		if (serviceReq!=null)
//			AddAssignmentLinks(serviceReq);	
		this.proposedScenario.getInfrastructureRequest().getReqOfferedResources().add(reqResource);
		return arg0;		
	}


//	private void AddAssignmentLinks(ServiceRequest sr) {
//		for (int i = 0; i < sr.getReqServiceSettings().size(); i++) {
//			ServiceSettingInstance setting = sr.getReqServiceSettings().get(i);
//			for (SettingInstance settingInstance : setting.getAssignSetting() ) {
//				AssignmentLink link = new AssignmentLink(setting ,settingInstance);
//				assignmentLinks.add(link);
//			}			
//		}		
//	}

	private void restoreSettingsAndAssignedLinksToResources() {
		for (AdvicedOffer offer : this.advicedOffers) {
			addSettingsToResourceRequest(offer.getResourceRequest(), offer.getServiceRequest());
					
		}
	}
	
	public void addSettingsToResourceRequest(ResourceRequest resourceRequest, ServiceRequest serviceRequest){
		OfferedResource offeredResource = resourceRequest.getRefOfferedResource() ;
		for (int j = 0; j < offeredResource.getResourceSettings().size() ; j++) {
			ResourceSetting rs = offeredResource.getResourceSettings().get(j);
			
			//create a resourceSetting instance
			ResourceSettingInstance resSetInst = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceSettingInstance() ;
			resSetInst.setName( rs.getName().toLowerCase().replace(' ', '_') );
			//resSetInst.setName( advoffer.getServiceAlias() );
			resSetInst.setRefResourceSetting(rs);
			resourceRequest.getReqResourceSettings().add( resSetInst );
			
			if (serviceRequest!=null)
				restoreSettingValuesFromService(  resSetInst, serviceRequest );
		}	
	}
	
	public void restoreSettingValuesFromService(
			ResourceSettingInstance resSetInst, ServiceRequest serviceReq) {
		// = \"value\"  or assign "refSetting"
		ServiceRequest sr = null;

		for (int i = 0; i < sourceFedScenario.getServicesRequest().getServiceRequestList().size(); i++) {
			// Service refServ =sourceFedScenario.getServicesRequest().getServiceRequestList().get(i).getRefService();
			ServiceRequest servReq = sourceFedScenario.getServicesRequest().getServiceRequestList().get(i);// if (refServ.getName().equals(service.getName()) ){
			if (serviceReq.getName().equals(servReq.getName())) {
				sr = sourceFedScenario.getServicesRequest().getServiceRequestList().get(i);
			}
		}

		if (sr != null) {
			for (int i = 0; i < sr.getReqServiceSettings().size(); i++) {
				ServiceSettingInstance setting = sr.getReqServiceSettings().get(i);
				
				if ( (resSetInst.getRefResourceSetting().getImplServiceSetting()!=null)
						&&(setting.getRefServiceSetting().getName().equals(resSetInst.getRefResourceSetting().getImplServiceSetting().getName())) ) {
					if (sr.getReqServiceSettings().get(i).getAssignSetting().size() > 0) {
						for (int ixAssignedSettings = 0; ixAssignedSettings < sr.getReqServiceSettings().get(i).getAssignSetting().size(); ixAssignedSettings++) {
							ServiceSettingInstance assignedSetting = (ServiceSettingInstance)sr.getReqServiceSettings().get(i).getAssignSetting().get(ixAssignedSettings);
							
							ResourceSettingInstance toBeAssigned = findResourceSettingByEquivalentServiceReq( assignedSetting );
							
							if (resSetInst.getRefResourceSetting().getRequiresParams().size()>0){
								for (AbstractSetting s : resSetInst.getRefResourceSetting().getRequiresParams()) {
									ResourceSetting requiredResourceSetting = (ResourceSetting)s;									
									if (toBeAssigned!=null)
										if (toBeAssigned.getRefResourceSetting().equals(requiredResourceSetting)){
											resSetInst.getAssignSetting().add(toBeAssigned);
										}
								}
							}else{							
								if (toBeAssigned!=null)
									resSetInst.getAssignSetting().add(toBeAssigned);								
							}							
						}

					} else if (sr.getReqServiceSettings().get(i).getStaticValue() != null){
						resSetInst.setStaticValue(sr.getReqServiceSettings().get(i).getStaticValue());
						//do a hack here with the name
						if (resSetInst.getRefResourceSetting().getName().equalsIgnoreCase("NAME")){
							resSetInst.setStaticValue( ((ResourceRequest)resSetInst.eContainer()).getName() );
						}else if (resSetInst.getRefResourceSetting().getName().equalsIgnoreCase("GW")){
							Site s = (Site)resSetInst.getRefResourceSetting().eContainer().eContainer();
							if (s.getIgwlist().size()>0)
								resSetInst.setStaticValue( s.getIgwlist().get(0).getIP() );
						}
						else if (resSetInst.getRefResourceSetting().getName().equalsIgnoreCase("IP")){
							String reqname = ((ResourceRequest)resSetInst.eContainer()).getName();
							if (reqname.contains("ixix") ){
								Site s = (Site)resSetInst.getRefResourceSetting().eContainer().eContainer();
								String igw="";
								if (s.getIgwlist().size()>0)
									igw = s.getIgwlist().get(0).getIP() ;
								
								String oldIP = sr.getReqServiceSettings().get(i).getStaticValue();//xx.xx.xx.xx
								String splitOldIP[]= oldIP.split( "\\." )  ;
								int lastnum = Integer.parseInt(splitOldIP[3]);
								if (!"".equals(igw))
									splitOldIP = igw.split( "\\." )  ;
								String splitName[]= reqname.split( "ixix" )  ;
								int toadd = Integer.parseInt(splitName[1]);
								toadd = lastnum+toadd -1;
								String newIP = splitOldIP[0]+"."+splitOldIP[1]+"."+splitOldIP[2]+"."+toadd;
								
								resSetInst.setStaticValue( newIP );
							}
						}
						
					}
				}
			}
		}

	}



	private boolean MoreRequiredResources() {
		//first check for each setting of resource, if it needs special treatment
		for (AdvicedOffer offer : this.getAdvicedOffers()) {
			ResourceRequest resourceReqInvestigated = offer.getResourceRequest();
			for (ResourceSettingInstance settingToInvestigate : resourceReqInvestigated.getReqResourceSettings()) {
				ResourceSetting setting = settingToInvestigate.getRefResourceSetting();
				for (AbstractSetting s : setting.getRequiresParams()) {
					ResourceSetting requiredResourceSetting = (ResourceSetting)s;
					//A setting RS of a resource resourceReqInvestigated needs another setting from another 
					//resource which doesn't exist in scenario
					//1) Add new resource resourceRequired that is missing
					//3) Find the corresponding service setting of setting RS
					//4) Find the serviceReq that is assigned
					//5) IF the serviceReq.refOfferedService and the NEWR have the same Service
					//6) then assign the settings (maybe see getSettingValueFromService()

					Resource resourceRequired = (Resource)requiredResourceSetting.eContainer();
					//site.partner.office
					Office tempoffice = (Office)(resourceRequired.eContainer().eContainer().eContainer());
					//2) Find the service that resourceReqInvestigated implements
					offer.getServiceRequest().getRefService() ;
					//find a contract that the resourceRequired Implements
					ResourceServiceContract c = findContractForResource(tempoffice, resourceRequired);
					//check and try to return the inital requested ServiceRequest 
					ServiceRequest sr =tryToFindExistingServiceRequest( tempoffice, offer,
							resourceReqInvestigated, settingToInvestigate,
							resourceRequired, requiredResourceSetting, c.getForOfferedService()) ;
					//Find if the required resource exists in the plan
					ResourceRequest resourceRequest =  CheckIfResourceRequestExistsInPlan(resourceRequired, sr);
					if (resourceRequest==null){	//the resource doesn't exist and must be injected
						AdvicedOffer myoffer;
						if (sr!=null) //we had an initial service request for such resource
							myoffer = AddOfferForContract(tempoffice, sr, c, sr.getName()+"_injected_" +injectedVar);
						else//we need this resource to be present, no matter what
							myoffer = AddOfferForContract(tempoffice, sr, c, "injected_" +injectedVar);
						injectedVar++;
						addSettingsToResourceRequest( myoffer.getResourceRequest(), myoffer.getServiceRequest() );
						fixSettingAssignmentsWithNewResourceRequest(settingToInvestigate, requiredResourceSetting, offer, myoffer);
						//if the resourcesettingIstance is assigned to another resource, then it is wrong
						//It should be assigned to a setting of the new, injected resource.
						
						return true; //return from here						
					}else{ //seems that resource exists in plan, so we must fix only the assignments here
						for (ResourceSettingInstance resourcesetting : resourceRequest.getReqResourceSettings() ) {
							if (resourcesetting.getRefResourceSetting().equals(requiredResourceSetting ))
								settingToInvestigate.getAssignSetting().add(resourcesetting);
						}
					}
				}
			}
		}
		
		//check now for resource itself if it needs another resource to be in scenario
		for (AdvicedOffer offer : this.getAdvicedOffers()) {
			for (Resource resource : offer.getOfferedResource().getRequiresResources()) {
				//check if resource is already in plan
				if (CheckIfResourceRequestExistsInPlan(resource, null)==null){
					Office tempoffice = (Office)(resource.eContainer().eContainer().eContainer());
					
					ResourceServiceContract c = findContractForResource(tempoffice, resource);
					AdvicedOffer myoffer = AddOfferForContract(tempoffice, null, c, "injected_"+injectedVar);
					injectedVar++;
					addSettingsToResourceRequest( myoffer.getResourceRequest(), myoffer.getServiceRequest() );

					return true; //return from here
				}
			}
		}
		return false;
	}

	private ServiceRequest tryToFindExistingServiceRequest(Office tempoffice,
			AdvicedOffer offer, ResourceRequest resourceReqInvestigated,
			ResourceSettingInstance settingToInvestigate,
			Resource resourceRequired, ResourceSetting requiredResourceSetting,
			Service offeredServiceOfResourceRequired) {

			ServiceRequest sourceServiceReq = offer.getServiceRequest();
			for (ServiceSettingInstance s : sourceServiceReq.getReqServiceSettings()) {
				if (s.getRefServiceSetting().equals(settingToInvestigate.getRefResourceSetting().getImplServiceSetting())){
					for (SettingInstance assignedSetting : s.getAssignSetting()) {
						ServiceRequest targetServiceRequest = (ServiceRequest)assignedSetting.eContainer();
						if (targetServiceRequest.getRefService().equals(offeredServiceOfResourceRequired))
							return targetServiceRequest;
					}
					
				}
			}
		
		return null;
	}


	private void fixSettingAssignmentsWithNewResourceRequest(
			ResourceSettingInstance settingToInvestigate, ResourceSetting requiredResourceSetting, 
			AdvicedOffer offer, AdvicedOffer newOffer) {
		//initial serviceReq of offer
		for (ResourceSettingInstance s : newOffer.getResourceRequest().getReqResourceSettings()) {
			if (s.getRefResourceSetting().equals(requiredResourceSetting)){
				settingToInvestigate.getAssignSetting().add(s);
			}
		}
		
	}


	public ResourceServiceContract findContractForResource(Office tempoffice, Resource resource){
		
		for (int j = 0; j < tempoffice.getResourceServiceContracts().size(); j++) {
			ResourceServiceContract rs = tempoffice.getResourceServiceContracts().get(j);
			if (rs.getForOfferedResource().equals(resource)){
				return rs;
			}
		}
		
		return null;
	}
	
	

	

	private ResourceRequest CheckIfResourceRequestExistsInPlan(Resource resource, ServiceRequest sr) {
		for (AdvicedOffer offer : this.getAdvicedOffers()) {
			if ( (offer.getOfferedResource().equals(resource)) && 
					((sr==null) || (offer.getServiceRequest().equals(sr) )) )
				return offer.getResourceRequest(); 
		}
		return null;
	}
	
	
	private ResourceSettingInstance findResourceSettingByEquivalentServiceReq(
			ServiceSettingInstance assignedSetting) {
		ServiceRequest serviceReq = ((ServiceRequest) assignedSetting.eContainer());
		AdvicedOffer offer = findOfferForServiceRequest(serviceReq);
		if (offer!=null){
			ResourceRequest resourceRequest = offer.getResourceRequest();
			for (ResourceSettingInstance setting : resourceRequest.getReqResourceSettings()) {
				if (setting.getRefResourceSetting().getImplServiceSetting().getName().equals(assignedSetting.getRefServiceSetting().getName())){
					return setting;
				}
			}
		}
		
		return null;
		
	}


	private AdvicedOffer findOfferForServiceRequest(ServiceRequest serviceReq) {
		for (AdvicedOffer offer : this.advicedOffers) {
			if (offer.getServiceRequest().equals(serviceReq))
				return offer;
		}
		return null;
	}


	public RequestedFederationScenario getProposedScenario() {
		return proposedScenario;
	}
	
	
	
}
