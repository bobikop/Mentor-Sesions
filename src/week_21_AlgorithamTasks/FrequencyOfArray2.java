package week_21_AlgorithamTasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfArray2 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,3,2,1,3,2,2,2,4,2,2,2,2,2,2};

        Map<Integer, Long> map = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("map = " + map);


        List<String> stringList = Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten","more than ten times");
        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " is " + stringList.get(entry.getValue().intValue() - 1) + " times");
        });

    }

    }


