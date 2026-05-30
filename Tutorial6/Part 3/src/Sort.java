interface SortAlgorithm{
    int ARRAY_SIZE = 10;

    int[] sort(int[] arr);
}

class BubbleSort implements SortAlgorithm{
    @Override
    public int[] sort(int[] arr){
        int n = Math.min(arr.length, SortAlgorithm.ARRAY_SIZE);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

class MergeSort implements SortAlgorithm{
    @Override
    public int[] sort(int[] arr){
        return mergeSort(arr, 0, Math.min(arr.length - 1, SortAlgorithm.ARRAY_SIZE - 1));
    }

    private int[] mergeSort(int[] arr, int l, int r){
        if (l<r){
            int m = l + (r - l) / 2;
            int[] leftArray = mergeSort(arr, l, m);
            int[] rightArray = mergeSort(arr, m+1, r);
            return merge(leftArray, rightArray);
        }
        return new int[]{arr[1]};
    }

    private int[] merge(int[] left, int[] right){
        int[] mergedArray = new int[left.length + right.length];
        int i=0, j=0, k=0;
        while (i<left.length && j<right.length){
            if(left[i] <= right[j]){
                mergedArray[k++] = left[i++];
            }
            else{
                mergedArray[k++] = right[j++];
            }
        }
        while(i<left.length)
            mergedArray[k++] = left[i++];
        while(j<right.length)
            mergedArray[k++] = right[j++];
        return mergedArray;
    }
}

class QuickSort implements SortAlgorithm{
    @Override
    public int[] sort(int[] arr){
        return quickSort(arr, 0, Math.min(arr.length - 1, SortAlgorithm.ARRAY_SIZE - 1));
    }

    private int[] quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);

            arr = quickSort(arr, low, pi-1);
            arr = quickSort(arr, pi+1, high);
        }
        return arr;
    }

    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
}

public class Sort{
    public static void main(String[] args) {
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90, 0, 5, 33};
        int[] arr2 = {54, 12, 87, 63, 41, 22, 3, 98, 72, 19};
        int[] arr3 = {31, 57, 8, 74, 49, 60, 15, 28, 96, 10};

        SortAlgorithm bubbleSort = new BubbleSort();
        arr1 = bubbleSort.sort(arr1.clone());
        printArray("Bubble Sort", arr1);

        SortAlgorithm mergeSort = new MergeSort();
        arr2 = mergeSort.sort(arr2.clone());
        printArray("Merge Sort", arr2);

        SortAlgorithm quickSort = new QuickSort();
        arr3 = quickSort.sort(arr3.clone());
        printArray("Quick Sort", arr3);
    }

    private static void printArray(String algorithm, int[] arr){
        System.out.println(algorithm + " Result: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}