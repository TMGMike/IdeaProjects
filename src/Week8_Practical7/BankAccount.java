package Week8_Practical7;



public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public BankAccount (String accountNumber, String accountHolder, double balance, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean hasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public void withdraw (double amount) {
        this.balance -= amount;
    }

    public void addInterest (int interestRate) {
        this.balance += this.balance * (interestRate / 100.0);
    }

    @Override
    public String toString () {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }


    public static void main (String[] args) {

        BankAccount account = new BankAccount("50344004", "Bob", false);

        account.setBalance(1500);
        System.out.println("Setting balance to £1500...");
        System.out.println(account);

        System.out.println("Account balance: " + account.getBalance());

        account.withdraw(250);
        System.out.println("Withdrawing £250...");
        System.out.println(account);

        System.out.println("New Balance: " + account.getBalance());
        System.out.println(account);

        System.out.println("Adding 10% interest...");
        account.addInterest(10);
        System.out.println(account);

        System.out.println("Final Balance: " + account.getBalance());
        System.out.println(account);
    }

}