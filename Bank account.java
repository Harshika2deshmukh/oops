// Abstract class (Abstraction)
abstract class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Encapsulation (Getter method)
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Abstract method (must be implemented in child class)
    public abstract void withdraw(double amount);
}


// Inheritance
class SavingsAccount extends BankAccount {
    private double minimumBalance = 500;

    // Using super keyword
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Polymorphism (Method Overriding)
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance must be maintained!");
        }
    }
}


class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}


// Main Class
public class BankSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("Harshika", 5000);
        BankAccount acc2 = new CurrentAccount("Rahul", 3000);

        acc1.deposit(1000);
        acc1.withdraw(2000);

        acc2.deposit(500);
        acc2.withdraw(4000);
    }
}
