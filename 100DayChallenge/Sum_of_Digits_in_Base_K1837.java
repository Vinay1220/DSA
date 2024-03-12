public class Sum_of_Digits_in_Base_K1837 {
    public static void main(String[] args) {
        int n = 34;
        int k = 6;
        System.out.println(sumBase(n, k));
    }

    public static int sumBase(int n, int k) {
        int sum = 0;
        while(n > 0) {
            sum += n % k;
            n = n / k;
        }
        return sum;
    }
}
