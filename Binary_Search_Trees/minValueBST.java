class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class minValueBST {
    public static int minValue(Node root) {
       Node temp = root;
       while(temp.left != null) temp = temp.left;
       
       return temp.data;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);

        System.out.println("Minimum value in the BST: " + minValue(root));
    }
}
