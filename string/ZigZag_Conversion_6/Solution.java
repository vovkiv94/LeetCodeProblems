package ZigZag_Conversion_6;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string s, int numRows);
 * Example 1:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 */
class Solution {
    public String convert(String s, int numRows) {
        if(s.length() <= numRows || numRows == 1)
            return s;
        StringBuilder sb = new StringBuilder();
        int dif = 2*numRows-2;
        int curDif = dif;
        for(int i = 0; i< numRows; i++) {
            int j = i;
            while(j<s.length()) {
                sb.append(s.charAt(j));
                if(dif != curDif && j+curDif < s.length()) {
                    sb.append(s.charAt(j + curDif));
                }
                j+= dif;
            }
            curDif -= 2;
            if(curDif == 0) {
                curDif = dif;
            }
        }
        return sb.toString();
    }


    public String convert2(String s, int nRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }
}