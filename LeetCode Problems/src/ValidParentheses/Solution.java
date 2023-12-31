package ValidParentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if ((s.charAt(0) == ')') || (s.charAt(0) == '}') || (s.charAt(0) == ']')) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                st.push(s.charAt(i));
            else if (st.size() > 0) {
                char c = st.peek();
                if (c == '(' && s.charAt(i) != ')')
                    return false;
                else if (c == '[' && s.charAt(i) != ']')
                    return false;
                else if (c == '{' && s.charAt(i) != '}')
                    return false;
                st.pop();

            } else
                return false;
            //cout<<st.top();
        }
        if (st.size() != 0) return false;
        else return true;

    }
}