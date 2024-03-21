
// Q1: Write seprate program to implement counting sort and radix sort.
//Q2: Analyze the algorithms and find the complexity in terms of 0(theeta).

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,2,1};
        int n = arr.length;
        // int[] outputArray = countingSort(arr);
        radixsort(arr, n);
        print(arr, n);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(outputArray[i] + " ");
        // }
    }

    // public static int[] countingSort(int[] arr){
    //     int N = arr.length;
    //     int M = 0;
 
    //     for (int i = 0; i < N; i++) {
    //         M = Math.max(M, arr[i]);
    //     }
 
    //     int[] countArray = new int[M + 1];
 
    //     for (int i = 0; i < N; i++) {
    //         countArray[arr[i]]++;
    //     }
 
    //     for (int i = 1; i <= M; i++) {
    //         countArray[i] += countArray[i - 1];
    //     }
 
    //     int[] outputArray = new int[N];
 
    //     for (int i = N - 1; i >= 0; i--) {
    //         outputArray[countArray[arr[i]] - 1] = arr[i];
    //         countArray[arr[i]]--;
    //     }
 
    //     return outputArray;
    // }

    
    
    // A utility function to get maximum value in arr[]
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    
 
    // The main function to that sorts arr[] of
    // size n using Radix Sort
    static void radixsort(int arr[], int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);
 
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
    
    static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
   
    
}

