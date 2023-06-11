import java.util.Scanner;
public class SumOfNnaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter<=n){
           sum = counter+sum;
            counter++;
        }
        System.out.println(sum);
    }
}
