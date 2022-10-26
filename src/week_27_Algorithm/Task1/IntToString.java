package week_27_Algorithm.Task1;

import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {

        int num = 2;
        System.out.println(one(5));
        System.out.println(lessThan20(11));
        System.out.println(tens(30));
        System.out.println(twoDigits(36));


    }

    public static String one(int num) {
        switch (num) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";

        }
        return "";
    }

    private static String lessThan20(int num) {
        switch (num) {
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
        }
        return "";
    }

    private static String tens(int num) {
        switch (num) {
            case 20:
                return "Twenty";
            case 30:
                return "Thirty";
            case 40:
                return "Forty";
            case 50:
                return "Fifty";
            case 60:
                return "Sixty";
            case 70:
                return "Seventy";
            case 80:
                return "Eighty";
            case 90:
                return "Ninety";

        }
        return "";
    }

        private static String twoDigits(int num) {

                if (num < 10 ) {
                    return one(num);
                }
                if (num < 20) {
                    return lessThan20(num);
                }
                int tenNum = num / 10;
                int onesNum = num % 10;
                if (tenNum != 0 && onesNum != 0) {
                    System.out.println(tens(tenNum) + "" + one(onesNum));
                }
                if (tenNum != 0) {
                    return tens(tenNum);
                }
                if (onesNum != 0) {

                }
                    return one(onesNum);

        }


//    private static String two(int n) {
//        if (n == 0) return "";
//        if (n < 10) return one(n);
//        if (n < 20) return lessThan20(n);
//        int tenNum = n / 100;
//        int onesNum = n % 10;
//        if (tenner !=0 && rest !=0) {
//            return lessThan20(tenNum) + " " + one(onesNum);
//        }else if  (tenNum !=0){
//            return lessThan20(tenNum);
//        }
//        if (rest != 0) return one(onesNum);
//
//    }











        private static String threeDigit(int num){

        int hundredsNum = num /100;
        int rest = num % 100;
        if (hundredsNum == 0){
            return twoDigits(rest);
        }
        if(rest == 0){
            return one(hundredsNum) + " " + "Hundred";
        }
            return  one(hundredsNum) + " " + "Hundred " + twoDigits(rest);


        }


    public static String numberToWords(int num){

        if (num == 0) return "Zero";
        int billion = num/1000000000;
        num %= 1000000000;
        int million =num/1000000;
        num %= 1000000;
        int thousand = num/1000;
        num %= 1000;


        String rest = "";
        if(billion!=0){
            rest+=threeDigit(billion) + "Billion";
        }
        if(million!=0){
            if (rest.length()!=0)rest+=" ";
            rest+=threeDigit(million) + "Million";
        }
        if(thousand!=0){
            if (rest.length()!=0)rest+=" ";
            rest+=threeDigit(thousand) + "Thousand";
        }
        if(num!=0){
            if (rest.length()!=0)rest+=" ";
            rest+=threeDigit(num);
        }
        return rest;
    }
}













