import java.util.ArrayList;
import java.util.Scanner;

class Expense {

    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
}

public class SimpleExpenseTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {

            System.out.println("\n1.Add Expense");
            System.out.println("2.View Expenses");
            System.out.println("3.Total Amount");
            System.out.println("4.Exit");

            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();

                    expenses.add(new Expense(category, amount));

                    break;

                case 2:

                    for (Expense e : expenses) {
                        System.out.println(e.category + " : ₹" + e.amount);
                    }

                    break;

                case 3:

                    double total = 0;

                    for (Expense e : expenses)
                        total += e.amount;

                    System.out.println("Total Expenses = ₹" + total);

                    break;

                case 4:

                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}