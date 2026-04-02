public class segregating0sand1sB {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0};

        int countZeros = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) countZeros++;
            
        }
        for (int i = 0; i < countZeros; i++) arr[i] = 0;
        for (int i = countZeros; i < arr.length; i++) arr[i] = 1;
        for(int ele : arr) System.out.print(ele+ " ");
    }
}
