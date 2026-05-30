package extendFunction.Pay;
import java.util.Scanner;

public class CreditCardPayment extends payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.printf("Your amount of spend is: RM %.2f" , getAmount());
        System.out.println();
        System.out.println("Enter Pay to conform your payment: ");

        Scanner scanner = new Scanner(System.in);
        String conformation = scanner.nextLine();

        if(conformation == "Pay") {
            System.out.println("Your payment have been accepted!!");
        } else {
            System.out.println("Your payment have been canceled, please try again later.");
        }
    }
}