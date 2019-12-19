package MultiplyStrings_43;

/**
 * Given two non-negative integers num1 and num2 represented as strings,
 * return the product of num1 and num2, also represented as a string.
 * <p>
 * Example 1:
 * <p>
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 */
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";

        int[] res = new int[num1.length() + num2.length()];
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = 0; i < num2.length(); i++) {
            int a = num2.charAt(num2.length() - 1 - i) - '0';
            int curry = 0;
            int j = 0;
            for (; j < num1.length(); j++) {
                int mul = a * (num1.charAt(num1.length() - 1 - j) - '0') + res[i + j] + curry;
                res[i + j] = mul % 10;
                curry = mul / 10;
            }
            while (curry != 0) {
                int sum = res[i + j] + curry;
                res[i + j] = sum % 10;
                curry = sum / 10;
                j++;
            }
        }

        int i = res.length - 1;
        while (i >= 0 && res[i] == 0) i--;
        StringBuilder sb = new StringBuilder();
        while (i >= 0) sb.append(res[i--]);
        String s = sb.toString();
        return s.isEmpty() ? "0" : s;
    }
}