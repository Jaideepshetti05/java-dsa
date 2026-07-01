import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num, sum = 0;

        while (temp != 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }

        System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
        sc.close();
    }
}