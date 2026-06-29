import java.util.Scanner;

public class CurrencyDenominationCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        System.out.println("Denominations:");

        for (int note : notes) {
            if (amount >= note) {
                System.out.println(note + " x " + amount / note);
                amount %= note;
            }
        }

        sc.close();
    }
}