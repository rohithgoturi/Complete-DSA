public class kthFromEnd {
    public static int getKthNode(Node head, int k){
        Node fast = head;
        Node slow = head;

        for(int i=1; i <= k; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }

    public static void main(String args[]){
        Node a = new Node(10);
        Node b = new Node(20);
        a.next = b;
        Node c = new Node(30);
        b.next = c;
        Node d = new Node(40);
        c.next = d;
        Node e = new Node(50);
        d.next = e;

        int k = 4;

        int kthNode = getKthNode(a, k);
        System.out.println(kthNode);

    }
}
