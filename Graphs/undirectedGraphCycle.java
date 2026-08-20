import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class undirectedGraphCycle {
    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static boolean isCycle(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (bfs(i, adj, vis)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean bfs(int start, ArrayList<ArrayList<Integer>> adj,
            boolean[] vis) {

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(start, -1));
        vis[start] = true;

        while (!q.isEmpty()) {

            Pair p = q.remove();

            int node = p.node;
            int parent = p.parent;

            for (int neighbor : adj.get(node)) {

                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(new Pair(neighbor, node));
                } else if (neighbor != parent) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 0 }, { 3, 4 } };

        boolean hasCycle = isCycle(V, edges);
        System.out.println("Graph contains a cycle: " + hasCycle);
    }
}
