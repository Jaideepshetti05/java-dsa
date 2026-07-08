import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String bin=sc.next();

        int decimal=Integer.parseInt(bin,2);

        System.out.println(decimal);
    }
}