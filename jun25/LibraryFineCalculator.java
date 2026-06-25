import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter delayed days: ");
        int days = sc.nextInt();

        double fine = 0;

        if (days <= 5)
            fine = days * 2;
        else if (days <= 10)
            fine = days * 5;
        else
            fine = days * 10;

        System.out.println("Fine = ₹" + fine);

        sc.close();
    }
}