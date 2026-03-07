
public class negativeEle {
    public static void main(String[] args) {
        int[] arr = {12, -5, 0, 8, -22, -1, 45, -9};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
