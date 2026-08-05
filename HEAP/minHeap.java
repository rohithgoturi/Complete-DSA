import java.util.ArrayList;

class minHeap {
    private ArrayList<Integer> arr;

    // Constructor
    public minHeap() {
        // Initialize your data members
        arr = new ArrayList<>();
    }

    public void push(int data) {
        // Insert x into the heap
        arr.add(data);
        
        int x = arr.size()-1;
        int par = (x-1)/2;
        
        while(x>0 && arr.get(x) < arr.get(par)){
            swap(x, par);
            x = par;
            par = (x-1)/2;
        }
        
    }
    
    public void swap(int i, int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
    
    private void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        
        int minIdx = i;
        
        if(arr.size()>left && arr.get(left)<arr.get(minIdx)) minIdx = left;
        if(arr.size()>right && arr.get(right) < arr.get(minIdx)) minIdx = right;
        
        if(i!=minIdx) {
            swap(i, minIdx);
            heapify(minIdx);
        }
    }

    public void pop() {
        // Remove the top (minimum) element
        swap(0, arr.size()-1);
        arr.remove(arr.size()-1);
        heapify(0);
    }
    

    public int peek() {
        // Return the top element or -1 if empty
        if(arr.size()==0) return -1;
        else return arr.get(0);
    }

    public int size() {
        // Return the number of elements in the heap
        return arr.size();
    }

    public boolean isEmpty() {
        // Return true if the heap is empty
        return arr.size()==0;
    }

    public static void main(String[] args) {
        minHeap h = new minHeap();
        h.push(3);
        h.push(5);
        h.push(1);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.pop();
        }

        System.out.println(h.isEmpty());
    }
}