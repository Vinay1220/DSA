import java.util.Arrays;

public class Maximum_Ascending_Subarray_Sum1800 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50};
        System.out.println(maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int currmax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]<nums[i]) {
                currmax +=nums[i];
            }else{
                max = Math.max(currmax, max);
                currmax = nums[i];
            }
        }
        max = Math.max(currmax, max);
        return max;
    }
}
