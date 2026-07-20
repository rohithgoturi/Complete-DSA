import java.util.Stack;

public class pushAtBottomStack {
    public static void pushAtBottom(Stack<Integer> st, int data) {
        if(st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.peek();
        st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        pushAtBottom(st, 100);

        while(!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
}
