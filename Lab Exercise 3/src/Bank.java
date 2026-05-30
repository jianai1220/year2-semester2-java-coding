public class Bank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank (String accountNumber, String accountHolderNumber, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit of RM" + amount + " successful.");
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawal of RM" + amount + " successful.");
    }

    public void checkBalance(){
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: RM" + balance);
    }

    public static void main(String[] args) {
        Bank myAccount = new Bank("123456789", "Anna Bella", 1000.0);
        myAccount.checkBalance();
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.checkBalance();
    }
}
