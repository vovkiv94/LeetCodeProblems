package InsertionSortList_147;

import ListNode.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode a = new ListNode(1);
        a.next = new ListNode(2);

        ListNode result = s.insertionSortList(a);
        System.out.print(result);
    }
}