public class rotateLinkedList {
     public static Node rotate(Node head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        int length = 1;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;

        if (k == 0)
            return head;

        Node curr = head;

        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        Node newHead = curr.next;

        curr.next = null;
        tail.next = head;

        return newHead;
    }

    public static void main(String args[]) {
        Node a = new Node(10);
        Node b = new Node(20);
        a.next = b;
        Node c = new Node(30);
        b.next = c;
        Node d = new Node(40);
        c.next = d;
        Node e = new Node(50);
        d.next = e;

        int k = 2;

        Node rotatedHead = rotate(a, k);

        while (rotatedHead != null) {
            System.out.print(rotatedHead.data + " ");
            rotatedHead = rotatedHead.next;
        }
    }
}
