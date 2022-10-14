public class SavingAccount {

    private final int accountNumber;
    private static int totalNumberOfAccounts = 0;
    private double balance;
    private double interestRate;

    /**
     * A saving account has a balance that can be changed by deposits and withdrawals.
     */
    public SavingAccount(double interestRate) {
        totalNumberOfAccounts++;
        accountNumber = totalNumberOfAccounts;
        balance = 0;
        this.interestRate = interestRate;
    }

    public SavingAccount(double initialBalance, double interestRate) {
        totalNumberOfAccounts++;
        accountNumber = totalNumberOfAccounts;
        balance = initialBalance;
       this.interestRate = interestRate;
    }

    /**
     * Deposit money to the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    /**
     * Adds interest rate for three months to the balance
     */
    public void addInterest() {
        balance += balance * ((interestRate * 90/360)/100);
    }

    /**
     * Gets the number of the saving account.
     *
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Gets the current balance of the saving account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets the interest rate of the account.
     *
     * @return the rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the interest rate of the account.
     *
     * @param interestRate the interest rate
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}