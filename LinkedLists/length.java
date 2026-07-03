public class length {
    public static int getCount(Node head) {
        Node temp = head;
        int length = 0;
        
        while(temp != null){
            length++;
            temp = temp.next;
        }
        
        return length;
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

        System.out.println(getCount(a));
    }
}
