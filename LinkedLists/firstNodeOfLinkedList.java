public class firstNodeOfLinkedList {
    public static int cycleStart(Node head) {
		Node slow = head;
		Node fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				slow = head;
				
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				
				return slow.data;
			}
		}
		
		return -1;
		
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

        int cycleStartNode = cycleStart(a);
        System.out.println(cycleStartNode);
    }


}
