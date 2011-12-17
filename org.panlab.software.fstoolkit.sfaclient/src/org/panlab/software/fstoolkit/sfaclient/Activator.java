package org.panlab.software.fstoolkit.sfaclient;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.panlab.software.fci.core.FCI;
import org.panlab.software.fci.core.ResourceContext;

import FederationOffice.Office;
import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.fcielements.FCICredentials;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.panlab.software.fstoolkit.sfaclient"; //$NON-NLS-1$

	private ArrayList<Office> sfaOffices;
	private ResourceContext SFA;
	
	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
		this.sfaOffices = new ArrayList<Office>();
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
	

	
	public List<Office> getOffices() {
		return sfaOffices;
	}

	public List<Office> loadSFAOfficesDescription(String string, String string2) {
		FCICredentials cred =FederationOffice.fcielements.FcielementsFactory.eINSTANCE.createFCICredentials();
		cred.setUsername( string );
		cred.setPassword( string2 );
		FCI fci = FCI.getInstance();
		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
	
		Office sfaOffice = FederationOffice.FederationOfficeFactory.eINSTANCE.createOffice();
		sfaOffice.setName("SFA authorityA");
		
		this.sfaOffices.add(sfaOffice);
		
		sfaOffice = FederationOffice.FederationOfficeFactory.eINSTANCE.createOffice();
		sfaOffice.setName("SFA authority 2");
		
		this.sfaOffices.add(sfaOffice);
		
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		if (sfaOffices!=null){
			return this.sfaOffices;
		}
		return null;
	}

}
