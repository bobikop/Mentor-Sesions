package week_24_Algorithm;

public class FindGreaterElements1 {

    public static void find(int[] array){

        int max = Integer.MIN_VALUE;

        for (int i = array.length-1; i >=0 ; i--) {
            if (array[i]> max){
                max = array[i];
                System.out.println(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int [] ar = { 14,16,5,9,4,2};

       find(ar);
    }



}


//    Given an unsorted integer array, print all greater elements than all elements present to their right using Stack.
//        • For example, consider the array [10, 4, 6, 3, 5]. The elements that are greater than all elements to their right are 10, 6,
//        and 5.
//        • 10 > 4 & 10 > 6 & 10 > 3 & 10 > 5