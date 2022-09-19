package week_20_AlgorithamTasks;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArray {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,3,2,1,3,2,2,2,4,2,2,2,2,2,2};

        Map<Integer, Integer> map = new HashMap<>();

//        for (int each : array) {
//            map.put(each, map.getOrDefault(each, 0) + 1);
//        }


        for (int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])){
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1 );

            }

        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> each : map.entrySet()) {
            if(each.getValue() == 1 ){
                System.out.println(each.getKey() + " is one time");
            }else if(each.getValue() == 2){
                System.out.println(each.getKey() + " is two times");
            }else if(each.getValue() > 10){
                System.out.println(each.getKey() + " is more then 10 times");
            }

        }
    }


}
