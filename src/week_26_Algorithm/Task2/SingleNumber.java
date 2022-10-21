package week_26_Algorithm.Task2;

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));

        System.out.println(singleNumber1(nums));
        System.out.println(singleNumber2(nums));
        System.out.println(singleNumber3(nums));


    }

    //solution 1

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!myMap.containsKey(nums[i])) {
                myMap.put(nums[i], 1);
            } else {
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == 1) {
                return key;
            }
        }

        return -1;
    }


    //solution 2

    public static int singleNumber1(int[] nums) {

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
    // solution 3
    //Time complexity : O(n^2)
    //Space complexity : O(n

    public static int singleNumber2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : nums) {
            if (!list.remove(i)) {
                list.add(i);
            }
        }
        return list.get(0);
    }


    //solution 4
    public static int singleNumber3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return (int) set.toArray()[0];


    }
}

// TASK:
//    Write a method that accepts a non-empty array of integers nums as paramter, every element in
//        given array appears twice except for one. Find that single one.
//        ⮚ You must implement a solution with a linear runtime complexity and use only constant extra
//        space.
//        ⮚ Notes:
//        1 <= nums.length <= 3 * 104
//        -3 * 104 <= nums[i] <= 3 * 104
//        Each element in the array appears twice except for one element which appears only once.