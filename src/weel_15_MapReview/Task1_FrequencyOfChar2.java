package weel_15_MapReview;

import java.util.HashMap;
import java.util.Map;

public class Task1_FrequencyOfChar2 {

    public static Map<Character, Integer> findFrequencyOfChar(String str){
        if (str == null) return null;
        Map<Character, Integer> map = new HashMap<>();
        for( char ch : str.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) +1);
        return map;
    }

    public static void main(String[] args) {
        System.out.println(findFrequencyOfChar("boban"));
    }
}
