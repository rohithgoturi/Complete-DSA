public class intersectionPoint {
    public static Node getIntersectPoint(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        
        int len1 = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            len1++;
        }
        
        int len2 = 0;
        while(temp2 != null){
            temp2 = temp2.next;
            len2++;
        }
        
        temp1 = head1;
        temp2 = head2;
        
        if(len1 > len2) {
            for(int i=0; i<len1-len2; i++) temp1 = temp1.next;
        }else{
            for(int i=0; i<len2-len1; i++) temp2 = temp2.next;
        }
        
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return temp1;
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

        Node f = new Node(60);
        Node g = new Node(70);
        f.next = g;
        g.next = d; 

        Node intersectNode = getIntersectPoint(a, f);
        System.out.println(intersectNode.data);
    }
}
