package RemoveNthNodeFromEndOfList_19;

import ListNode.ListNode;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * <p>
 * Example:
 * <p>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * <p>
 * Given n will always be valid.
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode previous = head;
        ListNode start = head;
        for (int i = 0; i < n; i++) {
            start = start.next;
        }
        if (start == null) { // remove first element;
            head = head.next;
        } else {
            while (start.next != null) {
                start = start.next;
                previous = previous.next;
            }
            previous.next = previous.next.next;
        }
        return head;
    }
}