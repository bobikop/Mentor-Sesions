package week_24_Algorithm;

import java.util.Stack;

public class FindGreaterElementsStack {

    public static void find(int[] arr){

        Stack<Integer> myStack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (myStack.isEmpty()){
                myStack.push(arr[i]);
                }else{

                while(!myStack.isEmpty() && myStack.peek() < arr[i]){
                    myStack.pop();

                }
                myStack.push(arr[i]);
            }
        }
        while(!myStack.empty()){
//            myStack
        }

    }

    public static void main(String[] args) {

        int[] arr = {10,4,6,3,5};
    }

}
