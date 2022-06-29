package week_09_splitterApp;

import java.util.Arrays;

public class CharRepeat {


    public static void main(String[] args) {

              String str = "ininsssininsss";


            str =  str.toLowerCase(); // aabbcde

            char[] eachCh = str.toCharArray(); // [a,a,b,b,c,d,e]

            System.out.println(Arrays.toString(eachCh));

            String result = "";

            for (char eachElement : eachCh) {

                int countUpperLower = 0;

                int count_digits = 0;

                if (Character.isLetter(eachElement) ) {

                    for (char eachInArr : eachCh) {


                        if (eachElement == eachInArr){
                            countUpperLower++;
                        }

                    }

                    if (!result.contains(""+eachElement) && (countUpperLower > 1)){
                        result += eachElement + " repeats : "+ countUpperLower + " times "+"\n" ;
                    }

                }

                if(Character.isDigit(eachElement)){

                    for (char eachInArr : eachCh) {

                        if (eachElement == eachInArr){
                            count_digits++;
                        }

                    }

                    if (!result.contains(""+eachElement) && (count_digits != 1)){
                        result += eachElement + " repeats : "+ count_digits + " times "+"\n" ;
                    }




                }





            }


        System.out.println(result);

        }

    }

