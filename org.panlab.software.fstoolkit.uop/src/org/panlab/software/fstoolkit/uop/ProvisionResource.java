package org.panlab.software.fstoolkit.uop;

import java.lang.reflect.InvocationTargetException;

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
import org.panlab.software.fci.core.ResourceContext;
import org.panlab.software.fci.core.ResourceProxy;

import FederationOffice.extensionInterfaces.IProvisionResource;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;

public class ProvisionResource implements IProvisionResource {

	public ProvisionResource() {
		// TODO Auto-generated constructor stub
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
	public boolean supportsOffice(String officeName) {
		return Activator.getDefault().getOfficeName().equalsIgnoreCase(officeName);
	}

	@Override
	public String getSupportedOfficeName() {
		return Activator.getDefault().getOfficeName();
	}

	@Override
	public String provisionResource(String officeName, 
			RequestedFederationScenario scenario, ResourceRequest resourceReq) {
		
		System.out.println("officeName = "+officeName+", scenario=" +scenario.toString()
				+", resource=" +resourceReq.toString());

		System.out.println(", getRefOfferedResource=" +resourceReq.getRefOfferedResource().toString() );
		System.out.println(", getBelongsToSite=" +resourceReq.getRefOfferedResource().getBelongsToSite().toString() );
		System.out.println(", getBelongsToProvider=" +resourceReq.getRefOfferedResource().getBelongsToSite().getBelongsToProvider().toString() );
		System.out.println(", getPtm=" +resourceReq.getRefOfferedResource().getBelongsToSite().getPtm().getIP() );
		System.out.println(", getImplOfferedService=" +resourceReq.getRefOfferedResource().getImplOfferedService().toString() );
		System.out.println(", getImplOfferedService.eContainer=" +resourceReq.getRefOfferedResource().getImplOfferedService().eContainer().toString() );

		System.out.println(", OfficeProvider.getInstance()="+ Activator.getDefault().getResourceContext().toString() );
		System.out.println(", OfficeProvider.getInstance()="+ Activator.getDefault().getResourceContext().getOfficeModel().toString() );
		
		
		ResourceContext uop = Activator.getDefault().getResourceContext();
		ResourceProxy rproxy = uop.createResourceProxyByResourceRequest(scenario.getName() , resourceReq);
		
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

		ResourceContext uop = Activator.getDefault().getResourceContext();
		//ResourceProxy rproxy = panlab.  createResourceProxyByResourceRequest((scenario.getName() , resourceReq);
		ResourceProxy rproxy = uop.getResourceProxy( resourceReq.getRuntimeInfo().getGUID() );
		if (rproxy==null)
			rproxy = uop.createResourceProxyByResourceRequest(scenario.getName(), resourceReq);
		
		if (rproxy!=null)
			return rproxy.DeleteResource() ;

		return "failed";
	}

	@Override
	public String updateResource(String officeName,
			RequestedFederationScenario scenario, ResourceRequest resourceReq,
			ResourceSettingInstance assignedSetting) {
		
		System.out.println("officeName = "+officeName+
				", read resource w guid =" + resourceReq.getRuntimeInfo().getGUID() );

		ResourceContext uop = Activator.getDefault().getResourceContext();
		ResourceProxy rproxy = uop.getResourceProxy( resourceReq.getRuntimeInfo().getGUID() );
		if (rproxy==null)
			rproxy = uop.createResourceProxyByResourceRequest(scenario.getName(), resourceReq);
		
		
		
		if (rproxy!=null)
			return rproxy.updateParameterValueOfResource(assignedSetting.getRefResourceSetting().getName(), 
					assignedSetting.getStaticValue());
		
		return "failed";
	}

	
	@Override
	public String readResource(String officeName,
			RequestedFederationScenario scenario, ResourceRequest resourceReq,
			ResourceSettingInstance assignedSetting, boolean forceUpdate) {
		
		System.out.println("officeName = "+officeName+
				", read resource w guid =" + resourceReq.getRuntimeInfo().getGUID() );

		ResourceContext uop = Activator.getDefault().getResourceContext();
		ResourceProxy rproxy = uop.getResourceProxy( resourceReq.getRuntimeInfo().getGUID() );
		if (rproxy==null)
			rproxy = uop.createResourceProxyByResourceRequest(scenario.getName(), resourceReq);
		
		if (rproxy!=null)
			return rproxy.getParameterValueOfResource(assignedSetting.getRefResourceSetting().getName() , forceUpdate);
		
		return "failed";
	}

}
