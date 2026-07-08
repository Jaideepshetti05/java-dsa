import java.util.Scanner;

public class CountUpperLower {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        int upper=0,lower=0;

        for(char c:s.toCharArray()){

            if(Character.isUpperCase(c))
                upper++;

            else if(Character.isLowerCase(c))
                lower++;
        }

        System.out.println("Upper="+upper);
        System.out.println("Lower="+lower);
    }
}