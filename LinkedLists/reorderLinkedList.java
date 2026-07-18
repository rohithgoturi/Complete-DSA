public class reorderLinkedList {
    public static Node reOrder(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head2 = slow.next;
        slow.next = null;

        Node second = reverse(head2);

        Node first = head;
        while(second != null){
            Node t1 = first.next;
            Node t2 = second.next;

            first.next = second;
            second.next = t1;

            first = t1;
            second = t2;
        }

        return head;
    }

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
        Node b = new Node(25);
        a.next = b;
        Node c = new Node(20);
        b.next = c;
        Node d = new Node(15);
        c.next = d;
        Node e = new Node(30);
        d.next = e;

        Node result = reOrder(a);
        while(result != null){
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
