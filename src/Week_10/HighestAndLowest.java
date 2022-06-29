package Week_10;

import java.util.ArrayList;
import java.util.Collections;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highestAndLowest("26356478028373"));
    }

    public static String highestAndLowest(String str){

        String[] strings = str.split("");// use "" to get separate numbers from string

        ArrayList<Integer> list = new ArrayList<>();
        for (String s : strings) { // we itereate all the elements of the array and assign it to arrayList
            list.add(Integer.valueOf(s));
        }
        return Collections.max(list) + " " + Collections.min(list);// then use this methods from Collections

    }
}
