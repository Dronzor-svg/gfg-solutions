import java.util.Stack;

class Solution {
    public static boolean checkRedundancy(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push everything except closing bracket
            if (ch != ')') {
                st.push(ch);
            } 
            else {
                // If ')' found, check what's inside brackets
                boolean hasOperator = false;

                while (!st.isEmpty() && st.peek() != '(') {
                    if (isOperator(st.peek())) {
                        hasOperator = true;
                    }
                    st.pop();
                }

                // Pop the opening '('
                st.pop();

                // No operator found → redundant brackets
                if (!hasOperator) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%';
    }
}
