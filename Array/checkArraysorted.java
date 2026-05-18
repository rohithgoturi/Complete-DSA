public class checkArraysorted {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int i = 1;
        boolean isSorted = true;
        while(i<arr.length){
            if(arr[i-1] > arr[i]) isSorted = false;
            i++;
        }

        System.out.println(isSorted);
    }
}
