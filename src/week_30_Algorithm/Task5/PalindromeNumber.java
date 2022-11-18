package week_30_Algorithm.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PalindromeNumber {



    public static boolean isPalindrome(int x){

        if(x < 0 || x % 10 == 0 && x !=0){
            return false;
        }

        // x = 1221
        int r = 0;

        while(x > r){
            r = r * 10 + x % 10; // 0 * 10 + 1221%10=1 ....r = 1
            x = x / 10;  // x = 1221 /10 = 122
        }


        return r == x || r / 10 == x;
    }


    public static void main(String[] args) {

        int x = 121;
        System.out.println(isPalindrome(x));

    }
}



//Given an integer x, return true if x is a palindrome, and false otherwise.
