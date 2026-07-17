public class oddEvenLinkedList {
    public static Node oddEvenList(Node head) {
        if(head == null || head.next == null) return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(25);
        a.next = b;
        Node c = new Node(20);
        b.next = c;
        Node d = new Node(15);
        c.next = d;
        Node e = new Node(30);
        d.next = e;

        Node result = oddEvenList(a);
        
        Node current = result;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
