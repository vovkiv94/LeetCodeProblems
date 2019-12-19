package PathSumII_113;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * <p>
 * Given the below binary tree and sum = 22,
 * <p>
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \    / \
 * 7    2  5   1
 * Return:
 * <p>
 * [
 * [5,4,11,2],
 * [5,8,4,5]
 * ]
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return null;
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), root, sum);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> current, TreeNode root, int sum) {
        if (root == null) return;
        current.add(root.val);
        if (root.left == root.right && sum - root.val == 0) {
            result.add(new ArrayList(current));
        } else {
            helper(result, current, root.left, sum - root.val);
            helper(result, current, root.right, sum - root.val);
        }
        current.remove(current.size() - 1);
    }
}