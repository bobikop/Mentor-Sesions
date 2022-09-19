package week_19_Streams;

import java.util.LinkedHashMap;

public class FrequencyOfChar2 {
    public static void main(String[] args) {

    }

    public static char solutionWithStream (String str){
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch,0)+1);
        }
        return frequencyMap.keySet().stream().filter(ch -> frequencyMap.get(ch) == 1).findFirst().orElse(' ');
    }
}
