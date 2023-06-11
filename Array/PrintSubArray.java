public class PrintSubArray {

    public static void printSubArray(int nums[]) {
        int tp = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
               int end = j;
               for (int k = start; k < end; k++) {
                 System.out.print(nums[k]+" ");
                 tp++;
               } 
               System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+tp);
    }
    public static void main(String[] args) {
        int nums[] = {2,3,4,6,8,9};
        printSubArray(nums);
    }
}
