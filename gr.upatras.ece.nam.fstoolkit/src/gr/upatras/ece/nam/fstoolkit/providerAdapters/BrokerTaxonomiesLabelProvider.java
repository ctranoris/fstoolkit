package gr.upatras.ece.nam.fstoolkit.providerAdapters;

import java.text.MessageFormat;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import brokermodel.Broker;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.providersite.Site;
import brokermodel.resources.Resource;
import brokermodel.resources.ResourceCategory;
import brokermodel.services.Service;
import brokermodel.services.Taxonomy;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;
import brokermodel.users.ResourcesProvider;

public class BrokerTaxonomiesLabelProvider extends StyledCellLabelProvider implements ILabelProvider   {

	//see jface snippets http://wiki.eclipse.org/JFaceSnippets
	
//	public String getText(Object obj) {
//		return obj.toString()+" <b>1234</b>";
//	}
//	
//	
//	public Image getImage(Object obj) {
//		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
//		if (obj instanceof TreeParent)
//		   imageKey = ISharedImages.IMG_OBJ_FOLDER;
//		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
//	}

	//private static int IMAGE_SIZE= 16;
	private static final Image OFFICE_IMG= AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.broker.model.edit",  
	"icons/full/obj16/Broker.gif").createImage();
	private static final Image TAXONOMY_IMG= AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.broker.model.edit",  
	"icons/full/obj16/Taxonomy.gif").createImage();
	private static final Image SERVICES_IMG= AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.broker.model.edit",  
	"icons/full/obj16/OfferedService.gif").createImage();
//	private static final Image SERVICECATEGORY_IMG= AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.broker.model.edit",  
//	"icons/full/obj16/ServiceCategory.gif").createImage();
	private static final Image RESOURCECATEGORY_IMG= AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.broker.model.edit",  
	"icons/full/obj16/ResourceCategory.gif").createImage();
	private static final Image RESOURCES_IMG= AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.broker.model.edit",  
	"icons/full/obj16/OfferedResource.gif").createImage();
	private static final Image RequestedFederationScenario_IMG= AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.broker.model.edit",  
	"icons/full/obj16/RequestedFederationScenario.gif").createImage();
//	private static final Image RUNNINGSCENARIO_IMG= AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.broker.model.edit",  
//	"icons/full/obj16/RunningScenario.gif").createImage();
	private static final Image RESOURCEREQUEST_IMG= AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.broker.model.edit",  
	"icons/full/obj16/ResourceRequest.gif").createImage();
	
	

