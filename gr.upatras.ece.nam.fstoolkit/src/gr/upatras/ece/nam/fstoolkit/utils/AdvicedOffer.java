package gr.upatras.ece.nam.fstoolkit.utils;

import brokermodel.availabilityContract.ResourceServiceContract;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.federationscenarios.ServiceRequest;
import brokermodel.resources.OfferedResource;

public class AdvicedOffer{
	protected ResourceServiceContract advicedRSContract;
	protected ServiceRequest serviceRequest;
	protected ResourceRequest resourceRequest;
	protected String forBroker;
	//protected int indexRequest;//keeps the index of the service eg: if we requested serviceA[1..3] then we will have resource[1], resource[2], resource[3]
	
	public void setForBroker(String forBroker) {
		this.forBroker = forBroker;
	}

	public ResourceServiceContract getAdvicedRSContract() {
		return advicedRSContract;
	}

	public void setAdvicedRSContract(ResourceServiceContract advicedRSContract) {
		this.advicedRSContract = advicedRSContract;
	}

	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceReq(ServiceRequest serviceReq) {
		this.serviceRequest = serviceReq;
	}
	
	public ResourceRequest getResourceRequest() {
		return resourceRequest;
	}

	public void setResourceRequest(ResourceRequest resourceReq) {
		this.resourceRequest = resourceReq;
	}
	
	

	protected int id;
	public int getId() {
		return id;
	}

	public void setId(int newId) {			
		id = newId;
	}
	
	public OfferedResource getOfferedResource(){
		return 
		advicedRSContract.getForOfferedResource();
	}

	

	public String getFullOfferedResourceIDRevert(){
		if (advicedRSContract.getForOfferedResource()==null)
			return advicedRSContract.getName()+" is EMPTY!";
		
		
		return advicedRSContract.getForOfferedResource().getName()
		+"."+
		advicedRSContract.getForOfferedResource().getBelongsToSite().getName()
		+"."+
		advicedRSContract.getForOfferedResource().getBelongsToSite().getBelongsToProvider().getName()
		+"."+
		forBroker;
	}


	public String getResourceProvider() {
		if (advicedRSContract.getForOfferedResource()==null)
			return advicedRSContract.getName()+" is EMPTY!";
		
		return forBroker+"."+
		advicedRSContract.getForOfferedResource().getBelongsToSite().getBelongsToProvider().getName()
		+"."+
		advicedRSContract.getForOfferedResource().getBelongsToSite().getName();
		
	}
	
//	public void setServiceReqIndex(int ixRequest) {
//		indexRequest = ixRequest;			
//	}
//	
//	public int getindexRequest(){
//		return this.indexRequest;
//	}

	
}
