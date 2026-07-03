public class RegexEmailValidator {

    public static void main(String[] args) {

        String email="abc@gmail.com";

        boolean valid=email.matches("^[A-Za-z0-9+_.-]+@(.+)$");

        System.out.println(valid);
    }
}