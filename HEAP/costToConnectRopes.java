import java.util.PriorityQueue;

public class costToConnectRopes {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        
        int cost = 0;
        
        while(pq.size()>1){
            int min = pq.remove();
            int min2 = pq.remove();
            
            cost += min + min2;
            
            pq.add(min+min2);
        }
        
        return cost;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        System.out.println(minCost(arr));
    }
}
