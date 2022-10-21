package week_23_Algorithm.FindCyrcle;

public class Solution1 {

    static ListNode detectCycleWithTwoPointers(ListNode head) {

        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                ListNode firstNode = head;
                ListNode intersection = fast;

                while (firstNode != intersection) {
                    intersection = intersection.next;
                    firstNode = firstNode.next;
                }

                return firstNode;
            }
        }

        return null;
    }
}
