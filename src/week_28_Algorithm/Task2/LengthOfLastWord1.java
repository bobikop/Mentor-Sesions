package week_28_Algorithm.Task2;

public class LengthOfLastWord1 {

    public static int lengthOfLastWord(String s) {
        int result = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' ' && result == 0)
                continue;
            if(s.charAt(i)!= ' ') result++;
            else break;
        }
        return result;
    }

    public static void main(String[] args) {

        String input = "Hello World";
        String input1 = "   fly me  to   the moon  ";


        System.out.println(lengthOfLastWord(input));
        System.out.println(lengthOfLastWord(input1));
    }
}

