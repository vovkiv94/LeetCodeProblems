package ConstructBinaryTreeFromInorderAndPostorderTraversal_106;

import TreeNode.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] inorder = new int[]{9, 3, 15, 20};
        int[] postorder = new int[]{9, 15, 20, 3};
        TreeNode tree = s.buildTree(inorder, postorder);
        System.out.println(tree.val);
    }
}