package jun02;

import java.util.LinkedList;

public class DFSGraph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency Lists

    // Constructor
    @SuppressWarnings("unchecked")
    public DFSGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    // Function to add an edge into the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // A function used by DFS
    private void DFSUtil(int v, boolean[] visited) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int n : adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    public void DFS(int v) {
        // Mark all the vertices as not visited (set as false by default in Java)
        boolean[] visited = new boolean[V];

        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
        System.out.println();
    }

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal " +
                           "(starting from vertex 2):");

        g.DFS(2);
    }
}
