package MergeTwoSortedLists_21;


import ListNode.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode start = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                start = start.next = l1;
                l1 = l1.next;
            } else {
                start = start.next = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null) start.next = l1;
        if (l2 != null) start.next = l2;

        return dummy.next;
    }
}