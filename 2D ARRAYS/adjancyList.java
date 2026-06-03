import java.util.ArrayList;

public class adjancyList {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
        int [][] arr =  {{0, 1, 0, 1},{1, 0, 1, 0},{0, 1, 0, 1},{1, 0, 1, 0}};

        for (int i = 0; i < arr.length; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1) ans.get(i).add(j);
            }
        }

        System.out.print(ans);
    }
}
