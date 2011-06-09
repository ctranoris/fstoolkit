package org.panlab.software.fstoolkit.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.panlab.software.fstoolkit.views.FSDLView.RunningScenariosView;

public class RefreshRunningScenarioCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
				
		IViewPart view_part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(RunningScenariosView.ID);
		if (view_part!=null){
			(  (RunningScenariosView)view_part).startUpdateTree(null);
		}
		return null;
	}

}
