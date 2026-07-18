import java.util.ArrayList;

public class mergeKsortedLL {
    public static Node mergeKLists(Node[] arr) {
		if (arr.length == 0)
			return null;
		
		ArrayList<Node> list = new ArrayList<>();
		for (Node i : arr)
			list.add(i);
		
		while (list.size()>1) {
			Node a = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			Node b = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			Node c = mergeList(a, b);
			list.add(c);
		}
		
		return list.get(0);
	}
	
	public static Node mergeList(Node head1, Node head2) {
		Node first = head1;
		Node second = head2;
		
		Node dummy = new Node(-1);
		Node k = dummy;
		
		while (first != null && second != null) {
			if (first.data > second.data) {
				k.next = second;
				second = second.next;
			} else {
				k.next = first;
				first = first.next;
			}
			
			k = k.next;
		}
		
		if (first != null)
			k.next = first;
		else
			k.next = second;
		
		return dummy.next;
	}

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(25);
        a.next = b;
        Node c = new Node(20);
        b.next = c;
        Node d = new Node(15);
        c.next = d;
        Node e = new Node(30);
        d.next = e;

        Node f = new Node(5);
        Node g = new Node(12);
        f.next = g;
        Node h = new Node(18);
        g.next = h;
        Node i = new Node(22);
        h.next = i;
        Node j = new Node(35);
        i.next = j;

        Node k = new Node(2);
        Node l = new Node(8);
        k.next = l;
        Node m = new Node(14);
        l.next = m;
        Node n = new Node(28);
        m.next = n;
        Node o = new Node(40);
        n.next = o;

        Node[] arr = {a, f, k};
        Node result = mergeKLists(arr);
        while(result != null){
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
