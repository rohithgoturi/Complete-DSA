import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class dijkstra {
    public static ArrayList<Integer> safeNodes(int V, int[][] edges) {

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }

        int[] indegree = new int[V];

        for(int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            list.get(v).add(u);
            indegree[u]++;
        }

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()) {

            int node = q.remove();
            ans.add(node);

            for(int ele : list.get(node)) {

                indegree[ele]--;

                if(indegree[ele] == 0) {
                    q.add(ele);
                }
            }
        }

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {
        int V = 7;
        int[][] edges = {{0,1},{0,2},{1,3},{2,3},{3,4},{4,5},{5,6}};

        ArrayList<Integer> result = safeNodes(V, edges);
        System.out.println(result); 
    }
}
