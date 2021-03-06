package org.panlab.software.fsdl.ui.wizard;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.wizard.AbstractPluginProjectCreator;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class FSDLProjectCreator extends AbstractPluginProjectCreator {

	protected static final String DSL_GENERATOR_PROJECT_NAME = "org.panlab.software.fsdl.generator";

	protected static final String SRC_ROOT = "scenarios";
//	protected static final String SRC_GEN_ROOT = "src-gen";
	protected final List<String> SRC_FOLDER_LIST = ImmutableList.of(SRC_ROOT);//, SRC_GEN_ROOT);

	@Override
	protected FSDLProjectInfo getProjectInfo() {
		return (FSDLProjectInfo) super.getProjectInfo();
	}
	
	protected String getModelFolderName() {
		return SRC_ROOT;
	}
	
	@Override
	protected List<String> getAllFolders() {
        return SRC_FOLDER_LIST;
    }
	
	@Override
	protected String[] getProjectNatures() {
		//String[] s = super.getProjectNatures();
		
//		return new String[] {
//	        	"org.eclipse.jdt.core.javanature",
//				"org.eclipse.pde.PluginNature",
//				"org.eclipse.xtext.ui.shared.xtextNature",
//				"org.panlab.software.fsdl.ui.idNature"
//			};
		
		return super.getProjectNatures();
	}
	
	
	@Override
	protected List<String> getImportedPackages() {
		return super.getImportedPackages();
		//return Lists.newArrayList();
	}

    @Override
	protected List<String> getRequiredBundles() {
		List<String> result = Lists.newArrayList(super.getRequiredBundles());
		//result.add(DSL_GENERATOR_PROJECT_NAME);
		return result;
		//return Lists.newArrayList();
	}

	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("Cp1253");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("org::panlab::software::fsdl::ui::wizard::FSDLNewProject::main", getProjectInfo());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

}