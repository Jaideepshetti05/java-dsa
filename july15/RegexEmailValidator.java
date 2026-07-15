public class RegexEmailValidator {
    public static void main(String[] args) {
        String email = "abc@gmail.com";

        if(email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}