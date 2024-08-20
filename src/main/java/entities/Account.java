package entities;

public class Account {
    private final int number;
    public String name;
    private double balance;
    private static final int WITHDRAW_TAX = 5;

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        this.deposit(initialDeposit);
    }

    public Account(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", this.number, this.name, this.balance);
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) throws Exception {
        if (value > this.balance) {
            throw new Exception("You don't have enough balance to perform the requested withdraw");
        }

        this.balance -= (value + WITHDRAW_TAX);
    }
}
