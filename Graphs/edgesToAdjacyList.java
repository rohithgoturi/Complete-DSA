import java.util.ArrayList;
import java.util.List;

public class edgesToAdjacyList {
    public static List<List<Integer>> printGraph(int V, int edges[][]) {
        // code here
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<V; i++){
            List<Integer> arr = new ArrayList<>();
            adj.add(arr);
        }
        
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            
            adj.get(b).add(a);
            adj.get(a).add(b);
        }
        
        return adj;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1},{1,2},{1,3},{2,3},{2,4}};

        List<List<Integer>> adjList = printGraph(V, edges);

        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
