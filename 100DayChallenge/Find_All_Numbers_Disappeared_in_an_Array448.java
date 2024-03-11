import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=1;
        }
        for(int i=1;i<=nums.length;i++){
            if(arr[i]==0){
                ans.add(i);
            }
        }
       return ans;
    }
    
}