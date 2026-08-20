import java.util.ArrayList;
import java.util.List;

public class countConnectedComponents {
    public static int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        boolean[] vis = new boolean[V];
        int count = 0;
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < V; i++){
            graph.add(new ArrayList<>());
        }

        for(ArrayList<Integer> edge : edges){
            int u = edge.get(0);
            int v = edge.get(1);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        for(int i=0; i<V; i++){
            if(!vis[i]){
                count++;
                dfs(i, vis, graph);
            }
        }
        
        return count;
    }
    
    public static void dfs(int i, boolean[] vis, ArrayList<ArrayList<Integer>> graph){
        vis[i] = true;
        for(int ele : graph.get(i)){
            if(!vis[ele]){
                dfs(ele, vis, graph);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        edges.add(new ArrayList<>(List.of(0, 1)));
        edges.add(new ArrayList<>(List.of(1, 2)));
        edges.add(new ArrayList<>(List.of(3, 4)));

        int connectedComponents = countConnected(V, edges);
        System.out.println("Number of connected components: " + connectedComponents);
    }
}
