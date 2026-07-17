public class DecimalToBinary {
    public static void main(String[] args) {
        int n=29;

        while(n>0){
            System.out.print(n%2);
            n/=2;
        }
    }
}