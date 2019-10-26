package Binary_Tree_Inorder_Traversal_94;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
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
 * Output: [1,3,2]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            traverse(root, list);
        }
        return list;

    }

    private void traverse(TreeNode node, List<Integer> list) {
        if (node.left != null) {
            traverse(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            traverse(node.right, list);
        }
    }
}