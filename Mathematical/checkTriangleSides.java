import java.util.ArrayList;

public class checkTriangleSides {
    public static ArrayList<Integer> canMakeTriangle(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        
        for(int i=0; i < n-2; i++){
            int a = arr[i];
            int b = arr[i+1];
            int c = arr[i+2];
            
            if((a+b > c) && (a+c > b) && (b+c > a)) ans.add(1);
            else ans.add(0);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 5};
        ArrayList<Integer> result = canMakeTriangle(arr);
        System.out.println(result); // Output: [1, 0, 1]
    }
}
