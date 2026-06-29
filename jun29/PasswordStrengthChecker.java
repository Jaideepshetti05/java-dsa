import java.util.Scanner;

public class PasswordStrengthChecker {

    public static String checkStrength(String password) {
        boolean upper = false, lower = false, digit = false, special = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch))
                upper = true;
            else if (Character.isLowerCase(ch))
                lower = true;
            else if (Character.isDigit(ch))
                digit = true;
            else
                special = true;
        }

        int score = 0;
        if (upper) score++;
        if (lower) score++;
        if (digit) score++;
        if (special) score++;
        if (password.length() >= 8) score++;

        if (score == 5)
            return "Very Strong";
        else if (score >= 4)
            return "Strong";
        else if (score >= 3)
            return "Medium";
        else
            return "Weak";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.println("Password Strength: " + checkStrength(password));

        sc.close();
    }
}