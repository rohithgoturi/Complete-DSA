public class findingLoopLength {
    public static int lengthOfLoop(Node head) {
		Node slow = head;
		Node fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				int count = 1;
				fast = fast.next;
				
				while (fast != slow) {
					count++;
					fast = fast.next;
				}
				
				return count;
				
			}
			
		}
		
		return 0;
		
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

        int loopLength = lengthOfLoop(a);
        System.out.println(loopLength);
    }
}
