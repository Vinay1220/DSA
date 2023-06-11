import java.util.Scanner;
public class FoundSecondMax {
    public static void print(int arr[]){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondLarge(int arr[]){
        int sl = max(arr);
        for(int i=0;i<arr.length;i++){
            if(sl==arr[i]){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int smax = max(arr);
        return smax;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sc.nextInt();
        System.out.println("Enter "+a+" Element");
        int arr[] = new int[a];
        for(int i = 0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("max value "+max(arr));
        System.out.println("second max value "+secondLarge(arr));
        //print(arr);
        // int ans= Integer.MIN_VALUE;
        // for(int i = 0; i<a; i++){
        //     if(arr[i]>ans){
        //        ans = arr[i];
        //     }
        // }
        
        // for(int i = 0; i<a; i++){
        //     if(arr[i]==ans){
        //         arr[i]=Integer.MIN_VALUE;
        //     }
        // }
        // int t = Integer.MIN_VALUE;
        // for(int i = 0; i<a; i++){
        //     if(arr[i]>t){
        //         t = arr[i];
        //     }
        // }
        // System.out.print(t+" ");
     sc.close();   
    }
    
}
