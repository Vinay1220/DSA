public class MaximumSum{
    public static void main(String[] args) {
        int[] arr = {1,2,7,5,11,3,2,1};
        int k=3;
        System.out.println(maximumSum(arr, k));
    }
    public static int maximumSum(int[] arr, int k) {
        int sum =0;
        // first window
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
            
        }
        int ans = sum;
        for (int i = k; i < arr.length; i++) {
            sum+=arr[i]; // window ko bdaya
            sum-=arr[i-k]; // window ko km kiya
            ans= Math.max(ans, sum); // ans update
        }
        return ans;
    }
}