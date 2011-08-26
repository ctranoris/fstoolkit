package gr.upatras.ece.wcl.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.wizard.AbstractPluginProjectCreator;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class RadlProjectCreator extends AbstractPluginProjectCreator {

	private static final String DSL_GENERATOR_PROJECT_NAME = "gr.upatras.ece.wcl.radl.generator;resolution:=optional";
	private static final String DSL_RALIB_PROJECT_NAME = "gr.upatras.ece.wcl.radl.externalLibs;resolution:=optional";
//	private static final String DSL_TIDE_MODEL = "org.panlab.tide.model;resolution:=optional";

	private static final String SRC_ROOT = "src";
	private static final String SRC_GEN_ROOT = "src-gen";
	private final List<String> SRC_FOLDER_LIST = Collections
			.unmodifiableList(Arrays.asList(SRC_ROOT, SRC_GEN_ROOT));

	@Override
	protected RadlProjectInfo getProjectInfo() {
		System.out.println("----->> RadlProjectInfo getProjectInfo() = " + super.getProjectInfo().getProjectName());
		return (RadlProjectInfo) super.getProjectInfo();
	}

//	@Override
//	protected void execute(final IProgressMonitor monitor)
//			throws CoreException, InvocationTargetException, InterruptedException {
//		SubMonitor subMonitor = SubMonitor.convert(monitor, 
//				"Creating Resource Adapter project " + getProjectInfo().getProjectName(), 
//				2);
//		try {
//			final IProject project = createProject(subMonitor.newChild(1));
//			if (project == null)
//				return;
//			initializeProject(project, subMonitor.newChild(1));
//			IFile modelFile = getModelFile(project);
//			setResult(modelFile);
//		} finally {
//			subMonitor.done();
//		}
//	}

//	protected IProject createProject(IProgressMonitor monitor) {
//		final IProject project = EclipseResourceUtil.createProject(
//				getProjectInfo().getProjectName(),
//				getSourceFolders(), 
//				getReferencedProjects(),
//				Sets.newLinkedHashSet(getRequiredBundles()), 
//				getExportedPackages(),
//				getImportedPackages(), 
//				getActivatorClassName(),
//				monitor,
//				null,
//				getProjectNatures()
//		);
//		return project;
//	}
	
	protected List<String> getSourceFolders() {
        return SRC_FOLDER_LIST;
    }

	protected List<IProject> getReferencedProjects() {
        return Collections.<IProject> emptyList();
    }

    protected List<String> getExportedPackages() {
    	return Lists.newArrayList(getProjectInfo().getProjectName());
        //return null;
    }

    protected List<String> getImportedPackages() {
        //return Lists.newArrayList("org.apache.log4j", "org.apache.commons.logging");
        //org.apache.log4j;bundle-version="1.2.15";resolution:=optional
        return Lists.newArrayList(
        		
        		"com.bct.ptm.core.ral",
        		"com.bct.ral.interfaces",
        "com.bct.ral.util",
        "javax.servlet", 
        "com.bct.ral",
        "com.uop.ssh",
        "javax.servlet.http",
//        "javax.wsdl",
//        "javax.wsdl.extensions",
//        "javax.wsdl.factory",
//        "javax.wsdl.xml",
        "javax.xml.namespace",
        "javax.xml.rpc",
        "javax.xml.rpc.handler",
        "javax.xml.rpc.handler.soap",
        "javax.xml.rpc.holders",
        "javax.xml.soap",
        "org.apache.axis",
        "org.apache.axis.client",
        "org.apache.axis.configuration",
        "org.apache.axis.description",
        "org.apache.axis.encoding",
//        "org.apache.axis.enum",
        "org.apache.axis.soap",
        "org.apache.axis.types",
        "org.apache.axis.utils",
        "org.apache.axis.wsdl",
        "org.osgi.framework",
        "org.osgi.service.http"
        );
    }

    protected String getActivatorClassName() {
    	return getProjectInfo().getProjectName()+".RAActivator" ;
        //return null;
    }
    
    protected String[] getProjectNatures() {
        return new String[] {
        	"org.eclipse.jdt.core.javanature",
			"org.eclipse.pde.PluginNature",
			"org.eclipse.xtext.ui.shared.xtextNature"
		};
    }
    
	
	protected String getModelFolderName() {
		return SRC_ROOT;
	}
	
	@Override
	protected List<String> getAllFolders() {
        return SRC_FOLDER_LIST;
    }
    
	protected List<String> getRequiredBundles() {
		return Lists.newArrayList(
//			"com.ibm.icu",
//			"org.eclipse.xtext", 
//			"org.eclipse.xtext.generator",
//			"org.eclipse.xtend",
//			"org.eclipse.xtend.typesystem.emf",
//			"org.eclipse.xpand", 
//			"de.itemis.xtext.antlr",
//			"org.eclipse.xtend.util.stdlib",
			"org.apache.log4j;resolution:=optional", 
        	"org.apache.commons.logging;resolution:=optional",
        	"org.apache.commons.logging;resolution:=optional",
        	"org.eclipse.equinox.common;resolution:=optional",
        	"org.eclipse.jface.text;resolution:=optional",
        	"org.eclipse.jdt.core;resolution:=optional",
			DSL_GENERATOR_PROJECT_NAME,
//			DSL_TIDE_MODEL,
			DSL_RALIB_PROJECT_NAME
			);
	}
	
	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("Cp1253");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("gr::upatras::ece::wcl::ui::wizard::RadlNewProject::main", getProjectInfo(), getProjectInfo().getProjectName());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

//	protected void initializeProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
//		OutputImpl output = new OutputImpl();
//		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));
//
//		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
//		execCtx.setFileEncoding("Cp1253");
//		execCtx.registerMetaModel(new JavaBeansMetaModel());
//
//		XpandFacade facade = XpandFacade.create(execCtx);
//		facade.evaluate("gr::upatras::ece::wcl::ui::wizard::RadlNewProject::main", getProjectInfo(), getProjectInfo().getProjectName());
//
//		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
//	}
//
//	protected IFile getModelFile(IProject project) throws CoreException {
//		IFolder srcFolder = project.getFolder(SRC_ROOT);
//		for (IResource resource : srcFolder.members()) {
//			if (IResource.FILE == resource.getType() && "radl".equals(resource.getFileExtension())) {
//				return (IFile) resource;
//			}
//		}
//		return null;
//	}

}