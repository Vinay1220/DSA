public class TailFac {
    public static void main(String[] args) {
        int n=5;
        int ans = 1;
        System.out.println(fac(n, ans));
    }

    public static int  fac(int n, int ans){
        if(n==0){
            return ans;
        }
        return fac(n-1, n*ans);
    }
}
