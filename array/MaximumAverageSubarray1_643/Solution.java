package MaximumAverageSubarray1_643;

/**
 * Given an array consisting of n integers, find the contiguous subarray of
 * given length k that has the maximum average value.
 * And you need to output the maximum average value.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0, sum = 0, max = 0;
        while (j < k) {
            sum += nums[j++];
        }
        max = sum;
        while (j < nums.length) {
            sum = sum + nums[j++] - nums[i++];
            max = Math.max(max, sum);
        }
        return ((double) max) / k;
    }
}