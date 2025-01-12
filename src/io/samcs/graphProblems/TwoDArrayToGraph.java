package io.samcs.graphProblems;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayToGraph {

	static class Vertex {
		int id;
		List<Vertex> adjacentVertices;

		public Vertex(int id) {
			this.id = id;
			adjacentVertices = new ArrayList<>();
		}
	}

	static class Graph {
		List<Vertex> vertices;

		public Graph() {
			vertices = new ArrayList<>();
		}

		public void addVertex(Vertex vertex) {
			vertices.add(vertex);
		}

		public void addEdge(Vertex vertex1, Vertex vertex2) {
			vertex1.adjacentVertices.add(vertex2);
			vertex2.adjacentVertices.add(vertex1);
		}

		public void convert2DArrayToGraph(int[][] array) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					Vertex currentVertex = new Vertex(array[i][j]);
					addVertex(currentVertex);

					// Add edges based on your graph representation (e.g., undirected, directed)
					if (i > 0) {
						addEdge(currentVertex, vertices.get(i - 1)); // Connect to previous row
					}
					if (j > 0) {
						addEdge(currentVertex, vertices.get((i - 1) * array[i].length + j - 1)); // Connect to previous column
					}
				}
			}
		}
	}
		public static void main(String[] args) {
			int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
			Graph graph = new Graph();
			graph.convert2DArrayToGraph(array);

			// Perform operations on the graph
			// ...
		}
}
