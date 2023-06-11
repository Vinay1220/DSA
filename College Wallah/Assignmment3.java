// Answer 1
// import java.util.Scanner;
// public class Assignmment3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          System.out.println("Enter your number");
//         int a = sc.nextInt();
//         int b = a+8;
//         int c = b/3;
//         int d = c%5;
//         int e = d*5;
//         System.out.println(e);

//     }
// }

// Answer 2
// import java.util.Scanner;
// public class Assignmment3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your first number  ");
//         int num1 = sc.nextInt();
//         System.out.println("Enter your second number  ");
//         int num2 = sc.nextInt();
//         System.out.println(num1+" "+num2);
//          num1 = num1+num2;
//          num2 = num1-num2;
//          num1 = num1-num2;
//         System.out.println(num1+" "+num2);
        

//     }
// }

// Answer 3
// import java.util.Scanner;
// public class Assignmment3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your three digit number");
//         int x = sc.nextInt();
//         int sum = 0;
//         while(x>0){
//             sum = sum+(x%10);
//             x = x/10;

//         }
//         System.out.println(sum);
        
//     }
// }

// Answer 4

// public class Assignmment3{
//     public static void main(String[] args) {
//         int a = 55;
//         int b = 70;
//         //1
//         if(a<50&&a<b){
//             System.out.println("Both condition true");
//         }
//         //2
//         if(a<50||a<b){
//             System.out.println("one condition is true");
//         }
//     }
// }
//Answer 5
public class Assignmment3{
    public static void main(String[] args) {
        int a = 65;
        int b = 80;
        int c = a^b;
        int count= 0;
        while(c>0){
            int r = c%2;
            if(r==1){
                count++;
            }
            c = c/2;

        }
        System.out.println(count);
        
    }
}