package WordPattern_290;

import java.util.*;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * <p>
 * Example 1:
 * <p>
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.get(words[i]) == null) {
                if (set.contains(pattern.substring(i, i + 1))) {
                    return false;
                }
                set.add(pattern.substring(i, i + 1));
                map.put(words[i], i);
            } else if (pattern.charAt(map.get(words[i])) != pattern.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean wordPattern2(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i = 0; i < words.length; ++i)
            if (!Objects.equals(index.put(pattern.charAt(i), i), index.put(words[i], i)))
                return false;
        return true;
    }

}