package gr.upatras.ece.nam.fstoolkit.sfaclient;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TreeItem;
import gr.upatras.ece.nam.fci.sfa.SFAUtils;
import gr.upatras.ece.nam.fstoolkit.sfaclient.Activator;
import gr.upatras.ece.nam.fstoolkit.sfaclient.preferences.SFAAccount;

import brokermodel.Broker;
import brokermodel.extensionInterfaces.IBrokerRepository;
import brokermodel.extensionInterfaces.IBrokerRepositoryListener;
import brokermodel.fcielements.FCICredentials;
import brokermodel.federationscenarios.RequestedFederationScenario;

public class SFARepository implements IBrokerRepository {

	public SFARepository() {
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


		List<FCICredentials>  creds = new ArrayList<FCICredentials>();
		
		// Get the preference store
	    IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		int accountsnum = preferenceStore.getInt("AccountNums");
	    
	    for (int i = 0; i < accountsnum; i++) {

			FCICredentials cred =brokermodel.fcielements.FcielementsFactory.eINSTANCE.createFCICredentials();
			EMap<String, String> opts = cred.getCredoptions();
			
			opts.put(SFAUtils.REGISTRY_URL, preferenceStore.getString("REGISTRYURL_" + i ));
			opts.put(SFAUtils.AM_URL, preferenceStore.getString("AGGREGATEURL_" + i ));
			opts.put(SFAUtils.SM_URL, preferenceStore.getString("SLICEMGRURL_" + i ));
			opts.put(SFAUtils.KEYSTORE_FILEPATH, preferenceStore.getString("KEYSTORE_" + i ));
			opts.put(SFAUtils.KEYSTORE_PASSWORD, preferenceStore.getString("KEYSTOREPASSWORD_" + i ));
			opts.put(SFAUtils.TRUSTSTORE_FILEPATH , preferenceStore.getString("TRUSTSTORE_" + i ) );
			opts.put(SFAUtils.TRUSTSTORE_PASSWORD, preferenceStore.getString("TRUSTSTOREPASSWORD_" + i ));
			opts.put(SFAUtils.AUTHORITY, preferenceStore.getString("AUTHORITY_" + i ));
			opts.put(SFAUtils.USERNAME, preferenceStore.getString("USERNAME_" + i ));
			opts.put(SFAUtils.SELF_CERTIFICATE_FILEPATH, preferenceStore.getString("CERTIFICATEFILENAME_" + i ));
			opts.put(SFAUtils.SFA_VERSION, preferenceStore.getString("SFAVERSION_" + i ));
			opts.put(SFAUtils.SFA_TYPE, preferenceStore.getString("SFATYPE_" + i ));
			opts.put(SFAUtils.ENABLED_ACCOUND, preferenceStore.getString("ENABLEDACCOUNT_" + i ));
			opts.put(SFAUtils.CACHE_MODEL, preferenceStore.getString("CACHEMODEL_" + i ));

			if (preferenceStore.getBoolean("ENABLEDACCOUNT_" + i ) ) //only if the account is enabled then load it
				creds.add(cred);	
	      
	    }
	    
		List<Broker> prototypeList = Activator.getDefault().loadSFABrokersDescriptions( creds );
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
