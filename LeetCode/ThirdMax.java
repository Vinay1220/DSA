

public class ThirdMax{
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,5};
        System.out.println(secondMax(arr));
        
    }
    public static int firstmax(int nums[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public static int secondMax(int nums[]){
        int max = firstmax(nums);
        for (int i = 0; i < nums.length; i++) {
            if(max==nums[i]){
                nums[i] = Integer.MIN_VALUE;
            }
        }
        int smax = secondMax(nums);
        return smax;
    }
}
