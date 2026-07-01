import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int x=sc.nextInt();

            if(x>first){
                second=first;
                first=x;
            }else if(x>second && x!=first){
                second=x;
            }
        }

        System.out.println(second);

        sc.close();
    }
}