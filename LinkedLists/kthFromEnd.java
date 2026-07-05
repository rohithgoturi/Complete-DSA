public class kthFromEnd {
    public static int getKthNode(Node head, int k){
        Node temp = head;
        int length = 0;

        while(temp != null){
            temp = temp.next;
            length++;
        }

        int kth = length - k + 1;
        temp = head;

        while(kth > 1){
            temp = temp.next;
            kth--;
        }

        return temp.data;
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
