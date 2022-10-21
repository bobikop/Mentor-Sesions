package week_24_Algorithm;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums){

        int arrayOfNumbers = nums.length;

        int[] numbersOnLeftSide = new int[arrayOfNumbers];
        int[] numbersOnRightSide = new int[arrayOfNumbers];

        int[] resultArray = new int[arrayOfNumbers];


        numbersOnLeftSide[0]= 1;
        numbersOnRightSide[arrayOfNumbers-1] = 1;


        for (int i = 1; i < arrayOfNumbers; i++) {
            numbersOnLeftSide[i] = nums[i-1] * numbersOnLeftSide[i-1];
        }

        for (int i = arrayOfNumbers-2; i >=0; i--) {
            numbersOnRightSide[i] = nums[i+1] * numbersOnRightSide[i+1];
        }


        for (int i = 0; i < arrayOfNumbers; i++) {
            resultArray[i] = numbersOnLeftSide[i] * numbersOnRightSide[i];

        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] numsTest = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(numsTest)));

    }



}


//• Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements
//        of nums except nums[i].
//• The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//• You must write an algorithm that runs in O(n) time and without using the division operation.