package Week_10;

public class StringPalindrome {

       public static boolean isPalindrome(String str){

           str = "Madam";
           String result = "";

           for (int i = str.length()-1; i >= 0 ; i--) {
               result += str.charAt(i);
           }

           boolean isPalindrome = str.equalsIgnoreCase(result);

          return isPalindrome;
       }

    public static void main(String[] args) {

        //call method here
       System.out.println(isPalindrome("Ana"));

    }
}

