package BinaryTreePaths_257;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * <p>
 * Input:
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * <p>
 * Output: ["1->2->5", "1->3"]
 * <p>
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root != null) {
            helper(res, "", root);
        }
        return res;

    }

    private void helper(List<String> res, String cur, TreeNode node) {
        cur += node.val;
        if(node.left == null && node.right == null) {
            res.add(cur);
            return;
        }
        if(node.left != null) {
            helper(res, cur+"->", node.left);
        }
        if(node.right != null) {
            helper(res, cur+"->", node.right);
        }
    }

    public List<String> binaryTreePathsSB(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(res, root, sb);
        return res;
    }

    private void helper(List<String> res, TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }
        int len = sb.length();
        sb.append(root.val);
        if(root.left == null && root.right == null) {
            res.add(sb.toString());
        } else {
            sb.append("->");
            helper(res, root.left, sb);
            helper(res, root.right, sb);
        }
        sb.setLength(len);
    }
}