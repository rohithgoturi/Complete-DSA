import java.util.ArrayList;

public class largestValueInEachLevel {
    public static void dfs(Node root, int level, ArrayList<Integer> ans) {
		if (root == null)
			return;
		
		if (level == ans.size()) {
			ans.add(root.data);
		} else {
			ans.set(level, Math.max(ans.get(level), root.data));
		}
		
		dfs(root.left, level + 1, ans);
		dfs(root.right, level + 1, ans);
	}
	
	public static ArrayList<Integer> largestValues(Node root) {
		ArrayList<Integer> ans = new ArrayList<>();
		dfs(root, 0, ans);
		return ans;
	}

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        ArrayList<Integer> largestValuesPerLevel = largestValues(root);
        System.out.println("Largest values in each level of the binary tree: " + largestValuesPerLevel);
    }
}
