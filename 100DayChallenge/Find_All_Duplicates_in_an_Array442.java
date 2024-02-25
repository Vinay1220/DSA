import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            //get the index 
            int index = Math.abs(nums[i])-1;
            // if the number is already negative it means we 
            // are encountring it twice
            if(nums[index] < 0){
                result.add(index+1);
            }else{
                nums[index] = nums[index]*-1; //change the number at the index to negative
            }
        }
        return result;
    }
}
