import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class zigZagTraversal {
    public static ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) return ans;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                if (leftToRight)
                    level.add(curr.data);
                else
                    level.add(0, curr.data);

                if (curr.left != null)
                    q.offer(curr.left);

                if (curr.right != null)
                    q.offer(curr.right);
            }

            ans.addAll(level);
            leftToRight = !leftToRight;
        }

        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> result = zigZagTraversal(root);
        System.out.println("Zig-Zag Traversal: " + result);
    }
}
