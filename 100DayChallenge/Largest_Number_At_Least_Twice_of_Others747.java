public class Largest_Number_At_Least_Twice_of_Others747 {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,15};
        System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        int max = -1;
        int smax = -1;
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]) {
                smax = max;
                max = nums[i];
                maxIdx = i;
            }else if (smax<nums[i]) {
                smax = nums[i];
            }
        }

        if (smax*2<=max) {
            return maxIdx;
        }else{
            return -1;
        }
    }
}
