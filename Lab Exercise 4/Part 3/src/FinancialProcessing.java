import java.math.BigInteger;

class Accounting {
    private String accountDetails;

    public Accounting(String accountDetails){
        this.accountDetails = accountDetails;
    }

    public String getAccountDetails(){
        return accountDetails;
    }

    public void setAccountDetails(String accountDetails){
        this.accountDetails = accountDetails;
    }

    @Override
    public String toString(){
        return "Accounting{" + "accountDetails='" + accountDetails + '\'' + '}';
    }
}

class Payment{
    private double amount;
    
    public Payment(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Payment{" + "amount=" + amount + '}';
    }
}

class Billing{
    private String billDetails;

    public Billing(String billDetails){
        this.billDetails = billDetails;
    }

    public String getBillDetails(){
        return billDetails;
    }

    public void setBillDetails(String billDetails){
        this.billDetails = billDetails;
    }

    @Override
    public String toString(){
        return "Billing{" + "billDetails='" + billDetails + '\'' + '}';
    }
}

public class FinancialProcessing {
    private Accounting accounting;
    private Payment payment;
    private Billing billing;

    public FinancialProcessing(Accounting accounting, Payment payment, Billing billing){
        this.accounting = accounting;
        this.payment = payment;
        this.billing = billing;
    }

    public Accounting geAccounting(){
        return accounting;
    }

    public void setAccounting(Accounting accounting){
        this.accounting = accounting;
    }

    public Payment getPayment(){
        return payment;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
    }

    public Billing getBilling(){
        return billing;
    }

    public void setBilling(Billing billing){
        this.billing = billing;
    }

    @Override

    public String toString(){
        return "Financial Processing \n" + "Accounting=" + accounting + "\n" + "Payment=" + payment + "\n" + "Billing=" + billing + "\n";
    }

    public static void main(String[] args) {
        Accounting accounting = new Accounting("Account details example");
        Payment payment = new Payment(100.0);
        Billing billing = new Billing("Bill details example");

        FinancialProcessing financialProcessing = new FinancialProcessing(accounting, payment, billing);

        System.out.println(financialProcessing);
    }
}
