import java.util.HashSet;

public class countDIstinct {
    public static int distinct(int arr[], int n) {

        HashSet <Integer> set = new HashSet<>();
        
        for(int ele : arr) set.add(ele);
        
        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3};
        int n = arr.length;
        System.out.println(distinct(arr, n));
    }
}
