public class sort0s1s2s {
    public static Node segregate(Node head) {
        int[] count = new int[3];

        Node temp = head;
        
        while (temp != null) {
            count[temp.data]++;
            temp = temp.next;
        }

        temp = head;
        
        while (count[0]-- > 0) {
            temp.data = 0;
            temp = temp.next;
        }

        while (count[1]-- > 0) {
            temp.data = 1;
            temp = temp.next;
        }

        while (count[2]-- > 0) {
            temp.data = 2;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(0);
        Node d = new Node(1);
        Node e = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node result = segregate(a);

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
