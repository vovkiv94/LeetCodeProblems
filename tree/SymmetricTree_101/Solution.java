package SymmetricTree_101;

import TreeNode.TreeNode;

import java.util.Stack;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * <p>
 * <p>
 * But the following [1,2,2,null,3,null,3] is not:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 */

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> s = new Stack<>();

        s.push(root.left);
        s.push(root.right);

        while (!s.empty()) {
            TreeNode r = s.pop();
            TreeNode l = s.pop();
            if (r == l) continue;// both null
            if (l == null || r == null || l.val != r.val)
                return false;
            s.push(l.left);
            s.push(r.right);
            s.push(l.right);
            s.push(r.left);
        }

        return true;
    }

    public boolean isSymmetric1(TreeNode root) {
        if (root == null) return true;
        return sym(root.left, root.right);
    }

    public boolean sym(TreeNode left, TreeNode right) {
        if (left == right) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return sym(left.left, right.right) && sym(left.right, right.left);

    }
}