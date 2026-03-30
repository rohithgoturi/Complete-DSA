public class waveArray {
    // we are given a sorted array and we have to convert into wavy array i. e arr[0]>= arr [1] <= arr [2].. 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length - 1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            
        }
        for (int ele : arr) {
            System.out.print(ele+ " ");
        }
        
        
    }
}
