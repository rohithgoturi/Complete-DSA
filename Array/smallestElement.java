
public class smallestElement {
    public static void main(String[] args) {
        int[] arr = {100, 60, 50, 80, 30, 90};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Smallest element in an array : "+min);
    }
}
