public class ATMSystem {
    public static void main(String[] args) {

        double balance = 10000;
        double withdraw = 2500;

        if(withdraw <= balance){
            balance -= withdraw;
            System.out.println("Remaining: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}