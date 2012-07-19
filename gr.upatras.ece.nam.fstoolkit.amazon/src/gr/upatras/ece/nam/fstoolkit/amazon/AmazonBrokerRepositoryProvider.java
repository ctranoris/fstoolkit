package gr.upatras.ece.nam.fstoolkit.amazon;


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
import gr.upatras.ece.nam.fstoolkit.amazon.preferences.AmazonPreferenceConstants;
import brokermodel.Broker;
import brokermodel.extensionInterfaces.IBrokerRepository;
import brokermodel.extensionInterfaces.IBrokerRepositoryListener;
import brokermodel.federationscenarios.RequestedFederationScenario;

public class AmazonBrokerRepositoryProvider implements IBrokerRepository {

	public AmazonBrokerRepositoryProvider() {
		// TODO Auto-generated constructor stub
	}

	
	public EList<Broker> getBrokers() {
		List<Broker> prototypeList = Activator.getDefault().getBrokers();
		EList<Broker> eList = new BasicEList<Broker>(prototypeList.size());
		ECollections.setEList(eList, prototypeList);
		
		return eList ;
		
		
	}
	
	@Override
	public String getName() {
		
		return Activator.getDefault().getBrokerName();
	}
	@Override
	public EList<Broker> loadBrokers() {
		
		// Get the resource
		String myAccessKeyID= Activator.getDefault().getPreferenceStore().getString( AmazonPreferenceConstants.P_ACCESSKEYID );
		String mySecretAccessKey= Activator.getDefault().getPreferenceStore().getString( AmazonPreferenceConstants.P_SECRETACCESSKEY );
		
		List<Broker> prototypeList = Activator.getDefault().loadAmazonBrokerDescription(myAccessKeyID, mySecretAccessKey);
		EList<Broker> eList = new BasicEList<Broker>(prototypeList.size());
		ECollections.setEList(eList, prototypeList);
		
		return eList ; 
		
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
	public void LoadScenario(RequestedFederationScenario fedScenario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerBrokerRepositoryListener(
			IBrokerRepositoryListener listener) {
		// TODO Auto-generated method stub

	}

}
