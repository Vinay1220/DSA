public class MaxNum {
    public static void main(String[] args) {
        int arr [] = {4,5,3,7,9,8,40,10,15,2,3,1};
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>ans){
            ans = arr[i];
            }
            
        }   
        System.out.println(ans);

    }
}
