package BinaryTreeLevelOrderTraversal_102;

import TreeNode.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        List<List<Integer>> res = s.levelOrder(root);
        System.out.println(res);
    }
}