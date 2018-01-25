package Week9_Practical8;

/**
 * Created by u1764905 on 30/11/2017.
 */
public class BankAccountDemo {
    public static void main(String[] args) {

        //This will create a new "account" object, with the name "Billy Bob". He doesn't have an overdraft.
        BankAccount account = new BankAccount("78064236", "Billy Bob", false);
        System.out.println(account);

        //This is setting his balance to 350.75, and outputting it to the console.
        account.setBalance(350.75);
        System.out.println(account);

        //This will check if it can withdraw 560. Since he has no overdraft, it *should* be refused.
        if(!account.withdraw(560)) {
            System.out.println("\nWithdrawal of 560 was refused.");
            System.out.println(account);
        }

        //This tests if it can deposit a negative figure, which *should* be refused.
        if(!account.deposit(-75.5)){
            System.out.println("\nDeposit of -75.5 was refused.");
            System.out.println(account);
        }

        //This will add an interest rate of 10%, and output the new account details to the console.
        System.out.println("\nAdding 10% interest rate...");
        account.addInterest(10);
        System.out.println(account);

        System.out.println("\n");

        BankAccount newAccount = new BankAccount("Test Name");
        System.out.println(newAccount);
    }
}
