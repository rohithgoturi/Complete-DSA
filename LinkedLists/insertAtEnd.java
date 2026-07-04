public class insertAtEnd {
    public static Node insertAtEnding(Node head, int x) {
        Node tail = new Node(x);
        
        if(head==null){
            head = tail;
            return head;
        }
        
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = tail;
        
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

        insertAtEnding(a, 60);

        Node temp = a;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    
}
