package LongestSubstringWithoutRepeatingCharacters_3;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int slow = 0;
        int fast = 1;
        int max = 1;
        while (fast < s.length()) {
            if(s.charAt(fast) == s.charAt(fast-1)) {
                max = max < fast-1 - slow ? fast-1 - slow : max;
                while(fast < s.length() && s.charAt(fast) == s.charAt(fast-1)) {
                    fast++;
                }
                slow = fast-1;
            } else if(s.charAt(slow) == s.charAt(fast)) {
                max = max < fast - slow ? fast - slow : max;
                slow++;
            } else
                fast++;
        }
        max = max < fast - slow ? fast - slow : max;
        return max;
    }
}