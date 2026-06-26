import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = {10, 20, -30, 500, 60};
        int target = 510;

        boolean check = twoSumPair(arr, target);
        System.out.println(check);
    }

    public static boolean twoSumPair(int[] arr, int target) {
        Arrays.sort(arr);

        int j = arr.length-1;
        int i = 0;
        while(i<arr.length && j >= 0){
            if(arr[i] + arr[j] == target && i != j) return true;
            else if(arr[i] + arr[j] > target) j--;
            else i++;
        }

        return false;
    }
}
