package week_14_exception.task1;

import java.util.Scanner;

public class CustomException {
    private String name;
    private int age;

    public CustomException(String name, int age) {
        try {
            if (age < 17 || age > 24) {
                String msg = "Age is not between 17 and 24";
                AgeDoesnotMatchException ex = new AgeDoesnotMatchException(msg);
                throw ex;
            }
        } catch (AgeDoesnotMatchException e) {
            e.printStackTrace();
        }
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name of the Student: " + this.name);
        System.out.println("Age of the Student: " + this.age);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Student: ");
        String name = sc.next();
        System.out.println("Enter the age of the Student, should be 17 to 24 (including 17 and 24): ");
        int age = sc.nextInt();
        CustomException obj = new CustomException(name, age);
        obj.display();
    }

}
