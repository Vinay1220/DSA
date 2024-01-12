public class Factorial{
    public static void main(String[] args) {
        int n=5;
        System.out.println(fac(n));
    }
    public static int fac(int n){
        // base case
        if(n==1){
            return 1;
        }
        // small problem
        int fn=fac(n-1);
        return fn*n;
    }
}