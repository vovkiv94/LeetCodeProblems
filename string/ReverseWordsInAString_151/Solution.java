package ReverseWordsInAString_151;

import java.util.Arrays;
import java.util.Collections;

/**
 * Given an input string, reverse the string word by word.
 * <p>
 * Example 1:
 * <p>
 * Input: "the sky is blue"
 * Output: "blue is sky the"
 */
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public String reverseWords2(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                if (sb.length() != 0) sb.append(" ");
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }
}