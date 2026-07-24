public class sumBT {
    public static int sumBT(Node root) {
        if(root == null) return 0;
        
        return root.data + sumBT(root.left) + sumBT(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Sum of all nodes in the binary tree: " + sumBT(root));
    }
}
