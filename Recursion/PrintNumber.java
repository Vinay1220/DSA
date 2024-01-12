public class PrintNumber {
    public static void main(String[] args) {
        int n=5;
       // PD(n);
       // PD2(n);
       PI(n);

    }
    public static void PD(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PD(n-1);
    }

        

      public static void PI(int n){
        if(n==0){
            return;
        }
       
        PI(n-1);
         System.out.println(n);
    }

    public static void PD2(int n){
        if(n==0){
            return;
        }
       System.out.println(n);
        PD2(n-1);
         System.out.println(n);
    }

}
