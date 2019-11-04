package BinaryTreeLevelOrderTraversalII_107;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 */

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, root, 0);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(list.get(i));
        }
        return res;
    }

    private void helper(List<List<Integer>> list, TreeNode node, int level) {
        if (node == null) return;
        if (list.size() <= level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);
        helper(list, node.left, level + 1);
        helper(list, node.right, level + 1);
    }
}