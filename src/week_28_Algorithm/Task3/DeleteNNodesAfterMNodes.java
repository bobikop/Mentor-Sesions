package week_28_Algorithm.Task3;

public class DeleteNNodesAfterMNodes {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);
        Node node13 = new Node(13);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;

        int m = 2, n = 3;

        deleteNNodesAfterMNodes(node1, m, n);
    }

    public static void deleteNNodesAfterMNodes(Node nodeHead, int m, int n){
        int count = n;
        Node current = nodeHead;
        Node previous = nodeHead;


        while (current != null){
            if(count >= n){
                count = m;
            }else{
                count = n;
            }
            // traverse first two nodes
            if(count == m){
                while (count != 0){
                    previous = current;
                    current = current.next;
                    count--;
                }
                count = m;
                continue;
            }

            if(count == n){
                while (count != 0){
                    previous.next = current.next;
                    current = current.next;
                    count--;
                    if(current == null) break;
                }
                previous = current;
                count = n;
            }
        }

        current = nodeHead;

        while (current != null){
            System.out.print(current.value + ", ");
            current = current.next;
        }
    }
}