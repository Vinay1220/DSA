public class N_th_Tribonacci_Number1137 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tribonacci(n));
    }
    public static int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }
        int firstterm = 0;
        int secondTerm =  1;
        int thirdTerm = 1;

        for(int i = 1; i<=n;i++){
            int fourthTerm = firstterm + secondTerm + thirdTerm;
            firstterm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = fourthTerm;
        }
        return firstterm;
    }
}
