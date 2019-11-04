package BinaryTreePreorderTraversal_144;

        import TreeNode.TreeNode;

        import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> res = s.preorderTraversal(root);
        System.out.println(res);
    }
}