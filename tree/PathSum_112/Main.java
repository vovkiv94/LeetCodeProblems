package PathSum_112;

import TreeNode.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode root = new TreeNode(-2);
        root.right = new TreeNode(-2);

        boolean res = s.hasPathSum(root, -5);
        System.out.println(res);
    }
}