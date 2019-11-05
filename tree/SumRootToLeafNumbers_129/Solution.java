package SumRootToLeafNumbers_129;

import TreeNode.TreeNode;

import java.util.Stack;

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * <p>
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * <p>
 * Find the total sum of all root-to-leaf numbers.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * <p>
 * Input: [1,2,3]
 * 1
 * / \
 * 2   3
 * Output: 25
 * Explanation:
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * Therefore, sum = 12 + 13 = 25.
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(0, root);
    }

    private int helper(int cur, TreeNode node) {
        if (node == null) return 0;
        int numb = cur * 10 + node.val;
        if (node.left == node.right) return numb;
        return helper(numb, node.left) + helper(numb, node.right);
    }
}