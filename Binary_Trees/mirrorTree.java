public class mirrorTree {
    public static void mirror(Node root) {
        if(root == null) return;
        
        mirror(root.left);
        mirror(root.right);
        
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void printInOrder(Node root) {
        if(root == null) return;
        
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Original tree:");
        printInOrder(root);

        mirror(root);

        System.out.println("\nMirrored tree:");
        printInOrder(root);
    }
}
