package Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal_105;

/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * <p>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * <p>
 * For example, given
 * <p>
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 * Return the following binary tree:
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 */

class Solution {
    int pi = 0;
    int ii = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, null);
    }

    public TreeNode build(int[] preorder, int[] inorder, TreeNode parent) {
        if (pi == preorder.length) return null;
        TreeNode node = new TreeNode(preorder[pi++]);
        if (pi == preorder.length) return node;
        if (node.val != inorder[ii]) {
            node.left = build(preorder, inorder, node);
        }
        ii++;
        if ((parent == null) || inorder[ii] != parent.val) {
            node.right = build(preorder, inorder, node);
        }
        return node;
    }
}