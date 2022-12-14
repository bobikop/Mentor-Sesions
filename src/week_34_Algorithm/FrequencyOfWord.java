package week_34_Algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FrequencyOfWord {

    public static void main(String[] args) {

//        Write a method that returns count the number of times each word appears in
//        the sentence
        
        String input = "My name is Boban is my name".toLowerCase();

        //using String split function
        String[] words = input.split(" ");
        System.out.println(Arrays.toString(words));

        //using java.util.regex Pattern
//        Pattern pattern = Pattern.compile(" ");
//        words = pattern.split(input);
//        System.out.println(Arrays.toString(words));

        System.out.println(solutionWithStream1(words));
        System.out.println(solutionWithStream2(words));

    }

    public static Map<String, Integer> solutionWithStream1(String[] stringsArray){
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(stringsArray)
                .filter(Objects::nonNull)
                .distinct()
                .forEach(e -> map.put(e, (int)Arrays.stream(stringsArray).filter( p -> p != null && p.equals(e)).count()));
        return map;

    }


    public static Map<String, Long> solutionWithStream2(String[] strings){
        return Arrays.stream(strings)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

}


