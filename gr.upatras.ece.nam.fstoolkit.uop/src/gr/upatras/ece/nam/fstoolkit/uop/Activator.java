package gr.upatras.ece.nam.fstoolkit.uop;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import gr.upatras.ece.nam.fci.core.FCI;
import gr.upatras.ece.nam.fci.core.ResourceContext;
import gr.upatras.ece.nam.fstoolkit.uop.preferences.UoPBrokerPreferenceConstants;

import brokermodel.Broker;
import brokermodel.extensionInterfaces.IBrokerRepositoryListener;
import brokermodel.fcielements.AuthorizationKey;
import brokermodel.fcielements.FCICredentials;
import brokermodel.federationscenarios.RequestedFederationScenario;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "gr.upatras.ece.nam.fstoolkit.uop"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private List<IBrokerRepositoryListener> officeRepositoryListener;
	

	private List<Broker> uopBrokers;
	private String officeName = "p2e";
	private ResourceContext p2e;
		
	
	public List<IBrokerRepositoryListener> getBrokerRepositoryListener() {
		return officeRepositoryListener;
	}

	/**
	 * The constructor
	 */
	public Activator() {
		officeRepositoryListener = new ArrayList<IBrokerRepositoryListener>();
		this.uopBrokers = new ArrayList<Broker>();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		Activator.getDefault().getPreferenceStore()
		.addPropertyChangeListener(new IPropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent event) {

				System.out.println("===UoP Broker Preferences change..trigger reload in FSToolkit");
			    IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
				if ((event.getProperty() == preferenceStore.getString( UoPBrokerPreferenceConstants.UOPUSERNAME) )
						|| (event.getProperty() == preferenceStore.getString(UoPBrokerPreferenceConstants.UOPPASSWORD) )) {
					NotifyRepositoryListeners();
					
				}
				
			}					
		});
	}
	
	
	
	public void NotifyRepositoryListeners() {
		for (IBrokerRepositoryListener iterable_element : officeRepositoryListener) {
			iterable_element.RepositoryChanged();
		}		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public void setBrokerName(String officeName) {
		this.officeName = officeName;
	}

	public String getBrokerName() {
		return officeName;
	}

//	public void setBroker(Broker office) {
//		this.panlabBroker = office;
//	}

	public List<Broker> getBrokers() {
		return uopBrokers;
	}

	public void setResourceContext(ResourceContext panlab) {
		this.p2e = panlab;
	}

	public ResourceContext getResourceContext() {
		return p2e;
	}
	
	public void LoadScenario(RequestedFederationScenario fedScenario){
		p2e.LoadFederationScenario(fedScenario);
	}
	
	public List<Broker> loadBrokers(String username, String passkey) {
		
		// Get the resource
		String myUsername= username;
		String myPassw= passkey;
		//office = PanlabServices.getInstance().getBroker( myUsername , myPassw, true);
		FCICredentials cred =brokermodel.fcielements.FcielementsFactory.eINSTANCE.createFCICredentials();
		cred.setUsername(myUsername);
		cred.setPassword(myPassw);
		FCI fci = FCI.getInstance();
		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		p2e = fci.createResourceContext(officeName, authKey);	
		if (p2e!=null){	
			Broker uopBroker = p2e.getBrokerModel();
			this.uopBrokers.add(uopBroker);
		}
		
		if (uopBrokers!=null){
			return uopBrokers;
		}
		
		return null ;
	}
	
	public String checkhUoPAuth(String username, String passkey) {
		
		// Get the resource
		String myUsername= username;
		String myPassw= passkey;
		//office = PanlabServices.getInstance().getBroker( myUsername , myPassw, true);
		FCICredentials cred =brokermodel.fcielements.FcielementsFactory.eINSTANCE.createFCICredentials();
		cred.setUsername(myUsername);
		cred.setPassword(myPassw);
		FCI fci = FCI.getInstance();
		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		p2e = fci.createResourceContext(officeName, authKey);
		
		if (p2e!=null){		
			Broker uopBroker = p2e.getBrokerModel();
			return "Connection succesful. Broker:"+uopBroker.getName()+", brokerdsl="+uopBroker.getResourceURI() ;
			
		}else{		
			return "Authorisation failed" ;
		}
	}
	

}
