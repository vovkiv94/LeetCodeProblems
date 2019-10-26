package AddBinary_67;

/**
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * The input strings are both non-empty and contains only characters 1 or 0.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 */
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int buf = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = 0;
            sum += i >= 0 ? a.charAt(i) - 48 : 0;
            sum += j >= 0 ? b.charAt(j) - 48 : 0;
            if (buf > 0) {
                sum += 1;
                buf--;
            }
            if (sum > 1) {
                buf++;
                sb.append(sum%2);
            } else {
                sb.append(sum);
            }

            i--;
            j--;
        }
        while (buf-- > 0) sb.append('1');

        return sb.reverse().toString();
    }
}