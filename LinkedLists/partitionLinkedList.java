public class partitionLinkedList {
     public static Node partition(Node head, int x) {
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);

        Node t1 = d1;
        Node t2 = d2;

        Node t = head;

        while(t != null){
            if(t.data < x){
                t1.next = t;
                t1 = t1.next;
            }

            else {
                t2.next = t;
                t2 = t2.next;
            }

            t = t.next;
        }

        t1.next = d2.next;
        t2.next = null;

        return d1.next;
    }

    public static void main(String[] args) {
        Node a = new Node(30);
        Node b = new Node(10);
        Node c = new Node(50);
        Node d = new Node(20);
        Node e = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        int x = 30;

        Node result = partition(a, x);

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

}
