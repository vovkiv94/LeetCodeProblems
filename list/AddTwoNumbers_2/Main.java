package AddTwoNumbers_2;

import ListNode.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);


        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = l1.next.next;

        ListNode result = s.addTwoNumbers(l1, l2);
        System.out.print(result);
    }
}