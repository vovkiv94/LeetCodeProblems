package RemoveLinkedListElements_203;

import ListNode.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode a = new ListNode(1);
        a.next = new ListNode(1);

        ListNode result = s.removeElements(a, 1);
        System.out.print(result);
    }
}