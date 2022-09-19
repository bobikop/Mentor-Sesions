package week_15_MapReview;

import java.util.LinkedHashMap;
import java.util.Map;

public class SummationOfTwoSeries {
    public static void main(String[] args) {

        Map<Integer, Double> seriesA = new LinkedHashMap<>();
        seriesA.put(1, 1.0);
        seriesA.put(2, 1.5);
        seriesA.put(3, 2.0);

        Map<Integer, Double> seriesB = new LinkedHashMap<>();
        seriesB.put(2, 1.0);
        seriesB.put(3, 2.5);
        seriesB.put(5, 1.0);

        Map<Integer, Double> seriesC = new LinkedHashMap<>();
        seriesC.putAll(seriesA);
        seriesC.putAll(seriesB);

        for (Map.Entry<Integer, Double> entry : seriesA.entrySet()) {


            for (Map.Entry<Integer, Double> entry2 : seriesB.entrySet()) {

                if (entry.getKey() == entry2.getKey()) {

                    seriesC.put(entry.getKey(), (entry.getValue() + entry2.getValue()));
                }


            }


        }


        System.out.println(seriesC);


    }
}
