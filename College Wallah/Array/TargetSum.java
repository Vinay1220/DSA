import java.util.Scanner;
public class TargetSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array length");
        
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter your array elements");
        for(int i = 0; i<a; i++){
            arr[i] = sc.nextInt();
        }
         for(int i = 0; i<a; i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
         System.out.println("Enter your target");
         int target=sc.nextInt();
         int ans = 0;
         for(int i = 0; i<a; i++){
            for(int j = i+1; j<a; j++ ){
                if(arr[i]+arr[j]==target){
                    ans++;
                }

            }
         }
         System.out.println("2 digit sum = "+ ans);
         for(int i = 0; i<a; i++){
            for(int j = i+1; j<a; j++ ){
                for(int k = j+1; k<a; k++){
                if(arr[i]+arr[j]+arr[k]==target){
                    ans++;
                }
            }

            }
         }
         System.out.println("3 digit sum = "+ans);
        
    }
}
