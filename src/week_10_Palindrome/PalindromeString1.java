package week_10_Palindrome;

public class PalindromeString1 {

    // This method Returning true if string is palindrome
    public static boolean isPalindrome1(String str){

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome1("ana ana"));

    }
}
