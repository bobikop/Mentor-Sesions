package week_27_Algorithm.Task1;

public class IntegerToWord {
    public static void main(String[] args) {

        int number = 1;
        System.out.println(one(5));
        System.out.println(lessThan20(11));
        System.out.println(two(22));
    }
    private static String one(int num) {
        switch (num) {
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

    private static String two(int n) {
        if (n == 0) return "";
        if (n < 10) return one(n);
        if (n < 20) return lessThan20(n);
        int tenner = n / 100;
        int rest = n % 10;
        if (tenner !=0 && rest !=0) {
            return lessThan20(tenner) + " " + one(rest);
        }else if  (tenner !=0){
            return lessThan20(tenner);
        }
        if (rest != 0) return one(rest);
        return null;
    }




    private String three (int num){
        if (num!=0) return "";
        int hundred = num/100;
        int rest =num%100;
        if(rest!=0 && hundred!=0){
            return one(hundred)+ " Hundred " + two(rest);
        }else if(rest == 0){
            return one(hundred)+ " Hundred ";
        }else{
            return two(rest);
        }
    }


    public  String intToWord(int num){

        if (num == 0) return "Zero";
        int billion = num/1000000000;
        num %= 1000000000;
        int million =num/1000000;
        num %= 1000000;
        int thousand = num/1000;
        num %= 1000;

        String res = "";
        if(billion!=0){
            res+=three(billion) + "Billion";
        }
        if(million!=0){
            if (res.length()!=0)res+=" ";
            res+=three(million) + "Million";
        }
        if(thousand!=0){
            if (res.length()!=0)res+=" ";
            res+=three(thousand) + "Thousand";
        }
        if(num!=0){
            if (res.length()!=0)res+=" ";
            res+=three(num);
        }
        return res;
    }
}
