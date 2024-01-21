// Approch: find max and second max and product those max -1 and return 
//         return = (max-1)*(smax-1)

public class Maximum_Product_of_Two_Elements_in_an_Array1464 {
    public static void main(String[] args) {
        int[] nums = {4,5,8,2,6,9};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int smax = -1;
        int max = -1;
        for(int i=0; i<nums.length; i++){
            if(max<nums[i]){
                smax = max;
                max = nums[i];
            }
            else if(smax<nums[i]){
                smax = nums[i];
            }
        }
        int ans = (max-1)*(smax-1);
        return ans;
    }
}
