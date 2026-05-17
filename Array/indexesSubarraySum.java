import java.util.ArrayList;

public class indexesSubarraySum {
    public static void main(String[] args) {

        ArrayList <Integer> ans = new ArrayList<>();

        int [] arr = {1,2,3,7,5};
        int target = 12;

        int sum = 0;
        int i = 0;
        int j = 0;

        
        for( j=0; j < arr.length; j++){
            sum += arr[j];

            while(sum > target && i <= j){
                sum -= arr[i];
                i++;
            }

            if(sum == target){
                ans.add(i+1);
                ans.add(j+1);
                break;
            }
        }

        if(sum != target) ans.add(-1);

        System.out.print(ans);


        // //brute force approach
        // ArrayList<Integer> ans = new ArrayList<>();
        // int[] arr = {1, 2, 3, 4, 5};
        // int target = 9;
        
        // boolean check = false;
        // for (int i = 0; i < arr.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < arr.length; j++) {

        //         sum += arr[j];
        //         if(sum==target){
        //             ans.add(i+1);
        //             ans.add(j+1);
        //             check = true;
        //             break;
        //         }
        //     }
        //     if(check) break;
        // }

        // if(!check) ans.add(-1);

        // System.out.println(ans);
    }
}
