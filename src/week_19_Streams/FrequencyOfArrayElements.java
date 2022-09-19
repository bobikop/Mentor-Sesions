package week_19_Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import static javax.swing.text.html.HTML.Attribute.N;

public class FrequencyOfArrayElements {

//    Write a function that takes a String array as parameter,
//    and returns a map object that contains each element of array as key and their occurrence counts as value.
//    For calculating occurrence, array elements should be checked by regarding case sensitivity.
//    Order is not important.
//    EXAMPLE:
//    Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
//    Output: returning map elements:
//    {Apple=2, apple=1, Cherry=1, Banana=1}

    // solution 1
    public static Map<String, Integer> solutionWithStream1(String[] stringsArray){
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(stringsArray)
                .filter(Objects::nonNull)
                .distinct()
                .forEach(e -> map.put(e, (int)Arrays.stream(stringsArray).filter( p -> p != null && p.equals(e)).count()));
        return map;

    }

    // solution 2
    public static Map<String, Long> solutionWithStream2(String[] strings){
        return Arrays.stream(strings)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }


    // How to convert a positive int to array of digits
//
//
//    EXAMPLE;input; 496
//             output; [4,9,6] as int Array
//
    int[] digits = Integer.toString(490).chars().map(c -> c-'0').toArray();






}
