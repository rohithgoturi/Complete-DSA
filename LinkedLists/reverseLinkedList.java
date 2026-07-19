public class reverseLinkedList {
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node fwd = null;

        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        return prev;
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

        Node result = reverse(a);
        while(result != null){
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
