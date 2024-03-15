public class Find_the_Pivot_Integer2485 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(pivotInteger(n));
    }
    public static int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int curr=0;
        for (int i=1;i<=n;i++){
            curr+=i;
            int temp=sum-curr+i;
            if(temp==curr){
                return i;
            }
        }
        return -1;

    }
}
