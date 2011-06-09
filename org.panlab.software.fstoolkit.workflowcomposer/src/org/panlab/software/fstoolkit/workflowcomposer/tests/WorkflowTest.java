/**
 * 
 */
package org.panlab.software.fstoolkit.workflowcomposer.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.panlab.software.fstoolkit.workflowcomposer.PrepareWorkflowGraph;

import FederationOffice.federationscenarios.InfrastructureRequest;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;

/**
 * @author ctranoris
 *
 */
public class WorkflowTest {

	RequestedFederationScenario scenario1;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		scenario1 = CreateScenario("Test Scenario 1");
		AddResource(scenario1.getInfrastructureRequest(), "RA");
		AddResource(scenario1.getInfrastructureRequest(), "RB");
		AddResource(scenario1.getInfrastructureRequest(), "RC");
	}
	
	private RequestedFederationScenario CreateScenario(String val) {
		RequestedFederationScenario scenario=  FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createRequestedFederationScenario();
		scenario.setName( val );
		scenario.setId( 0 );
		scenario.setDescription( val  );
		InfrastructureRequest infrReq = 
			FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createInfrastructureRequest();
		scenario.setInfrastructureRequest(infrReq );
		return scenario;
	}

	public static ResourceRequest AddResource(InfrastructureRequest infrReq , String resourceName){
		ResourceRequest resourceReq = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceRequest();
		resourceReq.setId(0 );
		resourceReq.setName(  resourceName );
		infrReq.getReqOfferedResources().add(resourceReq );
		
		ResourceSettingInstance resInst = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceSettingInstance() ;
		resInst.setName( "settingNameA" );
		resInst.setStaticValue( "myvalA" );
		resourceReq.getReqResourceSettings().add(resInst);
		
		resInst = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceSettingInstance() ;
		resInst.setName( "settingNameB" );
		resInst.setStaticValue( "myvalB" );
		resourceReq.getReqResourceSettings().add(resInst);
		
		resInst = FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createResourceSettingInstance() ;
		resInst.setName( "settingNameC" );
		resInst.setStaticValue( "myvalB" );
		resourceReq.getReqResourceSettings().add(resInst);
		
		return resourceReq;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.panlab.software.fstoolkit.workflowcomposer.PrepareWorkflowGraph#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		//fail("Not yet implemented");
		PrepareWorkflowGraph workflow = new PrepareWorkflowGraph();
		if (workflow == null)
			fail("testGetInstance null");
		
	}

	/**
	 * Test method for {@link org.panlab.software.fstoolkit.workflowcomposer.PrepareWorkflowGraph#createWorkflow(FederationOffice.federationscenarios.RequestedFederationScenario)}.
	 */
	@Test
	public void testCreateWorkflow() {
		PrepareWorkflowGraph workflow = new PrepareWorkflowGraph();
		assertTrue( workflow.createWorkflow(scenario1) );
	}

}
