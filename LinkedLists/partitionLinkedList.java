public class partitionLinkedList {
     public static Node partition(Node head, int x) {
        Node lessD = new Node(-1), equalD = new Node(-1), greaterD = new Node(-1);
        Node less = lessD, equal = equalD, greater = greaterD;

        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = null;

            if (curr.data < x) {
                less.next = curr;
                less = curr;
            } else if (curr.data == x) {
                equal.next = curr;
                equal = curr;
            } else {
                greater.next = curr;
                greater = curr;
            }

            curr = next;
        }

        equal.next = greaterD.next;
        less.next = equalD.next;

        return lessD.next;
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

        int x = 30;

        Node result = partition(a, x);

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

}
