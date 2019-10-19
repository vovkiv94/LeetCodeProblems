package _3Sum_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int sum = -nums[i];
                int l = i + 1;
                int k = nums.length - 1;
                while (l < k) {
                    if (nums[l] + nums[k] == sum) {
                        result.add(Arrays.asList(nums[i], nums[l], nums[k]));
                        while (l < k && nums[l] == nums[++l]) {
                        }
                        while (k > l && nums[k] == nums[--k]) {
                        }
                    } else if (nums[l] + nums[k] < sum) {
                        ++l;
                    } else {
                        --k;
                    }
                }
            }
        }
        return result;
    }
}