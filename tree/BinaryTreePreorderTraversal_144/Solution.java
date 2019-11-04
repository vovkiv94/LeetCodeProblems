package BinaryTreePreorderTraversal_144;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Example:
 * <p>
 * Input: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * Output: [1,2,3]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<>();

        while (root != null) {
            res.add(root.val);
            if (root.right != null) {
                st.push(root.right);
            }
            root = root.left;
            if (root == null && !st.empty()) {
                root = st.pop();
            }
        }
        return res;
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        traverse(res, root);
        return res;
    }

    private void traverse(List<Integer> res, TreeNode node) {
        if (node == null) return;
        res.add(node.val);
        traverse(res, node.left);
        traverse(res, node.right);
    }
}