package ConstructBinaryTreeFromPreorderAndInorderTraversal_105;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] preorder = new int[]{3, 1, 2, 4};
        int[] inorder = new int[]{1, 2, 3, 4};
        TreeNode tree = s.buildTree(preorder, inorder);
        System.out.println(tree.val);
    }
}