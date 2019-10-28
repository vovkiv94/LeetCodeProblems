package CombinationSumIII_216;

import java.util.LinkedList;
import java.util.List;

/**
 * Find all possible combinations of k numbers that add up to a number n, given that only numbers
 * from 1 to 9 can be used and each combination should be a unique set of numbers.
 * <p>
 * Note:
 * <p>
 * All numbers will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 * <p>
 * Input: k = 3, n = 7
 * Output: [[1,2,4]]
 */
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new LinkedList<>();
        helper(k, 1, n, new LinkedList<Integer>(), res);
        return res;
    }

    private void helper(int k, int index, int target, LinkedList<Integer> list, List<List<Integer>> res) {
        if (target < 0) {
            return;
        } else if (target == 0 && list.size() == k) {
            res.add(new LinkedList<>(list));
        }
        for (int i = index; i <= 9; i++) {
            if (list.size() < k) {
                list.add(i);
                helper(k, i + 1, target - i, list, res);
                list.remove(list.size() - 1);
            }
        }
    }
}