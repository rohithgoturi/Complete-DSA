public class mergeTwoSortedLinkedLists {
    public static Node sortedMerge(Node head1, Node head2) {
        Node first = head1;
        Node second = head2;
        
        Node dummy = new Node(-1);
        Node k = dummy;
        
        while(first != null && second != null){
            if(first.data >= second.data) {
                k.next = second;
                second = second.next;
            }
            else{
                k.next = first;
                first = first.next;
            }
            
            k = k.next;
        }
        
        if(first == null) k.next = second;
        else  k.next = first;
        
        return dummy.next;
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

        Node f = new Node(15);
        Node g = new Node(25);
        Node h = new Node(35);
        Node i = new Node(45);
        Node j = new Node(55);

        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        Node mergedHead = sortedMerge(a, f);

        Node current = mergedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
