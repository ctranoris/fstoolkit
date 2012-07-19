package gr.upatras.ece.nam.fstoolkit.plc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import gr.upatras.ece.nam.fci.core.FCI;
import gr.upatras.ece.nam.fci.core.ResourceContext;

import brokermodel.Broker;
import brokermodel.fcielements.AuthorizationKey;
import brokermodel.fcielements.FCICredentials;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "gr.upatras.ece.nam.fstoolkit.plc"; //$NON-NLS-1$
	
		// The shared instance
		private static Activator plugin;
		private ArrayList<Broker> plcBrokers;
			
		/**
		 * The constructor
		 */
		public Activator() {
			this.plcBrokers  = new ArrayList<Broker>();
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
		 */
		public void start(BundleContext context) throws Exception {
			super.start(context);
			plugin = this;
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

		
		
		public List<Broker> getBrokers() {
			return plcBrokers;
		}

		public List<Broker> loadPLCBrokerDescription(List<FCICredentials> creds) {
			this.plcBrokers.clear();
			
			FCI fci = FCI.getInstance();
			
			for (Iterator<FCICredentials> iterator = creds.iterator(); iterator.hasNext();) {
				FCICredentials cred = (FCICredentials) iterator.next();
				AuthorizationKey authKey = fci.createAuthorizationKey(cred);
//				ResourceContext sfa = fci.createResourceContext("plc", authKey);
//				Broker sfaBroker  = sfa.getBrokerModel();
//				
//				if (sfaBroker instanceof SFABrokerProxy)
//					if ( !((SFABrokerProxy)sfaBroker).officeLoaded() ){
//						sfaBroker = brokermodel.brokermodelFactory.eINSTANCE.createBroker();
//						sfaBroker.setName(
//								authKey.getCredentials().getCredoptions().get(SFAUtils.AUTHORITY ) +
//								" (error loading)");
//					}
				
				Broker plcBroker = brokermodel.BrokermodelFactory.eINSTANCE.createBroker();
				plcBroker.setName( authKey.getCredentials().getCredoptions().get( "PLCNAME") + " (m2m not implemented)");
				this.plcBrokers.add(plcBroker);
				
			}

			if (plcBrokers!=null){
				return this.plcBrokers;
			}
			return null;
		}

	}
