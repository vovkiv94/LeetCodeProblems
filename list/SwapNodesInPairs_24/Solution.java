package SwapNodesInPairs_24;

import ListNode.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 * <p>
 * Example:
 * <p>
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
class Solution {
    // O(n) space, O(n) time
    public ListNode swapPairsRecursively(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head.next;
        head.next = swapPairsRecursively(head.next.next);
        temp.next = head;
        return temp;
    }

    // O(1) space, O(n) time
     public ListNode swapPairs(ListNode head) {
         if(head == null || head.next == null) return head;
         ListNode dummy = new ListNode(0);
         dummy.next = head;
         head = dummy;
         while(head.next != null && head.next.next != null) {
             swap(head);
             head = head.next.next;
         }
         return dummy.next;
     }

     private void swap(ListNode previous) {
         ListNode first = previous.next;
         ListNode second = previous.next.next;
         previous.next = second;
         first.next = second.next;
         second.next = first;
     }
}