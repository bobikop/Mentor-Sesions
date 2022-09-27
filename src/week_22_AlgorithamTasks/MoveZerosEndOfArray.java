package week_22_AlgorithamTasks;

import java.util.Arrays;

public class MoveZerosEndOfArray {

    public static void main(String[] args) {

        int[] array = {1,0,2,0,0,7};
        moveZerosToTheEnd(array);
        System.out.println(Arrays.toString(array));

    }
    public static void moveZerosToTheEnd(int[] array) {
        int k = 0; // empty space of array
        for (int eachElement : array) { // check each element of int[] , and if element is not = 0 put it on next free position in the array
            if (eachElement != 0) {
                array[k++] = eachElement;   // moving elements forward so new array will be [ 0, 0, 0, 2, 1, 7]
            }
        }
        for (int i = k; i < array.length; i++) { //using for loop move all 0 to the end of the array
            array[i] = 0;
        }
    }

}
