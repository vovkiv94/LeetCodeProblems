package PalindromeLinkedList_234;

import ListNode.ListNode;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>
 * Example:
 * <p>
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;

        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode previous = slow;
        ListNode current = slow.next;
        while(current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        while(head != slow) {
            if(head.val != previous.val) return false;
            head = head.next;
            previous = previous.next;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        ListNode start = head;
        int count = 0;
        while(start != null) {
            start = start.next;
            count++;
        }
        start = head;
        for(int i = 0; i < count/2; i++) {
            start = start.next;

        }

        ListNode previous = start;
        ListNode next = previous.next;
        while(next != null) {
            ListNode temp = next;
            next = temp.next;
            temp.next = previous;
            previous = temp;
        }

        for(int i = 0; i < count/2; i++) {
            if(head.val != previous.val) return false;
            head = head.next;
            previous = previous.next;
        }
        return true;
    }
}