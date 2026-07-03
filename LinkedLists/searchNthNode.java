public class searchNthNode {
    public int GetNth(Node head, int index) {
        Node temp = head;
        int count = 0;
        
        while(temp != null){
            count++;
            if(count == index) return temp.data;
            temp = temp.next;
        }
        
        return -1;
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

        searchNthNode obj = new searchNthNode();
        System.out.println(obj.GetNth(a, 3));
    }
}
