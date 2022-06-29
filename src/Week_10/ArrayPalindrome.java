package Week_10;

public class ArrayPalindrome {

    public static void main(String[] args) {



        String[] array = {"abc", "car", "ada", "racecar", "cool"};

        int countOfPalindrome = 0;

        for (String each : array) {
            String temp = "";
            for(int i = each.length() - 1; i >= 0; i--){
                temp += each.charAt(i);
            }
            if(each.equalsIgnoreCase(temp)){
                countOfPalindrome++;
            }

        }
        System.out.println("Entered String have " + countOfPalindrome + " palindrome");
    }
}


