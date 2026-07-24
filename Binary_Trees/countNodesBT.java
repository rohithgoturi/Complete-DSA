public class countNodesBT {
    public static int countNodes(int i) {
        return (int) Math.pow(2, i-1);
    }

    public static void main(String[] args) {
        int height = 4;
        int totalNodes = countNodes(height);
        System.out.println("Total nodes in a complete binary tree of height " + height + ": " + totalNodes);
    }
}
