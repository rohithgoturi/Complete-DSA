import java.util.ArrayList;

public class arrayDuplicates {
    public static void main(String[] args) {
        ArrayList <Integer> ans = new ArrayList<>();
        int[] arr = {2, 3, 1, 2, 3};


        // brute force approach with o(n^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) ans.add(arr[i]);
            }
        }

        System.out.println(ans);
    }
}
