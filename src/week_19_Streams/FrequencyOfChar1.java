package week_19_Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FrequencyOfChar1 {
    public static void main(String[] args) {

       char unique =  solutionWithStream("success");
        System.out.println(unique);


    }


    public static char solutionWithStream(String str){

        // Since LinkedHashMap maintains insertion order, and since we are focusing on the FIRST unique char,
        // it is a good decision to implement LinkedHasMap for each character and their frequencies
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0)+1 );
            // this put method adds new character with default frequency as 1
            // and updates the frequency of the existing character which is the key of LinkedHashMap
        }

        Optional<Map.Entry<Character, Integer>> opt =
                frequencyMap.entrySet()//returns key&value pairs of the LinkedHashMap as Entry
                        .stream() // returns the entryset as stream object
                        .filter(p -> p.getValue() == 1)// filters the entries by their value (frequency)
                        .findFirst(); // returns the first entry whose frequency is 1 as Optional
        // (Remember; LinkedHashMap maintains insertion order!)
        if (opt.isPresent()) 	//checks if the opt object keeps a non-null entry
            return opt.get().getKey(); // opt.get() returns the kept entry object.
        // getKey() method returns the key (Character) of the entry object

        return ' '; // if the opt object does not keep an entry value, that means there is no unique chracter

    }



}
