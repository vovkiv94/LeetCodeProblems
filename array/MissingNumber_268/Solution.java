package MissingNumber_268;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,0,1]
 * Output: 2
 */
class Solution {
    public int missingNumber(int[] nums) {
        //sum of all indexes gives as a sum of array without missed element
        //sum of all values gives as a sum of array with missed element
        //difference gives us missed element
        int result = nums.length;
        for(int i = 0; i< nums.length; i++) {
            result += i-nums[i];
        }

        return result;
    }
    public int missingNumber2(int[] nums) {
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res = res ^ i ^ nums[i]; // a^b^b = a
        }
        return res;
    }
}