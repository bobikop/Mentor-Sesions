package week_34_Algorithm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfWord1 {

    //        Write a method that returns count the number of times each word appears in
    //        the sentence, insensitive (can be capitol or Lower letters);

    public static void main(String[] args) {

    String str = "This is an example of Example";
    frequencyOfWord(str);

    }
    public static void frequencyOfWord(String str){

        Map<String, Integer> myMap = new LinkedHashMap<>(); // use LinkedHashmap case is keeps insertion order ( correct print)

        String[] arr = str.toLowerCase().split(" "); // convert String to array with split();

        for(int i = 0; i < arr.length; i++){

            if(myMap.containsKey(arr[i])){ // if K (This) is already in the map increase V for 1
                myMap.put(arr[i], myMap.get(arr[i]) +1);
            }else{
                myMap.put(arr[i], 1);
            }
        }
        for(Map.Entry<String, Integer> eachEntry : myMap.entrySet()){
            System.out.print(eachEntry.getKey() + " = " + eachEntry.getValue() + "; ");
        }

    }

}
