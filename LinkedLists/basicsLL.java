class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class basicsLL {
    public static void main(String args[]){
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.print(a.data+" ");
        System.out.print(b.data+" ");
        System.out.print(c.data+" ");
        System.out.print(d.data+" ");
        System.out.print(e.data+" ");
    }
}
