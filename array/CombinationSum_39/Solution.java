package CombinationSum_39;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
 * find all unique combinations in candidates where the candidate numbers sums to target.
 * <p>
 * The same repeated number may be chosen from candidates unlimited number of times.
 * <p>
 * Note:
 * <p>
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 * <p>
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 * [7],
 * [2,2,3]
 * ]
 */
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, result, new ArrayList<>(), target, 0);
        return result;
    }

    public void helper(int[] candidates, List<List<Integer>> result, List<Integer> current, int target, int min) {
        if (0 == target) {
            result.add(new ArrayList(current));
            return;
        }
        if (0 > target) return;
        for (int i = min; i < candidates.length; i++) {
            current.add(candidates[i]);
            helper(candidates, result, current, target - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }
}