import java.util.Scanner;

public class Arr {
    public static void sumArray(int [] a){
        int sum= 0;
        for(int i = 0; i<a.length; i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of array:"+sum);
    }

    public static void averageArray(int [] a){
        float avg;
        float n = 0;
        for(int i = 0; i<a.length; i++){
            n = n+a[i];
        }
        System.out.println("Sum:"+n);
        avg = n/a.length;
        System.out.println("Average:"+avg);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = s.nextInt();
        int [] a = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        // sumArray(a);
        averageArray(a);
    }
}
