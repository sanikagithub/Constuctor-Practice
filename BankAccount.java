public class BankAccount {
    private String name;
    private int balance;

    // the class constructor
    public BankAccount(String accountHolderName, int accountBalance) {
        this.balance = accountBalance;
        this.name = accountHolderName;
    }

    public void deposit(int depositAmount) {
        balance = balance + depositAmount;
    }

    public void withdrawal(int withdrawalAmount) {
        balance = balance - withdrawalAmount;
        }

    public void accountDetails() {
        System.out.println("The customer's name is " + name + " and their account balance is " + balance);
            }

    
}
