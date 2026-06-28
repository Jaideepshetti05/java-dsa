import java.util.Scanner;

public class LibraryFineCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int days=sc.nextInt();

        if(days<=7)
            System.out.println(days*2);
        else
            System.out.println((7*2)+((days-7)*5));
    }
}