package org.panlab.software.fstoolkit.panlaboffice;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.panlab.software.fci.core.FCI;
import org.panlab.software.fci.core.ResourceContext;
import org.panlab.software.fstoolkit.panlaboffice.preferences.PanlabOfficePreferenceConstants;

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
	public static final String PLUGIN_ID = "org.panlab.software.fstoolkit.panlaboffice"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private List<IOfficeRepositoryListener> officeRepositoryListener;
	

	private Office office;
	private String officeName = "panlab";
	private ResourceContext panlab;
	
	
	
	public List<IOfficeRepositoryListener> getOfficeRepositoryListener() {
		return officeRepositoryListener;
	}

	/**
	 * The constructor
	 */
	public Activator() {
		officeRepositoryListener = new ArrayList<IOfficeRepositoryListener>();
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

				System.out.println("===Panlab Office Preferences change..trigger reload in FSToolkit");
				if ((event.getProperty() == PanlabOfficePreferenceConstants.P_PANLABUSERNAME)
						|| (event.getProperty() == PanlabOfficePreferenceConstants.P_PANLABPASSWORD)) {
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

	public void setOffice(Office office) {
		this.office = office;
	}

	public Office getOffice() {
		return office;
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
	
	public Office loadOffice(String username, String passkey) {
		
		// Get the resource
		String myUsername= username;
		String myPassw= passkey;
		//office = PanlabServices.getInstance().getOffice( myUsername , myPassw, true);
		FCICredentials cred =FederationOffice.fcielements.FcielementsFactory.eINSTANCE.createFCICredentials();
		cred.setUsername(myUsername);
		cred.setPassword(myPassw);
		FCI fci = FCI.getInstance();
		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		panlab = fci.createResourceContext(officeName, authKey);		
		office = panlab.getOfficeModel();
		
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		if (office!=null){
			return office;
		}
		
		return null ;
	}
	


}
