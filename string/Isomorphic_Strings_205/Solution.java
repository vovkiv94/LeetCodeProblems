package Isomorphic_Strings_205;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * Output: true
 */
class Solution {
    // public boolean isIsomorphic(String s, String t) {
    //     Map<Character, Integer> sSet = new HashMap<>();
    //     Map<Character, Integer> tSet = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         if (!Objects.equals(sSet.put(s.charAt(i), i), tSet.put(t.charAt(i), i))) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}