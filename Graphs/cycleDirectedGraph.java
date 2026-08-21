import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class cycleDirectedGraph {
    public static boolean isCyclic(int V, int[][] edges) {

         List<List<Integer>> list = new ArrayList<>();

         for(int i = 0; i < V; i++) {
             list.add(new ArrayList<>());
         }

         int[] indegree = new int[V];

         for(int i = 0; i < edges.length; i++) {

             int u = edges[i][0];
             int v = edges[i][1];

             list.get(u).add(v);
             indegree[v]++;
         }

         Queue<Integer> q = new LinkedList<>();

         for(int i = 0; i < V; i++) {
             if(indegree[i] == 0) {
                 q.add(i);
             }
         }

         int count = 0;

         while(!q.isEmpty()) {

             int node = q.remove();
             count++;

             for(int ele : list.get(node)) {

                 indegree[ele]--;

                 if(indegree[ele] == 0) {
                     q.add(ele);
                 }
             }
         }

         return count != V;
    }

    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {{0,1},{1,2},{2,3},{3,1}};

        boolean result = isCyclic(V, edges);
        System.out.println(result);
    }
}
