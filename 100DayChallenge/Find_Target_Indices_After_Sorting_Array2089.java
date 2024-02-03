// Approch: first we store the minimum value of target and how many time target appear than our anser 
// is start minimum value to haow many time our target value 


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Target_Indices_After_Sorting_Array2089 {
    public static void main(String[] args) {
       int[] nums = {1,2,5,2,3};
       int target = 2;
       System.out.println(targetIndices(nums, target));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        int num = 0;
        int tcount = 0;

        for (int ele : nums) {
            if (ele == target) {
                tcount++;
            }else if (ele<target) {
                num++;
            }
        }

        List<Integer> list = new ArrayList<>();

        while (tcount>0) {
            list.add(num);
            num++;
            tcount--;
        }

        return list;
    }
}
