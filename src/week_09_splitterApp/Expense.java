package week_09_splitterApp;

public class Expense {
    public int amount;
    public String expenseName;
    public User user;

    public Expense(int amount, String expenseName, User user) {
        this.amount = amount;
        this.expenseName = expenseName;
        this.user = user;
    }
}