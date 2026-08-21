import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstraAlgorithm {
    static class Pair{
        int node;
        int dist;
        
        Pair(int node, int dist){
            this.node = node;
            this.dist = dist;
        }
    }
    
    public static ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<V; i++) adj.add(new ArrayList<>());
        
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            int wt = edges[i][2];
            
            adj.get(b).add(new Pair(a, wt));
            adj.get(a).add(new Pair(b, wt));
        }
        
        ArrayList<Integer> dist  = new ArrayList<>();
        for(int i=0; i<V; i++){
            dist.add(Integer.MAX_VALUE);
        }
        
        PriorityQueue <Pair> pq = new PriorityQueue<>((a,b) -> a.dist - b.dist);
        
        dist.set(src, 0);
        pq.add(new Pair(src, 0));
        
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            int u = curr.node;
            int d = curr.dist;
            
            if(d>dist.get(u)) continue;
            
            for(Pair ele : adj.get(u)){
                int v = ele.node;
                int wt = ele.dist;
                
                if(dist.get(u) +wt < dist.get(v)){
                    dist.set(v, dist.get(u) + wt);
                    pq.add(new Pair(v, dist.get(v)));
                }
            }
        }
        
        return dist;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1,2},{0,2,4},{1,2,1},{1,3,7},{2,4,3},{3,4,1}};
        int src = 0;

        ArrayList<Integer> result = dijkstra(V, edges, src);
        System.out.println(result);
    }
}
