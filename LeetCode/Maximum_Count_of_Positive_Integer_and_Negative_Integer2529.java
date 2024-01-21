
// approch: it takes O(log(n)) time complexity and given array is sorted it means we can apply 
//         Binary search 


public class Maximum_Count_of_Positive_Integer_and_Negative_Integer2529 {
    public static void main(String[] args) {
        int [] nums = {-1,-2,-3,0,0,0,0,0,2,3,4,5,6};
        System.out.println(maximumCount(nums)); 
    }
    public static int maximumCount(int[] nums) {
        int lastnegIndex = lastNegative(nums)+1;
        int firstposIndex = nums.length - firstPositive(nums);
        return Math.max(lastnegIndex , firstposIndex);
    }
    public static int lastNegative(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]<0){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static int firstPositive(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>0){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}
