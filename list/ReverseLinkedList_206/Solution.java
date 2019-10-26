package ReverseLinkedList_206;

import ListNode.ListNode;

/**
 * Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
class Solution {
     public ListNode reverseList(ListNode head) {
         ListNode previous = null;
         ListNode current = head;
         while(current != null) {
             ListNode temp = current.next;
             current.next = previous;
             previous = current;
             current = temp;
         }
         return previous;
     }

    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}