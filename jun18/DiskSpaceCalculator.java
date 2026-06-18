import java.util.Scanner;

public class DiskSpaceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = sc.nextDouble();
        double used = sc.nextDouble();

        System.out.println("Free Space: " + (total-used));
    }
}