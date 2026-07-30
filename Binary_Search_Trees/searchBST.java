public class searchBST {
    public static boolean search(Node root, int key) {
        if(root == null) return false;
        
        if(root.data == key) return true;
        
        else if(root.data > key) return search(root.left, key);
        else return search(root.right, key);

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);

        int keyToSearch = 7;
        if (search(root, keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found in the BST.");
        } else {
            System.out.println("Key " + keyToSearch + " not found in the BST.");
        }
    }
}
