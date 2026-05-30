package extendFunction.Pay;
import java.util.Scanner;

public class Cash extends payment {
    private double change;

    public Cash(double amount) {
        super(amount);
        change = 0;
    }

    @Override
    public void processPayment() {
        System.out.printf("Your amount of spend is: RM %.2f" , getAmount());
        System.out.println();
        System.out.println("Enter the amount you want to pay: ");

        Scanner scanner = new Scanner(System.in);
        Double cashAmount = scanner.nextDouble();

        change = cashAmount - getAmount();  
        
        if(change < 0) {
            System.out.println("Your money is not enough!!!");
        } else {
            System.out.printf("Your change is RM: %.2f", change);
        }
    }

}