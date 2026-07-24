public class minMax {
    public static int findMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.max(root.data,
                Math.max(findMax(root.left), findMax(root.right)));
    }

    public static int findMin(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;

        return Math.min(root.data,
                Math.min(findMin(root.left), findMin(root.right)));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int minValue = findMin(root);
        int maxValue = findMax(root);

        System.out.println("Minimum value in the binary tree: " + minValue);
        System.out.println("Maximum value in the binary tree: " + maxValue);
    }
}
