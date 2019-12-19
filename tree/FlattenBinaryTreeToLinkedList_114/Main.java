package FlattenBinaryTreeToLinkedList_114;

import TreeNode.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        s.flatten(root);
        System.out.println(root);
    }
}