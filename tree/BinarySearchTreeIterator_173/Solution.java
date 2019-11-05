package BinarySearchTreeIterator_173;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * <p>
 * Calling next() will return the next smallest number in the BST.
 * <p>
 * Example:
 * <p>
 * 7
 * / \
 * 3  15
 * / \
 * 9   20
 * <p>
 * BSTIterator iterator = new BSTIterator(root);
 * iterator.next();    // return 3
 * iterator.next();    // return 7
 * iterator.hasNext(); // return true
 * iterator.next();    // return 9
 * iterator.hasNext(); // return true
 * iterator.next();    // return 15
 * iterator.hasNext(); // return true
 * iterator.next();    // return 20
 * iterator.hasNext(); // return false
 */

class BSTIterator {
    Stack<TreeNode> st = new Stack<>();


    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode cur = st.pop();
        pushAll(cur.right);
        return cur.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !st.empty();
    }

    private void pushAll(TreeNode node) {
        while(node != null){
            st.push(node);
            node = node.left;
        }
    }
}