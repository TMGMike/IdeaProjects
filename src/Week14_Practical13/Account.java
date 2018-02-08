package Week14_Practical13;

/**
 * Created by u1764905 on 08/02/2018.
 */
public class Account {
    public Account() {
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Billy");
        System.out.println("Name: " + acc1.getAccountHolder() + " Number: " + acc1.getAccountNumber());

        BankAccount acc2 = new BankAccount("John");
        System.out.println("Name: " + acc2.getAccountHolder() + " Number: " + acc2.getAccountNumber());
    }
}
