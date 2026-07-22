import java.util.Queue;
import java.util.Stack;

public class reverseKElements {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();
        if (k <= 0 || k > n)
            return q;
            
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(q.size()>0 && i<k){
            st.push(q.remove());
            i++;
        }
        
        while(!st.isEmpty()) q.add(st.pop());
        
        i = n-k;
        while(q.size()>0 && i>0){
            q.add(q.remove());
            i--;
        }
        
        
        return q;
        
    }

    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        reverseFirstK(q, 3);
        System.out.println(q);
    }
}
