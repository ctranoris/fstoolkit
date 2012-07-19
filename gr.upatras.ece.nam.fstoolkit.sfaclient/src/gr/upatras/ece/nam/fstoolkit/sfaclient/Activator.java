package gr.upatras.ece.nam.fstoolkit.sfaclient;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import gr.upatras.ece.nam.fci.core.FCI;
import gr.upatras.ece.nam.fci.core.ResourceContext;
import gr.upatras.ece.nam.fci.sfa.SFABrokerProxy;
import gr.upatras.ece.nam.fci.sfa.SFAUtils;

import brokermodel.Broker;
import brokermodel.extensionInterfaces.IBrokerRepositoryListener;
import brokermodel.fcielements.AuthorizationKey;
import brokermodel.fcielements.FCICredentials;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "gr.upatras.ece.nam.fstoolkit.sfaclient"; //$NON-NLS-1$

	private ArrayList<Broker> sfaBrokers;
	private ResourceContext SFA;
	private List<IBrokerRepositoryListener> officeRepositoryListener;
	
	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
		this.sfaBrokers = new ArrayList<Broker>();
		officeRepositoryListener = new ArrayList<IBrokerRepositoryListener>();
	}

	public List<IBrokerRepositoryListener> getBrokerRepositoryListener() {
		return officeRepositoryListener;
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

				System.out.println("===SFA Broker Preferences change..trigger reload in FSToolkit");
				NotifyRepositoryListeners();
					
				
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
	

	
	public List<Broker> getBrokers() {
		return sfaBrokers;
	}

	public List<Broker> loadSFABrokersDescriptions(List<FCICredentials> creds) {
		
		this.sfaBrokers.clear();
		
		FCI fci = FCI.getInstance();
		
		for (Iterator<FCICredentials> iterator = creds.iterator(); iterator.hasNext();) {
			FCICredentials cred = (FCICredentials) iterator.next();
			AuthorizationKey authKey = fci.createAuthorizationKey(cred);
			ResourceContext r = fci.createResourceContext(SFAUtils.RESOURCE_CONTEXT_NAME, authKey);
			Broker sfaBroker  = r.getBrokerModel();
			
			if (sfaBroker instanceof SFABrokerProxy)
				if ( !((SFABrokerProxy)sfaBroker).officeLoaded() ){
					sfaBroker = brokermodel.BrokermodelFactory.eINSTANCE.createBroker();
					sfaBroker.setName(
							authKey.getCredentials().getCredoptions().get(SFAUtils.AUTHORITY ) +
							" (error loading)");
				}
			
			this.sfaBrokers.add(sfaBroker);
			
		}
		
		
		
//		Broker sfaBroker = brokermodel.brokermodelFactory.eINSTANCE.createBroker();
//		sfaBroker.setName("SFA authorityA");
//		
//		this.sfaBrokers.add(sfaBroker);
//		
//		sfaBroker = brokermodel.brokermodelFactory.eINSTANCE.createBroker();
//		sfaBroker.setName("SFA authority 2");
//		
//		this.sfaBrokers.add(sfaBroker);
//		
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		if (sfaBrokers!=null){
			return this.sfaBrokers;
		}
		return null;
	}

}
