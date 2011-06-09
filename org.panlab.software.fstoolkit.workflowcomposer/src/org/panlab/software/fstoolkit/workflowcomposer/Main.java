package org.panlab.software.fstoolkit.workflowcomposer;

import FederationOffice.federationscenarios.InfrastructureRequest;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;

public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		RequestedFederationScenario scenario=  FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createRequestedFederationScenario();
		scenario.setName( "testVCT" );
		scenario.setId( 0 );
		scenario.setDescription( "a test one"  );
		InfrastructureRequest infrReq = 
			FederationOffice.federationscenarios.FederationscenariosFactory.eINSTANCE.createInfrastructureRequest();
		scenario.setInfrastructureRequest(infrReq );

		AddResource(infrReq, "Ra");
		AddResource(infrReq, "Rb");
		AddResource(infrReq, "Rc");
		
		PrepareWorkflowGraph u = new PrepareWorkflowGraph();
		u.createWorkflow(scenario);
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
		
		return resourceReq;
	}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Graph<Object> g = new Graph<Object>();
//		Vertex<Object> v0 = new Vertex<Object>("v0");
//		Vertex<Object> v1 = new Vertex<Object>("v1");
//		Vertex<Object> v2 = new Vertex<Object>("v2");
//		Vertex<Object> v3 = new Vertex<Object>("v3");
//		Vertex<Object> v4 = new Vertex<Object>("v4");
//		g.addVertex(v0 );
//		g.addVertex(v1 );
//		g.addVertex(v2 );
//		g.addVertex(v3 );
//		g.addVertex(v4 );
//		g.addEdge(v0, v1, 0);
//		g.addEdge(v1, v2, 0);
//		g.addEdge(v1, v3, 0);
//		g.addEdge(v2, v3, 0);
//		g.addEdge(v3, v4, 0);
//		g.setRootVertex(v0);
//		Edge<Object>[] cycles = g.findCycles();
//		if (cycles.length>0){
//			System.out.println("cycles found!");			
//		}
//		
//		System.out.println(g.toString());
//		DFSVisitor<Object> visitor = new DFSVisitor<Object>() {			
//			@Override
//			public void visit(Graph<Object> g, Vertex<Object> v, Edge<Object> e) {
//				System.out.println("Visit vertex="+v.toString()+", edge="+e.toString());
//				
//			}			
//			@Override
//			public void visit(Graph<Object> g, Vertex<Object> v) {
//				System.out.println("Visit vertex="+v.toString() );				
//			}
//		};
//		g.dfsSpanningTree(v0, visitor);
//
//	}

}
