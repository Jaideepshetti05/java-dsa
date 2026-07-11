public class PasswordValidator{

    public static void main(String[] args){

        String password="Java@1234";

        boolean ok=password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$");

        System.out.println(ok);
    }
}