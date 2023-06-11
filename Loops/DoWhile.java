import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.println("Enter your number");
        //     int n = sc.nextInt();
            
        //     if(n%10==0){
        //         break;
        //     }
        //     System.out.println(n);
        // }while(true);
        // System.out.println("I am out of the Loop");

            for(int i = 1; i<=5; i++){
                if(i==3){
                    continue;
                }
                System.out.println(i);
            }

    }
}
