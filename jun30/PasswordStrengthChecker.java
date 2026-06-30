import java.util.*;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass = sc.nextLine();

        if(pass.length()>=8 &&
                pass.matches(".*[A-Z].*") &&
                pass.matches(".*[a-z].*") &&
                pass.matches(".*\\d.*"))
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}