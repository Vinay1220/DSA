public class SwapINArray {

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }
    static void SwapInArray(int arr[], int i,int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
    static void reverseArray(int arr[]){
        int i = 0, j = arr.length-1;
        while(i<j){
            SwapInArray(arr, i, j);
            i++;
            j--;

        }

    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        reverseArray(arr);
        printArray(arr);
    }
}
