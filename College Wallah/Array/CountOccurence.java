
import java.util.Scanner;
public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array lenght");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your array elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your occurence digit");
        int x =sc.nextInt();
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(x==arr[i]){
                count++;
            }           
        }
        System.out.println("Your count is = " +count);
        sc.close();
    }
    
}
