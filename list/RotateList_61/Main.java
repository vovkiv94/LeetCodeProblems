package RotateList_61;

import ListNode.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(1);
        a.next.next.next = new ListNode(1);

        ListNode result = s.rotateRight(a, 3);
        System.out.print(result);
    }
}