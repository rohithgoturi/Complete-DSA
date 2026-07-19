import java.util.Pair;

public class splitLinkedListIntoTwoHalves {
    public Pair<Node, Node> splitList(Node head) {
        
        if (head == null) {
            return new Pair<>(null, null);
        }
        
        if (head.next == head) {
            return new Pair<>(head, null);
        }
        
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = null;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head2 = slow.next;
        slow.next = head; 
        
        Node tail2 = head2;
        while (tail2.next != null) {
            tail2 = tail2.next;
        }
        tail2.next = head2;

        return new Pair<>(head, head2);
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

        splitLinkedListIntoTwoHalves splitter = new splitLinkedListIntoTwoHalves();
        Pair<Node, Node> result = splitter.splitList(a);

        System.out.print("First half: ");
        Node temp1 = result.getKey();
        do {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        } while (temp1 != result.getKey());
        
        System.out.println();

        System.out.print("Second half: ");
        Node temp2 = result.getValue();
        do {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        } while (temp2 != result.getValue());
    }
}
