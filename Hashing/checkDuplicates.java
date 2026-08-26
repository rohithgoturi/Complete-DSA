import java.util.HashSet;
import java.util.Set;

public class checkDuplicates {
    public static boolean checkDuplicates(int arr[]) {
        Set<Integer> set = new HashSet<>();
        
        for(int ele : arr){
            if(set.contains(ele)) return true;
            set.add(ele);
        }
        
        return arr.length != set.size();
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(checkDuplicates(arr));
    }
}
