import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        double bill = units * 6.5;

        System.out.println("Bill = " + bill);
    }
}