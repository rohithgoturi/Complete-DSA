public class largestElement {
    public static void main(String[] args) {
        int[] arr = {20, 40, 10, 60, 25};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Largest element is : "+max);

    }
}
