package week_28_Algorithm.Task1;

public class Node {

   public Node next;
    int id;


    public Node(int id) {
        this.id = id;
    }


    static void printNodes(Node head){
        Node current = head;
        while(current != null){
            if (current.next==null) System.out.println(current.id + " => null");
            else {
                System.out.print(current.id+" => ");
            }
            current = current.next;
        }
    }
}
