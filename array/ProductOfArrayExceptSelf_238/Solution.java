package ProductOfArrayExceptSelf_238;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is
 * equal to the product of all the elements of nums except nums[i].
 * <p>
 * Example:
 * <p>
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Note: Please solve it without division and in O(n).
 * <p>
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space
 * for the purpose of space complexity analysis.)
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        L[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            L[i] = L[i - 1] * nums[i - 1];
        }
        int R = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            L[i] = L[i] * R;
            R *= nums[i];
        }
        return L;
    }
}