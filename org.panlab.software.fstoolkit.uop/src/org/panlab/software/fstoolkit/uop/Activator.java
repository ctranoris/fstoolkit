package org.panlab.software.fstoolkit.uop;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.panlab.software.fci.core.FCI;
import org.panlab.software.fci.core.ResourceContext;
import org.panlab.software.fstoolkit.uop.preferences.UoPOfficePreferenceConstants;

import FederationOffice.Office;
import FederationOffice.extensionInterfaces.IOfficeRepositoryListener;
import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.fcielements.FCICredentials;
import FederationOffice.federationscenarios.RequestedFederationScenario;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.panlab.software.fstoolkit.uop"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private List<IOfficeRepositoryListener> officeRepositoryListener;
	

	private List<Office> uopOffices;
	private String officeName = "uop";
	private ResourceContext uop;
	
	
	
	public List<IOfficeRepositoryListener> getOfficeRepositoryListener() {
		return officeRepositoryListener;
	}

	/**
	 * The constructor
	 */
	public Activator() {
		officeRepositoryListener = new ArrayList<IOfficeRepositoryListener>();
		this.uopOffices = new ArrayList<Office>();
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

				System.out.println("===UoP Office Preferences change..trigger reload in FSToolkit");
				if ((event.getProperty() == UoPOfficePreferenceConstants.P_UOPUSERNAME)
						|| (event.getProperty() == UoPOfficePreferenceConstants.P_UOPPASSWORD)) {
					NotifyRepositoryListeners();
					
				}
				
			}					
		});
	}
	
	
	
	public void NotifyRepositoryListeners() {
		for (IOfficeRepositoryListener iterable_element : officeRepositoryListener) {
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

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeName() {
		return officeName;
	}

//	public void setOffice(Office office) {
//		this.panlabOffice = office;
//	}

	public List<Office> getOffices() {
		return uopOffices;
	}

	public void setResourceContext(ResourceContext panlab) {
		this.uop = panlab;
	}

	public ResourceContext getResourceContext() {
		return uop;
	}
	
	public void LoadScenario(RequestedFederationScenario fedScenario){
		uop.LoadFederationScenario(fedScenario);
	}
	
	public List<Office> loadOffices(String username, String passkey) {
		
		// Get the resource
		String myUsername= username;
		String myPassw= passkey;
		//office = PanlabServices.getInstance().getOffice( myUsername , myPassw, true);
		FCICredentials cred =FederationOffice.fcielements.FcielementsFactory.eINSTANCE.createFCICredentials();
		cred.setUsername(myUsername);
		cred.setPassword(myPassw);
		FCI fci = FCI.getInstance();
		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		uop = fci.createResourceContext(officeName, authKey);		
		Office uopOffice = uop.getOfficeModel();
		this.uopOffices.add(uopOffice);
		
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		if (uopOffices!=null){
			return uopOffices;
		}
		
		return null ;
	}
	

}
