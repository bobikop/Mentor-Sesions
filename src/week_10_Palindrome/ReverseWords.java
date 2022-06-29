package week_10_Palindrome;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));

    }

    public static String reverseWords(String given){

        String [] wordsArray = given.split(" ");
        var resultString = new StringBuilder();

        for (int i = wordsArray.length -1 ; i >= 0; i--){
            resultString.append(wordsArray[i]).append(" ");
        }
        return resultString.toString();
    }

}
