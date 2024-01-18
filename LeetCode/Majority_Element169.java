
// Approch: number of element /2
//          if a number accurence more than N/2 , it is a majority element
//          return num.length/2

// 2nd :  we assume like a game and we take candidate and count at initial condition 0
//          after that we increase count according to candidate accurence at the last we return tha left condidate 

public class Majority_Element169 {
    public static void main(String[] args) {
        int []nums = {3,2,3,2,2,2};
        System.out.println(majorityElement(nums));

    }
    public static int majorityElement(int[] nums) {
        int cand=0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(count==0){
                cand=nums[i];
            }
            if(cand==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return cand;
    }
}
