public class modularNode {
    public static int findModularNode(Node head, int k) {
        Node temp = head;
        int length = 1;
        
        int ans = -1;
        while(temp != null){
            if(length % k == 0){
                ans = temp.data;
            }
            
            length++;
            temp = temp.next;
        }
        
        return ans;
        
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

        int k = 3;
        int result = findModularNode(a, k);

        if (result != -1) {
            System.out.println("The modular node is at position: " + result);
        } else {
            System.out.println("No modular node found for k = " + k);
        }
    }
}
