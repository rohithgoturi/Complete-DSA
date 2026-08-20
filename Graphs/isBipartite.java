import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class isBipartite {
    static boolean ans;
    
    public static boolean isGraphBipartite(int V, int[][] edges) {
        ans = true;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        int[] vis = new int[V];
        Arrays.fill(vis, -1);
        
        for(int i=0; i<V; i++){
            if(vis[i] == -1) bfs(i, adj, vis);
            if(!ans) return false;
        }
        
        return true;
    }
    
    public static void bfs(int i, ArrayList<ArrayList<Integer>> adj, int[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = 0;
        
        while(!q.isEmpty()){
            int front = q.remove();
            int color = vis[front];
            
            for(int ele : adj.get(front)){
                if(vis[ele] == vis[front]){
                    ans = false;
                    return;
                }
                
                if(vis[ele] == -1){
                    vis[ele] = 1 - color;
                    q.add(ele);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1},{1,2},{1,3},{2,3},{2,4}};

        boolean isBipartiteGraph = isGraphBipartite(V, edges);
        System.out.println("The graph is bipartite: " + isBipartiteGraph);
    }
}
