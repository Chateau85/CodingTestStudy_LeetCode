import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                    st.pop();
                } else if (c == ']' && !st.isEmpty() && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
