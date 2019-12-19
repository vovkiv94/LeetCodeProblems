package RotateList_61;

import ListNode.ListNode;

/**
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int length = 1;
        ListNode p = head;
        while (p.next != null) {
            length++;
            p = p.next;
        }
        k = k % length;
        ListNode start = head;
        while (++k != length) start = start.next;

        p.next = head;
        head = start.next;
        start.next = null;

        return head;
    }
}