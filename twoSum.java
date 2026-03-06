public class twoSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 80;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    System.out.print("target value found at idx : "+ i + " " + j);
                }
            }
        }
    }
}
