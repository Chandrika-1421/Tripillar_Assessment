package Module11;
import java.util.Stack;

public class ReverseStack {
    // Insert element at bottom
    public static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    // Reverse stack
    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverse(st);
        insertAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(21);
        st.push(12);
        st.push(2004);
        System.out.println("Original Stack: " + st);
        reverse(st);
        System.out.println("Reversed Stack: " + st);
    }
}

