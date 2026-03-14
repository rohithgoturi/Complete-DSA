import java.util.Vector;
import java.util.Collections;

public class addingTwoNumbers {
    public static void main(String[] args) {
        int[] a = { 3, 5, 9, 8 };
        int[] b = { 9, 2, 7 };

        System.out.println(addTwoNumbers(a, b));
    }

    static Vector<Integer> addTwoNumbers(int[] a, int[] b) {
        Vector<Integer> ans = new Vector<>();

        int carry = 0;
        int i = a.length - 1;
        int j = b.length - 1;

        while(i >= 0 || j>= 0 || carry!=0){
            int sum = carry;

            if(i>=0){
                sum += a[i];
                i--;
            }

            if(j>=0){
                sum += b[j];
                j--;
            }

            ans.add(sum%10);
            carry = sum/10;
        }
        
        Collections.reverse(ans);
        return ans;
    }
}
