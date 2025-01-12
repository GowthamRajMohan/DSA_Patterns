package io.samcs.graphProblems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Queue;

public class CheckPath {

	// Function to check a valid path between two vertices
	public static boolean checkPath(int n, int[][] edges, int source, int destination) {
		int[][] adjacency = new int[n][n];
		for (int[] edge : edges) {
			adjacency[edge[0]][edge[1]] = 1;
			adjacency[edge[1]][edge[0]] = 1;
		}

		Set<Integer> visited = new HashSet<>();
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(source);
		visited.add(source);

		while (!queue.isEmpty()) {
			int currentVertex = queue.poll();

			// Check if the dequeued vertex is the destination
			if (currentVertex == destination) {
				return true;
			}

			// Explore neighbors of the current vertex
			for (int i = 0; i < n; i++) {

				// If neighbor has not been visited yet, enqueue it and mark it as visited
				if (adjacency[currentVertex][i] == 1 && !visited.contains(i)) {
					queue.offer(i);
					visited.add(i);
				}
			}
		}

		// Return false if destination vertex is not reached
		return false;
	}

	public static void main(String[] args) {
		int[][] edge = new int[2][2];

		edge[0][0] = 0;
		edge[0][1] = 1;
		edge[1][0] = 1;
		edge[1][1] = 2;

		System.out.println(checkPath(3, edge, 2, 0));
	}

}
