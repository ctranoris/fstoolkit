package gr.upatras.ece.nam.fci.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import brokermodel.Broker;
import brokermodel.availabilityContract.ResourceServiceContract;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.providersite.Site;
import brokermodel.resources.OfferedResource;
import brokermodel.services.OfferedService;
import brokermodel.services.ServiceSetting;
import brokermodel.users.BrokerUser;
import brokermodel.users.ResourcesProvider;

public class ResourceContext {

	private Broker broker;
	private ArrayList<ResourceProxy> resourceProxies;
	

	public ResourceContext(Broker br) {
		// office = p.loadOffice(authKey.getUsername(), authKey.getPasskey());
		this.broker =br;
		this.resourceProxies = new ArrayList<ResourceProxy>();
	}
	

	public ArrayList<ResourceProxy> getResourceProxies() {
		return resourceProxies;
	}

	public Set<ServiceType> getAvailableServices() {
		
		Set<ServiceType> services = new HashSet<ServiceType>();
		
		for (OfferedService service : broker.getOfferedServices()) {
			ServiceType stype = new ServiceType(service);
			services.add(stype);
		}

		return services;
	}

	/**
	 * It will search all the available contracts to find all ResourceProvider offering the requested OfferedService
	 * @param serviceType The ServiceType object describing the requested service type (e.g echo, rubis_db)
	 * @return a set of ResourceProvider that offer that Service
	 */
	public Set<? extends ResourceProvider> getResourceProvidersForServiceType(
			ServiceType elem) {
		
		Set<ResourceProvider> providers = new HashSet<ResourceProvider>();
		for (ResourceServiceContract contr : broker.getResourceServiceContracts()) {
			if ( contr.getForOfferedService().getName().equals( elem.getName()  )  ){
				brokermodel.users.ResourcesProvider officeprovider = contr.getForOfferedResource().getBelongsToSite().getBelongsToProvider();
				ResourceProvider provider = new ResourceProvider(officeprovider);
				providers.add(provider);
			}
		}

		return providers;
	}
	
	/**
	 * It will search all the available contracts to find an offeredResource by the ResourceProvider implementing the requested OfferedService
	* @param offeredService The OfferedService object describing the requested service type (e.g rubis_db)
	 * @param provider The Resource Provider of this office that we request and can provide the resource
	 * @return an OfferedResource object or null if not found
	 */
	public OfferedResource getOfferedResourceByProvider(
			OfferedService offeredService, ResourceProvider provider) {
		
		for (ResourceServiceContract contr : broker.getResourceServiceContracts()) {
			if ( (contr.getForOfferedService().equals( offeredService  )) 
					&& ( provider.hasSite(contr.getForOfferedResource().getBelongsToSite()))  ){
				return 	contr.getForOfferedResource();			
			}
		}
		
		return null;
	}

	public void setBroker(Broker office) {
		this.broker = office;
	}
	
	public Broker getBrokerModel(){
		return this.broker;
	}

	public ServiceType getServiceType(String val) {

		for (OfferedService service : broker.getOfferedServices()) {
			if (val.equalsIgnoreCase(service.getName()))
			return new ServiceType(service);
		}
		return null;
	}

	public ResourceProvider getResourceProviderByResourceRequest(ResourceRequest resReq) {
		ResourcesProvider provider = resReq.getRefOfferedResource().getBelongsToSite().getBelongsToProvider() ;
		
		for (BrokerUser user : broker.getRegisteredUsers() ) {
			if ( user instanceof ResourcesProvider ){
				ResourcesProvider partner = (ResourcesProvider)user;
				if (provider.getName().equals(partner.getName()))
					return new ResourceProvider(partner) ;				
			}			
		}
		return null;
	}

	/**
	 * It will return a provider according to his alias 
	 * @param val The alias name
	 * @return the ResourceProvider that has that alias URI or null
	 */
	
