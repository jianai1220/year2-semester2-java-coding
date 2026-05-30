class Transaction{
    protected double amount;

    public Transaction(double amount){
        this.amount = amount;
    }

    public void process(){
        System.out.println("Processing transaction...");
    }

    public void describe(){
        System.out.println("Transaction of amount: " + amount);
    }
}

class Deposit extends Transaction{
    public Deposit(double amount){
        super(amount);
    }

    @Override
    public void process(){
        System.out.println("Processing deposit transaction...");
    }

    public void describe(String accountType){
        System.out.println("Deposit transaction of amount: " + amount + " into " + accountType + " account.");
    }
}

class Withdrawal extends Transaction{
    public Withdrawal(double amount){
        super(amount);
    }

    @Override
    public void process(){
        System.out.println("Processing withdrawal transaction...");
    }

    public void describe(String accountType){
        System.out.println("Withdrawal transaction of amount: " + amount + " from " + accountType + " account.");
    }
}

public class TransactionDemo{
    public static void main(String[] args){
        Transaction deposit1 = new Deposit(1000);
        deposit1.describe();
        deposit1.process();

        Deposit deposit2 = new Deposit(2000);
        deposit2.describe("Savings");
        deposit2.process();

        Transaction withdrawal1 = new Withdrawal(500);
        withdrawal1.describe();
        withdrawal1.process();
        

        Withdrawal withdrawal2 = new Withdrawal(1000);
        withdrawal2.describe("Checking");
        withdrawal2.process();

    }
}