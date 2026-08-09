import java.util.HashSet;

public class sumExists {
    public static int sumExists(int arr[], int sum) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            int temp = sum - ele;
            if(set.contains(temp)) return 1;
            else set.add(ele);
        }
        
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 9;
        System.out.println(sumExists(arr, sum));
    }
}
