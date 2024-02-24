import java.util.Arrays;

public class Find_Subarrays_With_Equal_Sum2395 {
    public static void main(String[] args) {
        int[] nums = {4,2,4};
        System.out.println(findSubarrays(nums));
    }
    public static boolean findSubarrays(int[] nums) {
        int k=nums.length;
        int a[]=new int[k-1];
        for(int i=1;i<k;i++)
        {
            a[i-1]=nums[i-1]+nums[i];
        }
        Arrays.sort(a);
        for(int i=0;i<k-2;i++)
        {
            if(a[i]==a[i+1])
                return true;
        }
        return false;
    }
}
