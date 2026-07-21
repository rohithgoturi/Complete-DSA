//'5','4','C','D','9','+','+'

import java.util.Stack;

public class baseBall {
    public static int checkScore(String[] arr){
        Stack <Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
           String s = arr[i];
           if(s=="C") st.pop();
           else if (s=="D") st.push(2*st.peek());
           else if(s=="+") {
              int top = st.pop();
              int secondTop = st.peek();
              int sum = top + secondTop;
              st.push(top);
              st.push(sum);
            }   
            else st.push(Integer.parseInt(s));
        }

        int sum = 0 ;
        while(!st.isEmpty()){
            sum += st.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] arr = {"5", "-2", "4", "C", "D" , "9", "+", "+"};
        int score = checkScore(arr);

        System.out.println(score);
    }

}