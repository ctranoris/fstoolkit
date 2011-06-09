package org.panlab.software.fstoolkit.panlaboffice;
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
import org.panlab.software.fstoolkit.panlaboffice.preferences.PanlabOfficePreferenceConstants;

import FederationOffice.Office;
import FederationOffice.extensionInterfaces.IOfficeRepository;
import FederationOffice.extensionInterfaces.IOfficeRepositoryListener;
import FederationOffice.federationscenarios.RequestedFederationScenario;


public class PanlabOfficeProvider implements IOfficeRepository {

//	better all of these to be at the activator.
//	This class not to be singleton at all
	
//	private Office office;
//	private static String officeName = "panlab";
//	private ResourceContext panlab;
//	private static PanlabOfficeProvider instance;	
	
//	public static PanlabOfficeProvider getInstance(){
//		if (instance == null){
//			instance = new PanlabOfficeProvider();
//		}
//		
//		return instance;
//	}
	
	public PanlabOfficeProvider() {
//		instance = this;
	}
	
	@Override
	public String getName() {
		
		return Activator.getDefault().getOfficeName();
	}


	@Override
	public Office loadOffice() {
		
		// Get the resource
		String myUsername= Activator.getDefault().getPreferenceStore().getString( PanlabOfficePreferenceConstants.P_PANLABUSERNAME );
		String myPassw= Activator.getDefault().getPreferenceStore().getString( PanlabOfficePreferenceConstants.P_PANLABPASSWORD );
		
		
		return Activator.getDefault().loadOffice(myUsername, myPassw);
	}
	
	public Office getOffice() {
		return 
		Activator.getDefault().getOffice();
	}
	
	public void LoadScenario(RequestedFederationScenario fedScenario){
		Activator.getDefault().getResourceContext().LoadFederationScenario(fedScenario);
	}
	
	public ResourceContext getResourceContext(){
		return 
		Activator.getDefault().getResourceContext();
	}

	@Override
	public void registerOfficeRepositoryListener(
			IOfficeRepositoryListener listener) {
		 Activator.getDefault().getOfficeRepositoryListener().add(listener);		
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
