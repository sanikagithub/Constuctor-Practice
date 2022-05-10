public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Sanika", 500);
        account1.deposit(100);
        account1.accountDetails();  

        BankAccount account2 = new BankAccount("Anish", 5000);
        account2.withdrawal(100);
        account2.accountDetails();  

        BankAccount account3 = new BankAccount("Anish", 300);
        account3.deposit(100);
        account3.accountDetails();  

        }
    }   
