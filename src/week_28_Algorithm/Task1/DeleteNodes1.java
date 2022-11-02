package week_28_Algorithm.Task1;

public class DeleteNodes1 {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next = new Node(10);
        head.next.next.next.next.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next.next.next.next.next = new Node(12);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new Node(13);


        //solution 1
        Node.printNodes(head);
        skipAndDeleteNode(head, 3, 2);
        Node.printNodes(head);

        //solution 2
        removeMAfterN(head,3,2);
        Node.printNodes(head);

    }

    public static Node skipAndDeleteNode(Node head, int m, int n) {

        Node current = head;
        Node previous = head;

        while (current != null) {
            int mCount = m;
            int nCount = n;

            while(current != null && mCount !=0){
                previous = current;
                current = current.next;
                mCount--;
            }
            while(current != null && nCount != 0){
                current = current.next;
                nCount--;
            }

             previous.next = current;
        }
        return head;
    }


    //solution 2
    public static Node removeMAfterN(Node head, int m, int n){
        Node current = head;
        while (current != null){
            int countM = 1, countN = 1;
            while(countM < m){
                current = current.next;
                countM++;
            }
            while(countN <= n && current.next != null){
                current.next = current.next.next;
                countN++;
            }
            current = current.next;
        }
        return head;
    }
}
