import java.util.ArrayList;

public class TreeBoundaryTraversal {
    public static ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);
        
        if(root.left == null && root.right == null) return ans;
        
        leftBoundary(root.left, ans);
        leafBoundary(root,ans);
        rightBoundary(root.right, ans);
        
        return ans;
    }
    
    public static void leftBoundary(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        ans.add(root.data);
        if(root.left != null) leftBoundary(root.left, ans);
        else if(root.right != null) leftBoundary(root.right, ans);
    }
    
    public static void leafBoundary(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        if(root.left == null && root.right == null) ans.add(root.data);
        
        leafBoundary(root.left, ans);
        leafBoundary(root.right, ans);
    }
    
    public static void rightBoundary(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        if(root.left != null) rightBoundary(root.left, ans);
        else if(root.right != null) rightBoundary(root.right, ans);
        ans.add(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> result = boundaryTraversal(root);
        System.out.println("Boundary traversal of the tree:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
