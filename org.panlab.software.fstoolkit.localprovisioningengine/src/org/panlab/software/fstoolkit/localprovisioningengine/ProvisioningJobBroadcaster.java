package org.panlab.software.fstoolkit.localprovisioningengine;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Vector;

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


import FederationOffice.extensionInterfaces.IProvisioningJobEvent;
import FederationOffice.extensionInterfaces.IProvisioningJobListener;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;

public class ProvisioningJobBroadcaster implements IProvisioningJobListener {

	private static ProvisioningJobBroadcaster instance;
	private List<IProvisioningJobListener> listeners = null;
	
	public static ProvisioningJobBroadcaster getInstance() {
		if (instance == null)
			instance = new ProvisioningJobBroadcaster();
		
		return instance;
	}
	
	public ProvisioningJobBroadcaster() {
		 listeners = new Vector<IProvisioningJobListener>();
		   
	}

	@Override
	public void initialize(EObject source) {
		ProvisioningJobBroadcaster obj = ProvisioningJobBroadcaster.getInstance();
		if ( source instanceof IProvisioningJobListener){
			obj.listeners.add( (IProvisioningJobListener)source);
		}

	}

	@Override
	public void eventOccured(IProvisioningJobEvent event) {
		for (IProvisioningJobListener iterable_element : listeners) {
			iterable_element.eventOccured(event);
		}

	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub

	}

	public void eventOccuredOnScenario( final RequestedFederationScenario schedScenario) {

		ProvisioningJobBroadcaster.getInstance().eventOccured( 
				new ProvisioningJobEvent(schedScenario, null));

	}

	public void eventOccuredOnResource(final ResourceRequest resourceReq) {
		RequestedFederationScenario schedScenario = null;
		
		if (resourceReq.eContainer()!=null )
			if (resourceReq.eContainer().eContainer()!=null )
				if (resourceReq.eContainer().eContainer() instanceof RequestedFederationScenario   )
					schedScenario = (RequestedFederationScenario)resourceReq.eContainer().eContainer();
		ProvisioningJobBroadcaster.getInstance().eventOccured(
				new ProvisioningJobEvent(schedScenario, resourceReq) );
				
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

	



}
