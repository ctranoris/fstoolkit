package org.panlab.software.fsdl.ui.wizard;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;

import com.google.inject.Inject;

public class FSDLNewProjectWizard extends XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	@Inject
	public FSDLNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New FSDL Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("FSDL Project");
		mainPage.setDescription("Create a new FSDL project.");
		addPage(mainPage);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		org.panlab.software.fsdl.ui.wizard.FSDLProjectInfo projectInfo = new org.panlab.software.fsdl.ui.wizard.FSDLProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
