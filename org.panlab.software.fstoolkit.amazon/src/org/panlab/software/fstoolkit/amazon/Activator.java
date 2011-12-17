package org.panlab.software.fstoolkit.amazon;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.panlab.software.fci.core.FCI;
import org.panlab.software.fci.core.ResourceContext;
import org.panlab.software.fstoolkit.amazon.preferences.AmazonPreferenceConstants;

import FederationOffice.Office;
import FederationOffice.extensionInterfaces.IOfficeRepositoryListener;
import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.fcielements.FCICredentials;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.panlab.software.fstoolkit.amazon"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private List<IOfficeRepositoryListener> officeRepositoryListener;

	private ArrayList<Office> amazonOffices;
	private String officeName = "amazon";
	private ResourceContext amazon;
	
	/**
	 * The constructor
	 */
	public Activator() {
		officeRepositoryListener = new ArrayList<IOfficeRepositoryListener>();
		this.amazonOffices   = new ArrayList<Office>();
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
	
	public List<IOfficeRepositoryListener> getOfficeRepositoryListener() {
		return officeRepositoryListener;
	}
	
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeName() {
		return officeName;
	}
//	public void setOffice(Office office) {
//		this.amazonOffices = office;
//	}

	public List<Office> getOffices() {
		return amazonOffices;
	}

	public List<Office> loadAmazonOfficeDescription(String myAccessKeyID, String mySecretAccessKey) {
		
		
		FCICredentials cred =FederationOffice.fcielements.FcielementsFactory.eINSTANCE.createFCICredentials();
		cred.setUsername(myAccessKeyID);
		cred.setPassword(mySecretAccessKey);
		FCI fci = FCI.getInstance();
		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		amazon = fci.createResourceContext(officeName, authKey);		
		Office amazonOffice = amazon.getOfficeModel();
		
		this.amazonOffices.add(amazonOffice);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		if (amazonOffices!=null){
			return amazonOffices;
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
