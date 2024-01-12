import java.util.Scanner;

public class House_Robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i : arr) {
            arr[i] = sc.nextInt();
        }
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums){
       if(nums.length==0){
        return 0;
       }
       else if(nums.length==1){
        return nums[0];
       }
       else if(nums.length==2){
        return Math.max(nums[0], nums[1]);
       }
       int dp[] = new int[nums.length];
       dp[0]=nums[0];
       dp[1] = Integer.max(nums[1], nums[0]);
       for (int i = 2; i < dp.length; i++) {
        dp[i]=Integer.max(nums[i]+dp[i-2],dp[i-1]);
       }
       return dp[nums.length-1];
    }

}
