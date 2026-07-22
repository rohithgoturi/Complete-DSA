import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueReversal {
     public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while(q.size()>0) st.push(q.remove());
        
        while(!st.isEmpty()) q.add(st.pop());
    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        reverseQueue(q);
        System.out.println(q);
    }
}
