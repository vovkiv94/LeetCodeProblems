package InsertionSortList_147;

import ListNode.ListNode;

/**
 * Algorithm of Insertion Sort:
 * <p>
 * Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data, finds the location
 * it belongs within the sorted list, and inserts it there.
 * It repeats until no input elements remain.
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while (head != null) {
            ListNode temp = head.next;

            if (prev.val >= head.val) prev = dummy;

            while (prev.next != null && prev.next.val < head.val) {
                prev = prev.next;
            }
            head.next = prev.next;
            prev.next = head;
            head = temp;
        }
        return dummy.next;
    }

    public ListNode insertionSortList2(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null) {
            ListNode previous = dummy;
            ListNode current = dummy.next;
            while (fast.val > current.val) {
                previous = current;
                current = current.next;
            }
            if (fast != current) {
                slow.next = fast.next;
                fast.next = current;
                previous.next = fast;
                fast = slow.next;
            } else {
                slow = fast;
                fast = fast.next;
            }
        }
        return dummy.next;
    }
}