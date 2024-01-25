import java.util.Arrays;

public class Squares_of_a_Sorted_Array977 {
    public static void main(String[] args) {
        int[] arr = {-2,-1,0,4,6};
        System.out.println(Arrays.toString(sortedSquares(arr)));

    }
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start=0;
        int end=nums.length-1;
        int ptr = ans.length-1;

        while (start<=end) {
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];
            
            if (ss>es) {
                ans[ptr] = ss;
                start++;
            }else{
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}
