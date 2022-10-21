package week_22_Algorithm.Task1;

public class SinglyLinkedList <T extends Number>{
     ListNode head;
     ListNode tail;
     int size;



    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // create a new node object from data
        ListNode node = new ListNode(data);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }

    }

    void printNodes(){
        ListNode current=head;
        while(current!=null){
            if (current.next==null) System.out.println(current.data+"=> null");
            else {
                System.out.print(current.data+"=> ");
            }
            current=current.next;
        }
    }


    public ListNode removeDuplicate( ){

        if(head == null){
            return head;
        }

        ListNode current = head;

        while(current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;

    }

}
