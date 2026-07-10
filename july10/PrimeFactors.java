public class PrimeFactors {

    public static void main(String[] args){

        int n=360;

        for(int i=2;i*i<=n;i++){

            while(n%i==0){

                System.out.print(i+" ");

                n/=i;
            }
        }

        if(n>1) System.out.print(n);
    }
}