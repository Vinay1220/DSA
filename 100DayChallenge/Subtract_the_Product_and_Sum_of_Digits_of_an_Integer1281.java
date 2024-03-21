public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer1281 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = n%10;
            sum += rem;
            mul *=rem;
            n = n/10;
        }
        return mul-sum;
    }
}
