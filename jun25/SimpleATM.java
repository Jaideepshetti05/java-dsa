import java.util.Scanner;

public class SimpleATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        while (true) {

            System.out.println("\n===== ATM =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");

            System.out.print("Choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Amount: ");
                    balance += sc.nextDouble();
                    break;

                case 2:
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();

                    if (amt <= balance)
                        balance -= amt;
                    else
                        System.out.println("Insufficient Balance");

                    break;

                case 3:
                    System.out.println("Balance = ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank You");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}