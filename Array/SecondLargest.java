public class SecondLargest {
    public static int secondLarg(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max = nums[i];
                continue;
            }
            max = Integer.MIN_VALUE;
           if(max<nums[i]){
            max = nums[i];
           }            
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {12,35,1,10,34,1};
        int largest = secondLarg(nums);
        System.out.println(largest);
    }
}
