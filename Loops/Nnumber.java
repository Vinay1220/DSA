import java.util.Scanner;
public class Nnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int number = 1;
        while(number<=n){
            System.out.print(number+" ");
            number++;
        }
    }
}
