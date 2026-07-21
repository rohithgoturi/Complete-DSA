import java.util.ArrayList;
import java.util.Stack;

public class nextGreaterInCircularArr {
    public static ArrayList<Integer> nextGreaterInCircular(int[] arr) {
        Stack<Integer> st = new Stack<>();
		
		int n = arr.length;
		int[] nge = new int[n];
		
		for(int i=n-1; i>=0; i--){
		    st.push(arr[i]);
		}
		
		for (int i = n-1; i >= 0; i--) {
			while (st.size()>0 && arr[i] >= st.peek())
				st.pop();
			
			if (st.isEmpty())
				nge[i] = -1;
			else
				nge[i] = st.peek();
			
			st.push(arr[i]);
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i<n; i++) {
			ans.add(nge[i]);
		}
		
		return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        ArrayList<Integer> ans = nextGreaterInCircular(arr);
        
        System.out.println(ans);
    }
}
