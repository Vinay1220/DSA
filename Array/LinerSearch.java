public class LinerSearch{

    public static int search(int nums[],int key) {
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int Arr[] = {9, 7, 2, 16, 4};
        int key = 16;
        int index = search(Arr, key);
        System.out.println("Key is index number = " +index);
        
        
    }
}