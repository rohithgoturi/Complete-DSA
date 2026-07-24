import java.util.ArrayList;

public class preOrderBT {
    public static void pre(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        
        ans.add(root.data);
        pre(root.left, ans);
        pre(root.right, ans);
    }
    
    
    public static ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        pre(root, ans);
        
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> preOrderTraversal = preOrder(root);
        System.out.println("Pre-order traversal of the binary tree: " + preOrderTraversal);
    }
}
