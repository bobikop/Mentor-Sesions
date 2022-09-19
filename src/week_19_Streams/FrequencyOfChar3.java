package week_19_Streams;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChar3 {

    public static char solutionWithStream3(String str) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyMap.keySet().stream()
                .filter(character -> frequencyMap.get(character) == 1).findFirst().orElse(' ');
    }
}