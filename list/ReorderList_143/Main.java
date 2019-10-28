package ReorderList_143;

import ListNode.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(5);

        s.reorderList(a);
        System.out.print(a);
    }
}