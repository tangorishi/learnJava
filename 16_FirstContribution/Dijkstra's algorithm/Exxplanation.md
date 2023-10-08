## **Current Example**

# Dijkstra's Algorithm

## Overview

Dijkstra's algorithm is a graph search algorithm that finds the shortest path between a designated starting node (or source) and all other nodes in a weighted graph. It operates in a greedy manner, continually selecting the node with the smallest tentative distance from the source and expanding outward.

## Key Steps

1. **Initialization**: Initialize an array to store the distances from the source to all other nodes. Initially, set the distance to the source as 0 and all other distances as infinity.

2. **Selection**: Repeatedly select the unvisited node with the smallest distance from the source. Initially, this will be the source node itself.

3. **Relaxation**: For the selected node, consider all of its unvisited neighbors. Calculate their tentative distances through the current node and update their distances if a shorter path is found.

4. **Marking Visited**: Once all neighbors have been considered, mark the selected node as visited to ensure it is not selected again.

5. **Termination**: Repeat steps 2 to 4 until all nodes have been visited or the destination node (if specified) has been reached.

## Output

Dijkstra's algorithm provides the shortest distance from the source to every other node in the graph and, if needed, the shortest path itself.

## Key Properties

- Dijkstra's algorithm works for graphs with non-negative edge weights.
- It may not find the correct solution for graphs with negative edge weights or cycles.
- It guarantees the shortest path when all edge weights are non-negative.

## Applications

- Routing algorithms in computer networks and GPS navigation systems.
- Shortest path problems in transportation and logistics.
- Network topology analysis.
- Robot path planning.

## Complexity

- Time Complexity: O(V^2) for the straightforward implementation with an adjacency matrix, or O((V + E) log V) using a priority queue (e.g., min-heap).
- Space Complexity: O(V) for storing distances and visited nodes.
