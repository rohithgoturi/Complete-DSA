public class isIdentical {
    public static boolean areIdentical(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp1 != null && temp2 != null){
            if(temp1.data != temp2.data) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        if(temp1 == null && temp2 == null) return true;
        
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node f = new Node(10);
        Node g = new Node(20);
        Node h = new Node(30);
        Node i = new Node(40);
        Node j = new Node(50);

        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        System.out.println(areIdentical(a, f));
    }


}
