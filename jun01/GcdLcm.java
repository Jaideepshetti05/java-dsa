import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int a = n1, b = n2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int gcd = a;
        int lcm = (n1 * n2) / gcd;
        
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
        sc.close();
    }
}
