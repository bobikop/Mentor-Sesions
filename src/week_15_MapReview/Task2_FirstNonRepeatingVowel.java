package week_15_MapReview;

import java.util.*;

public class Task2_FirstNonRepeatingVowel {
    public static void main(String[] args) {
        String str = "responsible";
        System.out.println(firstNonRepeatingVowel(str));
    }
    public static int firstNonRepeatingVowel(String str){// create custom method here
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'i', 'e', 'o', 'u')); // make list with vowels
        List<String> charList = new ArrayList<>(Arrays.asList(str.split(""))); // make list with new string characters
        Map<Character, Integer> map = new LinkedHashMap<>(); // empty map
        int result = -1;

        for(int i = 0; i < str.length(); i++){ // put characters in the map
            map.put(str.charAt(i), Collections.frequency(charList, charList.get(i)));
        }

        for(Character key: map.keySet()){ // go over keys and return all keys as a set
            for(Character eachVowel: vowels){ // go over vowels
                if(key.equals(eachVowel) && map.get(key) < 2){ // compare vowel with map key and if is repeat one time < 2  return it
                    return str.indexOf(key);
                }
            }
        }
        return result;
    }

}
    /*

    Given String , write a method to find the first non repeating vowel (a,e,i,o,u) in it return its index.
    *** If is does not exist return -1.
    *** Assume that all the characters of the Strings are lowercase
    *** Do not use String class functions other than charAt() and length().
    *** You can also try to solve withMap data structure like using Map<Character, Integer> variable

    EXAMPLE1
    INPUT: google
    OUTPUT: 5
    EXPLANATION: ony e is non repeating vowel, and it's index 5

    EXAMPLE1
    INPUT: mood
    OUTPUT: -1
    EXPLANATION: o is repeated, no non repeating vowel

    EXAMPLE1
    INPUT: responsible
    OUTPUT: 4
    EXPLANATION: e is repeating, o and i are not repeating, o is the first non repeating vowel!

     */