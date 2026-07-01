import java.util.ArrayList;

public class getDivisors {
    public static void main(String[] args) {
        int n = 12;
        ArrayList<Integer> ans = getDivisors(n);
        System.out.println(ans);
    }

    public static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                ans.add(i);
                if(i != n/i){
                    ans.add(n/i);
                }
            }
        }
        ans.sort(null);
        return ans;
    }
}
