import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        System.out.print("Enter number of expenses: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Expense " + i + ": ");
            total += sc.nextDouble();
        }

        System.out.println("Total Expense = " + total);
        System.out.println("Average Expense = " + (total / n));

        sc.close();
    }
}