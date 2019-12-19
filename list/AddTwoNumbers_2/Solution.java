package AddTwoNumbers_2;


import ListNode.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode last = dummy;
        int extra = 0;
        while (l1 != null || l2 != null) {
            int l1v = 0, l2v = 0;
            if (l1 != null) {
                l1v = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l2v = l2.val;
                l2 = l2.next;
            }

            int sum = l1v + l2v + extra;
            ListNode current = new ListNode(sum % 10);
            last.next = current;
            last = current;
            extra = sum / 10;
        }
        if (extra != 0) {
            last.next = new ListNode(extra);
        }
        return dummy.next;
    }
}