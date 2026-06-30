public class PrimeFactorization{

    public static void main(String[] args){

        int n=180;

        for(int i=2;i<=n;i++){

            while(n%i==0){

                System.out.print(i+" ");

                n/=i;

            }

        }

    }

}