package StringToInteger_8;

/**
 * Implement atoi which converts a string to an integer.
 * Note:
 * <p>
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1].
 * If the numerical value is out of the range of representable values, INT_MAX (231 − 1)
 * or INT_MIN (−231) is returned.
 */
class Solution {
    public int myAtoi(String str) {
        boolean isMinus = false;
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') i++;
        if (i == str.length()) return 0;
        else if (str.charAt(i) == '-') {
            isMinus = true;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }
        int numb = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') break;
            int n = c - '0';

            if (!isMinus && (Integer.MAX_VALUE / 10 < numb || (Integer.MAX_VALUE / 10 == numb && n > 7))) {
                return Integer.MAX_VALUE;
            } else if (isMinus && (Integer.MAX_VALUE / 10 < numb || (Integer.MAX_VALUE / 10 == numb && n > 8))) {
                return Integer.MIN_VALUE;
            }

            numb = numb * 10 + n;
            i++;
        }

        return isMinus ? -numb : numb;

    }
}