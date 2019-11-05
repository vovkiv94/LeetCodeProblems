package BinarySearchTreeIterator_173;

import TreeNode.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        BSTIterator iterator = new BSTIterator(root);

        iterator.next();
        iterator.next();
    }
}