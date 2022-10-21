package week_21_Algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,3,9};
        System.out.println("twoSum(numbers, 6) = " + twoSum(numbers, 6));
    }

    public static int[] twoSum(int[] nums, int target) {
        // O(n^2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] findThePairNumbers(int[] arr, int target) {
        int first = 0, last = arr.length - 1;
        Arrays.sort(arr);  // nlog(n)

//        { 2 , 3 , 4 , 6 , 8 , 9 }
//          ^                   ^
        while (first < last) {  //n

            if (arr[first] + arr[last] == target){

                return new int[]{ arr[first] , arr[last] };

            } else if ( arr[first] + arr[last] < target ){
                first++;
            } else {
                last--;
            }
        }
        return new int[0];
    }

    public static int[] findIndicesWithTwoPointerAndHashMap(int[] arr, int target) {
        int first = 0, last = arr.length - 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {  // n
            map.put(arr[i], i);
        }
        Arrays.sort(arr);  // n log(n)

        while (first < last) {  // n
            if (arr[first] + arr[last] == target) {
                return new int[]{map.get(arr[first]), map.get(arr[last])};
            } else if (arr[first] + arr[last] < target) {
                first++;
            } else
                last--;
        }
        return new int[0];
    }
}