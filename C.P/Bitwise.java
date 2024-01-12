import java.util.Scanner;
public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int n = sc.nextInt();
        int ans = 0;
        while(n-->0)
            ans+=sc.next().contains("+")?1:-1;
        
        System.out.println("Your Output = "+ ans);
    }
}
