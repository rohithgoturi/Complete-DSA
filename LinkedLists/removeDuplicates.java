public class removeDuplicates {
    public static Node removeDuplicateNodes(Node head) {
        if (head == null) return null;

        Node i = head;
        Node j = head;

        while(j != null){
            if(i.data == j.data) j = j.next;
            else{
                i.next = j;
                i = j;
            }
        }

        i.next = j;
        return head;
    }

    public static void main(String args[]){
        Node a = new Node(10);
        Node b = new Node(20);
        a.next = b;
        Node c = new Node(20);
        b.next = c;
        Node d = new Node(30);
        c.next = d;
        Node e = new Node(30);
        d.next = e;

        Node head = removeDuplicateNodes(a);

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
