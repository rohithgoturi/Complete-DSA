import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class courseSchedule2 {
    public static ArrayList<Integer> findOrder(int n, int[][] pre) {
		// code here
		List<List<Integer>> list = new ArrayList<>();
		
		for (int i = 0; i<n; i++) {
			List<Integer> ans = new ArrayList<>();
			list.add(ans);
		}
		
		int[] indegree = new int[n];
		
		for (int i = 0; i<pre.length; i++) {
			int a = pre[i][0];
			int b = pre[i][1];
			
			list.get(b).add(a);
			indegree[a]++;
		}
		
		Queue<Integer> q = new LinkedList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int i = 0; i<n; i++) {
			if (indegree[i] == 0)
				q.add(i);
		}
		
		while (!q.isEmpty()) {
			int node = q.remove();
			ans.add(node);
			
			for (int ele : list.get(node)) {
				indegree[ele]--;
				if (indegree[ele] == 0)
					q.add(ele);
			}
		}
		
		if (ans.size() != n)
			return new ArrayList<>();
		else
			return ans;
		
	}

    public static void main(String[] args) {
        int n = 4;
        int[][] pre = {{1,0},{2,0},{3,1},{3,2}};
        
        ArrayList<Integer> result = findOrder(n, pre);
        System.out.println(result); 
    }
}
