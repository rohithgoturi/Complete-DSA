public class isEven {
    public static boolean isEven(Node head) {
        // code here
        int count = 0;
        Node temp = head;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        if(count % 2 == 0) return true;
        
        return false;
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

        System.out.println(isEven(a));
    }
}
