public class Basics {
    public static int sum(int a, int b){
        int add = a+b;
        return add;
    }
    public static int multiply(int a, int b){
        int prod = a*b;
        return prod;
    }

    public static void swap(int a , int b ) {
        int temp = a;
         a = b;
         b = temp;
         System.out.println("a =" +a);
         System.out.println("b ="+ b);
    }
    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
            
        }
        return f;
    }
    public static int binomialCofficient(int n, int r) {
        int a = Factorial(n);
        int b = Factorial(r);
        int c = Factorial(n-r);
        int d = a/(b*c);
        return d;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
       int add= sum(a,b);
        System.out.println("your sum of a+b = " +add);
        //int prod = multiply(a, b);
        System.out.println("your product of a*b = "+ multiply(5, 4));
        swap(a,b);
        System.out.println("a =" +a);
        System.out.println("b ="+ b);
        System.out.println("Your factorial is = " +Factorial(5));
        System.out.println("Your BinomialCofficient is = " + binomialCofficient(5, 4));
      
    }
}
