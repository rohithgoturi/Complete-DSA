import java.util.ArrayList;

public class postOrderBT {
    public static void post(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        
        post(root.left, ans);
        post(root.right, ans);
        ans.add(root.data);
    }
    
    
    public static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        post(root, ans);
        
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> postOrderTraversal = postOrder(root);
        System.out.println("Post-order traversal of the binary tree: " + postOrderTraversal);
    }
}
