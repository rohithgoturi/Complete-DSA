public class MultiplyAdd {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        multiplyAdd(arr);
    }

    public static void multiplyAdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0){
                arr[i] *= 2;
                System.out.print(arr[i] + " ");
            }
            else {
                arr[i] += 10;
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
