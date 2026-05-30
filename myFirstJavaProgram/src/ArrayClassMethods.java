import java.util.Arrays;
public class ArrayClassMethods {
    public static void main(String[] args) {
        int[] array1 = {10,20,30,40,50};
        int[] array2 = {10,20,30,40,50};
        int[] array3 = {5,2,7,1,3};
        int[] array4 = new int[5];

        int index = Arrays.binarySearch(array1, 30);
        if (index >= 0){
            System.out.println("Value 30 found at index " + index);
        }else{
            System.out.println("Value 30 not found in the array.");
        }

        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("Arrays array1 and array2 are equal: " + isEqual);

        Arrays.fill(array4, 10);
        System.out.println("Filled array: " + Arrays.toString(array4));

        Arrays.sort(array3);
        System.out.println("Sorted array: " + Arrays.toString(array3));
        
        int[] partialSortArray = {5,2,7,1,3};
        Arrays.sort(partialSortArray, 1, 4);
        System.out.println("Partially sorted array: " + Arrays.toString(partialSortArray));
    }
}