//	private static final Image SERVICES_IMG= PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
//	private static final Image IMAGE2= new Image(DISPLAY, DISPLAY.getSystemImage(SWT.ICON_ERROR).getImageData().scaledTo(IMAGE_SIZE, IMAGE_SIZE));

	private final Styler fBoldStyler; 
	
	public  BrokerTaxonomiesLabelProvider(final Font boldFont) {
		fBoldStyler= new Styler() {
			@Override
			public void applyStyles(TextStyle textStyle) {
				textStyle.font= boldFont;
			}
		};
	}
	
	public void update(ViewerCell cell) {
		Object element= cell.getElement();
		
		if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof Broker) ) {
			Broker file= (Broker) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= file.getOfferedServices().size()>0  ? fBoldStyler: null;
			StyledString styledString= new StyledString(file.getName(), style);
			String decoration = " (broker)";
			styledString.append(decoration, StyledString.COUNTER_STYLER);
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(OFFICE_IMG);
		}
		else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof Taxonomy) ) {
			Taxonomy taxonomy= (Taxonomy) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= (taxonomy.getHasServices().size()>0 || 
					taxonomy.getHasScenarios().size()>0 || 
					taxonomy.getTaxonomies().size()>0)  ? fBoldStyler: null;
			StyledString styledString= new StyledString(taxonomy.getName(), style);
			//String decoration = " (Taxonomy)";
			String decoration = MessageFormat.format(" (taxonomy:{0})", new Object[] { new Long( ((ui_TaxonomyTreeItem)element).getChildNodes().size() ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.COUNTER_STYLER);
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(TAXONOMY_IMG);
		}
		else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof ResourceCategory) ) {
			ResourceCategory serviceCategory= (ResourceCategory) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= serviceCategory.getResourcelist().size()>0  ? fBoldStyler: null;
			StyledString styledString= new StyledString(serviceCategory.getName(), style);
			String decoration = MessageFormat.format(" (resources:{0})", new Object[] { new Long( serviceCategory.getResourcelist().size() ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.COUNTER_STYLER);
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(RESOURCECATEGORY_IMG);
			
		}else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof Service) ) {
			Service service= (Service) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= StyledString.COUNTER_STYLER;
			StyledString styledString= new StyledString(service.getName(), style);
			String decoration = MessageFormat.format(" (service)", new Object[] { new Long( 1 ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.DECORATIONS_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(SERVICES_IMG);
			
			
		}else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof Resource) ) {
			Resource service= (Resource) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= StyledString.COUNTER_STYLER;
			StyledString styledString= new StyledString(service.getName(), style);
			String decoration = MessageFormat.format(" (resource)", new Object[] { new Long( 1 ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.DECORATIONS_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(RESOURCES_IMG);
			
			
		}else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof RequestedFederationScenario) ) {
			RequestedFederationScenario reqFedScenario= (RequestedFederationScenario) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= StyledString.COUNTER_STYLER;
			StyledString styledString= new StyledString(reqFedScenario.getName(), style);
			String decoration = MessageFormat.format(" (scenario)", new Object[] { new Long( 1 ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.DECORATIONS_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(RequestedFederationScenario_IMG);			
			
		}
//		else if ( (element instanceof ui_TaxonomyTreeItem) 
//				&& (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof RunningScenario) ) {
//			RunningScenario reqRunningScenario= (RunningScenario) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
//			
//			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
//			// With JFace 3.4, the font information (bold in this example) will be ignored.
//			Styler style= StyledString.COUNTER_STYLER;
//			StyledString styledString= new StyledString(reqRunningScenario.getRequestedScenario().getName(), style);
//			String decoration = MessageFormat.format(" (::"+ reqRunningScenario.getRequestedScenario().getStatus() +")", new Object[] { new Long( 1 ) }); //$NON-NLS-1$
//			styledString.append(decoration, StyledString.DECORATIONS_STYLER );
//			
//			cell.setText(styledString.toString());
//			cell.setStyleRanges(styledString.getStyleRanges());
//			cell.setImage(RUNNINGSCENARIO_IMG);
//		}
		else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof ResourceRequest) ) {
			ResourceRequest resRequest= (ResourceRequest) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= StyledString.COUNTER_STYLER;
			StyledString styledString= new StyledString(resRequest.getName(), style);
			String decoration = MessageFormat.format(" (::"+ resRequest.getId()  +")", new Object[] { new Long( 1 ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.DECORATIONS_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(RESOURCEREQUEST_IMG);
			
			
		}else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof ResourcesProvider) ) {
			ResourcesProvider rp= (ResourcesProvider) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= StyledString.COUNTER_STYLER;
			StyledString styledString= new StyledString(rp.getName(), style);
			String decoration = MessageFormat.format(" (::"+ rp.getOfferedSiteList().size()  +")", new Object[] { new Long( 1 ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.DECORATIONS_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(RESOURCEREQUEST_IMG);
			
			
		}else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof Site) ) {
			Site s= (Site) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= StyledString.COUNTER_STYLER;
			StyledString styledString= new StyledString(s.getName(), style);
			String decoration = MessageFormat.format(" (::"+ s.getOfferedResourcesList().size()   +")", new Object[] { new Long( 1 ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.DECORATIONS_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(RESOURCEREQUEST_IMG);
			
			
		}else if (element instanceof ui_TaxonomyTreeItem){
			
			Styler style= ( ((ui_TaxonomyTreeItem)element).getChildNodes().size() )>0  ? fBoldStyler: null;
			StyledString styledString= new StyledString( ((ui_TaxonomyTreeItem)element).getDisplayName() , style);
			String decoration = MessageFormat.format(" (element)", new Object[] { new Long( ((ui_TaxonomyTreeItem)element).getChildNodes().size() ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.COUNTER_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(TAXONOMY_IMG);
			
			
		}else {
			cell.setText("Unknown element"); //$NON-NLS-1$
		}

		super.update(cell);
	}
	
	protected void measure(Event event, Object element) {
		super.measure(event, element);
	}

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(Object element) {
		ui_TaxonomyTreeItem item = (ui_TaxonomyTreeItem)element;
		if (item.getBrokerElement()!=null)
			return item.getBrokerElement().getName();
		else 
			return item.getDisplayName();
	}


}
