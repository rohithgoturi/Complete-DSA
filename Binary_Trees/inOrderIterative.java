import java.util.ArrayList;
import java.util.Stack;

public class inOrderIterative {
    public static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        
        while(!st.isEmpty() || curr!=null){
            if(curr != null){
                if(curr.left != null){
                    st.push(curr);
                    curr = curr.left;
                }
                
                else{
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
            
            else{
                Node top = st.pop();
                ans.add(top.data);
                curr = top.right;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> result = inOrder(root);
        System.out.println("In-order traversal of the tree:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
