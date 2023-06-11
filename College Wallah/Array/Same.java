import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a [] = {1,2,3,4,5};
        for(int i = 0; i<a.length; i++){
            n = a[i];
        }
        System.out.println("True");
    }
}
