public class Move_Zeroes283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);
        
        // Print the modified nums array
        System.out.print("Modified array after moving zeroes: [ ");
        for (int num : nums) {
            System.out.print( num + " ");
        }
        System.out.println("]");
    
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        
        while(count < nums.length){
            nums[count++] = 0;
        }

    }
}
