public class insertInMiddle {
    
    public static Node insertInMiddle(Node head, int x) {
        Node newNode = new Node(x);
        
        if(head == null){
            head = newNode;
        }
        
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node temp = slow.next;
        
        slow.next = newNode;
        newNode.next = temp;
        
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

        int x = 25; 
        Node result = insertInMiddle(a, x);

        Node temp = result;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

