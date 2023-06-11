public class Selection_sort {

    public static void selectionsort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min_idx] ){
                    min_idx  = j;
                }
            }
            int t = arr[i];
            arr[i]= arr[min_idx ];
           arr[min_idx ]= t;
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,6,3,2,1};
        selectionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
