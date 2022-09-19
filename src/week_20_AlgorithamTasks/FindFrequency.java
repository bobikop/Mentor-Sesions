package week_20_AlgorithamTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequency {

    public static void main(String[] args) {

    }

    static void arrayAndMap(int[] arr) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};
        Map<Integer, String> map = new HashMap<>();

        for (int each : arr) {
            int count = 0;
            for (int n : arr) {
                if (each == n) {
                    count++;
                }
            }
            if (count > 10) {
                map.put(each, words[11]);
            } else {
                map.put(each, words[count]);
            }
        }

        map.forEach((k, v) -> System.out.println(k + " is " + v));
    }

    static void withEnumAndMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int each : arr) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        map.forEach((k, v) -> {
            int n = v <= 11 ? v : 11;
            System.out.println(k + " is " + NumberToWord.values()[n].value);
        });
    }

    static void withStreamAndEnum(int[] arr) {
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .forEach((k, v) -> {                            //Map.forEach method
                    int n = v <= 11 ? Math.toIntExact(v) : 11;
                    System.out.println(k + " is " + NumberToWord.values()[n].value);
                });
    }

    enum NumberToWord {
        ZERO("zero"), ONE("one"), TWO("two"), THREE("three"), FOUR("four"), FIVE("five"),
        SIX("six"), SEVEN("seven"), EIGHT("eight"), NINE("nine"), TEN("ten"),
        MORE_THAN_TEN("more than ten");

        final String value;
        NumberToWord(String value){
            this.value = value;
        }
    }


}