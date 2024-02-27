import java.util.HashSet;

public class First_Missing_Positive41 {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int num:nums){
            if(num>0){
                set.add(num);
            }
        }
        for(int i=1;i<=n+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
