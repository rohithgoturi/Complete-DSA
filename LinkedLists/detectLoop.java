public class detectLoop {
    public static boolean detectLoops(Node head) {  
        Node slow = head;
        Node fast = head;
        
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast) return true;
        }
        
        return false;
    }

    public static void main(String args[]){
        Node a = new Node(10);
        Node b = new Node(20);
        a.next = b;
        Node c = new Node(30);
        b.next = c;
        Node d = new Node(40);
        c.next = d;
        Node e = new Node(50);
        d.next = e;

        e.next = c; 

        boolean hasLoop = detectLoops(a);
        System.out.println(hasLoop);
    }
}
