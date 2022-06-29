package week_10_Palindrome;

import java.util.ArrayList;
import java.util.Arrays;

public class StringToArray2 {


    public static void main(String[] args) {

        // first convert String to StringArray

        String str = "Boban Milosevic is very good Java developer!";

        String[] arrayString = null;

        arrayString = str.split(" ");

            System.out.println(Arrays.toString(arrayString));

            // here convert string Array to ArrayList


        System.out.println("------------------------------");


        ArrayList<String> list = new ArrayList<>(Arrays.asList(arrayString));

        System.out.println(list);

        }

    }
