import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100)
            bill = units * 1.5;
        else if (units <= 300)
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        else
            bill = (100 * 1.5) + (200 * 2.5) + ((units - 300) * 4);

        System.out.printf("Total Bill = ₹%.2f%n", bill);

        sc.close();
    }
}