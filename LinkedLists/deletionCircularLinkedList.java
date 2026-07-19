public class deletionCircularLinkedList {
    public static Node deleteNode(Node head, int key) {

        if (head == null)
            return null;

        if (head.data == key && head.next == head)
            return null;

        Node curr = head;
        Node prev = null;

        if (head.data == key) {

            Node last = head;
            while (last.next != head)
                last = last.next;

            head = head.next;
            last.next = head;

            return head;
        }

        prev = head;
        curr = head.next;

        while (curr != head) {
            if (curr.data == key) {
                prev.next = curr.next;
                return head;
            }
            prev = curr;
            curr = curr.next;
        }

        return head;
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

        int keyToDelete = 30; // Change this value to delete a different node
        Node result = deleteNode(a, keyToDelete);

        if (result != null) {
            Node temp = result;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != result);
        } else {
            System.out.println("The list is empty after deletion.");
        }
    }
}
