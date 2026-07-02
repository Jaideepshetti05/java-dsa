import java.util.*;

public class EmailValidator{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String email=sc.nextLine();

        if(email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}