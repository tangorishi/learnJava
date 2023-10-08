
/**
 * This class implements Dijkstra's algorithm to find the shortest path from a source node to all other nodes in a graph.
 * The graph is represented as a 2D array of integers, where -1 represents no edge between two nodes.
 * The class contains methods to find the minimum distance from the source node to a given node, print the shortest distances from the source node to all other nodes,
 * and run the Dijkstra's algorithm on the graph to find the shortest distances.
 */
import java.util.*;

public class Dijkstra {
    static final int totalVertices = 9;

    /**
     * Find the vertex with the minimum distance value from the set of vertices not yet included
     * in the shortest path tree.
     *
     * @param distances       An array of distances from the source node to all other nodes.
     * @param shortestPathSet An array to track whether a node is included in the shortest path.
     * @return The index of the vertex with the minimum distance.
     */
    int findMinimumDistance(int distances[], Boolean shortestPathSet[]) {
        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        // Loop through all vertices to find the one with the minimum distance.
        for (int vertex = 0; vertex < totalVertices; vertex++) {
            // Check if the vertex is not yet included in the shortest path set
            // and its distance is less than or equal to the current minimum distance.
            if (!shortestPathSet[vertex] && distances[vertex] <= minDistance) {
                minDistance = distances[vertex];
                minIndex = vertex;
            }
        }
        return minIndex;
    }

    /**
     * Print the shortest distances from the source node to all other nodes.
     *
     * @param distances An array of distances from the source node to all other nodes.
     * @param n         The total number of nodes.
     */
    void printShortestDistances(int distances[], int n) {
        System.out.println("The shortest distances from source node 0 to all other nodes are: ");
        for (int node = 0; node < n; node++)
            System.out.println("To Node " + node + ", the shortest distance is: " + distances[node]);
    }

    /**
     * Compute the shortest paths from a source node to all other nodes in the given graph
     * using Dijkstra's algorithm.
     *
     * @param graph      The adjacency matrix representing the graph.
     * @param sourceNode The source node from which to find the shortest paths.
     */
    void dijkstra(int graph[][], int sourceNode) {
        int distances[] = new int[totalVertices];
        Boolean shortestPathSet[] = new Boolean[totalVertices];

        // Initialize distances and shortestPathSet arrays.
        for (int node = 0; node < totalVertices; node++) {
            distances[node] = Integer.MAX_VALUE;
            shortestPathSet[node] = false;
        }

        distances[sourceNode] = 0;  // Distance from source to itself is always 0.

        // Find the shortest paths for all vertices.
        for (int count = 0; count < totalVertices - 1; count++) {
            int u = findMinimumDistance(distances, shortestPathSet);
            shortestPathSet[u] = true;

            // Update distances for adjacent vertices if a shorter path is found.
            for (int v = 0; v < totalVertices; v++) {
                if (!shortestPathSet[v] && graph[u][v] != -1 && distances[u] != Integer.MAX_VALUE
                        && distances[u] + graph[u][v] < distances[v]) {
                    distances[v] = distances[u] + graph[u][v];
                }
            }
        }

        // Print the shortest distances to all nodes.
        printShortestDistances(distances, totalVertices);
    }
}
