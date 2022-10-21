package week_21_Algorithm;

import java.util.Arrays;
import java.util.Collections;

public class TwoSum1 {

    public static void main(String[] args) {
        Integer [] array = {16,3,11,5,15};

        System.out.println(Arrays.toString(twoSumTwoPointer(array,8)));

    }


    public static int[] twoSumTwoPointer(Integer[] array, int targetValue){

        Collections.sort(Arrays.asList(array)); // {3,5,11,15,16}

//        List<Integer> list = Arrays.stream(array).boxed()
//                .sorted()
//                .collect(Collectors.toList());
//
//        Integer [] numbers = list.toArray(new Integer[list.size()]);

        int low = 0;

        int high = array.length -1;

        while(array[low] + array[high] != targetValue){
            if (array[low] + array[high] < targetValue){
                low++;
            }else{
                high--;

            }

        }

        return new int[]{array[low], array[high]};
    }

}