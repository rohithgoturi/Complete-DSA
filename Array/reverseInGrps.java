public class reverseInGrps {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = i + k - 1;

            if (right >= n) {
                right = n - 1;
            }

            while(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        for(int ele : arr) {
                System.out.print(ele+ " ");
            }
    }

}
