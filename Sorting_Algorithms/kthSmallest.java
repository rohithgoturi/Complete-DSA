public class kthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int result = kthSmallest(arr, k);
        System.out.println("The " + k + "rd smallest element is: " + result);
    }

    public static int kthSmallest(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k - 1];
    }

}
