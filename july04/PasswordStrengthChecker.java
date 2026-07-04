public class PasswordStrengthChecker {

    public static void main(String[] args){

        String p="Java@123";

        boolean upper=false,lower=false,digit=false,special=false;

        for(char c:p.toCharArray()){

            if(Character.isUpperCase(c)) upper=true;
            else if(Character.isLowerCase(c)) lower=true;
            else if(Character.isDigit(c)) digit=true;
            else special=true;
        }

        if(p.length()>=8 && upper && lower && digit && special)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");

    }
}