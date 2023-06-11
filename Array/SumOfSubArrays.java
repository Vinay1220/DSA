public class SumOfSubArrays {

    public static void sumOfSubArray(int nums[]) {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = 0; j < nums.length; j++) {
                int end = j;
                currSum = 0;
                for (int j2 = start; j2 < end; j2++) {
                  currSum += nums[j2];
                  
                }
                System.out.println(currSum); 
            if(maxSum<currSum){
                maxSum = currSum;
            }
            }

          
        }
        System.out.println("Maximum sum = " +maxSum);
    }
    public static void main(String[] args) {
        int nums [] = {1,-2,6,-1,3};
        sumOfSubArray(nums);
    }
}
