public class BankInterestCalculator {

    public static void main(String[] args){

        double p=50000;

        double r=7;

        int t=5;

        double amount=p*Math.pow(1+r/100,t);

        System.out.println(amount);

    }
}