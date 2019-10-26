package Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal_106;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] inorder = new int[]{9, 3, 15, 20};
        int[] postorder = new int[]{9, 15, 20, 3};
        TreeNode tree = s.buildTree(inorder, postorder);
        System.out.println(tree.val);
    }
}