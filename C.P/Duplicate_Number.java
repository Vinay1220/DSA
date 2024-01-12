public class Duplicate_Number {
    public static void main(String[] args) {
        int [] arr={1,2,2,2,3,3,3,4,4,5,5,6,6,7,9};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        int n=nums.length;
        for(int j=1; j<n; j++){
            if(nums[j] != nums[i]){
                 i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
