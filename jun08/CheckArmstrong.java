import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num, sum = 0;

        while(temp > 0){
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        System.out.println(sum == num);
    }
}