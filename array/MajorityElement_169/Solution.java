package MajorityElement_169;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * <p>
 * Your algorithm should run in O(n) complexity.
 * <p>
 * Example:
 * <p>
 * Input: [100, 4, 200, 1, 3, 2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
class Solution {
    public int majorityElement2(int[] nums) {
        int max = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums) {
            int val = map.getOrDefault(num, 0) +1;
            map.put(num, val);
            if(map.getOrDefault(max, 0) < val) max = num;
        }
        return max;
    }
    public int majorityElement(int[] nums) {
        Integer candidate = null;
        int count = 0;
        for(int num: nums) {
            if(count == 0) candidate = num;
            count += candidate == num ? 1 : -1;
        }
        return candidate;
    }
}