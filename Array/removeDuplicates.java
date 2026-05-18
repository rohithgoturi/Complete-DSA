// this question is related to removing all the repeated elements from a sorted array and add in array list as a single appearance and return them

import java.util.ArrayList;
public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList <Integer> ans = new ArrayList<>();
        int[] arr = {2,2,2,2,2,2};
        int i = 1;
        ans.add(arr[0]);
        while(i<arr.length){
            if(arr[i-1] != arr[i]){
                ans.add(arr[i]);
            }
            i++;
        }

        System.out.println(ans);
    }
}
