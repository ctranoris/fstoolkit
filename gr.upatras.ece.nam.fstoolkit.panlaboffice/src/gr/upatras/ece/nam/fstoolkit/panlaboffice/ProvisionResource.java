package gr.upatras.ece.nam.fstoolkit.panlaboffice;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

import gr.upatras.ece.nam.fci.core.ParameterValuePair;
import gr.upatras.ece.nam.fci.core.ResourceContext;
import gr.upatras.ece.nam.fci.core.ResourceProxy;

import brokermodel.extensionInterfaces.IProvisionResource;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.federationscenarios.ResourceSettingInstance;

public class ProvisionResource implements IProvisionResource {

	public ProvisionResource() {
	}
	
	@Override
	public boolean supportsBroker(String officeName) {
		return Activator.getDefault().getBrokerName().equalsIgnoreCase(officeName);
	}
	
	@Override
	public String getSupportedBrokerName() {
		return Activator.getDefault().getBrokerName();
	}
	
	@Override
	public String provisionResource(String officeName, 
			RequestedFederationScenario scenario, ResourceRequest resourceReq) {
		
		System.out.println("officeName = "+officeName+", scenario=" +scenario.toString()
				+", resource=" +resourceReq.toString());

		System.out.println(", getRefOfferedResource=" +resourceReq.getRefOfferedResource().toString() );
		System.out.println(", getBelongsToSite=" +resourceReq.getRefOfferedResource().getBelongsToSite().toString() );
		System.out.println(", getBelongsToProvider=" +resourceReq.getRefOfferedResource().getBelongsToSite().getBelongsToProvider().toString() );
		System.out.println(", getPtm=" +resourceReq.getRefOfferedResource().getBelongsToSite().getDomainManager().getIP() );
		System.out.println(", getImplOfferedService=" +resourceReq.getRefOfferedResource().getImplOfferedService().toString() );
		System.out.println(", getImplOfferedService.eContainer=" +resourceReq.getRefOfferedResource().getImplOfferedService().eContainer().toString() );

		System.out.println(", PanlabBrokerProvider.getInstance()="+ Activator.getDefault().getResourceContext().toString() );
		System.out.println(", PanlabBrokerProvider.getInstance()="+ Activator.getDefault().getResourceContext().getBrokerModel().toString() );
		
		
		ResourceContext panlab = Activator.getDefault().getResourceContext();
		ResourceProxy rproxy = panlab.createResourceProxyByResourceRequest(scenario.getName() , resourceReq);
		
		if (rproxy!=null)
			return rproxy.getGUID();
		else
			return "";

		
	}
	
	@Override
	public String deleteResource(String officeName,
			RequestedFederationScenario scenario, ResourceRequest resourceReq) {
		System.out.println("DELETE RESOURCE: officeName = "+officeName+", scenario=" +scenario.toString()
				+", resource=" +resourceReq.toString());

		ResourceContext panlab = Activator.getDefault().getResourceContext();
		//ResourceProxy rproxy = panlab.  createResourceProxyByResourceRequest((scenario.getName() , resourceReq);
		ResourceProxy rproxy = panlab.getResourceProxy( resourceReq.getRuntimeInfo().getGUID() );
		if (rproxy==null)
			rproxy = panlab.createResourceProxyByResourceRequest(scenario.getName(), resourceReq);
		
		if (rproxy!=null)
			return rproxy.DeleteResource() ;

		return "failed";
	}

	@Override
	public String updateResource(String officeName,
			RequestedFederationScenario scenario, ResourceRequest resourceReq,
			EList<ResourceSettingInstance> assignedSetting) {
		
		System.out.println("officeName = "+officeName+
				", read resource w guid =" + resourceReq.getRuntimeInfo().getGUID() );

		ResourceContext panlab = Activator.getDefault().getResourceContext();
		ResourceProxy rproxy = panlab.getResourceProxy( resourceReq.getRuntimeInfo().getGUID() );
		if (rproxy==null)
			rproxy = panlab.createResourceProxyByResourceRequest(scenario.getName(), resourceReq);
		
		
		List<ParameterValuePair> params = new ArrayList<ParameterValuePair>();
		for (Iterator iterator = assignedSetting.iterator(); iterator.hasNext();) {
			ResourceSettingInstance resourceSettingInstance = (ResourceSettingInstance) iterator.next();
			ParameterValuePair p = new ParameterValuePair(
					resourceSettingInstance.getRefResourceSetting().getName() , 
					resourceSettingInstance.getStaticValue(), 
					resourceSettingInstance.getName() );
			params.add(p);			
		}
		
		if (rproxy!=null)
			return rproxy.UpdateResource(params);
//		if (rproxy!=null)
//			return rproxy.updateParameterValueOfResource(assignedSetting.getRefResourceSetting().getName(), 
//					assignedSetting.getStaticValue());
		
		return "failed";
	}

	
	@Override
	public String readResource(String officeName,
			RequestedFederationScenario scenario, ResourceRequest resourceReq,
			ResourceSettingInstance assignedSetting, boolean forceUpdate) {
		
		System.out.println("officeName = "+officeName+
				", read resource w guid =" + resourceReq.getRuntimeInfo().getGUID() );

		ResourceContext panlab = Activator.getDefault().getResourceContext();
		ResourceProxy rproxy = panlab.getResourceProxy( resourceReq.getRuntimeInfo().getGUID() );
		if (rproxy==null)
			rproxy = panlab.createResourceProxyByResourceRequest(scenario.getName(), resourceReq);
		
		if (rproxy!=null)
			return rproxy.getParameterValueOfResource(assignedSetting.getRefResourceSetting().getName() , forceUpdate);
		
		return "failed";
	}

//	
//	public String readResourceParam(String officeName, String guid, String paramName, boolean forceUpdate) {
//		System.out.println("officeName = "+officeName+", read resource w guid =" + guid);
//
//		ResourceContext panlab = Activator.getDefault().getPanlab();
//		ResourceProxy rproxy = panlab.getResourceProxy( guid );
//		if (rproxy!=null)
//			return rproxy.getParameterValueOfResource(paramName, forceUpdate);
//		else
//			return "";
//	}

	
	

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

	


	



}
