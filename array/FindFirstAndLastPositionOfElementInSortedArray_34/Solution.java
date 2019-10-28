package FindFirstAndLastPositionOfElementInSortedArray_34;

/**
 * Given an array of integers nums sorted in ascending order,
 * find the starting and ending position of a given target value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = 0;

        if (target > nums[nums.length - 1] || target < nums[0]) {
            return new int[]{-1, -1};
        } else if (nums[0] == target && nums[nums.length - 1] == target) {
            return new int[]{0, nums.length - 1};
        } else if (nums[nums.length - 1] == target) {
            l = r = nums.length - 1;
        } else if (nums[0] != target) {
            int targetIndex = -1;
            r = nums.length - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (nums[mid] > target) r = mid - 1;
                else if (nums[mid] < target) l = mid + 1;
                else {
                    targetIndex = mid;
                    break;
                }
            }
            if (targetIndex < 0) {
                return new int[]{-1, -1};
            }
            l = r = targetIndex;
        }
        while (l > 0 && nums[l-1] == target) {
            l--;
        }
        while (r < nums.length-1 && nums[r+1] == target) {
            r++;
        }
        return new int[]{l, r};
    }
}