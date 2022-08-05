package week_14_exception.BankApp;

import java.util.Scanner;

public class BankAccount {

    double withdraw;
    double balance = 0;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }


   /* void deposit(double ammount)
    {
        Scanner b = new Scanner(System.in);
        System.out.println(" please deposit a amount");
        ammount=b.nextInt();
        balance +=ammount;
    }
    */

    void withdraw(double amount)
    {
        Scanner b=new Scanner(System.in);
        System.out.println("withdraw a amount");
        amount =b.nextInt();
        balance += amount;
    }

    void display()
    {
        System.out.println(balance);
    }
    public static void main(String[]args) {
    }
    }
