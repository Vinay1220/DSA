import java.util.Scanner;
public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entyer your array size");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter your arrays elements");
        for(int i = 0; i<a; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Your array is = ");
        for(int i = 0; i<a; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = 0; i<a; i++){
            for(int j = i+1; j<a; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        
        }
        int ans= -1;
        for(int i = 0; i<a; i++){
            if(arr[i]>0){
                ans= arr[i];
            }
        }
        System.out.println();
        System.out.println("Unique element is = "+ans);
    }
    
}
