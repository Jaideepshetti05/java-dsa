interface Interest {
    double calculate(double amount, double rate, int years);
}

class SimpleInterest implements Interest {
    public double calculate(double amount, double rate, int years) {
        return (amount * rate * years) / 100;
    }
}

public class BankInterestCalculator {
    public static void main(String[] args) {
        Interest obj = new SimpleInterest();
        System.out.println("Interest = " + obj.calculate(50000, 7.5, 3));
    }
}