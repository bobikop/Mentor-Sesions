package weel_15_MapReview;

import java.util.HashMap;
import java.util.Map;

public class Task3_SummationOfTwoSeries2 {

    public static void main(String[] args) {
        Map<Integer,Double> map1 = new HashMap<>();
        map1.put(1,1.0);
        map1.put(2,1.5);
        map1.put(3,2.0);
        Map<Integer,Double> map2 = new HashMap<>();
        map2.put(2,1.0);
        map2.put(3,2.5);
        map2.put(5,1.0);

        System.out.println(sumOfTwoTimeSeries(map1,map2));

    }


   public static Map<Integer, Double> sumOfTwoTimeSeries(Map<Integer, Double> map1, Map<Integer, Double> map2){
       Map<Integer, Double> result = new HashMap<>();

       map2.forEach((k,v) -> result.put(k, result.getOrDefault(k,0d) + v));
       return result;
   }
}
