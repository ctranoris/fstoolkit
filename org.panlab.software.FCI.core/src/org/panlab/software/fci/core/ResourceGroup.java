package org.panlab.software.fci.core;

import java.util.ArrayList;
import java.util.List;

public class ResourceGroup {
	List<ResourceProxy> resources;
	private String groupName;
	
	public ResourceGroup(String groupName){
		this.resources = new ArrayList<ResourceProxy>();
		this.setGroupName(groupName);
	}
	
	public void addResourceProxy(ResourceProxy r){
		resources.add(r);
	}
	
	public void deleteResourceProxy(ResourceProxy r){
		resources.remove(r) ;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}
	
	/**
	 * propagates an update request with the given parameters to the resources of the group
	 * @param val: a list of ParameterValuePair objects
	 * 
	 */
	public void updateResources(List<ParameterValuePair> params){
		for (ResourceProxy r : resources) {
			System.out.println("updateResources: "+r.getGUID()+" = "+r.UpdateResource(params) );
		}
		
	}

	public void TearDownResources() {
		for (ResourceProxy r : resources) {
			System.out.println("TearDownResources: "+r.getGUID()+" = "+r.DeleteResource());
		}
		
	}

}
