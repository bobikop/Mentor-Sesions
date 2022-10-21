package week_22_Algorithm;

public class ValidPalindrome {

    public static void main(String[] args) {

        String str = "Do geese see God?";
        String str1 = "Was it a car or a cat I saw?";
        String str2 = "A brown fox jumping over";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));

        System.out.println("-----------------------------------");

        System.out.println(isPalindromeTwoPointers(str));
        System.out.println(isPalindromeTwoPointers(str1));
        System.out.println(isPalindromeTwoPointers(str2));

    }

    // SOLUTION 1

    public static boolean isPalindrome(String s){

        StringBuilder stringBuilder = new StringBuilder();
        for (char eachCharacter : s.toCharArray()){
            if(Character.isLetterOrDigit(eachCharacter)){
                stringBuilder.append(eachCharacter);
            }
        }
        String myString = stringBuilder.toString();
        String reverseString = stringBuilder.reverse().toString();
        return myString.equalsIgnoreCase(reverseString);
    }


    // SOLUTION 2

    public static boolean isPalindromeTwoPointers(String s){
        for (int i = 0, j = s.length() - 1 ; i < j; i++, j--) {  // i is out first pointer and is starting form beginning of the string (first char), while j is last one
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) // while the pointer i does not point to a valid character  shift i to i + 1
                i++;
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) // while the pointer j does not point to a valid character  shift j to j - 1
                j--;

                if (i<j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) // check if the character at i != to character at j
                    return false;

        }
        return  true;
    }

}
