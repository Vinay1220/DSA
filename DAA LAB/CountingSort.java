
// Q1: Write seprate program to implement counting sort and radix sort.
//Q2: Analyze the algorithms and find the complexity in terms of 0(theeta).

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,2,1};
        int[] outputArray = countingSort(arr);
 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }

    public static int[] countingSort(int[] arr){
        int N = arr.length;
        int M = 0;
 
        for (int i = 0; i < N; i++) {
            M = Math.max(M, arr[i]);
        }
 
        int[] countArray = new int[M + 1];
 
        for (int i = 0; i < N; i++) {
            countArray[arr[i]]++;
        }
 
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }
 
        int[] outputArray = new int[N];
 
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[arr[i]] - 1] = arr[i];
            countArray[arr[i]]--;
        }
 
        return outputArray;
    }
}
