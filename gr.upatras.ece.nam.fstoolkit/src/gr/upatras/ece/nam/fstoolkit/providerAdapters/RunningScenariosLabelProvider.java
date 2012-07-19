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
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import brokermodel.Broker;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceGroup;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;

public class RunningScenariosLabelProvider extends StyledCellLabelProvider implements ILabelProvider   {

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

//	private static int IMAGE_SIZE= 16;
	private static final Image IMAGE1= PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
	private static final Image IMAGE2= AbstractUIPlugin.imageDescriptorFromPlugin( "org.panlab.software.office.model.edit",  
	"icons/full/obj16/RunningScenario.gif").createImage();
	private static final Image IMAGEResource= AbstractUIPlugin.imageDescriptorFromPlugin( "org.panlab.software.office.model.edit",  
	"icons/full/obj16/ResourceRequest.gif").createImage();
	private static final Image IMAGEResourceGroup= AbstractUIPlugin.imageDescriptorFromPlugin( "org.panlab.software.office.model.edit",  
	"icons/full/obj16/ResourceGroup.gif").createImage();

	private final Styler fBoldStyler; 
	
	public  RunningScenariosLabelProvider(final Font boldFont) {
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
			String decoration = " (Taxonomy)";
			styledString.append(decoration, StyledString.COUNTER_STYLER);
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(IMAGE1);
		}else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof RequestedFederationScenario) ) {
			RequestedFederationScenario reqFedScenario= (RequestedFederationScenario) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			Styler style= StyledString.COUNTER_STYLER;
			StyledString styledString= new StyledString(reqFedScenario.getName(), style);
			String decoration = MessageFormat.format(" ("+ reqFedScenario.getStatus() +")", new Object[] { new Long( 1 ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.DECORATIONS_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(IMAGE2);
			
			
		}else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof ResourceRequest) ) {
			ResourceRequest resRequest= (ResourceRequest) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= StyledString.COUNTER_STYLER;
			StyledString styledString= new StyledString(resRequest.getName(), style);
			String decoration = MessageFormat.format(" (-)", new Object[] { new Long( 1 ) }); //$NON-NLS-1$
			if (resRequest.getRuntimeInfo()!=null){
				decoration = MessageFormat.format(" ("+ resRequest.getRuntimeInfo().getStatus().getName() +")", new Object[] { new Long( 1 ) }); //$NON-NLS-1$
				
			}
			styledString.append(decoration, StyledString.DECORATIONS_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(IMAGEResource);
			
			
		}else if ( (element instanceof ui_TaxonomyTreeItem) && (   ((ui_TaxonomyTreeItem)element).getBrokerElement() instanceof ResourceGroup) ) {
			ResourceGroup resGroup= (ResourceGroup) ((ui_TaxonomyTreeItem)element).getBrokerElement() ;
			
			// Multi-font support only works in JFace 3.5 and above (specifically, 3.5 M4 and above).
			// With JFace 3.4, the font information (bold in this example) will be ignored.
			Styler style= StyledString.COUNTER_STYLER;
			StyledString styledString= new StyledString(resGroup.getName(), style);
			String decoration = MessageFormat.format(" (group, {0} items)", new Object[] { new Long( resGroup.getGroupedResources().size() ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.DECORATIONS_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(IMAGEResourceGroup); 
			
			
		}else if (element instanceof ui_TaxonomyTreeItem){
			
			Styler style= ( ((ui_TaxonomyTreeItem)element).getChildNodes().size() )>0  ? fBoldStyler: null;
			StyledString styledString= new StyledString( ((ui_TaxonomyTreeItem)element).getDisplayName() , style);
			String decoration = MessageFormat.format(" ({0})", new Object[] { new Long( ((ui_TaxonomyTreeItem)element).getChildNodes().size() ) }); //$NON-NLS-1$
			styledString.append(decoration, StyledString.COUNTER_STYLER );
			
			cell.setText(styledString.toString());
			cell.setStyleRanges(styledString.getStyleRanges());
			cell.setImage(IMAGE1);
			
			
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
