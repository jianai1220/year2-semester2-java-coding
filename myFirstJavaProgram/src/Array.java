public class Array {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        System.out.println("Element of numbers array at index 0: " + numbers[0]);
        System.out.println("Element of numbers array at index 2: " + numbers[2]);

        numbers[1] = 10;
        System.out.println("Modified element of numbers array at index 1: " + numbers[1]);

        System.out.println("Printing all elements of the numbers array:");
        for(int i = 0; i<numbers.length; i++){
            System.out.println("Element at index "+ i + ": " + numbers[i]);
        }

        int[] uninitializedArray = new int[3];

        uninitializedArray[0] = 100;
        uninitializedArray[1] = 200;
        uninitializedArray[2] = 300;

        int[] initializedArray = new int [uninitializedArray.length];
        int index = 0;
        for(int element : uninitializedArray){
            initializedArray[index] = element;
            index++;
        }

        System.out.println("Printing initialized array using enhanced for loop:");
        for(int element : initializedArray){
            System.out.println("Element: " + element);
        }
    }    
}
