package Contains_Duplicate_II_219;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices
 * i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length <= 1) {
            return false;
        }
        if(nums.length == 2) {
            return nums[0] == nums[1];
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< nums.length; i++) {
            if(i > k) {
                set.remove(nums[i - k - 1]);
            }
            if(!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}