import java.util.ArrayList;
import java.util.Stack;

public class nextGreatestElement {
     public static ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        
        int n = arr.length;
        int[] nge = new int[n];
        
        nge[n-1] = -1;
        st.push(arr[n-1]);
        
        for(int i = n-2; i>=0; i--){
            while(st.size()>0 && arr[i] >= st.peek()) st.pop();
            
            if(st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();
            
            st.push(arr[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(nge[i]);
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        ArrayList<Integer> ans = nextLargerElement(arr);
        
        System.out.println(ans);
    }
}
