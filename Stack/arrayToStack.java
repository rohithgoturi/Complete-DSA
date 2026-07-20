import java.util.Stack;

public class arrayToStack {
    public static Stack<Integer> push(int arr[]) {
        Stack <Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++) st.push(arr[i]);
        return st;
    }

    public static void printAndPop(Stack<Integer> st) {
        while(!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        push(arr);
    }
}
