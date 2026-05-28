import java.util.ArrayList;

public class pascalsTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = 5;

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j <= i ; j++) {
                if(j==0 || j==i) list.get(i).add(1);
                else{
                    int value = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    list.get(i).add(value);
                }
            }
        }

        for (ArrayList<Integer> arrayList : list) {
            System.out.println(arrayList);
        }
    }
}
