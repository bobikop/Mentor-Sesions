package weel_15_MapReview;

import java.util.*;

public class Task1_FrequencyOfChar {

    /*
    Write method that returns the frequency of each character of a given String parameter.
    * If the given String is null, then return null
    * If the given String is empty return empty map

    EXAMPLE 1
    input:""
    output: empty map
    explanation : input is empty
    EXAMPLE 2
    input:null
    output: null
    explanation : input is null
    EXAMPLE 3
    input: responsible
    output: {r=1,e=2,s=2,p=1,o=1,n=1,i=1,b=1,l=1}
    explanation : input is empty

    NOTE:
    Since problem output is focused on frequency we can comfortably use Map data structure.
    Because we can use characters as key and the occurrences of them as a value
     */
    public static Map<Character,Integer> frequencyOfCharacter(String str){ // creating our custom method here

        Map<Character, Integer> map = new LinkedHashMap<>();

        if (str.isEmpty()){ // checking first condition in case when map is empty
            return map;
        } else if (str == null) {
           return null;
        }

        for (String eachChar : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")), eachChar);
            map.put(eachChar.charAt(0), frequency);
        }
        return map;
    }


    public static void main(String[] args) {

        try{
            System.out.println(frequencyOfCharacter("responsible"));
        }catch(NullPointerException e){
            System.out.println((String) null);
        }


    }
}
