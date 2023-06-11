//Answer 1
// import java.util.Scanner;
// public class Assignment4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your lenght");
//         int a = sc.nextInt();
//         System.out.println("Enter your breadth");
//         int b = sc.nextInt();
//         if(a>b){
//             System.out.println("It is a rectangle");
//         }
//         else{
//             System.out.println("It is not a rectangle");
//         }
//     }
    
// }

// Answer 2
// import java.util.Scanner;
// public class Assignment4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number");
//         int num = sc.nextInt();
//         if(num>=0){
//             System.out.println("Output  "+num);
//         }
//         else{
//             int num1 = num*-1;
//             System.out.println(num1);
//         }
//     }
// }
// Answer 3
// import java.util.Scanner;
// public class Assignment4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your cost price");
//         int c = sc.nextInt();
//         System.out.println("Enter your selling price");
//         int s = sc.nextInt();
//         if(s>c){
//             System.out.println("your profit  "+(s-c));   

//         }
//         if(c>s){
//             System.out.println("your loss  "+(c-s));
//         }

//     }
// }

// Answer 4
// import java.util.Scanner;
// public class Assignment4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number");
//         int num = sc.nextInt();
//         if(num>=0){
//             System.out.println("Output "+num);
//         }
//         else{
//             System.out.println("The number is negative and skipped");
//         }
//     }
// }

// Answer 5

// import java.util.Scanner;
// public class Assignment4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your first number");
//         double a = sc.nextDouble();
//         System.out.println("Enter your operater:(+,-,*,/)");
//         char op = sc.next().charAt(0);
//         System.out.println("Enter your second number");
//         double b = sc.nextDouble();
//         switch(op){
//             case '+':
//             double ans = a+b;
//             System.out.println("Answer a+b = "+ans);
//             break;
//             case '-':
//             ans = a-b;
//             System.out.println("Answer a-b = "+ans);
//             break;
//             case '*':
//             ans = a*b;
//             System.out.println("Answer a*b = "+ans);
//             break;
//             case '/':
//             ans = a/b;
//             System.out.println("Answer a/b = "+ans);
//             break;
//             default:
//             System.out.println("Please enter valid input");

            
//         }
        
//     }
// }

// Answer 6
import java.util.Scanner;
public class Assignment4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        if(num>90){
        System.out.println("Your grade is = A+");
        }
        else if(num>80){
            System.out.println("Your grade is = A");
        }
        else if(num>70){
            System.out.println("Your grade is = B+");
        }
        else if(num>60){
            System.out.println("Your grade is = B");
        }
        else if(num>50){
            System.out.println("Your grade is = C");
        }
        else if(num>40){
            System.out.println("Your grade is = D");
        }
        else if(num>30){
            System.out.println("Your grade is = E");
        }
        else{
            System.out.println("Your grade is = E");
        }
    }
}