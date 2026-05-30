import math.MathOperations;
public class CalculatorApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + MathOperations.add(a, b));
        System.out.println("Subtraction: " + MathOperations.subtract(a, b));
        System.out.println("Multiplication: " + MathOperations.multiply(a, b));
        System.out.println("Division: " + MathOperations.divide(a, b));
    }
}
