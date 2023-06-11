public class LargestNumber {
    public static int largestNumber(int nums[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(largest<nums[i]){
                largest = nums[i];
            }
            if(smallest>nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("Your smallest value is = "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int nums[] = {2,34,5,7,45,23,76,87,90,2,3,4,};
        int largest = largestNumber(nums);
        System.out.println("Your largest number is = "+ largest);
    }
}
