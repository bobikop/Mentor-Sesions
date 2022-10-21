package week_26_Algorithm.Task1;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {


    }




 //solution 1

    boolean isPalindrome (ListNode head){
        if(head == null || head.next == null)  return true; // if have one element is always palindrome

        List<Integer> myList = new ArrayList<>();

        while(head != null){ // Convert LinkedList into ArrayList.
            myList.add(head.data);
            head = head.next;
        }
        // Use two-pointer technique to check for palindrome
        int first = 0;
        int last = myList.size()-1;
        while (first < last){
            if(myList.get(first)!= myList.get(last)) // check the elements and if they are = move first one forward and move last one forward
                return false;
            first++;
            last--;
        }

        return true;
    }


 // solution 2 -stack , time complexity O(n): space complexity O(n):

     public static boolean isPalindrome1(ListNode head){

        ListNode current = head;
        boolean isPalindrome= true;

        Stack<Integer> stack = new Stack<>();

         while (current != null) {
             stack.push(current.data);
             current = current.next;
         }
         while (head!=null){
             int i = stack.pop();
             if(head.data == i){
                 isPalindrome=true;
             }else{
                 isPalindrome=false;
                 break;
             }
             head = head.next;

         }
        return isPalindrome;
     }


    //solution 3
    public static boolean isPalindrome2(ListNode head){

        ListNode slow = head;
        ListNode fast = head;
        // first we are finding middle point
        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half of Linked list

       ListNode prev = slow;
        slow = slow.next;
        prev.next = null;

        while (slow != null){
          ListNode  temp = slow.next;
          prev = slow;
          slow = temp;
        }
        // check first half and second half

        fast = head;
        slow = prev;
        while( slow != null){
            if(fast.data != slow.data) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }


}
