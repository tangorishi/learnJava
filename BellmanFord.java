/**
 * Java implementation of the Bellman-Ford algorithm for finding the shortest paths
 * from a single source vertex to all other vertices in a weighted, directed graph.
 * This implementation can handle graphs with negative edge weights and detect negative
 * weight cycles.
 */

import java.util.Arrays;

// Class to represent an edge in the graph
class Edge {
    int source, destination, weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

public class BellmanFord {
    private int V, E; // Number of vertices and edges
    private Edge[] edges;
    private int[] distances;

    /**
     * Constructor to initialize the Bellman-Ford algorithm with the number of
     * vertices and edges.
     * 
     * @param V Number of vertices
     * @param E Number of edges
     */
    public BellmanFord(int V, int E) {
        this.V = V;
        this.E = E;
        edges = new Edge[E];
        distances = new int[V];
        Arrays.fill(distances, Integer.MAX_VALUE);
    }

    /**
     * Add an edge to the graph.
     * 
     * @param source      Source vertex of the edge
     * @param destination Destination vertex of the edge
     * @param weight      Weight (distance) of the edge
     */
    public void addEdge(int source, int destination, int weight) {
        edges[E++] = new Edge(source, destination, weight);
    }

    /**
     * Calculate the shortest paths from the source vertex using the Bellman-Ford
     * algorithm.
     * 
     * @param source Source vertex for which to find the shortest paths
     */
    public void shortestPath(int source) {
        distances[source] = 0;

        // Relax all edges V-1 times
        for (int i = 1; i < V; i++) {
            for (int j = 0; j < E; j++) {
                int u = edges[j].source;
                int v = edges[j].destination;
                int weight = edges[j].weight;
                if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                }
            }
        }

        // Check for negative weight cycles
        for (int j = 0; j < E; j++) {
            int u = edges[j].source;
            int v = edges[j].destination;
            int weight = edges[j].weight;
            if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                System.out.println("Graph contains a negative weight cycle.");
                return;
            }
        }

        // Print the shortest distances
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + ": Distance = " + distances[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        int E = 8; // Number of edges
        BellmanFord graph = new BellmanFord(V, E);

        // Add the edges to the graph
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, -2);
        graph.addEdge(1, 3, 4);
        graph.addEdge(1, 4, 2);
        graph.addEdge(3, 2, 5);
        graph.addEdge(3, 1, 1);
        graph.addEdge(4, 3, -3);

        int source = 0; // Source vertex

        // Find and print the shortest paths
        graph.shortestPath(source);
    }
}
