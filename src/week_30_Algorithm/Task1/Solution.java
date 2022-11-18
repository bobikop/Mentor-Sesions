package week_30_Algorithm.Task1;

import java.util.ArrayDeque;
import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        if(s==null || s.length()==1) return 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(!stack.isEmpty() && s.charAt(i)=='(' && s.charAt(stack.peek())==')'){
                stack.pop();
            }
            else{stack.push(i);}
        }
        int index=-1;
        int res=0;
        for(int n:stack){
            res=Math.max(res,n-index-1);
            index=n;
        }
        res= Math.max(res,s.length()-index-1);
        return res;
    }
}