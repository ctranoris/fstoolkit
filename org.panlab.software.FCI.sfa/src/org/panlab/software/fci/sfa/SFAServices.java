package org.panlab.software.fci.sfa;

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

import FederationOffice.Office;
import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.fcielements.IFCIService;
import FederationOffice.federationscenarios.ResourceRequest;

public class SFAServices implements IFCIService {


	private Office SFAOffice;
	private static SFAServices instance;
	private AuthorizationKey authorizationKey;
	
	public static SFAServices getInstance() {
		if (instance == null)
			instance = new SFAServices();
		// TODO Auto-generated method stub
		return instance;
	}
	
	
	@Override
	public Office getOffice(AuthorizationKey authorizationKey,
			boolean forceRefresh) {
		this.authorizationKey = authorizationKey;
		
		if ( (SFAOffice!=null) && (!forceRefresh) )
			return SFAOffice;				
		
		
		
		SFAOffice = new SFAOfficeProxy(authorizationKey,  forceRefresh);
		

		return SFAOffice;
	}

	
	
	
	@Override
	public Office getOffice(String username, String password,
			boolean forceRefresh) {
		
		if ( (SFAOffice!=null) && (!forceRefresh) )
			return SFAOffice;	
		//this normally should not happen.
		return null;
	}
	

	@Override
	public Office getOffice() {
		if ( (SFAOffice!=null)  )
			return SFAOffice;	
		return null;
	}

	@Override
	public String CreateResource(String scenario, String providerAlias,
			String resourceTypeName, ResourceRequest resourceReq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateResource(String scenario, String providerAlias,
			String resourceTypeName, String runtimeID,
			ResourceRequest resourceReq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteResource(String scenario, String providerAlias,
			String resourceTypeName, String runtimeID,
			ResourceRequest resourceReq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParameterValueOfResource(String scenario,
			String providerAlias, String runtimeID, String paramName) {
		// TODO Auto-generated method stub
		return null;
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
	public void setOffice(Office value) {
		// TODO Auto-generated method stub

	}


	
	

	

}
