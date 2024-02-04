
// 1: Implement the Quick sort algorithm for soriong n elements in an array.
// 2: What do you mean by the stability of a sorting algorithm.
// 3: State and explain about the stability on the basic of implementation of Quick sort done in quetion.

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;
 
        quickSort(arr, 0, N - 1);
        System.out.print("Sorted array: ");
        printArr(arr);
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high)
    {
        
        int pivot = arr[high];
 
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
 
          
            int pi = partition(arr, low, high);
 
           
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
