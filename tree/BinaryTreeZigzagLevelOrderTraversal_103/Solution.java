package BinaryTreeZigzagLevelOrderTraversal_103;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, 0, root);
        return result;
    }

    void helper(List<List<Integer>> result, int level, TreeNode node) {
        if(node == null) return;
        if(result.size() == level) result.add(new LinkedList<>());
        if(level%2==0) result.get(level).add(node.val);
        else result.get(level).add(0, node.val);

        helper(result, level+1, node.left);
        helper(result, level+1, node.right);
    }
}