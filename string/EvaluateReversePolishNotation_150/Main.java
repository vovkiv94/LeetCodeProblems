package EvaluateReversePolishNotation_150;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.evalRPN(new String[]{"2", "1", "+", "3", "*"});
        System.out.print(result);
    }
}