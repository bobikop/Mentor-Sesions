package week_25_Algorithm;

import week_22_Algorithm.Task1.ListNode;

public class IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;// do not have  intersection
//start both pointers in same time
        ListNode a_runner = headA;//assign A ListNode (smaller list)
        ListNode b_runner = headB; // assign B ListNode (biggest list)

        while (a_runner != b_runner) {
            if (a_runner == null) {//if this node is equal to null - mean - we hit end of the list
                a_runner = headB;// and assign to head of NodeList B (the longest list)
            } else {//if it is not end of the list
                a_runner = a_runner.next;
            }
            if (b_runner == null) {
                b_runner = headA;
            } else {
                b_runner = b_runner.next;
            }
        }//while loop until they are meet
        return a_runner;// whe they are meet - they have intersection - return Node
    }
}
