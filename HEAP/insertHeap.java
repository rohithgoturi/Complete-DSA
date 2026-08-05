import java.util.ArrayList;
import java.util.PriorityQueue;

public class insertHeap {
    static class Heap{
        ArrayList<Integer> ans = new ArrayList<>();

        public void insert(int data){
            ans.add(data);
            int x = ans.size()-1;
            int par = (x-1)/2;

            while(ans.get(x) < ans.get(par)){
                int temp = ans.get(x);
                ans.set(x, ans.get(par));
                ans.set(par, temp);
            }
        }
    }
}
