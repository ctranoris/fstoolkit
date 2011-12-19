package org.panlab.software.fstoolkit;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.panlab.software.fstoolkit.views.FSDLView.ScenariosView;

public class FSDefinitionPerspectiveFactory implements IPerspectiveFactory {

//	private IPageLayout factory;
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
//		this.factory = layout;

		layout.setEditorAreaVisible(true);
		layout.setFixed(false);
		
		IFolderLayout left = layout.createFolder(
				"FSDefinition.left", IPageLayout.LEFT, 0.20f, layout.getEditorArea()); //$NON-NLS-1$
		//left.addView("org.panlab.tide.app.VTProjectsView");
		left.addView(IPageLayout.ID_PROJECT_EXPLORER );
		
		IFolderLayout middleLeft = layout.createFolder(
				"FSDefinition.middleLeft", IPageLayout.BOTTOM , 0.30f, "FSDefinition.left"); //$NON-NLS-1$	//$NON-NLS-2$
		middleLeft.addView("org.panlab.software.fstoolkit.views.OfferedServicesView");
		middleLeft.addView("org.panlab.software.fstoolkit.views.OfferedResourcesView");
		
		IFolderLayout bottomLeft = layout.createFolder(
				"FSDefinition.bottomLeft", IPageLayout.BOTTOM , 0.50f, "FSDefinition.middleLeft"); //$NON-NLS-1$	//$NON-NLS-2$
		bottomLeft.addView(ScenariosView.ID );		
		

//		IFolderLayout bottomright = layout.createFolder(
//				"bottomright", IPageLayout.BOTTOM, 0.60f,  "right"); //$NON-NLS-1$
		IFolderLayout right = layout.createFolder(
					"FSDefinition.right", IPageLayout.RIGHT, 0.75f, layout.getEditorArea()); //$NON-NLS-1$
		right.addView(IPageLayout.ID_OUTLINE);
		

		IFolderLayout bottom = layout.createFolder(
		"FSDefinition.bottom", IPageLayout.BOTTOM, 0.75f, layout.getEditorArea()); //$NON-NLS-1$
		bottom.addView(IPageLayout.ID_PROP_SHEET);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW );
		bottom.addView(IPageLayout.ID_PROGRESS_VIEW );
		bottom.addView("org.eclipse.pde.runtime.LogView" );
		//bottom.addView("org.panlab.tide.app.RTResourcesView" );
		
	}
	
	

}
