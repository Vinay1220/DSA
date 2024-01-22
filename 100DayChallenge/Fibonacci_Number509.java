public class Fibonacci_Number509 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int firstterm = 0;
        int secondTerm =  1;

        for(int i = 1; i<=n;i++){
            int thirdTerm = firstterm + secondTerm;
            firstterm = secondTerm;
            secondTerm = thirdTerm;
        }
        return firstterm;
    }
}
