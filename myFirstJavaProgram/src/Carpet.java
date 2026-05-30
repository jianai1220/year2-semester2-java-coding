import java.util.Scanner;
public class Carpet {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String brandName;
        double length, width;
        double area;

        System.out.println("Enter the carpet brand: ");
        brandName = input.nextLine();

        System.out.println("Enter the carpet length: ");
        length = input.nextDouble();

        System.out.println("Enter the carpet width: ");
        width = input.nextDouble();

        area = width * length;
        
        System.out.println("The area of carpet of " + length + " x " + width + " is RM " + area);
    }
}
