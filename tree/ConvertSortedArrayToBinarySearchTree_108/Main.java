package ConvertSortedArrayToBinarySearchTree_108;

import TreeNode.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode tree = s.sortedArrayToBST(nums);
        System.out.println(tree.val);
    }
}