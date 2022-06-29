package Week_9;

import java.util.ArrayList;
import java.util.List;

public class CountingDuplicateLetters {
    private static List chars = new ArrayList<>();

    public static void main(String[] args) {

        printCountOfDuplicateCharacter("aabbcde");
        System.out.println("---------------------------------");
        printCountOfDuplicateCharacter("indivisibility");

    }

    // print count of each character in a given string.
    private static void printCountOfDuplicateCharacter(String input) {

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (isExistingChar(ch))
                continue;

            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (ch == input.charAt(j)) {
                    count++;
                }
            }
            System.out.println(ch + " : " + count);
        }
        chars.clear();
    }

    // checking whether the given char is already processed or not.
    private static boolean isExistingChar(char ch) {

        if (chars.contains(Character.toString(ch))) {
            return true;
        } else {
            chars.add(Character.toString(ch));
        }
        return false;
    }
}
