package gr.upatras.ece.nam.fstoolkit;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class FSOperationPerspectiveFactory implements IPerspectiveFactory {

//	private IPageLayout factory;
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
//		this.factory = layout;

		layout.setEditorAreaVisible(true);
		layout.setFixed(false);
		
		IFolderLayout left = layout.createFolder(
				"FSOperation.left", IPageLayout.LEFT, 0.20f, layout.getEditorArea()); //$NON-NLS-1$
		//left.addView("org.panlab.tide.app.VTProjectsView");
		left.addView(IPageLayout.ID_PROJECT_EXPLORER );
		

		IFolderLayout right = layout.createFolder(
					"FSOperation.right", IPageLayout.RIGHT, 0.75f, layout.getEditorArea()); //$NON-NLS-1$
		right.addView(IPageLayout.ID_OUTLINE);
		IFolderLayout bottomright = layout.createFolder(
				"bottomright", IPageLayout.BOTTOM, 0.65f,  "FSOperation.right"); //$NON-NLS-1$
		bottomright.addView(IPageLayout.ID_PROGRESS_VIEW );
		

		IFolderLayout bottom = layout.createFolder(
		"FSOperation.bottom", IPageLayout.BOTTOM, 0.65f, layout.getEditorArea()); //$NON-NLS-1$
		bottom.addView(IPageLayout.ID_PROP_SHEET);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW );
		bottom.addView("org.eclipse.pde.runtime.LogView" );
		
		IFolderLayout top = layout.createFolder(
				"FSOperation.top", IPageLayout.TOP  , 0.50f, layout.getEditorArea()); //$NON-NLS-1$	//$NON-NLS-2$
		top.addView("org.panlab.software.fstoolkit.views.RunningScenariosView");		
		layout.setEditorAreaVisible(false);
		//TeagleAuth.getInstance().CheckCredentialsExist();

	}

}
