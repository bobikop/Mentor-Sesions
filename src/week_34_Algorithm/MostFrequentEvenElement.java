package week_34_Algorithm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MostFrequentEvenElement {

    public static void main(String[] args) {

        int[] arr = {1,2,2,6,3,3,4};
        System.out.println(mostFrequentEvenElement(arr));
    }


    public static int mostFrequentEvenElement(int [] nums){

        Map<Integer,Integer> map = new TreeMap();
        int ans = Integer.MAX_VALUE;
        for(int i : nums){
            if(i%2 == 0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i : map.keySet()){
            if(max < map.get(i)){
                max = map.get(i);
                ans = i;
            }
        }

        if(ans == Integer.MAX_VALUE)return -1;

        return ans;

    }
}
