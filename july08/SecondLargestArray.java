import java.util.Scanner;

public class SecondLargestArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int x:arr){
            if(x>first){
                second=first;
                first=x;
            }else if(x>second && x!=first){
                second=x;
            }
        }

        System.out.println(second);
    }
}