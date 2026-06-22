public class ElectricityBillGenerator {
    public static void main(String[] args) {

        int units = 250;

        double bill = units * 6.5;

        System.out.println("Bill = ₹" + bill);
    }
}