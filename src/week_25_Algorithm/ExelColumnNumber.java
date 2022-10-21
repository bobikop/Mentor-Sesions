package week_25_Algorithm;

public class ExelColumnNumber {

    static int columToNumber(String s) {

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result *= 26;
            result += s.charAt(i) - 'A' + 1;
        }
        return result;
    }


    //my solution

    public static void main(String[] args) {
        System.out.println(columToNumber("ABC"));
    }
}


