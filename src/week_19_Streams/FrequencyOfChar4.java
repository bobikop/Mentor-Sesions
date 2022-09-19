package week_19_Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfChar4 {
    public static char solutionWithStream2(String str) {

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        str.chars()
                .mapToObj(i -> (char)i).forEach(ch -> frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1));

        return frequencyMap.keySet().stream()
                .filter(ch -> frequencyMap.get(ch) == 1).findFirst().orElse(' ');
    }

}
