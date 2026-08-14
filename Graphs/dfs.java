import java.util.ArrayList;

public class dfs {
    public static ArrayList<Integer> depthFirstSearch(ArrayList<ArrayList<Integer>> adj) {
		int V = adj.size();
		
		ArrayList<Integer> ans = new ArrayList<>();
		boolean[] visited = new boolean[V];
		
		DFS(0, adj, visited, ans);
		
		return ans;
	}
	
	public static void DFS(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans) {
		visited[node] = true;
		ans.add(node);
		
		for(int ele : adj.get(node)){
		    if(!visited[ele]){
		        DFS(ele, adj, visited, ans);
		    }
		}
	}

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // vertex 0
        adj.get(0).add(1);

        // vertex 1
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(1).add(0);

        // vertex 2
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);

        // vertex 3
        adj.get(3).add(2);
        adj.get(3).add(1);

        // vertex 4
        adj.get(4).add(2);

        ArrayList<Integer> dfsResult = depthFirstSearch(adj);
        System.out.println(dfsResult);
    }
}
