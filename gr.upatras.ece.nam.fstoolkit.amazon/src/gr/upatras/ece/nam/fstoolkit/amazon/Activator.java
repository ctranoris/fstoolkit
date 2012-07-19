package gr.upatras.ece.nam.fstoolkit.amazon;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import gr.upatras.ece.nam.fci.core.FCI;
import gr.upatras.ece.nam.fci.core.ResourceContext;
import gr.upatras.ece.nam.fstoolkit.amazon.preferences.AmazonPreferenceConstants;

import brokermodel.Broker;
import brokermodel.extensionInterfaces.IBrokerRepositoryListener;
import brokermodel.fcielements.AuthorizationKey;
import brokermodel.fcielements.FCICredentials;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "gr.upatras.ece.nam.fstoolkit.amazon"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private List<IBrokerRepositoryListener> officeRepositoryListener;

	private ArrayList<Broker> amazonBrokers;
	private String officeName = "amazon";
	private ResourceContext amazon;
	
	/**
	 * The constructor
	 */
	public Activator() {
		officeRepositoryListener = new ArrayList<IBrokerRepositoryListener>();
		this.amazonBrokers   = new ArrayList<Broker>();
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

				System.out.println("===Amazon Preferences change..trigger reload in FSToolkit");
				if ((event.getProperty() == AmazonPreferenceConstants.P_ACCESSKEYID)
						|| (event.getProperty() == AmazonPreferenceConstants.P_SECRETACCESSKEY)) {
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
	
	public List<IBrokerRepositoryListener> getBrokerRepositoryListener() {
		return officeRepositoryListener;
	}
	
	public void setBrokerName(String officeName) {
		this.officeName = officeName;
	}

	public String getBrokerName() {
		return officeName;
	}
//	public void setBroker(Broker office) {
//		this.amazonBrokers = office;
//	}

	public List<Broker> getBrokers() {
		return amazonBrokers;
	}

	public List<Broker> loadAmazonBrokerDescription(String myAccessKeyID, String mySecretAccessKey) {
		
		
		FCICredentials cred =brokermodel.fcielements.FcielementsFactory.eINSTANCE.createFCICredentials();
		cred.setUsername(myAccessKeyID);
		cred.setPassword(mySecretAccessKey);
		FCI fci = FCI.getInstance();
		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		amazon = fci.createResourceContext(officeName, authKey);		
		Broker amazonBroker = amazon.getBrokerModel();
		
		this.amazonBrokers.add(amazonBroker);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		if (amazonBrokers!=null){
			return amazonBrokers;
		}
		return null;
	}
	
	public void setResourceContext(ResourceContext panlab) {
		this.amazon = panlab;
	}

	public ResourceContext getResourceContext() {
		return amazon;
	}

}
