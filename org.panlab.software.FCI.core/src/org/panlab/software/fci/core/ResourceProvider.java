package org.panlab.software.fci.core;

import java.util.HashSet;
import java.util.Set;

import FederationOffice.providersite.Site;
import FederationOffice.users.ResourcesProvider;

public class ResourceProvider {
	
	private ResourcesProvider officeprovider;

	public ResourceProvider(ResourcesProvider officeprovider) {
		this.officeprovider = officeprovider;
	}
	
	public String getName(){
		return this.officeprovider.getName();
	}
	
	public ResourcesProvider getResourcesProvider(){
		return this.officeprovider;
	}
	
	public String getDescription(){
		return this.officeprovider.getDescription() ;
	}
	


	/**
	 * 
	 * @return the available URIs of the provider
	 */
	public Set<String> getURIs(){
		Set<String> uris = new HashSet<String>();
		for (Site site : this.officeprovider.getOfferedSiteList()) {
			uris.add(site.getPtm().getName());
		}

		return uris;
	}
	
	/**
	 * 
	 * @return the available URIs of the provider
	 */
	public String getFirstURI(){
		for (Site site : this.officeprovider.getOfferedSiteList()) {
			return site.getPtm().getIP();
		}

		return null;
	}

	public boolean hasSite(Site belongsToSite) {
		return  this.officeprovider.getOfferedSiteList().contains(belongsToSite);
		
	}

}
