import java.util.ArrayList;

public class reverseSublistLL {

    public static Node reverseBetween(int a, int b, Node head) {
        ArrayList<Node> arr = new ArrayList<>();
        Node temp = head;
        
        while(temp != null){
            arr.add(temp);
            temp = temp.next;
        }
        
        int i = a-1;
        int j = b-1;
        
        while(i<=j){
            Node t1 = arr.get(i);
            Node t2 = arr.get(j);
            
            arr.set(i, t2);
            arr.set(j, t1);
            i++;
            j--;
        }
        
        for(i = 0; i<arr.size(); i++){
            arr.get(i).next = (i == arr.size()-1) ? null : arr.get(i+1);
        }
        
        return arr.get(0);
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

        Node result = reverseBetween(2, 4, a);
        while(result != null){
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

}
