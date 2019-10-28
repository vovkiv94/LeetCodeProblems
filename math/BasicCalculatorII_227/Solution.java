package BasicCalculatorII_227;

import java.util.Stack;

/**
 * Implement a basic calculator to evaluate a simple expression string.
 * <p>
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces .
 * The integer division should truncate toward zero.
 * <p>
 * Example 1:
 * <p>
 * Input: "3+2*2"
 * Output: 7
 */
class Solution {
    public int calculate(String s) {
        int length = 0;
        if (s == null || (length = s.length()) == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if ('0' <= c && c <= '9') {
                num = num * 10 + c - '0';
            }
            if ((('0' > c || c > '9') && c != ' ') || i == length - 1) {
                if (sign == '+') stack.push(num);
                if (sign == '-') stack.push(-num);
                if (sign == '*') stack.push(stack.pop() * num);
                if (sign == '/') stack.push(stack.pop() / num);
                sign = c;
                num = 0;
            }
        }
        for (int n : stack) num += n;
        return num;

    }
}