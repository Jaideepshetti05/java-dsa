import java.util.Scanner;

public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();

        double si = (p*r*t)/100;

        System.out.println(si);
    }
}