class Account {
    private int accNo = 123;
    private int balance = 5000;

    public void deposit(int amt) {
        balance += amt;
    }

    public void show() {
        System.out.println("Acc: " + accNo + " Balance: " + balance);
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(1000);
        a.show();
    }
}
