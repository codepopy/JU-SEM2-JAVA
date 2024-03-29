package assignment1;

public class Accounts {
    private int accountNumber;
    private double balance;
    private double interestRate; //fixed at 6.5%

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public Accounts(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = 0.065;
    }

    public Accounts() {
        this.interestRate =0.065;
    }

    public double calculateInterest(){
        return getBalance()*getInterestRate();
    }
}
