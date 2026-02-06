import java.util.Scanner;

public class searchEle {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();

        for(int i = 0; i<arr.length; i++){
            if(ele == arr[i]){
                System.out.println("element found at index "+i);
            }
        }
        sc.close();
    }
}
