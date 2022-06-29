package week_09_splitterApp;

import java.util.ArrayList;
import java.util.Scanner;

public class MySplitter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] optionList = { "List Specific Person Expense",
                "List All Expenses",
                "Make Split",
                "Close the budget"};

        //Users DB
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("ower", "ower@gmail.com"));
        userList.add(new User("hasan", "hasan@gmail.com"));
        userList.add(new User("boban", "boban@gmail.com"));

        //Expenses DB
        ArrayList<Expense> expenseList = new ArrayList<>();
        expenseList.add(new Expense(100, "taxi", userList.get(0)));
        expenseList.add(new Expense(200, "hotel", userList.get(1)));
        expenseList.add(new Expense(750, "fun", userList.get(2)));
        expenseList.add(new Expense(750, "funny", userList.get(2)));

        while (true) {

            System.out.println("What would you like to do?");

            for(int i=0;i<optionList.length;i++){

                System.out.println(optionList[i] + ":" + (i+1));

            }

            int request =  scanner.nextInt();

            switch(request-1){
                case 0:

                    System.out.println("Which user you want to see expenses? Just type user id: ");

                    //show all users: id:0 name: Ower
                    for(User user : userList){
                        System.out.println("id: " + userList.indexOf(user) + " name: " + user.name);
                    }

                    // get input
                    int userId = scanner.nextInt();
                    User user = userList.get(userId);

                    // Calculate all expenses made by this user
                    int expensesByUser = 0;
                    for(Expense expense : expenseList){
                        if (user.name.equals(expense.user.name)){
                            expensesByUser += expense.amount;
                        }
                    }

                    System.out.println(user.name+" has spent "+expensesByUser+" total ");
                    break;

                case 1: //total expenses
                    calculateTotalExpense(expenseList);
                    break;

                case 2: // split

                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);
                    makeSplit(calculateTotalExpense(expenseList), splitList);
                    break;

                case 3:
                    System.exit(0);

            }

        }

    }

    public static int calculateTotalExpense(ArrayList<Expense> expenseList){
        int totalExpense = 0;
        for(int i = 0;i<expenseList.size();i++){
            System.out.println(i + " - expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user.name);
            totalExpense += expenseList.get(i).amount;
        }
        return totalExpense;
    }


    public static void makeSplit(int totalExpenses, ArrayList<Split> splitList) {

        double averageAmount = totalExpenses / splitList.size();

        for(Split split : splitList){

            if(split.amount > averageAmount){

                System.out.println(split.user.name + " needs to take back " + (split.amount - averageAmount));

            }else{

                System.out.println(split.user.name + " need to give " + (-1 * (split.amount - averageAmount)));
            }

        }

    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>();

        for(Expense expense : expenseList){

            Split split = getSplitByUserIfExist(expense.user.name, splitList);

            if(split != null){
                split.amount += expense.amount;
            }else{
                splitList.add(new Split(expense.amount, expense.user));
            }
        }

        return splitList;

    }

    public static Split getSplitByUserIfExist(String userName, ArrayList<Split> splitList) {

        for(Split split : splitList){
            if(split.user.name.equals(userName)){
                return split;
            }
        }

        return null;

    }


}
