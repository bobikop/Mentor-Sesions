package week_22_AlgorithamTasks.Task1;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> myList = new SinglyLinkedList<Integer>();
        myList.add(1);
        myList.add(1);
        myList.add(3);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(6);

        myList.printNodes();

        myList.removeDuplicate();
        myList.printNodes();

    }


}
