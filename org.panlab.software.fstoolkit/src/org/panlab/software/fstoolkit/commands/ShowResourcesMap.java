package org.panlab.software.fstoolkit.commands;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.handlers.HandlerUtil;

import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.providersite.Site;
import FederationOffice.uiObjects.ui_TaxonomyTreeItem;
import FederationOffice.users.ResourcesProvider;

public class ShowResourcesMap extends AbstractHandler {
	class myMarker {
		Site site;
		String descriptions;
		
		
	}
	
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			
			for (Object obj : strucSelection.toArray()) {
				System.out.println("Object =" + obj.toString()  );
				if (obj instanceof ui_TaxonomyTreeItem){
					if ( (((ui_TaxonomyTreeItem)obj).getOfficeElement() instanceof RequestedFederationScenario)   ){
						//http://nam.ece.upatras.gr/fstoolkit/utils/resourcesmap.php?x[0]=38.288291,21.788884
						String req="";
						RequestedFederationScenario scenario = (RequestedFederationScenario)((ui_TaxonomyTreeItem)obj).getOfficeElement();
						
						ArrayList<myMarker> sitelist = new ArrayList<myMarker>();
						for (ResourceRequest resReq : scenario.getInfrastructureRequest().getReqOfferedResources() ) {
							if (resReq.getRefOfferedResource()!=null){		
								System.out.println("resReq.getRefOfferedResource() = "+ resReq.getRefOfferedResource().getName());
																	
								Site site = (Site)resReq.getRefOfferedResource().eContainer();
								
								if ( (site!=null) && (!sitelist.contains(site) )  ){
									myMarker mymarker = null;
									for (myMarker m : sitelist) {
										if (m.site.equals(site))
											mymarker = m;
									}
									if (mymarker==null){
										mymarker = new myMarker();
										mymarker.site = site;
										mymarker.descriptions = "";
										sitelist.add(mymarker);
									}
									mymarker.descriptions += 
										resReq.getName() +" : <i>"+
										resReq.getRefOfferedResource().getName() +"</i></br>";
								}
							}
						}
						int i=0;
						for (myMarker mymarker : sitelist) {
							if (mymarker.site.getLocatedAt()!=null){
								ResourcesProvider r = (ResourcesProvider)mymarker.site.eContainer();
								req=req+"x["+i+"]="+mymarker.site.getLocatedAt().getGeocoords()+"&";
								req=req+"c["+i+"]=<b>"+r.getName()+"</b><br>"+ 
								"<small>"+mymarker.descriptions +"</small>" +
									"&";
							}
						i++;
						}
						
					
						req = req.substring(0, req.length()-1);
						req= "http://nam.ece.upatras.gr/fstoolkit/utils/resourcesmap.php?"+req;
						System.out.println("req = "+ req);
						
						IWorkbenchBrowserSupport support =  PlatformUI.getWorkbench().getBrowserSupport();
						IWebBrowser browser;
						try {
							
							browser = support. createBrowser(IWorkbenchBrowserSupport.AS_VIEW, 
									((ui_TaxonomyTreeItem)obj).getOfficeElement().getName() +".webbrowser.fstoolkit", 
									"Map for "+((ui_TaxonomyTreeItem)obj).getOfficeElement().getName(), 
									"A world map for "+((ui_TaxonomyTreeItem)obj).getOfficeElement().getName());
									
							
							browser.openURL(new URL(req));
							
						} catch (PartInitException e) {
							e.printStackTrace();
						} catch (MalformedURLException e) {
							e.printStackTrace();
						}

						
					}
				}	
			}
		}
		return null;
	}



}
