import java.util.*;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list

    // Constructor
    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge to the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Recursive DFS function starting from vertex v
    private void DFSUtil(int v, boolean[] visited) {
        // Mark the current vertex as visited
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the adjacent vertices
        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // DFS traversal starting from vertex v
    public void DFS(int v) {
        // Mark all vertices as not visited
        boolean[] visited = new boolean[V];

        // Call the recursive helper function to perform DFS
        DFSUtil(v, visited);
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph g = new Graph(7);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);

        System.out.println("Depth-First Traversal (starting from vertex 0): ");
        g.DFS(0);
    }
}
/* The Java program defines a simple directed graph and performs a Depth-First Search (DFS) traversal starting from a specified vertex. The `Graph` class includes a constructor to initialize the number of vertices and an adjacency list to represent the graph. It also contains methods to add edges between vertices and conduct DFS traversal.

In the `DFSUtil` method, a recursive helper function for DFS, the program marks each visited vertex and prints its value. It then recursively explores all adjacent vertices that have not been visited. The `DFS` method initializes an array to keep track of visited vertices and calls the `DFSUtil` function to initiate the DFS traversal.

The `main` function creates an instance of the `Graph` class with seven vertices and adds directed edges between them. Finally, it prints the result of the DFS traversal starting from vertex 0. The output displays the order in which vertices are visited during the DFS traversal, providing insights into the connectivity of the graph.*/
