public class minElement {
    public static int minValue(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        
        int left = minValue(root.left);
        int right = minValue(root.right);
        
        return Math.min(root.data, Math.min(left, right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int minValue = minValue(root);
        System.out.println("Minimum value in the binary tree: " + minValue);
    }
}

