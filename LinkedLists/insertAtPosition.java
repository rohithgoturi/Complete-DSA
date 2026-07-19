public class insertAtPosition {
    public static Node insertPos(Node head, int pos, int val) {
        Node newNode = new Node(val);
        if(pos == 1){
            newNode.next = head;
            return newNode;
        }
        
        Node temp = head;
        for(int i=1; i<pos-1; i++){
            temp = temp.next;
        }
        
        Node t = temp.next;
        temp.next = newNode;
        newNode.next = t;
        
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

        int pos = 3;
        int val = 25; 
        Node result = insertPos(a, pos, val);

        Node temp = result;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
