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

        public int peek(){
            return ans.get(0);
        }

        private void heapify(int idx){
            int left = 2*idx+1;
            int right = 2*idx+2;
            int minIdx = idx;

            if(left < ans.size() && ans.get(idx) < ans.get(left)){
                minIdx = left;
            }

            if(right < ans.size() && ans.get(idx) < ans.get(right)){
                minIdx = right;
            }

            if(idx != minIdx){
                int temp = ans.get(idx);
                ans.set(idx, ans.get(minIdx));
                ans.set(minIdx, temp);

                heapify(minIdx);
            }

        }

        public int remove(){
            int data = ans.get(0);

            int temp = ans.get(0);
            ans.set(0, ans.get(ans.size()-1));
            ans.set(ans.size()-1, temp);

            heapify(0);

            return data;
        }
    }
}
