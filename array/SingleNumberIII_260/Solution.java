package SingleNumberIII_260;

/**
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other
 * elements appear exactly twice. Find the two elements that appear only once.
 * <p>
 * Example:
 * <p>
 * Input:  [1,2,1,3,2,5]
 * Output: [3,5]
 * Note:
 * <p>
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
class Solution {
    public int[] singleNumber(int[] nums) {
        int res[] = new int[2];
        int elem = 0;
        for (int num : nums) {
            elem ^= num;
        }
        elem &= -elem;
        for (int num : nums) {
            if ((num & elem) == 0) res[0] ^= num;
            else res[1] ^= num;
        }

        return res;
    }
}