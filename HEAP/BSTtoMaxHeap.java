import java.util.ArrayList;

public class BSTtoMaxHeap {
    static int idx;
    public static void convertBSTtoMaxHeap(Node root, ArrayList<Integer> arr) {
        idx = 0;
        inorderTraversal(root, arr);
        postorderTraversal(root, arr);
    }

    public static void inorderTraversal(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, arr);
        arr.add(root.data);
        inorderTraversal(root.right, arr);
    }

    public static void postorderTraversal(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        postorderTraversal(root.left, arr);
        postorderTraversal(root.right, arr);
        root.data = arr.get(idx++);
    }   

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        ArrayList<Integer> arr = new ArrayList<>();
        idx = 0;
        convertBSTtoMaxHeap(root, arr);

        System.out.println("Max Heap:");
        printInorder(root);
    }

    public static void printInorder(Node root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
}
