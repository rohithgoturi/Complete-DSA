import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
		Queue<Integer> q = new LinkedList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		int V = adj.size();
		
		boolean[] visited = new boolean[V];
		q.add(0);
		visited[0] = true;
		
		while (!q.isEmpty()) {
			int node = q.remove();
			ans.add(node);
			
			for (int ele : adj.get(node)) {
				if (!visited[ele]) {
					visited[ele] = true;
					q.add(ele);
				}
			}
		}
		
		return ans;
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

        ArrayList<Integer> bfsResult = bfs(adj);
        
        System.out.println("BFS Traversal: " + bfsResult);
    }
}
