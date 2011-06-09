package org.panlab.software.fstoolkit.workflowcomposer;

import workflow.*;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceRequest;

public class PrepareWorkflowGraph {
	//first prepare Dependency graph.
	//Then make a topological sort. Q: How can we define parallel actions? 
	
	
	private Graph<Object> workflowGraph ;
	
	
	
	public PrepareWorkflowGraph(){
		workflowGraph = new Graph<Object>();
	}
	
	public  Graph<Object> getworkflowGraph(){
		return workflowGraph;
	}
	
	public boolean createWorkflow(RequestedFederationScenario scenario){
		Workflow workflow = WorkflowFactory.eINSTANCE.createWorkflow();
		//add initial activity
		Vertex<Object> startVertex = AddActivityToWorkflowGraph(workflow , "Start", null);
		Vertex<Object> startFork = AddForkToWorkflowGraph(workflow , "StartFork");
		workflowGraph.addEdge(startVertex, startFork, 0);
		
		//for now just simple/parallel provisioning

		Vertex<Object> endJoin = AddJoinToWorkflowGraph(workflow , "EndJoin");
		//add all 		
		for (ResourceRequest req: scenario.getInfrastructureRequest().getReqOfferedResources()){
			Vertex<Object> v = AddActivityToWorkflowGraph(workflow , "Activity for: "+req.getName(), req);
			workflowGraph.addEdge(startFork, v, 0);
			workflowGraph.addEdge(v, endJoin, 0);
		}
		

		//add end activity
		Vertex<Object> endVertex = AddActivityToWorkflowGraph(workflow , "End", null);
		workflowGraph.addEdge(endJoin, endVertex, 0);
		System.out.println(workflowGraph.toString());
		return true;
	}
	

	public Vertex<Object> AddActivityToWorkflowGraph(Workflow workflow , String activityName, ResourceRequest req){
		Activity activity = WorkflowFactory.eINSTANCE.createActivity(); 
		activity.setName( activityName );
		workflow.getHasActivities().add(activity);
		activity.setResourceRequest(req);
		String vertexname = activityName;
		Vertex<Object> v0 = new Vertex<Object>( vertexname, activity  );
		workflowGraph.addVertex(v0);			
		return v0;
	}
	
	public Vertex<Object> AddForkToWorkflowGraph(Workflow workflow , String forkName){
		Fork fork = WorkflowFactory.eINSTANCE.createFork(); 
		fork.setName( forkName );
		workflow.getHasForks().add(fork); 
		String vertexname = forkName;
		Vertex<Object> v0 = new Vertex<Object>( vertexname, fork  );
		workflowGraph.addVertex(v0);			
		return v0;
	}
	
	public Vertex<Object> AddJoinToWorkflowGraph(Workflow workflow , String joinName){
		Join join = WorkflowFactory.eINSTANCE.createJoin(); 
		join.setName( joinName );
		workflow.getHasJoins().add(join); 
		String vertexname = joinName;
		Vertex<Object> v0 = new Vertex<Object>( vertexname, join  );
		workflowGraph.addVertex(v0);			
		return v0;
	}
	
}
