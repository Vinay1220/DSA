import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int  target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if (nums.length == 0) {
            return ans;
        }

        ans[0] = firstOccurence(nums, target);
        ans[1] = lastOccurence(nums, target);

        return ans;
    }
    public static int firstOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while (start<=end) {
            int mid = (start+end)/2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid-1;
            }else if (target > nums[mid]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static int lastOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while (start<=end) {
            int mid = (start+end)/2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid+1;
            }else if (target > nums[mid]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}