	public ResourceProvider getResourceProviderByURI(String val) {
		
		for (BrokerUser user : broker.getRegisteredUsers() ) {
			if ( user instanceof ResourcesProvider ){
				ResourcesProvider partner = (ResourcesProvider)user;
				for (Site site : partner.getOfferedSiteList()) {
					if ( val.toLowerCase().equals(site.getDomainManager().getName()) || val.toLowerCase().equals(site.getName())  )
						return new ResourceProvider(partner) ;
				}
			}			
		}
		return null;
	}

	/**
	 * It will search all the available contracts to find all ResourceProvider offering the requested OfferedService and return the first one
	 * @param serviceType The ServiceType object describing the requested service type (e.g echo, rubis_db)
	 * @return the first available ResourceProvider that offer that Service
	 */
	public ResourceProvider getFirstResourceProviderOfService(
			ServiceType serviceType) {
		for (ResourceServiceContract contr : broker.getResourceServiceContracts()) {
			if ( contr.getForOfferedService().getName().equals( serviceType.getName()  )  ){
				brokermodel.users.ResourcesProvider officeprovider = contr.getForOfferedResource().getBelongsToSite().getBelongsToProvider();
				ResourceProvider provider = new ResourceProvider(officeprovider);
				return provider;				
			}
		}
		return null;
	}

	/**
	 * Creates a resource on a certain resource Provider of the Office of this context
	* @param scenario The name of scenario where the Resource is involved
	 * @param resourceName The alias name that the user wants of the resource (e.g myResource)
	 * @param provider The Resource Provider of this office that we request and can provide the resource
	 * @param ServiceType The ServiceType object describing the requested service type (e.g rubis_db)
	 * @param params a list with params to be created
	 */
	public ResourceProxy createResourceProxy(String scenario, String resourceName, ResourceProvider provider,
			ServiceType service, List<ParameterValuePair> params) {
		
		ResourceProxy rp = FCI.getInstance().CreateResource(scenario, resourceName, this, provider, service, params);
		resourceProxies.add(rp);
		return rp;
	}
	
	/**
	 * Creates a resource on a certain resource Provider of the Office of this context
	 * @param scenario The name of scenario where the Resource is involved
	 * @param resourceReq The resourceReq objects (e.g myResource)
	 * @return a new ResourceProxy object for accessing this resource
	 */
	public ResourceProxy createResourceProxyByResourceRequest( String scenario, ResourceRequest resourceReq ) {
		 
		ResourceProxy rp = FCI.getInstance().CreateResource(scenario, resourceReq, this);		
		resourceProxies.add(rp);
		return rp;
	}
	
	/**
	 * Returns a resourceProxy of a given Resource on a certain resource Provider of the Office of this context
	 * @param scenario The name of scenario where the Resource is involved
	 * @param resourceGUID The alias name that the user wants to retrieve resource proxy (e.g rubis_db-18)
	 * @param provider The Resource Provider of this office that we request and can provide the resource
	 * @param service The ServiceType object describing the requested service type (e.g rubis_db)
	 * @return a new ResourceProxy object for accessing this resource
	 */
	public ResourceProxy createResourceProxyFromResourceGUID(String scenario, String resourceGUID, ResourceProvider provider,
			ServiceType service) {
		
		ResourceProxy rp = FCI.getInstance().getResourceProxyFromResourceGUID(scenario, resourceGUID, this, provider, service);
		resourceProxies.add(rp);		
		return rp;
	}
	
	public ResourceProxy getResourceProxy(String resourceGUID){
		for (ResourceProxy rp : resourceProxies) {
			if (rp.getGUID()!=null)
				if (rp.getGUID().equals(resourceGUID))
					return rp;
		}
		
		return null;
	}

	public List<String> getAvailableParamsForServiceType(ServiceType serviceType) {
		List<String> params = new ArrayList<String>();
		
		for (ServiceSetting setting : serviceType.getOfferedService().getServiceSettings() ) {
			params.add(setting.getName());			
		}
		
		return params;
	}

	public void LoadFederationScenario(RequestedFederationScenario fedScenario) {
		FCI.getInstance().LoadFederationScenario(fedScenario, broker);
		
	}

	


}
