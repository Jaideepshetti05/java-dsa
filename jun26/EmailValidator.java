import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "student@gmail.com";

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (Pattern.matches(regex, email))
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }
}