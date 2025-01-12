package io.samcs.graphProblems;

public class DetectCycle {

	public static boolean detectCycle(Graph g) {
		boolean[] visited = new boolean[g.vertices];
		boolean[] recNodeStack = new boolean[g.vertices];
		for (int node = 0; node < g.vertices; node++) {
			if (detectCycleRec(g, node, visited, recNodeStack)) {
				return true;
			}
		}
		return false;
	}

	public static boolean detectCycleRec(Graph g, int node, boolean[] visited, boolean[] recNodeStack) {
		if (recNodeStack[node]) {
			return true;
		}
		if (visited[node]) {
			return false;
		}
		visited[node] = true;
		recNodeStack[node] = true;
		EduLinkedList<Integer>.Node headNode = g.adjacencyList[node].headNode;
		while (headNode != null) {
			int adjacent = headNode.data;
			if (detectCycleRec(g, adjacent, visited, recNodeStack)) {
				return true;
			}
			headNode = headNode.nextNode;
		}
		recNodeStack[node] = false;
		return false;
	}
}
