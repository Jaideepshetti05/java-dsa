import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Days Late: ");
        int days = sc.nextInt();

        int fine;

        if(days<=5)
            fine = days*2;
        else if(days<=10)
            fine = 5*2 + (days-5)*5;
        else
            fine = 5*2 + 5*5 + (days-10)*10;

        System.out.println("Fine = ₹"+fine);
    }
}