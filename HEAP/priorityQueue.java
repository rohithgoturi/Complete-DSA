import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        // minHeap
        // PriorityQueue <Integer> pq = new PriorityQueue<>();
        
        //maxHeap
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(50);
        pq.add(30);
        pq.add(20);
        pq.add(40);

        System.out.println(pq);
    }
}
