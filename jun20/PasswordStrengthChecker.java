public class PasswordStrengthChecker {
    public static void main(String[] args) {
        String password = "Abc@1234";

        boolean upper = password.matches(".*[A-Z].*");
        boolean lower = password.matches(".*[a-z].*");
        boolean digit = password.matches(".*\\d.*");
        boolean special = password.matches(".*[^a-zA-Z0-9].*");

        if (password.length() >= 8 && upper && lower && digit && special)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}