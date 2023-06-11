public class Bubbal_sort{

    public static void bubbalsort(int[] arr) {
        
        for (int turn = 1; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length-turn; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                
                }
            }
            
        }
       
    }
    public static void main(String[] args) {
        int[] c = {5,7,3,9,6,2,8};
        int[] b ={1,2,3,4,5};
     
        bubbalsort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
    }
}