public class reverseCircularLinkedList {
    public static Node reverseCircular(Node head) {
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        
        temp.next = null;
        Node newHead = reverse(head);
        
        temp = newHead;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = newHead;
        
        return newHead;
        
    }
    
    public static Node reverse(Node head) {
        if(head == null) return head;

        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
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
        e.next = a;

        Node result = reverseCircular(a);
        
        Node temp = result;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != result);
    }
}
