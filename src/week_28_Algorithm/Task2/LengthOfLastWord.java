package week_28_Algorithm.Task2;

import java.util.ArrayDeque;
import java.util.Stack;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str="Hello world";

        System.out.println(lengthOfLastWord(str));

    }

    public static String lengthOfLastWord(String str){

        ArrayDeque<String> word = new ArrayDeque<>();
        Stack<String> sentence= new Stack<>();
        String lastWord="";

        for (int i = 0; i < str.length(); i++) {
            sentence.push(""+str.charAt(i));
        }
        while(!sentence.peek().equals(" ")){
            word.add(sentence.pop());
        }

        while(!word.isEmpty()){
            lastWord+=word.removeLast();
        }

        return lastWord;
    }


}