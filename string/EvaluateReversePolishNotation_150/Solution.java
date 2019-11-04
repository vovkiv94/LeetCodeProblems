package EvaluateReversePolishNotation_150;

import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * <p>
 * Note:
 * <p>
 * Division between two integers should truncate toward zero.
 * The given RPN expression is always valid. That means the expression would always evaluate
 * to a result and there won't be any divide by zero operation.
 * Example 1:
 * <p>
 * Input: ["2", "1", "+", "3", "*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 */
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int result = 0;
        for (String str : tokens) {
            if (str.length() == 1) {
                char ch = str.charAt(0);
                if (ch >= '0' && ch <= '9') {
                    st.push(ch - '0');
                } else {
                    int b = st.pop();
                    int a = st.pop();
                    int c = 0;
                    if (ch == '+') c = a + b;
                    else if (ch == '-') c = a - b;
                    else if (ch == '*') c = a * b;
                    else if (ch == '/') c = a / b;
                    st.push(c);
                }
            } else {
                st.push(Integer.valueOf(str));
            }
        }
        return st.pop();
    }
}
