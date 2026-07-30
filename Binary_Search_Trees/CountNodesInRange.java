public class CountNodesInRange {
    public static int getCount(Node root, int l, int h) {
        if(root == null) return 0;
        if(root.data < l) return getCount(root.right,l,h);
        else if(root.data > h) return getCount(root.left, l, h);
        else return 1 + getCount(root.left,l,h) + getCount(root.right,l,h);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);

        int low = 5;
        int high = 15;
        int count = getCount(root, low, high);
        System.out.println("Number of nodes in the range [" + low + ", " + high + "]: " + count);
    }
}
