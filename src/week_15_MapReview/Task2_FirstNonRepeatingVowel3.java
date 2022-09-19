package week_15_MapReview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2_FirstNonRepeatingVowel3 {

    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatingVowel1("boban"));
    }

    public static int getFirstNonRepeatingVowel1(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        String vowels = "aeiou";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (vowels.contains("" + currentChar)) {
                map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

                }
            }
            for (Map.Entry<Character, Integer> each : map.entrySet()) {
                if (each.getValue() == 1) {
                    return input.indexOf(each.getKey());
                }
            }
            return -1;
        }

    }
