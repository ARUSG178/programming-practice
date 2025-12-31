package src.oop;
package src.oop.src.oop.basics;
public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(double money) {
        if (money > 0) {
            balance += money;
        }
    }

    public double getBalance() {
        return balance;
    }
}
