import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class postOrderIterative {
    public static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        
        st.push(root);
        while(!st.isEmpty()){
            Node top = st.pop();
            ans.add(top.data);
            if(top.left != null) st.push(top.left);
            if(top.right != null) st.push(top.right);
            
        }
        
        Collections.reverse(ans);
        
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> result = postOrder(root);
        System.out.println("Post-order traversal of the tree:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
