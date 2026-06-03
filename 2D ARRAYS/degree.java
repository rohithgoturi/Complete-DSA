import java.util.ArrayList;

public class degree {
    public static void main(String[] args) {
        //[[0, 1], [0, 3], [1, 0], [2, 0], [3, 0], [3, 2]]
        int[][] edges = {{0,1},{0,3},{1,0},{2,0},{3,0},{3,2}};

        int V = 4;
        int[] indegree = new int[V];
        int[] outdegree = new int[V];

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            indegree[u]++;
            outdegree[v]++;
        }

        ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            ans.add(new ArrayList<>());
            ans.get(i).add(indegree[i]);
            ans.get(i).add(outdegree[i]);
        }

        System.out.print(ans);
    }
}

