package CountAndSay;

import java.util.ArrayList;
import java.util.List;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * <p>
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: "1"
 */
class Solution {
    public String countAndSay(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i < n; i++) {
            List<Integer> next = new ArrayList<>();
            int j = 0;
            while (j < res.size()) {
                int k = j + 1;
                while (k < res.size() && res.get(k) == res.get(j)) k++;
                next.add(k - j);
                next.add(res.get(j));
                j = k;
            }
            res = next;
        }

        StringBuilder sb = new StringBuilder();
        for (Integer elem : res) {
            sb.append(elem);
        }
        return sb.toString();
    }
}