public class segregating0sand1sB {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};

        int countZeros = 0;
        int countOnes = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) countZeros++;
            else countOnes++;
        }

        for (int i = 0; i < countZeros; i++) arr[i] = 0;
        for (int i = countZeros; i < arr.length; i++) arr[i] = 1;
            
        for(int ele : arr) System.err.print(ele+ " ");
    }
}
