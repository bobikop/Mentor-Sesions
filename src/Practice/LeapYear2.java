package MentorSessions;

import java.util.Scanner;

public class LeapYear2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();

        input.close();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Selected year is leap year");
        }else{
            System.out.println("Selected year is not leap year");
        }

    }


    public static class LeapYear {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a year");
            int year = input.nextInt();

            boolean isLeap = true;

            if(year % 4 == 0) {
                if( year % 100 == 0)
                {
                    isLeap = year % 400 == 0;
                } else
                    isLeap = true;
            } else {
                isLeap = false;
            }

            if(isLeap==true)
                System.out.println(year + " is a Leap Year.");
            else
                System.out.println(year + " is not a Leap Year.");
        }
    }
}
