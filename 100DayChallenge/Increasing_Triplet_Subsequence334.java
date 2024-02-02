public class Increasing_Triplet_Subsequence334 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums));
    }
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            
            int n = nums[i];

            if (first>=n) {
                first = n;
            }else if (second>=n) {
                second = n;
            }else{
                third = n;
                return true;
            }
        }

        return false;
    }
}
