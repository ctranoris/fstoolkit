package org.panlab.software.fstoolkit;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.panlab.software.fstoolkit.views.FSDLView.OfferedServicesView;
import org.panlab.software.fstoolkit.views.FSDLView.RunningScenariosView;
import org.panlab.software.fstoolkit.views.FSDLView.ScenariosView;

import FederationOffice.FederationOfficePackage;
import FederationOffice.Office;
import FederationOffice.extensionInterfaces.IOfficeRepository;
import FederationOffice.extensionInterfaces.IOfficeRepositoryListener;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.uiObjects.OfficeManager;
import FederationOffice.uiObjects.UiObjectsFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.panlab.software.fstoolkit"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	//The office manager
	private OfficeManager officeManager;

	protected IOfficeRepositoryListener officeRepositoryListener ;

	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		CreateTaxonomyModel();
	}
	

	public void ReloadModelsAndViews(){
		CreateTaxonomyModel();
//		//find view org.panlab.software.fstoolkit.views.OfferedServicesView and then  initializeOfferedServicesDomain()
		IViewPart view_part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(OfferedServicesView.ID);
		if (view_part!=null){
			(  (OfferedServicesView)view_part).initializeOfferedServicesDomain();
		}

		view_part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(ScenariosView.ID);
		if (view_part!=null){
			(  (ScenariosView)view_part).initializeScenariosDomain();
		}

		view_part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(RunningScenariosView.ID);
		if (view_part!=null){
			(  (RunningScenariosView)view_part).initializeRunningResourcesDomain();
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

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	// This is the ID from our extension point
	private static final String IOFFICEREPOSITORY_ID = "org.panlab.software.fstoolkit.extensionpoint.officerepository";
	
	public void CreateTaxonomyModel(){
		System.out.println("============CreateTaxonomyModel================");
				
		// Initialize the model
		FederationOfficePackage.eINSTANCE.eClass();		
		officeManager = UiObjectsFactory.eINSTANCE.createOfficeManager();

		runOfficeReposityExtension();
		
		
//		BasicEMap<String,Object>  officeImportURIMap = new BasicEMap<String, Object>();
//		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
//		// Get the resource
		
//		Resource resource = resSet.getResource(URI.createURI("http://localhost:8081/org.panlab.software.ws.repos.m2m/repo/panlab.office"), true);
//		Resource resource = resSet.getResource( URI.createFileURI("C:\\Users\\ctranoris\\Desktop\\panlab.office" ), true);

//		Resource resource = resSet.getResource(URI.createURI("platform:/resource/myProject/src/another.federationoffice"), true);
//		Office of = (Office) resource.getContents().get(0);
//		of.setResourceURI( resource.getURI().toString() );
//		officeManager.getOfficesRef().add( (Office) resource.getContents().get(0) );
//		
	//		resource = resSet.getResource(URI.createURI("platform:/resource/myProject/src/Amazon.officedl"), true);	
//		officeRule = (OfficeRule) resource.getContents().get(0);
//		officeRule.getTestbedOfficev().setResourceURI( resource.getURI().toString() );
//		officeManager.getOfficesRef().add( officeRule.getTestbedOfficev() );
//		
	
//		Resource resource = resSet.getResource(URI.createURI("platform:/resource/org.panlab.software.fstoolkit.scenarios.p2nerLargeScale/scenarios/small.officedl"), true);		
//		OfficeRule officeRule = (OfficeRule) resource.getContents().get(0);
//		officeRule.getTestbedOfficev().setResourceURI( resource.getURI().toString() );
//		officeManager.getOfficesRef().add( officeRule.getTestbedOfficev() );
	}
	
	private void runOfficeReposityExtension() {
		IConfigurationElement[] config = Platform.getExtensionRegistry()
		.getConfigurationElementsFor(IOFFICEREPOSITORY_ID);
			try {
				for (IConfigurationElement e : config) {
					System.out.println("Evaluating extension "+IOFFICEREPOSITORY_ID);
					final Object o = e.createExecutableExtension("class");
					if (o instanceof IOfficeRepository) {
						ISafeRunnable runnable = new ISafeRunnable() {
							@Override
							public void handleException(Throwable exception) {
								System.out.println("Exception in client");
							}
			
							@Override
							public void run() throws Exception {		
								
								
								List<Office> offices = ((IOfficeRepository) o).loadOffices( );								
								
								registerRepositoryListener((IOfficeRepository) o);
								
								for (Iterator iterator = offices.iterator(); iterator.hasNext();) {
									Office office = (Office) iterator.next();

									if (office!=null)
										officeManager.getOfficesRef().add( office  );
								}
								
							}
						};
						SafeRunner.run(runnable);
					}
				}
			} catch (CoreException ex) {
				System.out.println(ex.getMessage());
			}
		
	}

	protected void registerRepositoryListener(IOfficeRepository o) {
		if (officeRepositoryListener==null){
			officeRepositoryListener = new OfficeRepositoryListener();
			o.registerOfficeRepositoryListener(officeRepositoryListener );
		}
	}

	/**
	 * Returns the shared officeManager instance
	 *
	 * @return the shared officeManager instance
	 */
	public OfficeManager getOfficeManager() {
		return officeManager;
	}
	
	
	public void LoadScenarioFromOffice(final RequestedFederationScenario fedScenario) {
		final Office tempof = (Office)fedScenario.eContainer();
		
		if (fedScenario.getInfrastructureRequest() !=null){
			return;//it is already loaded
		}
		
		//System.out.println("Container = "+fedScenario.eContainer());
		//PanlabServices.getInstance().LoadFSbyVCT(fedScenario);
		//ask now all plugins if they can load it
		IConfigurationElement[] config = Platform.getExtensionRegistry()
		.getConfigurationElementsFor(IOFFICEREPOSITORY_ID);
			try {
				for (IConfigurationElement e : config) {
					System.out.println("Evaluating extension "+IOFFICEREPOSITORY_ID);
					final Object o = e.createExecutableExtension("class");
					if (o instanceof IOfficeRepository) {
						ISafeRunnable runnable = new ISafeRunnable() {
							@Override
							public void handleException(Throwable exception) {
								System.out.println("Exception in client");
							}
			
							@Override
							public void run() throws Exception {		
								
								
								List<Office> offices = ((IOfficeRepository) o).getOffices( );
								for (Iterator iterator = offices.iterator(); iterator
										.hasNext();) {
									Office office = (Office) iterator.next();
									if (office!=null)
										if (office.getName().equalsIgnoreCase( tempof.getName() ) ) //don;t compare objects..they may not be the same. for example the office can be an officeProxy and the other one an OfficeImpl
											((IOfficeRepository) o).LoadScenario(fedScenario);
								}
								
								
							}
						};
						SafeRunner.run(runnable);
					}
				}
			} catch (CoreException ex) {
				System.out.println(ex.getMessage());
			}		
	}
	
	
	
	
	
	
	
	
	
	
	
}
