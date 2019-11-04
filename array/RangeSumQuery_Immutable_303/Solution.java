package RangeSumQuery_Immutable_303;

/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * <p>
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * <p>
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 */
class NumArray {
    int[] arr;

    public NumArray(int[] nums) {
        arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[i + 1] = arr[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return arr[j + 1] - arr[i];
    }
}