package gr.upatras.ece.nam.fstoolkit.panlaboffice;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import gr.upatras.ece.nam.fci.core.FCI;
import gr.upatras.ece.nam.fci.core.ResourceContext;
import gr.upatras.ece.nam.fstoolkit.panlaboffice.preferences.PanlabBrokerPreferenceConstants;

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
	public static final String PLUGIN_ID = "gr.upatras.ece.fstoolkit.panlaboffice"; //$NON-NLS-1$
	
		// The shared instance
		private static Activator plugin;
		
		private List<IBrokerRepositoryListener> officeRepositoryListener;
		

		private List<Broker> panlabBrokers;
		private String officeName = "panlab";
		private ResourceContext panlab;
		
		
		
		public List<IBrokerRepositoryListener> getBrokerRepositoryListener() {
			return officeRepositoryListener;
		}

		/**
		 * The constructor
		 */
		public Activator() {
			officeRepositoryListener = new ArrayList<IBrokerRepositoryListener>();
			this.panlabBrokers = new ArrayList<Broker>();
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

					System.out.println("===Panlab Broker Preferences change..trigger reload in FSToolkit");
					if ((event.getProperty() == PanlabBrokerPreferenceConstants.P_PANLABUSERNAME)
							|| (event.getProperty() == PanlabBrokerPreferenceConstants.P_PANLABPASSWORD)) {
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

//		public void setBroker(Broker office) {
//			this.panlabBroker = office;
//		}

		public List<Broker> getBrokers() {
			return panlabBrokers;
		}

		public void setResourceContext(ResourceContext panlab) {
			this.panlab = panlab;
		}

		public ResourceContext getResourceContext() {
			return panlab;
		}
		
		public void LoadScenario(RequestedFederationScenario fedScenario){
			panlab.LoadFederationScenario(fedScenario);
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
			panlab = fci.createResourceContext(officeName, authKey);		
			Broker panlabBroker = panlab.getBrokerModel();
			this.panlabBrokers.add(panlabBroker);
			
			// Get the first model element and cast it to the right type, in my
			// example everything is hierarchical included in this first node
			if (panlabBrokers!=null){
				return panlabBrokers;
			}
			
			return null ;
		}
		


	}
