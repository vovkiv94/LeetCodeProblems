package LongestConsecutiveSequence_128;

import java.util.HashSet;
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
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }
        int maxLength = 0;
        for (Integer el : numsSet) {
            if(!numsSet.contains(el-1)) {
                int currentLength = 1;
                int val = el + 1;
                while (numsSet.contains(val++)) {
                    currentLength++;
                }
                maxLength = maxLength < currentLength ? currentLength : maxLength;
            }
        }
        return maxLength;
    }
}