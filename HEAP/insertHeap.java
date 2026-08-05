import java.util.ArrayList;

public class insertHeap {
    static class Heap{
        ArrayList<Integer> ans = new ArrayList<>();

        public void insert(int data){
            ans.add(data);
            int x = ans.size()-1;
            int par = (x-1)/2;

            while(x > 0 && ans.get(x) < ans.get(par)){
                int temp = ans.get(x);
                ans.set(x, ans.get(par));
                ans.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return ans.get(0);
        }

        private void heapify(int idx){
            int left = 2*idx+1;
            int right = 2*idx+2;
            int minIdx = idx;

            if(left < ans.size() && ans.get(left) < ans.get(minIdx)){
                minIdx = left;
            }

            if(right < ans.size() && ans.get(right) < ans.get(minIdx)){
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

            ans.remove(ans.size()-1);

            heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return ans.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(3);
        h.insert(5);
        h.insert(1);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }

        System.out.println(h.isEmpty());
    }
}
