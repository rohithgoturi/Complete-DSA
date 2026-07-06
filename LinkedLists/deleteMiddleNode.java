public class deleteMiddleNode {
    public static Node deleteMid(Node head) {
        if (head == null || head.next == null)
            return null;
            
        Node temp = head;
        int length = 0;
        
        while(temp != null){
            length++;
            temp = temp.next;
        }
        
        temp = head;
        for(int i=1; i<(length/2); i++){
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
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

        Node head = deleteMid(a);
        
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
