import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        if(password.length() >= 8)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}