package BinaryTreeInorderTraversal_94;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        List<Integer> res = s.inorderTraversal(root);
        System.out.println(res);
    }
}