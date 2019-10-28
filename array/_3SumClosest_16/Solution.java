package _3SumClosest_16;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target,
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 * <p>
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE - Math.abs(target);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, k = nums.length - 1;
            while (l < k) {
                int sum = nums[i] + nums[l] + nums[k];
                if (sum == target) return target;
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if (sum > target) {
                    while (l < k && nums[k] == nums[--k]) {
                    }
                }
                if (sum < target) {
                    while (l < k && nums[l] == nums[++l]) {
                    }
                }
            }
        }
        return closest;
    }
}