import java.util.Scanner;

public class NPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // question 1 
    //    * * * 
    //    * * *
    //    * * *

       for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("*");
        }
        System.out.println();
       }

       // question 2
       //    * 
       //    * * 
       //    * * *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // question 3
        //    * * * 
        //    * * 
        //    * 
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <n-i+1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        // question 4
        //    *
        //   ***
        //  *****
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i+1; j++){
                System.out.print(" ");
            } 
            System.out.println();
        }
        sc.close();
    }
}


