package week_25_Algorithm;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String roman) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;

        for (int i = 0; i < roman.length(); i++) {

            if(roman.charAt(i) == 'V' || roman.charAt(i) == 'X'){
                if (i>0 && roman.charAt(i-1) == 'I') num = num - 2;
            }
            if(roman.charAt(i) == 'L' || roman.charAt(i) == 'C'){
                if (i>0 && roman.charAt(i-1) == 'X') num = num - 20;
            }
            if(roman.charAt(i) == 'D' || roman.charAt(i) == 'M'){
                if (i>0 && roman.charAt(i-1) == 'C') num = num - 200;
            }
            num = num + map.get(roman.charAt(i));
        }
            return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
