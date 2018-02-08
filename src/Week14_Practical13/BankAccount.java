package Week14_Practical13;

import java.util.Random;

/**
 * Created by u1764905 on 08/02/2018.
 */
public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        Random rand = new Random();
        this.accountNumber = String.format((rand.nextInt((9999 - 1000) + 1) + 1000) + " "
                + (rand.nextInt((9999 - 1000) + 1) + 1000) + " "
                + (rand.nextInt((9999 - 1000) + 1) + 1000) + " "
                + (rand.nextInt((9999 - 1000) + 1) + 1000) + " ");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
