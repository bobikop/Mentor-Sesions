package week_14_exception.BankApp;

public class InsufficientFundsException extends Throwable {

    private double amount;//2create var for getAmount90 to return

    public InsufficientFundsException(double amount) {//3required argument constructor
        this.amount = amount;
    }

    public double getAmount() {//1e.getAmount -> not exception() --> custom () from new custom exception
        return amount;
    }
}
