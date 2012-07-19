package gr.upatras.ece.nam.fstoolkit.providerAdapters;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;

import brokermodel.NamedElement;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;

public class OfferedServicesTabbedPropertiesLabelProvider implements ILabelProvider {

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(Object element) {
		Object input = ((IStructuredSelection) element).getFirstElement();
		
		if ( input instanceof ui_TaxonomyTreeItem){
			ui_TaxonomyTreeItem item = (ui_TaxonomyTreeItem) input;
			
			if  (((ui_TaxonomyTreeItem) input).getBrokerElement() != null) {
				String lbl = item.getBrokerElement().getName();
				
				if ( item.getBrokerElement().eContainer() != null) {
					if (item.getBrokerElement().eContainer() instanceof NamedElement)
						lbl = ((NamedElement)item.getBrokerElement().eContainer()).getName() + ": " + lbl;
				}
				return  lbl;
				
			}else
				return  ((ui_TaxonomyTreeItem) input).getDisplayName() ;
			
		}
		return "---";
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}
