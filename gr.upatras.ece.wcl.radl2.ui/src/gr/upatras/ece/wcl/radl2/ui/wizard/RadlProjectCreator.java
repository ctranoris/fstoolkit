package gr.upatras.ece.wcl.radl2.ui.wizard;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtext.ui.wizard.AbstractPluginProjectCreator;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class RadlProjectCreator extends AbstractPluginProjectCreator {

	protected static final String DSL_GENERATOR_PROJECT_NAME = "gr.upatras.ece.wcl.radl.generator;resolution:=optional";

	private static final String DSL_RALIB_PROJECT_NAME = "gr.upatras.ece.wcl.radl.externalLibs;resolution:=optional";
	
	protected static final String SRC_ROOT = "src";
	protected static final String SRC_GEN_ROOT = "src-gen";
	protected final List<String> SRC_FOLDER_LIST = ImmutableList.of(SRC_ROOT, SRC_GEN_ROOT);

	@Override
	protected RadlProjectInfo getProjectInfo() {
		System.out.println("----->> RadlProjectInfo getProjectInfo() = " + super.getProjectInfo().getProjectName());
		return (RadlProjectInfo) super.getProjectInfo();
	}
	
	protected String getModelFolderName() {
		return SRC_ROOT;
	}
	
	@Override
	protected List<String> getAllFolders() {
        return SRC_FOLDER_LIST;
    }

    @Override
	protected List<String> getRequiredBundles() {
//		List<String> result = Lists.newArrayList(super.getRequiredBundles());
//		result.add(DSL_GENERATOR_PROJECT_NAME);
//		return result;
    	return Lists.newArrayList(
//    			"com.ibm.icu",
//    			"org.eclipse.xtext", 
//    			"org.eclipse.xtext.generator",
//    			"org.eclipse.xtend",
//    			"org.eclipse.xtend.typesystem.emf",
//    			"org.eclipse.xpand", 
//    			"de.itemis.xtext.antlr",
//    			"org.eclipse.xtend.util.stdlib",
    			"org.apache.log4j;resolution:=optional", 
            	"org.apache.commons.logging;resolution:=optional",
            	"org.apache.commons.logging;resolution:=optional",
            	"org.eclipse.equinox.common;resolution:=optional",
            	"org.eclipse.jface.text;resolution:=optional",
            	"org.eclipse.jdt.core;resolution:=optional",
            	"gr.upatras.ece.wcl.radl2;resolution:=optional",
    			"org.eclipse.xtext.common.types", 
    			"gr.upatras.ece.nam.broker.model", 
    			DSL_GENERATOR_PROJECT_NAME,
//    			DSL_TIDE_MODEL,
    			DSL_RALIB_PROJECT_NAME
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
         "com.jcraft.jsch",
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


	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("Cp1253");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("gr::upatras::ece::wcl::radl2::ui::wizard::RadlNewProject::main", getProjectInfo(), getProjectInfo().getProjectName());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

}