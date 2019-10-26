package ImplementStrStr_28;

/**
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty() || haystack.length() < needle.length()) return -1;
        if (haystack.length() == needle.length()) {
            return haystack.equals(needle) ? 0 : -1;
        }

        int k = 0, l = 0;
        while (k < haystack.length()) {
            if (haystack.charAt(k) == needle.charAt(l)) {
                l++;
                if (l == needle.length()) return k - l + 1;
            } else {
                k = k - l;
                l = 0;
            }
            k++;
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

}