package io.samcs.graphProblems;

import java.util.ArrayList;
import java.util.List;

public class BFS {

	public static List<Integer> bfsTraversal(Graph graph, int source) {

		List<Integer> result = new ArrayList<>();
		int numVertices = graph.vertices;
		boolean[] visited = new boolean[numVertices];
		Queue<Integer> queue = new Queue<>(numVertices);

		// Enqueue the source vertex and mark it as visited
		queue.enqueue(source);
		visited[source] = true;

		// Perform BFS
		while (!queue.isEmpty()) {
			// Dequeue a vertex from the queue and add it to the result
			int currentVertex = queue.dequeue();
			result.add(currentVertex);

			// Enqueue all neighbors of the dequeued vertex
			EduLinkedList<Integer>.Node temp = graph.adjacencyList[currentVertex].headNode;
			while (temp != null) {
				if (!visited[temp.data]) {
					queue.enqueue(temp.data);
					visited[temp.data] = true;
				}
				temp = temp.nextNode;
			}
		}
		return result;
	}
}
