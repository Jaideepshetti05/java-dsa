import java.util.Scanner;

public class MiniATM{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        double bal=5000;

        while(true){

            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Balance");
            System.out.println("4.Exit");

            int ch=sc.nextInt();

            switch(ch){

                case 1:
                    bal+=sc.nextDouble();
                    break;

                case 2:
                    bal-=sc.nextDouble();
                    break;

                case 3:
                    System.out.println(bal);
                    break;

                default:
                    return;
            }
        }
    }
}