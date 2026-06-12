import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();

        double bill = units * 5.5;

        System.out.println("Bill Amount: " + bill);
    }
}