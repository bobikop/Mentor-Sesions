package week_15_MapReview;

import java.util.HashMap;
import java.util.Map;

public class Task3_SummationOfTwoSeries {
    public static void main(String[] args) {

        Map<Integer,Double> seriesA = new HashMap<>();
        seriesA.put(1,1.0);
        seriesA.put(2,1.5);
        seriesA.put(3,2.0);
        Map<Integer,Double> seriesB = new HashMap<>();
        seriesB.put(2,1.0);
        seriesB.put(3,2.5);
        seriesB.put(5,1.0);

        System.out.println(summationOfTwoSeries(seriesA,seriesB));
    }

    private static Map<Integer, Double> summationOfTwoSeries(Map<Integer, Double> seriesA, Map<Integer,Double> seriesB){

        Map<Integer, Double> sumMap = new HashMap<>(); // new Map created here
        for (Map.Entry<Integer, Double> entry : seriesA.entrySet()) { // using entrySet adding elements of seriesA to sumMap
            if(!sumMap.containsKey(entry.getKey())){ // checking if there is not already same key in sumMap, if not add that set from Map seriesA
                sumMap.put(entry.getKey(),entry.getValue());// adding new key set form seriesA to sumMap with value
            } //else sumMap.put(entry.getKey(), sumMap.get(entry.getKey()) + entry.getValue());

            }
        for (Map.Entry<Integer, Double> entry : seriesB.entrySet()) {
            if (!sumMap.containsKey(entry.getKey())){
                sumMap.put(entry.getKey(),entry.getValue());
                }else sumMap.put(entry.getKey(), sumMap.get(entry.getKey()) + entry.getValue());

        }
        return sumMap;
        }

}
