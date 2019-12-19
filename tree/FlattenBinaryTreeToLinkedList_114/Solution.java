package FlattenBinaryTreeToLinkedList_114;

import TreeNode.TreeNode;

/**
 * Given a binary tree, flatten it to a linked list in-place.
 * <p>
 * For example, given the following tree:
 * <p>
 * 1
 * / \
 * 2   5
 * / \   \
 * 3   4   6
 * The flattened tree should look like:
 * <p>
 * 1
 * \
 * 2
 * \
 * 3
 * \
 * 4
 * \
 * 5
 * \
 * 6
 */

class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        helper(root);
    }

    private void helper(TreeNode root) {
        if (root.left != null) {
            TreeNode lastChild = findLastChild(root.left);
            lastChild.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if (root.right != null) {
            helper(root.right);
        }
    }

    private TreeNode findLastChild(TreeNode node) {
        if (node.left == node.right) return node;
        return findLastChild(node.right != null ? node.right : node.left);
    }


    public void flatten2(TreeNode root) {
        flatten(root, null);
    }

    private TreeNode flatten(TreeNode root, TreeNode pre) {
        if (root == null) return pre;
        pre = flatten(root.right, pre);
        pre = flatten(root.left, pre);
        root.right = pre;
        root.left = null;
        pre = root;
        return pre;
    }
}