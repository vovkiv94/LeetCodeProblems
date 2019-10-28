package LongestCommonPrefix_14;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
        return pre;
    }


    // public String longestCommonPrefix(String[] strs) {
    //     if(strs.length == 0) {
    //         return "";
    //     } else if(strs.length == 1) {
    //         return strs[0];
    //     }
    //     StringBuilder sb = new StringBuilder();
    //     int min = Integer.MAX_VALUE;
    //     for(String str : strs) {
    //         int length = str.length();
    //         if(length == 0) return "";
    //         min = str.length() < min ? str.length() : min;
    //     }
    //     for(int i=0; i < min; i++) {
    //         char symb = strs[0].charAt(i);
    //         int j = 1;
    //         while(j<strs.length) {
    //             if(strs[j].charAt(i) != symb) break;
    //             j++;
    //         }
    //         if(j!=strs.length) break;
    //         sb.append(symb);
    //     }
    //     return sb.toString();
    // }
}