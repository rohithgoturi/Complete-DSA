public class rotateArr1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length - 1;

        int i = 0;
        int j = n - 1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        for(int x : arr){
            System.out.print(x);
        }

        System.out.println();
        
        i=0;
        j=n;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int x : arr) {
            System.out.print(x);
        }
    }
}
