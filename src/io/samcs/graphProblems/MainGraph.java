package io.samcs.graphProblems;

import java.util.Deque;

public class MainGraph {

	public static void main(String[] args) {
		Graph graph = new Graph(6);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(1,3);
		graph.addEdge(1,5);
		graph.addEdge(2,4);
		graph.addEdge(3,4);
		graph.addEdge(4,5);
//		graph.addEdge(5,2);

		graph.printGraph();
//		System.out.println(BFS.bfsTraversal(graph, 0));
//		System.out.println(DFS.dfsTraversal(graph, 0));
		System.out.println(DetectCycle.detectCycle(graph));
	}


}
