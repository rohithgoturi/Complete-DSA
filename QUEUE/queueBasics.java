import java.util.LinkedList;
import java.util.Queue;

public class queueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);
        System.out.println(q.size());
        q.remove();
        System.out.println(q);
        System.out.println(q.size());
    }
}