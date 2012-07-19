package gr.upatras.ece.nam.fstoolkit.views.FSDLView;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

public class RunningResourceView extends ViewPart {

	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	
	@Override
	public void createPartControl(Composite parent) {
		// Just a little bit layout
		//parent.setLayout(new GridLayout(1, false));
		PatternFilter patternFilter = new PatternFilter();
	    final FilteredTree filter = new FilteredTree(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL|
	    		SWT.BORDER | SWT.FULL_SELECTION , patternFilter, true);
	    viewer = filter.getViewer(); 
	    viewer.getTree().setHeaderVisible(true);
	    viewer.getTree().setLinesVisible(true);
	    
		//viewer = new TreeViewer(parent , SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL );
		drillDownAdapter = new DrillDownAdapter(viewer);
		
		getSite().setSelectionProvider(viewer);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
