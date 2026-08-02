import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class kLargestElements {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int ele : arr){
            pq.add(ele);
            
            if(pq.size()>k) pq.remove();
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(pq.size() > 0) ans.add(pq.remove());
        
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        kLargestElements obj = new kLargestElements();
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(obj.kLargest(arr, k));
    }
}
