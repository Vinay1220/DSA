public class foundNum {
    public static void main(String[] args) {
        int arr[] = {3,4,2,4,5,6,7,8};
        int x = 8;
        int ans = -1;
        for(int i = 0; i <arr.length; i++){
            if(arr[i]==x){
                ans = i;
            }
        }
        System.out.println("Index number is = "+  ans);
    }
}
