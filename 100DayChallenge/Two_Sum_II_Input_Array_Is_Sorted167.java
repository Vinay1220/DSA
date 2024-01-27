import java.util.Arrays;

public class Two_Sum_II_Input_Array_Is_Sorted167 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] numbers, int target){
        int[] ans = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while (start<end) {
            int sum = numbers[start]+numbers[end];
            if (sum == target) {
                ans[0] = start+1;
                ans[1] = end+1;
                return ans;
            }else if (sum>target) {
                end--;
            }else{
                start++;
            }
        }
        return ans;
    }
    
} 