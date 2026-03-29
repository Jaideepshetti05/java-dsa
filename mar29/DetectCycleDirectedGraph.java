import java.util.*;

public class DetectCycleDirectedGraph {
    static boolean dfs(int node, boolean[] visited, boolean[] recStack, List<List<Integer>> graph) {
        visited[node] = true;
        recStack[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor] && dfs(neighbor, visited, recStack, graph)) return true;
            else if (recStack[neighbor]) return true;
        }

        recStack[node] = false;
        return false;
    }

    public static boolean hasCycle(int V, List<List<Integer>> graph) {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i] && dfs(i, visited, recStack, graph)) return true;
        }
        return false;
    }
}