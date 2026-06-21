class Bank {
    double balance = 1000;

    void deposit(double amt){ balance += amt; }
    void withdraw(double amt){ balance -= amt; }

    void display(){ System.out.println(balance); }

    public static void main(String[] args){
        Bank b = new Bank();
        b.deposit(500);
        b.withdraw(200);
        b.display();
    }
}