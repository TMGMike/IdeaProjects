package Week9_Practical8;


import java.util.Random;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    // Stores the object BankAccount, defaulting to a balance of 0
    public BankAccount(String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }
    // Stores the object BankAccount, setting the balance to the optional "balance" parameter.
    public BankAccount(String accountNumber, String accountHolder, double balance, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }
    public BankAccount(String accountHolder) {
        Random rand = new Random();
        int num = rand.nextInt(5000);
        this.accountNumber = String.valueOf(num);
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = false;
    }
    //Returns the account number
    public String getAccountNumber () {
        return accountNumber;
    }
    //Changes the account number to the parameter provided
    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }
    //Gets the name of the account holder.
    public String getAccountHolder () {
        return accountHolder;
    }
    //Updates the name of the account holder to the parameter provided
    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }
    //Gets the balance of the account
    public double getBalance () {
        return balance;
    }
    //Sets the balance of the account to the parameter provided.
    public void setBalance (double balance) {
        this.balance = balance;
    }
    //Returns if the account has an overdraft or not.
    public boolean hasOverdraft () {
        return hasOverdraft;
    }
    //Updates whether the account has an overdraft or not.
    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }
    //Deposits a provided amount of money into the account.
    //Changes: Converted the method into a boolean to return true if the deposit was successful, or false if not.
    //         Checks if the amount to deposit is greater than 0.
    public boolean deposit (double amount) {
        if(amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }
    // Withdraws a provided amount from the account.
    // Changes: Converted the method to a boolean to return true if the withdrawal was successful, or false if not.
    //          Checks if the amount is greater than 0. Then checks if the withdrawal will put the account into overdraft,
    //          and if the overdraft is allowed or not.
    public boolean withdraw (double amount) {
        if (amount > 0) {
            double newValue = getBalance() - amount;
            if(newValue < 0){
                if(hasOverdraft()){
                    this.balance -= amount;
                    return true;
                }
                return false;
            }
            this.balance -= amount;
            return true;
        }
        return false;
    }
    //Adds the provided interest rate into the account
    public void addInterest (int interestRate) {
        this.balance += this.balance * (interestRate / 100.0);
    }
    //Converts the account object into a manageable string.
    @Override
    public String toString () {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }

}