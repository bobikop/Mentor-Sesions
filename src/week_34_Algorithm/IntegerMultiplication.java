package week_34_Algorithm;

import java.util.Arrays;




public class IntegerMultiplication {


//    Given an array of integers, update every element with the multiplication of previous and next elements with the
//    following exceptions.
//    a) The First element is replaced the by multiplication the of first and second.
//        b) The last element is replaced by multiplication of the last and second last
//    Input : arr[] = {2, 3, 4, 5, 6}
//    Output : arr[] = {6, 8, 15, 24, 30}

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        integerMultiplication(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }

    public static void integerMultiplication(int [] arr){
        int s = arr.length;
        if (s <= 1){
            System.out.println("There is no elements for multiplication");
        }
        int prev = arr[0]; // first element multiple only with next one
        arr[0] = arr[0] * arr[1];
        for (int i = 1; i < s - 1; i++) {
            int current = arr[i];
            arr[i] = prev * arr[i + 1];
            prev = current;
        }

        arr[s-1] = arr[s-1] * prev;  //last element multiply only with previous one
    }


}
