import java.util.Scanner;

public class ExceptionHandling{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number 0-10:");
        int num = scanner.nextInt();
        try{
            if(num == 0){
                int result = divide(num, 0);
            } else if (num == 1){
                int[] array = new int[5];
                System.out.println(array[5]);
            } else if (num == 2){
                Object obj = new Integer(10);
                String str = (String) obj;
            } else if(num == 3){
                String str = "example";
                System.out.println(str.charAt(10));
            } else if(num == 4){
                int [] array = new int[-5];
            } else if (num == 5){
                String str = null;
                System.out.println(str.length());
            } else if(num == 6){
                int value = Integer.parseInt("abc");
            } else if (num == 7){
                throw new IllegalArgumentException("Illegal argument");
            } else if (num == 8){
                throw new IllegalStateException("Illegal state");
            } else if (num == 9){
                throw new UnsupportedOperationException("Unsupported operation");
            }
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (ClassCastException e){
            System.out.println("ClassCastException caught: " + e.getMessage());
        } catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NegativeArraySizeException e){
            System.out.println("NegativeArraySizeException caught: " + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (IllegalStateException e){
            System.out.println("IllegalStateException caught: " + e.getMessage());
        } catch (SecurityException e){
            System.out.println("SecurityException caught: " + e.getMessage());
        } catch (UnsupportedOperationException e){
            System.out.println("UnsupportedOperationException caught: " + e.getMessage());
        } catch (DivideByZeroException e){
            System.out.println("DivideByZeroException caught: " + e.getMessage());
        } finally{
            scanner.close();
        }
    }

    private static int divide(int dividend, int divisor) throws DivideByZeroException{
        if(divisor == 0){
            throw new DivideByZeroException("Divisor cannot be zero!");
        }
        return dividend / divisor;
    }
}

class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(String message){
        super(message);
    }
}