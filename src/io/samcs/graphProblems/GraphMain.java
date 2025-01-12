package io.samcs.graphProblems;

public class GraphMain {

	public static void main(String[] args) {
		int[] graph_vertices = {10, 6, 4, 7, 5, 4, 6};
		int[][][][] graph_edges = {
				{{{}, {8,2}, {0,6,3,9,7}, {6,7,9,5,8}, {8,6,5}, {7,0,6}, {7,9}, {9}, {7,9}, {0}}},
				{{{1}, {2,3}, {0}, {4}, {5}, {2}}},
				{{{2,3}, {3,2,1}, {3,0,2},{2,1}}},
				{{{1, 2, 3}, {2, 4, 5}, {3, 6}}},
				{{{0, 1, 2}, {2, 0, 3, 4}}},
				{{{0, 1, 2}, {2, 0, 3}}},
				{{{0, 1, 4}, {1, 2, 5}, {4, 3}, {3, 2}}}
		};
		int[] sources = {2, 0, 0};

		for (int i = 0; i < graph_vertices.length; i++) {
			Graph graph = new Graph(graph_vertices[i]);
			for (int j = 0; j < graph_edges[i][0].length; j++) {
				int source = graph_edges[i][0][j][0];
				for (int k = 1; k < graph_edges[i][0][j].length; k++) {
					int destination = graph_edges[i][0][j][k];
					graph.addEdge(source, destination);
				}
			}
			System.out.println((i + 1) + ".\t>>Adjacency List of the Graph<<\n");
			graph.printGraph();
//			System.out.println("\n\tBFS Traversal starting from vertex " + sources[i] + ": " + BFS.bfsTraversal(graph, sources[i]));
			System.out.println(new String(new char[100]).replace('\0', '-'));
		}
	}
}
