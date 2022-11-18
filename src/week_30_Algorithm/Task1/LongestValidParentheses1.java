package week_30_Algorithm.Task1;

import java.util.Stack;

public class LongestValidParentheses1 {

 public static int longestValidParentheses(String str){


     Stack<Integer> stack = new Stack<>();
     stack.push(-1);
     int max = 0;
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == '('){
             stack.push(i);
         }else{
                 stack.pop();
                 if(stack.isEmpty()){
                     stack.push(i);
                 }else{
                     int resultLength = i - stack.peek();
                      max = Math.max(max,resultLength);
                 }
         }
     }
     return max;
 }


    public static void main(String[] args) {
        String s = "(()";

        System.out.println(longestValidParentheses(s));
    }

}
