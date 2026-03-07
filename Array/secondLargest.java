
public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        // boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondMax && arr[i]!= max){
                secondMax = arr[i];
                // flag = true;
            }
        }

        System.out.println(secondMax);
    }
}
