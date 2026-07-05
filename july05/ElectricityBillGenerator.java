import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Units: ");
        int u=sc.nextInt();

        double bill=0;

        if(u<=100)
            bill=u*2;

        else if(u<=300)
            bill=100*2+(u-100)*3.5;

        else
            bill=100*2+200*3.5+(u-300)*5;

        System.out.println("Bill = "+bill);
    }
}