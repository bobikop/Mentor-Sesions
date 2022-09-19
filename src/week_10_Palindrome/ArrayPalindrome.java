package week_10_Palindrome;

public class ArrayPalindrome {

    public static void main(String[] args) {


        String[] array = {"abc", "car", "ada", "racecar", "cool"};

        int countOfPalindrome = 0;

        for (String each : array) { // using each loop to iterate over each element of array
            String temp = ""; // here we just declare new temp string
            for(int i = each.length() - 1; i >= 0; i--){ // using for loop to over each character form each element of the string, but checking characters from last to first of each element
                temp += each.charAt(i); // then we assign new each to the temp variable
            }
            if(each.equalsIgnoreCase(temp)){ // by using if statement here we compare new each element example (cba)  from temp variable with original
                // and if they are same then we have palindrome string
                countOfPalindrome++;
            }

        }
        System.out.println("Entered String have " + countOfPalindrome + " palindrome");
    }
}


