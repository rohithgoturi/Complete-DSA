import java.util.ArrayList;
import java.util.Stack;

public class nextSmallestElement {
     public static ArrayList<Integer> nextSmallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        
        int n = arr.length;
        int[] nse = new int[n];
        
        nse[n-1] = -1;
        st.push(arr[n-1]);
        
        for(int i = n-2; i>=0; i--){
            while(st.size()>0 && arr[i] <= st.peek()) st.pop();
            
            if(st.isEmpty()) nse[i] = -1;
            else nse[i] = st.peek();
            
            st.push(arr[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(nse[i]);
        }
        
        return ans;
        
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        ArrayList<Integer> ans = nextSmallerElement(arr);
        
        System.out.println(ans);
    }
}
