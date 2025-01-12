package io.samcs.graphProblems;

import java.util.ArrayList;
import java.util.List;

public class DFS {

	public static List<Integer> dfsTraversal(Graph graph, int source) {
		List<Integer> result = new ArrayList<>();
		int numVertices = graph.vertices;
		boolean[] visited = new boolean[numVertices];
		Stack<Integer> stack = new Stack<>(numVertices);

		stack.push(source);
		visited[source] = true;

		// Perform BFS
		while (!stack.isEmpty()) {
			// Dequeue a vertex from the queue and add it to the result
			int currentVertex = stack.pop();
			result.add(currentVertex);

			// Enqueue all neighbors of the dequeued vertex
			EduLinkedList<Integer>.Node temp = graph.adjacencyList[currentVertex].headNode;
			while (temp != null) {
				if (!visited[temp.data]) {
					stack.push(temp.data);
					visited[temp.data] = true;
				}
				temp = temp.nextNode;
			}
		}
		return result;
	}
}
