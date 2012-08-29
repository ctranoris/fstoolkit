package gr.upatras.ece.nam.fstoolkit.uop;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.preference.IPreferenceStore;

import gr.upatras.ece.nam.fstoolkit.uop.preferences.UoPBrokerPreferenceConstants;

import brokermodel.Broker;
import brokermodel.extensionInterfaces.IBrokerRepository;
import brokermodel.extensionInterfaces.IBrokerRepositoryListener;
import brokermodel.federationscenarios.RequestedFederationScenario;

public class UoPRepository implements IBrokerRepository {

	public UoPRepository() {
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
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void LoadScenario(RequestedFederationScenario fedScenario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerBrokerRepositoryListener(
			IBrokerRepositoryListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public EList<Broker> loadBrokers() {
		// Get the resource
		// Get the preference store
	    IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
	    
		String myUsername= Activator.getDefault().getPreferenceStore().getString( 
				 UoPBrokerPreferenceConstants.UOPUSERNAME) ;
		String myPassw= Activator.getDefault().getPreferenceStore().getString( 
				 UoPBrokerPreferenceConstants.UOPPASSWORD) ;

		List<Broker> prototypeList = Activator.getDefault().loadBrokers(myUsername, myPassw);
		EList<Broker> eList = new BasicEList<Broker>(prototypeList.size());
		ECollections.setEList(eList, prototypeList);
		return eList ;
	}

	@Override
	public EList<Broker> getBrokers() {
		List<Broker> prototypeList = Activator.getDefault().getBrokers();
		EList<Broker> eList = new BasicEList<Broker>(prototypeList.size());
		ECollections.setEList(eList, prototypeList);
		return eList ;
	}

}
