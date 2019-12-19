package MinimumDepthOfBinaryTree_111;

import TreeNode.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        int res = s.minDepth(root);
        System.out.println(res);
    }
}