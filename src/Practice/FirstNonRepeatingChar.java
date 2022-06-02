package MentorSessions;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {

        String str1 = "bbddeeaffgi";
        for (int i = 0; i < str1.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    unique = false;

                    break;
                }

            }
            if (unique) {
                System.out.println(str1.indexOf(str1.charAt(i)));
                break;
            }
        }

    }
}
/*
Question 1: Given a string, write a method to find the first non-repeating vowel(a,e, i,o,u) in it and return its index.
        If it doesn't exist, return -1. Assume that all the characters of the String are lowercase.
        (Do not use String class functions other than charAt())
*/