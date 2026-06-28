import java.util.Scanner;

public class EmailValidator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();

        System.out.println(email.matches("^[A-Za-z0-9+_.-]+@(.+)$"));
    }
}