public class Pow50 {
    public static void main(String[] args) {
       double x = 2.00000;
       int n = 10;
       System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        return solve(x, (long)n);
    }

    public static double solve(double x, long n){
        if(n == 0){
            return 1;
        }
        if(n<0){
            return solve(1/x, -n);
        }

        if(n%2 == 0){
            return solve(x*x, n/2);
        }
        return x*solve(x*x, (n-1)/2);
    }
}
