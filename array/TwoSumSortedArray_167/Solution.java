package TwoSumSortedArray_167;
/**
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ps = 0;
        int pe = numbers.length - 1;
        while (ps < pe) {
            int sum = numbers[ps] + numbers[pe];
            if (sum == target) return new int[]{ps + 1, pe + 1};
            if (sum > target) pe--;
            else if (sum < target) ps++;
        }
        return null;
    }
}