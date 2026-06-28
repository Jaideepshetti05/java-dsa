import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        boolean upper = pass.matches(".*[A-Z].*");
        boolean lower = pass.matches(".*[a-z].*");
        boolean digit = pass.matches(".*\\d.*");
        boolean special = pass.matches(".*[@#$%^&+=!].*");

        if(pass.length()>=8 && upper && lower && digit && special)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}