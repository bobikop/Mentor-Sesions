package week_19_Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String st= "souccess";
        System.out.println(findFirstUniqueCharacter(st));



    }


    //SOLUTION 1
    public static Character findFirstUniqueCharacter(String str){

        // create map first
        Map<Character,Integer> map = new LinkedHashMap<>();
        int count;

        //cont the frequency of chars
        for( Character ch : str.toCharArray()){
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch, count + 1);
            }
            else map.put(ch,1);
        }
        // start from the beginning and check if there is a char with frequency 1
        for(Character ch:str.toCharArray()){
            if(map.get(ch)==1) return ch;
        }
        return null;
    }

      //  SOLUTION 2 regular non stream solution
     public static char solutionWithFor (String str) {
         for (int i = 0; i < str.length(); i++) {
             int frequency = 0; // keeps frequency of each character

             for (int j = 0; j < str.length(); j++) {
                 if (str.charAt(i) == str.charAt(j)){
                     frequency++;
                 }
             }
             if (frequency == 1) { //checks if current character frequency is 1
                 return str.charAt(i); //returns the character whose frequency is 1, no need to check rest
         }

         }
         return ' '; // if the opt object does not keep an entry value, that means there is no unique character.
     }



}
/*

Write a function that returns the first non-repeated
character from a string.
If all characters are repeated return a space character.

EXAMPLE:
Input: "success"
output: u
Explanation:
u and e are non-repeated,u is the first non-repeated character


Tip:
Since the focus is on the FIRST non-repeated character the
LinkedHashMap class can be implemented. Because
LinkedHashMap class maintains insertion order.
Tip:
Character can be KEY of the LinkedHashMap, frequency can
be VALUE of the LinkedHashMap.
*/