import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
        }
        
        

        int[] indegree = new int[V];

        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                indegree[v]++;
            }
        }
        

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!q.isEmpty()) {

            int node = q.remove();
            ans.add(node);


            for (int neighbor : adj.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int V = 6;
        int[][] edges = {{5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1}};

        ArrayList<Integer> result = topoSort(V, edges);

        System.out.println("Topological Sort: " + result);
    }
}
