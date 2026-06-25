import java.util.ArrayList;

class Transaction {

    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    void display() {
        System.out.println(type + " : ₹" + amount);
    }
}

public class BankTransactionHistory {

    public static void main(String[] args) {

        ArrayList<Transaction> history = new ArrayList<>();

        history.add(new Transaction("Deposit", 5000));
        history.add(new Transaction("Withdraw", 1200));
        history.add(new Transaction("Deposit", 2500));

        System.out.println("Transaction History:");

        for (Transaction t : history)
            t.display();
    }
}