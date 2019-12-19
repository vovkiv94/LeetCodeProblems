package Subset_II_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 * <p>
 * Example:
 * <p>
 * Input: [1,2,2]
 * Output:
 * [
 * [2],
 * [1],
 * [1,2,2],
 * [2,2],
 * [1,2],
 * []
 * ]
 */
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> ret = new ArrayList<>();
        ret.add(new ArrayList<>());

        int size = 0, startIndex;
        for (int i = 0; i < num.length; i++) {
            startIndex = (i >= 1 && num[i] == num[i - 1]) ? size : 0;
            size = ret.size();
            for (int j = startIndex; j < size; j++) {
                List<Integer> temp = new ArrayList<>(ret.get(j));
                temp.add(num[i]);
                ret.add(temp);
            }
        }
        return ret;
    }
}