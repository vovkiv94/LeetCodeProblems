package ValidPalindrome_125;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 */
class Solution {
    public boolean isPalindrome2(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start < end) {
            char l = Character.toLowerCase(s.charAt(start));
            char r = Character.toLowerCase(s.charAt(end));
            if(l < 'a' || l > 'z') start++;
            else if(r < 'a' || r > 'z') end--;
            else if(r!=l) return false;
            start++; end--;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--]))
                return false;
        }
        return true;
    }
}