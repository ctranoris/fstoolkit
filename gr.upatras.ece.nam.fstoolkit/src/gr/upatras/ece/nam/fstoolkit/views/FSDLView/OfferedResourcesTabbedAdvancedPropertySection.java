package gr.upatras.ece.nam.fstoolkit.views.FSDLView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import brokermodel.NamedElement;
import brokermodel.uiObjects.ui_TaxonomyTreeItem;


public class OfferedResourcesTabbedAdvancedPropertySection extends AdvancedPropertySection {

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	private OfferedResourcesTabbedPropertySheetPage myPropertySheetPage;
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		myPropertySheetPage = (OfferedResourcesTabbedPropertySheetPage) tabbedPropertySheetPage;
		page.setPropertySourceProvider(new AdapterFactoryContentProvider(
				myPropertySheetPage.getAdapterFactory(   )));
	}
	

    private NamedElement buttonElement;
    
    class mySelClass implements IStructuredSelection{
    	
    	private NamedElement myElem;
    	private List<NamedElement> mylist;

		public mySelClass(NamedElement buttonElement) {
			// TODO Auto-generated constructor stub
			myElem = buttonElement;
			mylist= new ArrayList<NamedElement>();
			mylist.add(myElem);
		}
		
		

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return mylist.size()>0;
		}

		@Override
		public Object getFirstElement() {
			// TODO Auto-generated method stub
			return mylist.get(0);
		}

		@Override
		public Iterator<NamedElement> iterator() {
			// TODO Auto-generated method stub
			return mylist.iterator();
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return mylist.size();
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return mylist.toArray();
		}

		@Override
		public List<NamedElement> toList() {
			// TODO Auto-generated method stub
			return mylist;
		}
    	
    }
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		
		Object input = ((IStructuredSelection) selection).getFirstElement();

        if ( input instanceof NamedElement)
			this.buttonElement = (NamedElement) input;
		if ( input instanceof ui_TaxonomyTreeItem)
			this.buttonElement = ((ui_TaxonomyTreeItem) input).getBrokerElement();

		//wrap here the namedElement as IIStructuredSelection
        mySelClass mysel = new mySelClass(this.buttonElement);
		super.setInput(part, mysel);
        
	}

	
}
