package gr.upatras.ece.nam.fstoolkit.providerAdapters;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;

import brokermodel.uiObjects.ui_TaxonomyTreeItem;

public class RunningScenariosTabbedPropertiesLabelProvider implements ILabelProvider {

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(Object element) {
		Object input = ((IStructuredSelection) element).getFirstElement();		
			
		if ( input instanceof ui_TaxonomyTreeItem){
			String lbl = "" ;
			
			ui_TaxonomyTreeItem item = (ui_TaxonomyTreeItem) input;
			do{
				if (item.getBrokerElement() != null) 
					lbl = item.getBrokerElement().getName()+"."+lbl;
				item = item.getParentNode();
			}while (item!=null);
			
			if ("".equals(lbl))
				return  ((ui_TaxonomyTreeItem) input).getDisplayName() ;
			else
				return lbl.substring(0, lbl.length()-1);
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
