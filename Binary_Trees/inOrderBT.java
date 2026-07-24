import java.util.ArrayList;

public class inOrderBT {
    public static void in(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        
        in(root.left, ans);
        ans.add(root.data);
        in(root.right, ans);
    }
    
    
    public static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        in(root, ans);
        
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> inOrderTraversal = inOrder(root);
        System.out.println("In-order traversal of the binary tree: " + inOrderTraversal);
    }
}
