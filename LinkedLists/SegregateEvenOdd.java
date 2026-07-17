public class SegregateEvenOdd {
    public static Node divide(Node head) {
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        
        Node t1 = d1;
        Node t2 = d2;
        
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                t1.next = temp;
                t1 = t1.next;
            }
            else {
                t2.next = temp;
                t2 = t2.next;
            }
            
            temp = temp.next;
        }
        
        t1.next = d2.next;
        t2.next = null;
        
        return d1.next;
    }

    public static void main(String args[]){
        Node a = new Node(10);
        Node b = new Node(25);
        a.next = b;
        Node c = new Node(20);
        b.next = c;
        Node d = new Node(15);
        c.next = d;
        Node e = new Node(30);
        d.next = e;

        Node ans = divide(a);
        
        while(ans != null){
            System.out.print(ans.data+" ");
            ans = ans.next;
        }
    }
}
