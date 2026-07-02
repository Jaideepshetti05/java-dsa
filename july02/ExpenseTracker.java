import java.util.*;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        while(true){
            System.out.print("Expense (0 to stop): ");
            double amt = sc.nextDouble();

            if(amt==0)
                break;

            total += amt;
        }

        System.out.println("Total Expense = ₹"+total);
    }
}