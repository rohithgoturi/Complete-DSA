class Node {
    int data;
    Node left, right;
    
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class isBTHeap {
    static int s;
    
    public static boolean isHeap(Node root) {
        s = size(root);
        return isMaxHeap(root) && isCBT(root,1);
    }
    
    public static int size(Node root){
        if(root == null) return 0;
        
        return 1 + size(root.left) + size(root.right);
    }
    
    public static boolean isMaxHeap(Node root){
        if(root == null) return true;
        
        int leftVal = (root.left == null) ? Integer.MIN_VALUE : root.left.data;
        int rightVal = (root.right == null) ? Integer.MIN_VALUE : root.right.data;
        
        if(root.data <= leftVal || root.data <= rightVal) return false;
        
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }
    
    public static boolean isCBT(Node root, int idx){
        if(root == null) return true;
        
        if(idx > s) return false;
        
        return isCBT(root.left, 2*idx) && isCBT(root.right, 2*idx+1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);

        if (isHeap(root)) {
            System.out.println("The binary tree is a max heap.");
        } else {
            System.out.println("The binary tree is not a max heap.");
        }
    }
}
