package week_31_Algorithm;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first = input.nextLine().trim().replace( " ", "");

        System.out.println("Entert your last name");
        String last = input.nextLine().trim().replace(" ", "");

        input.close();


        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " " + last;
        System.out.println(fullName);

    }

}
