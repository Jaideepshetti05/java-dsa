public class PasswordStrengthChecker {
    public static void main(String[] args) {

        String password = "Cloud@123";

        if(password.length() >= 8)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}