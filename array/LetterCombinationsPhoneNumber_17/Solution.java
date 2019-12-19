package LetterCombinationsPhoneNumber_17;

import java.util.*;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * Example:
 * <p>
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
class Solution {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        helper(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void helper(List<String> result, StringBuilder current, String digits, int start) {
        if (start == digits.length()) result.add(current.toString());
        else {
            for (char c : KEYS[digits.charAt(start) - '0'].toCharArray()) {
                helper(result, current.append(c), digits, start + 1);
                current.setLength(current.length() - 1);
            }
        }
    }
}