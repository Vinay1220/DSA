import java.util.Arrays;

public class BinarySearch {

    public static int  binSearch(int nums[], int key) {
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid==key){
                return mid;
            }
           if(mid<key){
            return mid+1;
           }
           else{
            return mid-1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,3,1,6,8,9,12,10,15};
        
        int key = 8;
        System.out.println("Your index is = "+ binSearch(nums, key));
        int n = 1+2+3+4+5+6;
        int sum = n*(n+1)/2;
        System.out.println("your sum is = " +sum);
    }
}
