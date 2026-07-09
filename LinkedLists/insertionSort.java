public class insertionSort {
    public static Node insertionSortLinkedList(Node head) {
        if (head == null || head.next == null)
            return head;

        Node sorted = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;

            if (sorted == null || curr.data <= sorted.data) {
                curr.next = sorted;
                sorted = curr;
            } else {

                Node temp = sorted;

                while (temp.next != null && temp.next.data < curr.data) {
                    temp = temp.next;
                }

                curr.next = temp.next;
                temp.next = curr;
            }

            curr = next;
        }

        return sorted;
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

        Node sortedHead = insertionSortLinkedList(a);

        Node current = sortedHead;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
