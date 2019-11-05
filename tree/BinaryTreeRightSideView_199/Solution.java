package BinaryTreeRightSideView_199;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 * <p>
 * Example:
 * <p>
 * Input: [1,2,3,null,5,null,4]
 * Output: [1, 3, 4]
 * Explanation:
 * <p>
 * 1            <---
 * /   \
 * 2     3         <---
 * \     \
 * 5     4       <---
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(res, root, 0);
        return res;
    }

    private void helper(List<Integer> res, TreeNode node, int level) {
        if (node == null) return;
        if (res.size() <= level) res.add(node.val);
        helper(res, node.right, level + 1);
        helper(res, node.left, level + 1);
    }
}