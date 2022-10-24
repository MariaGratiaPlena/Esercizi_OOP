import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(double initialBalance, String customerName) {
        BankAccount newAccount = new BankAccount(initialBalance, customerName);
        this.accounts.add(newAccount);
    }

    public BankAccount find(int accountNumber) {
        for (BankAccount ba : this.accounts) {
            if (ba.getAccountNumber() == accountNumber)
                return ba;
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        this.accounts.get(accountNumber).deposit(amount);
    }

    public void withdraw(int accountNumber, double amount) {
        this.accounts.get(accountNumber).withdraw(amount);
    }

    public double getBalance(int accountNumber) {
        return this.accounts.get(accountNumber).getBalance();
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        this.accounts.get(fromAccountNumber).withdraw(amount);
        this.accounts.get(toAccountNumber).deposit(amount);
    }
}