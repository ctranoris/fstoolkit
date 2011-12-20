package org.panlab.software.fstoolkit.sfaclient;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.panlab.software.fci.core.FCI;
import org.panlab.software.fci.core.ResourceContext;
import org.panlab.software.fci.sfa.SFAOfficeProxy;
import org.panlab.software.fci.sfa.SFAUtils;

import FederationOffice.Office;
import FederationOffice.extensionInterfaces.IOfficeRepositoryListener;
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
	private List<IOfficeRepositoryListener> officeRepositoryListener;
	
	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
		this.sfaOffices = new ArrayList<Office>();
		officeRepositoryListener = new ArrayList<IOfficeRepositoryListener>();
	}

	public List<IOfficeRepositoryListener> getOfficeRepositoryListener() {
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

				System.out.println("===SFA Office Preferences change..trigger reload in FSToolkit");
				NotifyRepositoryListeners();
					
				
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
	

	
	public List<Office> getOffices() {
		return sfaOffices;
	}

	public List<Office> loadSFAOfficesDescriptions(List<FCICredentials> creds) {
		
		this.sfaOffices.clear();
		
		FCI fci = FCI.getInstance();
		
		for (Iterator<FCICredentials> iterator = creds.iterator(); iterator.hasNext();) {
			FCICredentials cred = (FCICredentials) iterator.next();
			AuthorizationKey authKey = fci.createAuthorizationKey(cred);
			ResourceContext sfa = fci.createResourceContext(SFAUtils.RESOURCE_CONTEXT_NAME, authKey);
			Office sfaOffice  = sfa.getOfficeModel();
			
			if (sfaOffice instanceof SFAOfficeProxy)
				if ( !((SFAOfficeProxy)sfaOffice).officeLoaded() ){
					sfaOffice = FederationOffice.FederationOfficeFactory.eINSTANCE.createOffice();
					sfaOffice.setName(
							authKey.getCredentials().getCredoptions().get(SFAUtils.AUTHORITY ) +
							" (error loading)");
				}
			
			this.sfaOffices.add(sfaOffice);
			
		}
		
		
		
//		Office sfaOffice = FederationOffice.FederationOfficeFactory.eINSTANCE.createOffice();
//		sfaOffice.setName("SFA authorityA");
//		
//		this.sfaOffices.add(sfaOffice);
//		
//		sfaOffice = FederationOffice.FederationOfficeFactory.eINSTANCE.createOffice();
//		sfaOffice.setName("SFA authority 2");
//		
//		this.sfaOffices.add(sfaOffice);
//		
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		if (sfaOffices!=null){
			return this.sfaOffices;
		}
		return null;
	}

}
