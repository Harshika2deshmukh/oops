class Account {
    double balance;

    Account(double b) {
        balance = b;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double b) {
        super(b);
    }

    void interest() {
        System.out.println("Savings Interest: " + (balance * 0.04));
    }
}

class CurrentAccount extends Account {
    CurrentAccount(double b) {
        super(b);
    }

    void overdraft() {
        System.out.println("Overdraft facility available");
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(50000);
        sa.interest();

        CurrentAccount ca = new CurrentAccount(30000);
        ca.overdraft();
    }
}

