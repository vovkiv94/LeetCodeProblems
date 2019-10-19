package Minimum_Size_Subarray_Sum_209;

/**
 * Given an array of n positive integers and a positive integer s,
 * find the minimal length of a contiguous subarray of which the sum ≥ s.
 * If there isn't one, return 0 instead.
 * <p>
 * Example:
 * <p>
 * Input: s = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: the subarray [4,3] has the minimal length under the problem constraint.
 */
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int min = nums.length + 1, j = 0, i = 0, sum = 0;
        while (i < nums.length) {
            sum += nums[i++];
            while (sum >= s) {
                min = Math.min(min, i - j);
                if (min == 1) return 1;
                sum -= nums[j++];
            }
        }
        return min == nums.length + 1 ? 0 : min;
    }
}